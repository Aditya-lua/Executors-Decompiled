/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aa8ac..0x1aa93c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aa8ac_0 {
    char field_0;
} st_1aa8ac_0;

extern char g_10002b0;

unsigned long long sub_1aa8ac(unsigned long a0, long long a1, long long a2)
{
    unsigned long long v7;  // x0
    st_1aa8ac_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_1aa8ac_0 *v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xac]
    char v3;  // [bp-0xa8]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = 128;
    v7 = _getsockname();
    if (!(unsigned int)v7)
        v7 = sub_1c7ae8(&v3, v2, a1, a2);
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}
