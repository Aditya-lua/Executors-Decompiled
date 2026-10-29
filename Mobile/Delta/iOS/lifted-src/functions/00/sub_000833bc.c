/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x833bc..0x83488 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_833bc_0 {
    char field_0;
} st_833bc_0;

extern char g_10002b0;

unsigned long long sub_833bc(long long a0, long long a1, long long a2, long long a3)
{
    long long v7;  // x20
    unsigned long long v8;  // x0
    unsigned long long v9;  // 4106
    st_833bc_0 **v0;  // [bp-0x2c8], Other Possible Types: char
    st_833bc_0 *v1;  // [bp-0x2c0]
    char v2;  // [bp-0x2b2]
    char v3;  // [bp-0x248]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = sub_783ac(a3, a2, a1);
    v8 = sub_7845c(&v2, v7, a0, a2, a1, (unsigned long long)a2 > 0x7ff);
    v9 = arm64g_calculate_condition(130, v8, 120, 0);
    if (!(v9 & 1))
        v8 = sub_78aac(&v3, 0x200, &v2, a1, v7);
    if (*(long long *)&g_10002b0 == v4)
        return v8;
    ___stack_chk_fail();
}
