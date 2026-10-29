/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7052c..0x70684 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7052c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
} st_7052c_0;


unsigned long long sub_7052c(unsigned long a0, st_7052c_0 *a1, unsigned int *a2)
{
    unsigned long long v3;  // x0
    unsigned int v4;  // w8
    unsigned int v5;  // w11
    unsigned int v6;  // w9
    unsigned int v7;  // w10
    unsigned int v8;  // w9
    unsigned int v9;  // w10
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_6d8cc(&v0);
    v4 = __ROL__(a2[4] ^ a2[9] ^ a2[14] ^ a2[12], 1);
    a2[12] = v4;
    v5 = a1->field_8;
    a1->field_10 = v4 + ((a1->field_4 | v5) & a1->field_0 | a1->field_4 & v5) + (a1->field_c * 32 | a1->field_c >> 27) + a1->field_10 + 2400959708;
    a1->field_8 = v5 * 0x40000000 | v5 >> 2;
    v6 = __ROL__(a2[5] ^ a2[10] ^ a2[15] ^ a2[13], 1);
    a2[13] = v6;
    v7 = a1->field_c;
    a1->field_0 = v6 + ((a1->field_8 | v7) & a1->field_4 | a1->field_8 & v7) + (a1->field_10 * 32 | a1->field_10 >> 27) + a1->field_0 + 2400959708;
    a1->field_c = v7 * 0x40000000 | v7 >> 2;
    v8 = __ROL__(a2[6] ^ a2[11] ^ *a2 ^ a2[14], 1);
    a2[14] = v8;
    v9 = a1->field_10;
    a1->field_4 = v8 + ((a1->field_c | v9) & a1->field_8 | a1->field_c & v9) + (a1->field_0 * 32 | a1->field_0 >> 27) + a1->field_4 + 2400959708;
    a1->field_10 = v9 * 0x40000000 | v9 >> 2;
    return v3;
}
