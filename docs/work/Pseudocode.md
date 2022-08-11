Electric Bill Estimator

Created by: Blake Ellsworth, Chris Logan, Angela Kwarkoh

* What is Electric Bill Estimator?
  Appliances used around the home all use various amounts of electricity and have differing costs
  for use. Appliances that are commonly used in every household include air conditioner,
  washer/dryer, television, stove, computer, dish washer.


* We have included multiple default values for various appliances. These values include
  amps, voltage, hours of use per day, and cost per kWh.
  These values are calculated into an estimated cost to use for a day, week, 30-day period, and a
  year. The user can can change the default values to a more accurate representation of their
  own home or appliances.


* An example for how this system works.
  User inputs: The state they live in. Monitor, 19V, 2.1A, 8 hours, Oklahoma. The system will
  automatically calculate the information given and convert this into an estimate day, week,
  30-day, and annual cost value.


* Common questions:
  Q: Where do the default values come from?
  A: The values were found from various appliances around our homes
  Q: Where did the cost of electricity come from?
  A: The cost for electricity is set to the average state cost values from year 2022.
  Q: What if I use less hours that I originally planned for?
  A: This is only an estimator for values and does not necessarily reflect an accurate
  representation of your home bill.
  Q: What if my appliance is not listed on here?
  A: We cannot possibly list every appliance and all values. Therefore, we included only common
  larger use items in these calculations and allow the user to calculate for 'other' items.


* Code calculation Samples:
  19V 2.1A = 19 Volts 2.1 Amps - Volts and AMPS are both found on the appliance tags
  Amps or ampere(A) are used to measure electric current
  Voltage(V) is an electromotive force
  Watts(W) are calculated by multiplying A and V together (W = 19 * 2.1 = 39.9)
  Kilowatts(kW) are calculated by diving W by 1000 (kW = 39.9 / 1000 = 0.0399)
  Kilowatt Hours(KWh) are calculated by multiplying the kW by the estimate hours used in the day
  (8 hours) and then by 30 days (kWh = (.0399 * 8) * 30 = 9.576)
  Estimate Cost is calculated by multiplying the kWh by the cost of electricity (6.3496¢)
  (Cost = 9.576 * 0.063496¢ = 0.6080)

* Sample displays for the user:
  Your television daily cost = $xx
  Your television weekly cost = $xx
  Your television 30-day cost = $xx
  Your television annual cost = $xx
  Your total 30-day cost = $xx


* References:
    * Average Energy prices for the US:
      https://www.bls.gov/regions/midwest/data/averageenergyprices_selectedareas_table.htm
    * Cost calculator and Watt conversions added in docs folder.
    * Estimate costs per state:
      https://www.eia.gov/electricity/monthly/epm_table_grapher.php?t=epmt_5_6_a
    * Extra assistance from: Nick Bennett for instructional purposes and coding assistance
    * How to read a CSV File in Java: https://www.javatpoint.com/how-to-read-csv-file-in-java
    * Reading specific lines in CSV file:
      https://stackoverflow.com/questions/2312756/how-to-read-a-specific-line-using-the-specific-line-number-from-a-file-in-java

  
    