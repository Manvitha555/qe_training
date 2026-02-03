import pandas as pd

def read_csv(file_name):
    df = pd.read_csv(file_name)
    return df

def main():
    csv_file = "data.csv"   # replace with your actual CSV file name/path
    df = read_csv(csv_file)
    print(df)

if __name__ == "__main__":
    main()
