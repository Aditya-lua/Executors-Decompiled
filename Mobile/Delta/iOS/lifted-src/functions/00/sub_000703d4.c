/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x703d4..0x7052c (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_703d4_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
} st_703d4_0;


unsigned long long sub_703d4(unsigned long a0, st_703d4_0 *a1, unsigned int *a2)
{
    unsigned long long v3;  // x0
    unsigned int v4;  // w8
    unsigned int v5;  // w10
    unsigned int v6;  // w9
    unsigned int v7;  // w10
    unsigned int v8;  // w9
    unsigned int v9;  // w12
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_7052c(&v0);
    v4 = __ROL__(a2[7] ^ a2[12] ^ a2[1] ^ a2[15], 1);
    a2[15] = v4;
    v5 = a1->field_0;
    a1->field_8 = v4 + ((a1->field_10 | v5) & a1->field_c | a1->field_10 & v5) + (a1->field_4 * 32 | a1->field_4 >> 27) + a1->field_8 + 2400959708;
    a1->field_0 = v5 * 0x40000000 | v5 >> 2;
    v6 = __ROL__(a2[8] ^ a2[13] ^ a2[2] ^ *a2, 1);
    *a2 = v6;
    v7 = a1->field_4;
    a1->field_c = v6 + ((a1->field_0 | v7) & a1->field_10 | a1->field_0 & v7) + (a1->field_8 * 32 | a1->field_8 >> 27) + a1->field_c + 2400959708;
    a1->field_4 = v7 * 0x40000000 | v7 >> 2;
    v8 = __ROL__(a2[9] ^ a2[14] ^ a2[3] ^ a2[1], 1);
    a2[1] = v8;
    v9 = a1->field_8;
    a1->field_10 = v8 + ((a1->field_4 | v9) & a1->field_0 | a1->field_4 & v9) + (a1->field_c * 32 | a1->field_c >> 27) + a1->field_10 + 2400959708;
    a1->field_8 = v9 * 0x40000000 | v9 >> 2;
    return v3;
}
