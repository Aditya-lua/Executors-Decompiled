/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa803e8..0xa80554 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a803e8_1 {
    char padding_0[8];
    struct st_a803e8_0 *field_8;
    char padding_10[144];
    unsigned long long field_a0;
    char padding_a8[24];
    unsigned long long field_c0;
    char padding_c8[8];
    unsigned long long field_d0;
} st_a803e8_1;

typedef struct st_a803e8_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_a803e8_0;


unsigned long long sub_a803e8(st_a803e8_1 *a0)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v25;  // x19
    unsigned long long v26;  // x0
    unsigned long v27;  // x20
    unsigned long long v28;  // x21
    unsigned long long v29;  // x23
    unsigned long long v30;  // x25
    unsigned long long v31;  // x25
    unsigned long long v32;  // x23
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    unsigned long long v24;  // x23
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    if (!a0->field_a0)
        return 0;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    if (!*(long long *)&a0->padding_a8[0])
        return 0;
    v24 = a0->field_8->field_20;
    v25 = (v24 * 0x800 | v24 >> 53) & 0x3fffffff800 & 0x3ffffffffff;
    v26 = sub_a6bf4c(v25, "crypto/ml_dsa/ml_dsa_key.c", 395);
    if (!v26)
        return v26;
    v27 = v26;
    v28 = sub_a3f728();
    if (v28)
    {
        v29 = v24 & 0xffffffff;
        v2 = v27;
        v3 = v29;
        v0 = v27 + v29 * 0x400;
        v1 = v29;
        if (sub_a801cc(a0, v28, &v2, &v0) && v29 == a0->padding_c8)
        {
            if (v29)
            {
                v30 = 0;
                while (!sub_a66f20(v27 + v30, a0->field_c0 + v30, 0x400))
                {
                    if (v29 * 0x400 == v30 + 0x400 && v29 == a0[1].padding_0)
                    {
                        v31 = 0;
                        while (1)
                        {
                            v32 = v29;
                            if (sub_a66f20(v0 + v31, a0->field_d0 + v31, 0x400))
                                break;
                            v31 += 0x400;
                            v29 = v32 - 1;
                            if (v32 == 1)
                            {
                                sub_a3f73c(v28);
                                sub_a6c4e8(v27, v25, "crypto/ml_dsa/ml_dsa_key.c", 410);
                                return 1;
                            }
                        }
                    }
                }
            }
            else
            {
                sub_a3f73c(v28);
                sub_a6c4e8(v27, v25, "crypto/ml_dsa/ml_dsa_key.c", 410);
                return !a0[1].padding_0;
            }
        }
    }
    sub_a3f73c(v28);
    sub_a6c4e8(v27, v25, "crypto/ml_dsa/ml_dsa_key.c", 410);
    return 0;
}
