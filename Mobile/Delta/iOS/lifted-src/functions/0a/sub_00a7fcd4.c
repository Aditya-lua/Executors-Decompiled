/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7fcd4..0xa7ff6c (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7fcd4_1 {
    char padding_0[24];
    long long field_18;
} st_a7fcd4_1;

typedef struct st_a7fcd4_0 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[24];
    long long field_40;
    long long field_48;
} st_a7fcd4_0;


void* sub_a7fcd4(void* a0, unsigned long long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    uint128_t v19;  // q1
    uint128_t v20;  // q1
    uint128_t v21;  // q1
    unsigned long long v22;  // x22
    unsigned long long index;  // x21
    unsigned long long v24;  // x8
    unsigned long long v25;  // x8
    unsigned long long v26;  // x8
    uint128_t v27;  // q1
    unsigned long v28;  // x23
    unsigned long long v11;  // x22
    unsigned long v29;  // x20
    unsigned long long idx;  // x22
    unsigned long long v31;  // x8
    unsigned long long v32;  // x20
    long long v33;  // x21
    unsigned long long v34;  // x8
    unsigned long long v35;  // x8
    st_a7fcd4_1 *v36;  // x19
    unsigned long long v37;  // x20
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long idx1;  // x0
    st_a7fcd4_0 *v17;  // x9
    unsigned long long v18;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if ((long long)a0[160] || !(long long)a0[168] && !(long long)a0[176])
    {
        idx1 = sub_a6bffc(0x100, "crypto/ml_dsa/ml_dsa_key.c", 191);
        if (idx1)
        {
            v17 = (long long)a0[8];
            *(long long *)idx1 = *(long long *)a0;
            *(st_a7fcd4_0 **)(idx1 + 8) = v17;
            *(int *)(idx1 + 184) = (int)a0[184];
            if (a1 & 3)
            {
                v18 = (long long)a0[160];
                if (v18)
                {
                    v19 = (int128_t)a0[48];
                    *(int128_t *)(idx1 + 32) = (int128_t)a0[32];
                    *(uint128_t *)(idx1 + 48) = v19;
                    v20 = (int128_t)a0[80];
                    *(int128_t *)(idx1 + 64) = (int128_t)a0[64];
                    *(uint128_t *)(idx1 + 80) = v20;
                    v21 = (int128_t)a0[112];
                    *(int128_t *)(idx1 + 96) = (int128_t)a0[96];
                    *(uint128_t *)(idx1 + 112) = v21;
                    if (!(long long)a0[192])
                    {
                        index = idx1;
LABEL_a7fdc4:
                        v25 = sub_a6dac4(v18, v17->field_48, "crypto/ml_dsa/ml_dsa_key.c", 207);
                        idx1 = index;
                        *(unsigned long long *)(index + 160) = v25;
                        if (v25)
                            goto LABEL_a7fdec;
                    }
                    else if (!*(long long *)(idx1 + 192))
                    {
                        v22 = v17->field_20;
                        index = idx1;
                        v24 = sub_a6bf4c(v22 * 0x400, "crypto/ml_dsa/ml_dsa_vector.h", 35);
                        idx1 = index;
                        *(unsigned long long *)(index + 192) = v24;
                        if (v24)
                        {
                            *(unsigned long long *)(idx1 + 200) = v22;
                            _memcpy(v24, (long long)a0[192], (long long)a0[200] * 0x400);
                            v18 = (long long)a0[160];
                            v17 = (long long)a0[8];
                            goto LABEL_a7fdc4;
                        }
                    }
                }
                else
                {
LABEL_a7fdec:
                    if (!(a1 & 1))
                        goto LABEL_a7fdf0;
                    v26 = (long long)a0[168];
                    if (v26)
                    {
                        v27 = (int128_t)a0[144];
                        *(int128_t *)(idx1 + 128) = (int128_t)a0[128];
                        *(uint128_t *)(idx1 + 144) = v27;
                        if (!(long long)a0[240])
                        {
                            idx = idx1;
LABEL_a7fec0:
                            v34 = sub_a6dac4(v26, *(long long *)((long long)a0[8] + 64), "crypto/ml_dsa/ml_dsa_key.c", 222);
                            idx1 = idx;
                            *(unsigned long long *)(idx + 168) = v34;
                            if (v34)
                                goto LABEL_a7feec;
                        }
                        else if (!*(long long *)(idx1 + 240))
                        {
                            v28 = *(long long *)(*(long long *)(idx1 + 8) + 32);
                            v29 = *(long long *)(*(long long *)(idx1 + 8) + 40);
                            idx = idx1;
                            v31 = sub_a6bf4c(v29 * 0x400 + v28 * 0x800, "crypto/ml_dsa/ml_dsa_vector.h", 35);
                            idx1 = idx;
                            *(unsigned long long *)(idx + 240) = v31;
                            if (v31)
                            {
                                *(unsigned long *)(idx1 + 248) = v29;
                                v32 = v31 + v29 * 0x400;
                                *(unsigned long long *)(idx1 + 224) = v32;
                                *(unsigned long *)(idx1 + 232) = v28;
                                v33 = v32 + v28 * 0x400;
                                *(long long *)(idx1 + 208) = v33;
                                *(unsigned long *)(idx1 + 216) = v28;
                                _memcpy(v31, (long long)a0[240], (long long)a0[248] * 0x400);
                                _memcpy(v32, (long long)a0[224], (long long)a0[232] * 0x400);
                                _memcpy(v33, (long long)a0[208], (long long)a0[216] * 0x400);
                                v26 = (long long)a0[168];
                                goto LABEL_a7fec0;
                            }
                        }
                    }
                    else
                    {
LABEL_a7feec:
                        if (!(long long)a0[176] || (v35 = sub_a6dac4((long long)a0[176], 32, "crypto/ml_dsa/ml_dsa_key.c", 228), idx1 = idx1, *(unsigned long long *)(idx1 + 176) = v35, v35))
                            goto LABEL_a7fdf0;
                    }
                }
                v36 = idx1;
                sub_a3f52c(*(long long *)(idx1 + 16));
                sub_a3f52c(v36->field_18);
                sub_a7fbd8(v36);
                sub_a6c2e4(v36, "crypto/ml_dsa/ml_dsa_key.c", 138);
                goto LABEL_a7ff54;
            }
            else
            {
LABEL_a7fdf0:
                v37 = idx1;
                sub_a40a98((long long)a0[16]);
                sub_a40a98((long long)a0[24]);
                idx1 = v37;
                *(int128_t *)(v37 + 16) = (int128_t)a0[16];
            }
        }
    }
    else
    {
LABEL_a7ff54:
        idx1 = 0;
    }
    return idx1;
}
