/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5730..0x1b5880 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b5730_0 {
    char field_0;
} st_1b5730_0;

extern char g_10002b0;

unsigned long long sub_1b5730(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, unsigned long a7, char a8, char a9, char a10, char a11, char a12, unsigned long a13, void* a14)
{
    unsigned long long v15;  // x0
    unsigned long long v16;  // 4112
    unsigned int v17;  // w8
    long long v18;  // x0
    st_1b5730_0 **v0;  // [bp-0xf0], Other Possible Types: char
    st_1b5730_0 *v1;  // [bp-0xe8]
    unsigned long v2;  // [bp-0xe0]
    unsigned long v3;  // [bp-0xd8]
    void* v4;  // [bp-0xd0]
    char *v5;  // [bp-0xc8]
    char *v6;  // [bp-0xc0]
    char *v7;  // [bp-0xb8]
    char *v8;  // [bp-0xb0]
    char *v9;  // [bp-0xa8]
    char *v10;  // [bp-0xa0]
    unsigned long v11;  // [bp-0x98]
    char v12;  // [bp-0x88]
    unsigned long v13;  // [bp-0x68]
    char *v14;  // [bp-0x10]

    v14 = &a8;
    v13 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v11 = a7;
    sub_1c412c(&v12, a6);
    v2 = a13;
    v3 = &(int)a3;
    v4 = a14;
    v5 = &v11;
    v6 = &a8;
    v7 = &a9;
    v8 = &a10;
    v9 = &a11;
    v10 = &a12;
    v15 = sub_1a7904(a0, a1, a2, a3, 0, a4, a5, &v12, &v2);
    sub_181a8(&v12);
    v16 = arm64g_calculate_condition(1, v15 & 0xffffffff, 1, 0);
    if (!(v16 & 1))
    {
        v17 = 0;
    }
    else
    {
        if (*(int *)a14)
            goto LABEL_1b5824;
        v17 = 2;
    }
    *(unsigned int *)a14 = v17;
LABEL_1b5824:
    if (*(long long *)&g_10002b0 == v13)
        return v15;
    v18 = ___stack_chk_fail();
    sub_181a8(&v12);
    __Unwind_Resume(v18);
}
