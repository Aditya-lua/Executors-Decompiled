/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50eca8..0x50ed34 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50eca8_0 {
    char field_0;
} st_50eca8_0;

extern unsigned long long g_e81df8;

void sub_50eca8(unsigned long long *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_50eca8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_50eca8_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    *a0 = 0xc4ceb9fe1a85ec53;
    (g_e81df8 - 0x4e46d500)();
}
