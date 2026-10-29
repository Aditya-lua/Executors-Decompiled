/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52ccdc..0x52ce0c (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52ccdc_0 {
    char field_0;
} st_52ccdc_0;


int sub_52ccdc(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w12
    unsigned int v5;  // w13
    unsigned int v6;  // w14
    unsigned int v7;  // w12
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w10
    unsigned int v11;  // w8
    st_52ccdc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52ccdc_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 | v2;
    v5 = -(((v2 | ~v3) ^ v3 + 1) + ((v2 | ~v3) & v3 + 1) * 2);
    v6 = v5 ^ v4;
    v7 = v6 + (v4 + (v5 | ~v4)) * 2 + 2;
    v8 = v2 - v3 + (__ROL__(v6, 1) & 2 & 3) + (v7 ^ 1) - (((unsigned int)(v2 * 2 + (v2 ^ 0xfffffffe) - (v2 * 2 & 2)) + 2 & v3) - v3 + v7) * 2;
    v9 = v8 + 2;
    v10 = v8 - 1;
    v11 = -v8;
    v0 = v9 + 96053332 + (v11 | 4198913960) + (v9 + 96053332 ^ -(v10 | 96053332 | 3)) + (v9 + 96053332 & -(v10 | 96053332 | 3)) * 2 + 1;
    v1 = ((v9 - 2 ^ (v11 | 92348457)) + (v9 - 2 & (v11 | 92348457)) * 2 ^ v9 + 92348457 - (v10 & 92348457) - 2) + ((v9 - 2 ^ (v11 | 92348457)) + (v9 - 2 & (v11 | 92348457)) * 2 & v9 + 92348457 - (v10 & 92348457) - 2) * 2 - 1;
    return v1 + v0;
}
