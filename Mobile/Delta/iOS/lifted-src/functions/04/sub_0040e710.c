/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40e710..0x40e7c4 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40e710_0 {
    char field_0;
} st_40e710_0;

extern unsigned long long g_e7fc00;

void sub_40e710(unsigned long a0, unsigned long a1)
{
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_40e710_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_40e710_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v4 = v9;
    v5 = v10;
    v6 = &v8;
    v7 = v11;
    v1 = &v0;
    v0 = &v1;
    v2 = 0x7fffffffffffffff;
    v3 = 0xffffffffffffffff;
    (g_e7fc00 - 0x1cb08200)();
}
