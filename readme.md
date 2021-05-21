# Assignment Goals

- Read in plain text files in various formats
- Standardize them into a single format
- Run validations/checks against the data to determine potential quality issues
- Run some “analysis” on the data and generate a single resulting dataset

## Files
Data Granularity: Data in these files are at the event granularity, that is to say when a medical event actually occurs. So 
if a person has 100 medical events that happen within a single month, then there will be 1 record(row) per event.
`file1` — csv file, has header and the following schema

- member_num
- record_id
- fname
- lname
- dob
- claim_pay_amount
- claim_amount
- date_of_service

## Standard Format

| Field Name       | Data Type       |
| ---------------- | ---------       |
| source_member_id | String          |
| claim_id         | String          |
| first_name       | String          |
| last_name        | String          |
| birth_date       | Date (MM-dd-yy) |
| claim_amount     | Decimal         |
| service_date     | Date (yyyyMMdd) |
| paid_amount      | Decimal         |


## Validation Checks

Once all the data has been gathered into a single collection, we need to check each field’s “fill rate.” This means we are 
checking what percentage of the fields values are non-null. So if the file has 100 records and 90 of those have a value 
for `last_name`, then `last_name` has a 90% fill rate.

## Result Format
Data Granularity: The granularity of this data is expected to be at the per member, per month level, which means that if 
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

## Getting Started

You are welcome to do this exercise in whatever language you want, but there are a few starter templates available under 
`/src/main` if you want to use Scala, Scala w/ Spark, or Java. Just see the main classes in 
`/src/main/scala/coding_exercise/ScalaDataPipeline.scala`, `/src/main/scala/coding_exercise/ScalaSparkDataPipeline.scala`, or
`/src/main/java/coding_exercise/JavaDataPipeline.java`, respectively.   