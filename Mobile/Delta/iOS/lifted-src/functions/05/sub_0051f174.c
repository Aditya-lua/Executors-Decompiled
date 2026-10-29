/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51f174..0x51f280 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51f174_0 {
    char field_0;
} st_51f174_0;

extern unsigned long long g_5213d4;

void sub_51f174(void)
{
    unsigned long long v7;  // x30
    st_51f174_0 **v8;  // x10
    unsigned long long v9;  // x9
    unsigned long long v10;  // x15
    st_51f174_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_51f174_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_5213d4;
    v8 = v0;
    v9 = (v8 ^ v1) - (char *)v8 + 2 * ((v8 ^ v1) + (v8 ^ ~v1) * 2 + 1 & v8);
    v10 = v1 + 1 - v0 + ((char *)v1 + 0x2 * ~v1 + 1 & v0) * 2 + ~(((v0 | v1) ^ -(v0 & v1)) + ((v0 | v1) & -(v0 & v1)) * 2);
    v0 = v10 + 3;
    v1 = v10 + 29;
    v3 = ((v9 | v8) ^ ~(~(v9 + (v8 | ~v9)))) + (char *)&g_5213d4 + (v1 + 1 ^ v0) + (-v9 ^ v8) + 2 * (-v9 & v8 | v9 & ~v8) + 2 * (v1 + 1 & v0) + -2 * ((v9 | v8) & ~(v9 + (v8 | ~v9)));
    v3();
}
