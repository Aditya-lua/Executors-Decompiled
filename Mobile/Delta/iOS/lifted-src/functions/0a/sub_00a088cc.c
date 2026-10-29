/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa088cc..0xa089ec (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a088cc_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a088cc_0;


st_a088cc_0 * sub_a088cc(st_a088cc_0 *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v10;  // x15
    unsigned long long v11;  // x12
    unsigned long long v12;  // x13
    unsigned long long v13;  // x11
    unsigned long long v14;  // x10
    unsigned long long v15;  // x9
    unsigned long long v16;  // x16
    unsigned long long v17;  // x12
    unsigned long long v18;  // x8
    unsigned long long v2;  // x10
    unsigned long long v3;  // x11
    unsigned long long v4;  // x12
    unsigned long long v5;  // x13
    unsigned long long v6;  // x14
    unsigned long long v7;  // x15
    unsigned long long v8;  // x16
    unsigned long long v9;  // x14

    v0 = *a2 + *a1;
    a0->field_0 = v0;
    v1 = a2[1] + a1[1];
    a0->field_8 = v1;
    v2 = a2[2] + a1[2];
    a0->field_10 = v2;
    v3 = a2[3] + a1[3];
    a0->field_18 = v3;
    v4 = a2[4] + a1[4];
    a0->field_20 = v4;
    v5 = a2[5] + a1[5];
    a0->field_28 = v5;
    v6 = a2[6] + a1[6];
    a0->field_30 = v6;
    v7 = a2[7] + a1[7];
    v8 = (v7 & 0xffffffffffffff) + (v6 >> 56);
    v9 = (v6 & 0xffffffffffffff) + (v5 >> 56);
    v10 = v7 >> 56;
    v11 = v4 + v10;
    v12 = (v5 & 0xffffffffffffff) + (v11 >> 56);
    v13 = (v3 & 0xffffffffffffff) + (v2 >> 56);
    v14 = (v2 & 0xffffffffffffff) + (v1 >> 56);
    v15 = (v1 & 0xffffffffffffff) + (v0 >> 56);
    v16 = v8 >> 56;
    v17 = (v11 & 0xffffffffffffff) + (v3 >> 56) + v16;
    v18 = (v0 & 0xffffffffffffff) + v10;
    a0->field_30 = (v9 & 0xffffffffffffff) + (v12 >> 56);
    a0->field_38 = (v8 & 0xffffffffffffff) + (v9 >> 56);
    a0->field_20 = (v17 & 0xffffffffffffff) + (v13 >> 56);
    a0->field_28 = (v12 & 0xffffffffffffff) + (v17 >> 56);
    a0->field_10 = (v14 & 0xffffffffffffff) + (v15 >> 56);
    a0->field_18 = (v13 & 0xffffffffffffff) + (v14 >> 56);
    a0->field_0 = (v18 & 0xffffffffffffff) + v16;
    a0->field_8 = (v15 & 0xffffffffffffff) + (v18 >> 56);
    return a0;
}
