/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6def4..0x6e04c (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6def4_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
} st_6def4_0;


unsigned long long sub_6def4(unsigned long a0, st_6def4_0 *a1, unsigned int *a2)
{
    unsigned long long v3;  // x0
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v6;  // w9
    unsigned int v7;  // w11
    unsigned int v8;  // w9
    unsigned int v9;  // w10
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_70980(&v0);
    v4 = __ROL__(*a2 ^ a2[5] ^ a2[10] ^ a2[8], 1);
    a2[8] = v4;
    v5 = a1->field_10;
    a1->field_4 = v4 + ((a1->field_c | v5) & a1->field_8 | a1->field_c & v5) + (a1->field_0 * 32 | a1->field_0 >> 27) + a1->field_4 + 2400959708;
    a1->field_10 = v5 * 0x40000000 | v5 >> 2;
    v6 = __ROL__(a2[1] ^ a2[6] ^ a2[11] ^ a2[9], 1);
    a2[9] = v6;
    v7 = a1->field_0;
    a1->field_8 = v6 + ((a1->field_10 | v7) & a1->field_c | a1->field_10 & v7) + (a1->field_4 * 32 | a1->field_4 >> 27) + a1->field_8 + 2400959708;
    a1->field_0 = v7 * 0x40000000 | v7 >> 2;
    v8 = __ROL__(a2[2] ^ a2[7] ^ a2[12] ^ a2[10], 1);
    a2[10] = v8;
    v9 = a1->field_4;
    a1->field_c = v8 + ((a1->field_0 | v9) & a1->field_10 | a1->field_0 & v9) + (a1->field_8 * 32 | a1->field_8 >> 27) + a1->field_c + 2400959708;
    a1->field_4 = v9 * 0x40000000 | v9 >> 2;
    return v3;
}
