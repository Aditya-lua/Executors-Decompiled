/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ad08c..0x1ad770 (1764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ad08c_1 {
    char padding_0[48];
    struct st_1ad08c_2 *field_30;
} st_1ad08c_1;

typedef struct st_1ad08c_2 {
    unsigned long long field_0;
} st_1ad08c_2;

typedef struct st_1ad08c_0 {
    char field_0;
} st_1ad08c_0;

extern char g_10002b0;

long long sub_1ad08c(st_1ad08c_1 **a0, unsigned long a1, long long a2, unsigned long a3, unsigned long a4, unsigned int *a5)
{
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x0
    st_1ad08c_0 **v0;  // [bp-0x6e0], Other Possible Types: char
    st_1ad08c_0 *v1;  // [bp-0x6d8]
    char v2;  // [bp-0x6b8]
    long long v3;  // [bp-0x6b0]
    st_1ad08c_0 **v4;  // [bp-0x590], Other Possible Types: char
    char *v5;  // [bp-0x300]
    unsigned long v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v5 = &v4;
    v4 = &v5;
    if (sub_6b08(a2 + 24))
    {
        sub_1b0464(&v5, a2);
        *a0->field_30();
    }
    *a5 = 2;
    if (*(long long *)&g_10002b0 == v6)
        return 0;
    v9 = ___stack_chk_fail();
    sub_1adb9c(&v4);
    sub_62aa0(&v2, v3);
    sub_1adb9c(&v5);
    v10 = __Unwind_Resume(v9);
    sub_1adb9c(&v4);
    sub_1adb9c(&v5);
    v11 = __Unwind_Resume(v10);
    sub_1adb9c(&v4);
    sub_1adb9c(&v5);
    v12 = __Unwind_Resume(v11);
    std::__1::mutex::unlock(a0 + 10);
    sub_1adb9c(&v5);
    v13 = __Unwind_Resume(v12);
    sub_1adb9c(&v5);
    v14 = __Unwind_Resume(__Unwind_Resume(v13));
    sub_1adb9c(&v5);
    __Unwind_Resume(v14);
}
