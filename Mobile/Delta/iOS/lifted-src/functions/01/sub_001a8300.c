/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8300..0x1a84ec (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8300_1 {
    char padding_0[32];
    struct st_1a8300_2 *field_20;
} st_1a8300_1;

typedef struct st_1a8300_2 {
    unsigned long long field_0;
} st_1a8300_2;

typedef struct st_1a8300_0 {
    char field_0;
} st_1a8300_0;

extern char g_10001c8;
extern char g_10002b0;

long long sub_1a8300(st_1a8300_1 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned int *a4)
{
    long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x0
    st_1a8300_0 **v0;  // [bp-0x220], Other Possible Types: char
    st_1a8300_0 *v1;  // [bp-0x218]
    char v2;  // [bp-0x209]
    unsigned long v3;  // [bp-0x208]
    char *v4;  // [bp-0x200], Other Possible Types: st_1a8300_1 **
    st_1a8300_1 **v5;  // [bp-0x1f8]
    char *v6;  // [bp-0x1f0]
    char v7;  // [bp-0x1e1]
    char v8;  // [bp-0x1e0]
    char v9;  // [bp-0x1c0]
    char v10;  // [bp-0x1a0]
    char v11;  // [bp-0x180]
    unsigned long long v12;  // [bp-0xc0]
    char v13;  // [bp-0x78]
    unsigned long v14;  // [bp-0x58]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = a2;
    v2 = 1;
    sub_1bdbd4(&v8);
    v4 = &v2;
    v5 = a0;
    v6 = &v3;
    sub_1bcf00(sub_1adb1c(&v13, &v4, &v7), &v8, &v7);
    v4 = a0;
    sub_1b53b8(sub_1afbf4(sub_181a8(&v13), &v4, &v7), &v9, &v7);
    sub_181a8(&v13);
    if (a3 + a2 > v3)
        *a0->field_20();
    *a4 = 0;
    v12 = &g_10001c8;
    sub_181a8(&v11);
    sub_181a8(&v10);
    sub_181a8(&v9);
    sub_181a8(&v8);
    if (*(long long *)&g_10002b0 == v14)
        return v3 >= a3 + a2;
    v19 = ___stack_chk_fail();
    sub_1a5c84(&v8);
    v20 = __Unwind_Resume(v19);
    sub_1a5c84(&v8);
    v21 = __Unwind_Resume(__Unwind_Resume(v20));
    sub_1a5c84(&v8);
    __Unwind_Resume(v21);
}
