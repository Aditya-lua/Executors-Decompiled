/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50be30..0x50bedc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50be30_0 {
    char field_0;
} st_50be30_0;

extern unsigned long long g_e81de8;

void sub_50be30(uint128_t *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_50be30_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_50be30_0 *v1;  // [bp-0x28]
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
    *a0 = 0;
    a0[1] = 0;
    (g_e81de8 - 0xa01e200)();
}
