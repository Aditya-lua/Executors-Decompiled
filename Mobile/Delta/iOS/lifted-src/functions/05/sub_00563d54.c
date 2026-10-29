/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x563d54..0x563e98 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_563d54_0 {
    char field_0;
} st_563d54_0;


int sub_563d54(void)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    unsigned int v12;  // w11
    unsigned int v13;  // w8
    st_563d54_0 **v0;  // [bp-0x10], Other Possible Types: char
    char v1;  // [bp-0xe]
    st_563d54_0 *v2;  // [bp-0x8], Other Possible Types: unsigned short
    char v3;  // [bp-0x6]

    v2 = &v0;
    v0 = &v2;
    v4 = (unsigned short)v2 | *(char *)((void*)&v2 + 2) * 0x10000;
    v5 = (unsigned short)v0 | *(char *)((void*)&v0 + 2) * 0x10000;
    v6 = v5 + v4;
    v7 = v5 | v4;
    v8 = v6 + (-(v5 & v4) & ~v7) * 2 + ((v5 ^ v4) - (v7 | -(v5 & v4))) * 2;
    v9 = -((v6 ^ -v7) + (v6 & -v7) * 2);
    v10 = (v9 ^ v7) + (v9 & v7) * 2;
    v11 = v10 - 1;
    v12 = v10 + v8 + (unsigned int)((v11 & v8) - (v10 + v8)) * 2;
    v13 = ((v11 & v8 + ~v8 * 2 + 1) - v10 & ~(v8 + ~v8 * 2)) * 4 + (v8 + ~v8 * 2 ^ ~((v11 & v8 + ~v8 * 2 + 1) - v10)) * 2;
    v14 = v12 + (v13 | ~v12) + (v13 | v12);
    v15 = v14 + 2049354;
    v0 = ((unsigned short)v14 + 1 | 1) + ((unsigned short)v14 + 1 & 1) + ((unsigned short)~(v14 + 1) | (unsigned short)~1297756) + ((unsigned short)v14 + 52573 ^ (unsigned short)-(v14 + 1 | 1297756)) + ((unsigned short)v14 + 52573 & (unsigned short)-(v14 + 1 | 1297756)) * 2 + 52572;
    v1 = 0;
    v3 = v15 >> 16;
    v2 = v15;
    return (v2 | v3 * 0x10000) + (v0 | v1 * 0x10000);
}
