/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa95e90..0xa95f6c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a95e90_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
    unsigned long long field_88;
    unsigned long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    unsigned long long field_a8;
    unsigned long long field_b0;
    unsigned long long field_b8;
    unsigned long long field_c0;
    unsigned long long field_c8;
    unsigned long long field_d0;
    unsigned long long field_d8;
    unsigned long long field_e0;
    unsigned long long field_e8;
    unsigned long long field_f0;
    unsigned long long field_f8;
} st_a95e90_0;


st_a95e90_0 * sub_a95e90(st_a95e90_0 *a0, unsigned long long *a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long v10;  // x16
    unsigned long long v11;  // x17
    unsigned long long v12;  // x1
    unsigned long long v13;  // x2
    unsigned long long v14;  // x3
    unsigned long long v15;  // x4
    unsigned long long v16;  // x5
    unsigned long long v17;  // x6
    unsigned long long v2;  // x12
    unsigned long long v3;  // x13
    unsigned long long v4;  // x10
    unsigned long long v5;  // x13
    unsigned long long v6;  // x15
    unsigned long long v7;  // x14
    unsigned long long v8;  // x15
    unsigned long long v9;  // x11

    a0->field_0 = 0;
    a0->field_8 = 0;
    v0 = *a1;
    v1 = a1[1];
    a0->field_80 = v0;
    a0->field_88 = v1;
    v2 = v0 * 0x8000000000000000 | v1 >> 1;
    v3 = v0 >> 1;
    v4 = ((long long)(v1 * 0x8000000000000000) >> 63 & 0xfffffffffffffffe | v1 & 1) & 0xe100000000000000 ^ v3;
    a0->field_40 = v4;
    a0->field_48 = v2;
    v5 = v3 * 0x8000000000000000 | v2 >> 1;
    v6 = v4 >> 1;
    v7 = v6 ^ ((long long)(v2 * 0x8000000000000000) >> 63 & 0xfffffffffffffffe | v2 & 1) & 0xe100000000000000;
    a0->field_20 = v7;
    a0->field_28 = v5;
    v8 = v6 * 0x8000000000000000 | v5 >> 1;
    v9 = ((long long)(v5 * 0x8000000000000000) >> 63 & 0xfffffffffffffffe | v5 & 1) & 0xe100000000000000 ^ v7 >> 1;
    a0->field_10 = v9;
    a0->field_18 = v8;
    v10 = v9 ^ v7;
    v11 = v8 ^ v5;
    a0->field_30 = v10;
    a0->field_38 = v11;
    v12 = v9 ^ v4;
    v13 = v8 ^ v2;
    a0->field_50 = v12;
    a0->field_58 = v13;
    v14 = v7 ^ v4;
    v15 = v5 ^ v2;
    a0->field_60 = v14;
    a0->field_68 = v15;
    v16 = v10 ^ v4;
    v17 = v11 ^ v2;
    a0->field_70 = v16;
    a0->field_78 = v17;
    a0->field_90 = v9 ^ v0;
    a0->field_98 = v8 ^ v1;
    a0->field_a0 = v7 ^ v0;
    a0->field_a8 = v5 ^ v1;
    a0->field_b0 = v10 ^ v0;
    a0->field_b8 = v11 ^ v1;
    a0->field_c0 = v4 ^ v0;
    a0->field_c8 = v2 ^ v1;
    a0->field_d0 = v12 ^ v0;
    a0->field_d8 = v13 ^ v1;
    a0->field_e0 = v14 ^ v0;
    a0->field_e8 = v15 ^ v1;
    a0->field_f0 = v16 ^ v0;
    a0->field_f8 = v17 ^ v1;
    return a0;
}
