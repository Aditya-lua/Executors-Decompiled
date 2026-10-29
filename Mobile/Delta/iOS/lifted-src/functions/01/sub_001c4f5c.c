/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4f5c..0x1c5300 (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4f5c_0 {
    char field_0;
} st_1c4f5c_0;

typedef struct st_1c4f5c_1 {
    unsigned long long field_0;
} st_1c4f5c_1;

extern st_1c4f5c_1 *g_f0b030;
extern char g_10002b0;

unsigned long long sub_1c4f5c(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    long long v13;  // x0
    st_1c4f5c_0 **v0;  // [bp-0x928], Other Possible Types: char
    st_1c4f5c_0 *v1;  // [bp-0x920]
    char *v2;  // [bp-0x918]
    char v3;  // [bp-0x900]
    unsigned long v4;  // [bp-0x890]
    char *v5;  // [bp-0x888]
    long long v6;  // [bp-0x880]
    unsigned long long v7;  // [bp-0x878]
    unsigned long long v8;  // [bp-0x868]
    char v9;  // [bp-0x858]
    unsigned long v10;  // [bp-0x58]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    _bzero(&v9, 0x800);
    v4 = a1;
    v5 = &v9;
    v6 = 0x800;
    v7 = 0;
    v8 = 0;
    if (sub_1c2800(&v4) & 1)
        g_f0b030();
    if (*(long long *)&g_10002b0 == v10)
        return 0;
    v13 = ___stack_chk_fail();
    v2 = &v3;
    sub_127c0(&v2);
    __Unwind_Resume(v13);
}
