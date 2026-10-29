/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966f78..0x967210 (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966f78_1 {
    char padding_0[216];
    struct st_966f78_0 *field_d8;
} st_966f78_1;

typedef struct st_966f78_3 {
    char padding_0[24];
    struct st_966f78_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[276];
    unsigned long long field_160;
    char padding_168[408];
    struct st_966f78_2 *field_300;
    char padding_308[88];
    unsigned long long field_360;
    long long field_368;
    long long field_370;
    long long field_378;
    unsigned int field_380;
    char padding_384[4];
    long long field_388;
    unsigned long long field_390;
    char padding_398[480];
    unsigned int field_578;
    char padding_57c[1432];
    unsigned int field_b14;
} st_966f78_3;

typedef struct st_966f78_2 {
    char padding_0[38];
    char field_26;
    char padding_27[25];
    unsigned int field_40;
} st_966f78_2;

typedef struct st_966f78_0 {
    char padding_0[80];
    char field_50;
} st_966f78_0;


char sub_966f78(st_966f78_3 *a0, unsigned long long a1)
{
    long long v7;  // x20
    long long v8;  // x24
    unsigned long long v17;  // x28
    unsigned long long v18;  // x8
    unsigned long long v19;  // x8
    unsigned int v20;  // w0
    long long v21;  // x13
    long long v22;  // x27
    unsigned long long v23;  // x8
    unsigned long long v24;  // x9
    unsigned int v25;  // w8
    unsigned int v26;  // w9
    long long v9;  // x25
    unsigned long v27;  // cc_dep1
    unsigned int v28;  // w8
    unsigned long long v29;  // 4108
    unsigned long long v30;  // 4108
    char v31;  // x23
    unsigned int v32;  // w8
    unsigned int v33;  // w9
    unsigned int v10;  // w0
    unsigned long long v11;  // x0
    long long v12;  // x20
    unsigned long v13;  // x22
    unsigned long long v14;  // x26
    long long v15;  // x11
    unsigned long long v16;  // x10
    long long v0;  // [bp-0xa0]
    long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x6c]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a0->field_370;
    v8 = a0->field_368;
    v9 = a0->field_388;
    v10 = sub_9e4290(v7);
    if (sub_a4fdf4(v7) == 6 || sub_a4fdf4(v7) == 7)
    {
        v11 = 4;
LABEL_966fe8:
        v4 = a0->field_390;
        v13 = v10;
        v14 = v11 & 0xffffffff;
        if ((unsigned int)a1 == 33 || (unsigned int)a1 == 18)
        {
            v16 = v9 * 2;
            v19 = v9 + v13;
            v17 = v19 * 2;
            v18 = (v19 + v14) * 2;
            v15 = v8;
        }
        else
        {
            v15 = v8 + v9;
            v16 = v13 + v9 * 2;
            v17 = v16 + v13 + v14;
            v18 = v17 + v14;
        }
        if (v18 > a0->field_360)
        {
            v12 = 0xaa;
LABEL_967044:
            sub_a368c8();
            sub_a369bc("ssl/t1_enc.c", v12, "tls1_change_cipher_state");
            sub_9a58a4(a0, 80, 0xc0103, 0);
        }
        else
        {
            v1 = v15;
            v2 = v16;
            v20 = sub_a4fdf4(v7);
            v3 = a0->field_380;
            if (v20 == 6)
            {
LABEL_9670e0:
                v21 = 16;
            }
            else if (v20 == 7)
            {
                if (!(a0->field_300->field_26 & 3))
                    v21 = 16;
                else
                    v21 = 8;
            }
            else
            {
                if (sub_a4fe08(v7, "CHACHA20-POLY1305"))
                    goto LABEL_9670e0;
                v21 = a0->field_388;
            }
            v22 = a0->field_378;
            v23 = a0->field_160;
            v24 = a0->field_b14 != 0;
            if (!(a1 & 1))
            {
                a0->field_160 = v23 & 0xfffffffffffff800 | (v23 & 0xfffffffffffffbff | (v24 * 0x400 | v24 >> 54) & 0x400) & 0x7ff;
                v25 = a0->field_300->field_40;
                v26 = a0->field_578 & 0xfffffffc | (a0->field_578 & 0xfffffffd | (v25 >> 16) * 2 & 2) & 3;
                v27 = v25 & 0x20000;
                if (!(v25 & 0x20000))
                {
                    v28 = v26 & 0xfffffff7;
                    v29 = arm64g_calculate_condition(9, v27, 0, 0);
                    if (!(v29 & 1))
                        goto LABEL_967132;
LABEL_967131:
                }
                else
                {
                    v28 = v26 | 8;
                    v30 = arm64g_calculate_condition(9, v27, 0, 0);
                    if (v30 & 1)
                        goto LABEL_967131;
LABEL_967132:
                }
                v31 = 1;
            }
            else
            {
                a0->field_160 = v23 & 0xfffffffffffffe00 | (v23 & 0xfffffffffffffeff | (v24 * 0x100 | v24 >> 56) & 0x100) & 0x1ff;
                v32 = a0->field_300->field_40;
                v33 = a0->field_578 & 0xfffffffe | (v32 * 0x10000 | v32 >> 16) & 0xffff0001 & 1;
                if (!(v32 & 0x20000))
                    v28 = v33 & 0xfffffffb;
                else
                    v28 = v33 | 4;
                v31 = 0;
            }
            a0->field_578 = v28;
            if (a0->field_18->field_d8->field_50 >> 3 & 1)
                sub_991e20(a0, a1);
            *(unsigned int *)&v0 = v3;
            if (sub_992148(a0, a0->field_48, v31, 3, 0, 0, v8 + v2, v13, v8 + v17, v14, v1, v9, v7, v21, v0, v22, v4, 0))
                return 1;
        }
        return 0;
    }
    v11 = sub_a50728(v7);
    if (!(v11 >> 31 & 1))
        goto LABEL_966fe8;
    v12 = 148;
    goto LABEL_967044;
}
