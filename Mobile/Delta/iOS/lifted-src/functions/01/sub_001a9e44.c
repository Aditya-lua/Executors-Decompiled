/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a9e44..0x1aa014 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a9e44_1 {
    char padding_0[424];
    long long field_1a8;
} st_1a9e44_1;

typedef struct st_1a9e44_0 {
    char field_0;
} st_1a9e44_0;

typedef struct st_1a9e44_2 {
    unsigned long long field_0;
    unsigned int field_8;
} st_1a9e44_2;

extern char g_10002b0;

unsigned long long sub_1a9e44(st_1a9e44_1 *a0, unsigned long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9)
{
    st_1a9e44_2 *v15;  // x8
    unsigned long long v16;  // x0
    long long v17;  // x0
    long long v18;  // x0
    st_1a9e44_0 **v0;  // [bp-0x378], Other Possible Types: char
    st_1a9e44_0 *v1;  // [bp-0x370]
    unsigned int v2;  // [bp-0x364]
    char v3;  // [bp-0x360]
    char v4;  // [bp-0x340]
    char v5;  // [bp-0x320]
    char v6;  // [bp-0x308]
    char v7;  // [bp-0x2d8]
    char v8;  // [bp-0x100]
    unsigned long long t;  // [bp-0x98]
    unsigned long v10;  // [bp-0x90]
    char v11;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long v12;  // [bp-0x70]
    char *v13;  // [bp-0x10]

    v13 = &a8;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_1ac5d0(&v5);
    v5 = a1;
    sub_1a9e04(&v7, a3);
    v6 = a2;
    sub_1b66b4(sub_1e524(&v11, a9), &v8);
    sub_181a8(&v11);
    if (a0->field_1a8 >= 1)
        t = std::__1::chrono::steady_clock::now();
    v2 = 0;
    sub_1b7754(&v4, a6);
    sub_1af858(&v3, a7);
    sub_1c007c(a0, &v5, a4, a5, &v4, &v3, a8, &v2);
    sub_181a8(&v3);
    sub_181a8(&v4);
    v10 = 0;
    v15->field_0 = v11;
    v15->field_8 = v2;
    sub_1b52a0((char *)&v15[1].field_0 + 4, &v7);
    sub_1c1dec(&v10, 0);
    v16 = sub_1adb9c(&v5);
    if (*(long long *)&g_10002b0 == v12)
        return v16;
    v17 = ___stack_chk_fail();
    sub_181a8(&v3);
    sub_181a8(&v4);
    sub_1adb9c(&v5);
    v18 = __Unwind_Resume(__Unwind_Resume(v17));
    sub_1adb9c(&v5);
    __Unwind_Resume(v18);
}
