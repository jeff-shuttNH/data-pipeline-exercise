# Getting Started

You are welcome to do this exercise in whatever language you want, but there are a few starter templates available under
`/src/main` if you want to use Scala, Scala w/ Spark, or Java. You are welcome to use any IDE of your choice and if you 
choose to use any of the templates provided, the prerequisites are listed below. 

| Language | Prerequisites | Build File | Template Location |   
| -------- | ------------- | ---------- | ----------------- | 
| Scala    | - JDK8 <br /> - SBT |  `build.sbt` | `/src/main/scala/coding_exercise/ScalaDataPipeline.scala` | 
| Scala w/ Spark | - JDK8 <br /> - SBT |  `build.sbt` | `/src/main/scala/coding_exercise/ScalaSparkDataPipeline.scala` | 
| Java | - JDK8  | `pom.xml` | `/src/main/java/coding_exercise/JavaDataPipeline.java` |

# High Level Assignment Goals

1. Read in a plain text file in csv format and standardize its format
2. Execute some validation checks against the data to determine potential quality issues
3. Run analyses on the data and generate a single resulting dataset

## Goal 1 - Source Data

### File 1
**Data Granularity:** Data in this file are at the event granularity, that is to say when a medical event actually occurs. So 
if a person has 100 medical events that happen within a single month, then there will be 1 record(row) per event.

[/src/main/resources/file1.csv](src/main/resources/file1.csv) has the following schema
- member_num
- record_id
- fname
- lname
- dob
- claim_pay_amount
- claim_amount
- date_of_service

### Standard Format
Standardize the file into the following format

| Field Name       | Data Type       |
| ---------------- | ---------       |
| source_member_id | String          |
| claim_id         | String          |
| first_name       | String          |
| last_name        | String          |
| birth_date       | Date (yyyyMMdd) |
| claim_amount     | Decimal         |
| service_date     | Date (yyyyMMdd) |
| paid_amount      | Decimal         |


## Goal 2: Validation Checks

Once all the data has been gathered into a single collection, we need to check each field’s “fill rate.” This means we are 
checking what percentage of the fields values are non-null. So if the file has 100 records and 90 of those have a value 
for `last_name`, then `last_name` has a 90% fill rate. Calculate the fill rate for each field and print it out.

## Goal 3: Result Format
**Data Granularity:** The granularity of this data are expected to be at the per member, per month level, which means that if 
there are 100 medical events in the month of 11/2017 for member 123, there will be a single record that aggregates all 
the records together.

| Field Name          | Data Type       |
| ------------------- | --------------- |
| source_member_id    | String          |
| first_name          | String          |
| last_name           | String          |
| year_month          | String (yyyyMM) |
| total_claims_amount | Decimal         |
| total_paid_amount   | Decimal         |
| total_claim_count   | Int             |

Write these results out to a `.csv` file.