/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabc7e0..0xabc8a0 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_abc7e0_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
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
} st_abc7e0_0;


unsigned long long sub_abc7e0(st_abc7e0_0 *a0)
{
    unsigned long long v3;  // x26
    long long v4;  // x1
    unsigned long long v13;  // x10
    unsigned long long v14;  // x11
    unsigned long long v15;  // x12
    unsigned long long v16;  // x13
    unsigned long long v17;  // x14
    unsigned long long v18;  // x15
    unsigned long long v19;  // x16
    unsigned long long v20;  // x17
    unsigned long long v21;  // x25
    unsigned long long v22;  // x19
    long long v5;  // x2
    unsigned long long v23;  // x20
    unsigned long long v24;  // x21
    unsigned long long v25;  // x22
    unsigned long long v26;  // x23
    unsigned long long v27;  // x24
    unsigned long long v28;  // x0
    long long v6;  // x3
    long long v7;  // x4
    long long v8;  // x5
    long long v9;  // x6
    long long v10;  // x7
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    char *v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x38]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = a0->field_8;
    v5 = a0->field_10;
    v6 = a0->field_18;
    v7 = a0->field_20;
    v8 = a0->field_28;
    v9 = a0->field_30;
    v10 = a0->field_38;
    v11 = a0->field_40;
    v12 = a0->field_48;
    v13 = a0->field_50;
    v14 = a0->field_58;
    v15 = a0->field_60;
    v16 = a0->field_68;
    v17 = a0->field_70;
    v18 = a0->field_78;
    v19 = a0->field_80;
    v20 = a0->field_88;
    v21 = a0->field_90;
    v22 = a0->field_98;
    v23 = a0->field_a0;
    v24 = a0->field_a8;
    v25 = a0->field_b0;
    v26 = a0->field_b8;
    v27 = a0->field_c0;
    v28 = sub_abc5a0(a0->field_0, v4, v5, v6, v7, v8, v9, v10);
    a0->field_0 = v28;
    a0->field_8 = v4;
    a0->field_10 = v5;
    a0->field_18 = v6;
    a0->field_20 = v7;
    a0->field_28 = v8;
    a0->field_30 = v9;
    a0->field_38 = v10;
    a0->field_40 = v11;
    a0->field_48 = v12;
    a0->field_50 = v13;
    a0->field_58 = v14;
    a0->field_60 = v15;
    a0->field_68 = v16;
    a0->field_70 = v17;
    a0->field_78 = v18;
    a0->field_80 = v19;
    a0->field_88 = v20;
    a0->field_90 = v21;
    a0->field_98 = v22;
    a0->field_a0 = v23;
    a0->field_a8 = v24;
    a0->field_b0 = v25;
    a0->field_b8 = v26;
    a0->field_c0 = v27;
    return v28;
}
