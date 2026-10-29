/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51ca00..0x51cb10 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51ca00_0 {
    char field_0;
} st_51ca00_0;


long long sub_51ca00(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    unsigned long long v8;  // x10
    unsigned long long v9;  // x8
    unsigned long long v10;  // x8
    unsigned long long v11;  // x9
    st_51ca00_0 **v0;  // [bp-0x10], Other Possible Types: char
    char v1;  // [bp-0xc]
    st_51ca00_0 *v2;  // [bp-0x8], Other Possible Types: unsigned int
    char v3;  // [bp-0x4]

    v2 = &v0;
    v0 = &v2;
    v4 = (unsigned int)v2 | *(char *)((void*)&v2 + 4) * 0x100000000;
    v5 = (unsigned int)v0 | *(char *)((void*)&v0 + 4) * 0x100000000;
    v6 = (v5 | v4) + ~((v4 | ~v5) + v5);
    v7 = v4 - v5 + (v5 & ~v4) * 2 + v6 + (~(v4 - v5) - (v5 & ~v4) * 2 & -v6) * 2 + (v4 - v5 + (v5 & ~v4) * 2 - (v6 + (v4 - v5 + (v5 & ~v4) * 2 | -v6))) * 2;
    v8 = v7 * 2;
    v9 = (v7 ^ 664071888910) + (v8 & 228632150044) - 1;
    v0 = (v7 ^ 140817538423) + (v8 & 281635076846) - 1;
    v1 = 0;
    v3 = v9 >> 32;
    v2 = v9;
    v10 = v0 | v1 * 0x100000000;
    v11 = v2 | v3 * 0x100000000;
    return (v10 | v11) + (v11 & v10);
}
