import pandas as pd
data={
    "Firstname":  ["Satvik","Avinash","Lahari"],
    "Lastname":   ["Shah","kati","Rath"],
    "Email":      ["satshah@example","avinashk@example","lahrirath@example.com"]
}
   
df = pd.DataFrame(data)
df.to_excel(
    r"C:\Users\BanalaSharvani\Desktop\Training\qe-python\users.xlsx",
    sheet_name="Sheet1", index=False
)
print(df)
print(df.shape)
print(df["Firstname"])
print(df.sort_values("by_firstname"))

