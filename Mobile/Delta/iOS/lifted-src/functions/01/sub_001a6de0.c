/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6de0..0x1a6e7c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6de0_0 {
    char field_0;
} st_1a6de0_0;

extern char g_10002b0;

unsigned long long sub_1a6de0(unsigned long a0, long long a1, long long a2)
{
    unsigned long long v8;  // x0
    st_1a6de0_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_1a6de0_0 *v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xac]
    char v3;  // [bp-0xa8]
    char v4;  // [bp-0xa7]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = 128;
    v8 = _getpeername();
    if (!(unsigned int)v8 && v4 != 1)
        v8 = sub_1c7ae8(&v3, v2, a1, a2);
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
