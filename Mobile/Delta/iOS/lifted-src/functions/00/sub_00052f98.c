/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52f98..0x530bc (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52f98_0 {
    char field_0;
} st_52f98_0;

extern char g_10002b0;

unsigned long long sub_52f98(long long *a0, unsigned long a1, unsigned long a2)
{
    long long v9;  // x20
    unsigned long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    st_52f98_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_52f98_0 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x58]
    char v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v4 = a1;
    v9 = sub_527b4();
    sub_54a20(a0 + 19, &v4);
    *(long long *)(sub_12484(a0 + 19, &v4) + 8) = v9;
    v2 = 0;
    sub_f6e8(&v5, &v2, 0);
    v2 = 0;
    v3 = 0;
    v10 = sub_534d0(v9, &v2, a0 + 11, a0[4], a0[5], a0[10], &v5);
    if ((unsigned int)v10 != 15)
    {
        sub_53fd4(a0[2], &v4);
        *(unsigned int *)(sub_12484(a0[2], &v4) + 8) = v10;
    }
    sub_a070(&v5);
    if (*(long long *)&g_10002b0 == v6)
        return v10;
    v11 = ___stack_chk_fail();
    sub_a070(&v5);
    v12 = __Unwind_Resume(v11);
    sub_a070(&v5);
    v13 = __Unwind_Resume(v12);
    __Unwind_Resume(v13);
}
