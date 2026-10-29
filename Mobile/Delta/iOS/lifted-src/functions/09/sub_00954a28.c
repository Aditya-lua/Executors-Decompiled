/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954a28..0x954bdc (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954a28_0 {
    unsigned int field_0;
    char padding_4[68];
    unsigned int field_48;
    char padding_4c[276];
    unsigned long long field_160;
    char padding_168[424];
    char field_310;
    char padding_311[55];
    long long field_348;
    char padding_350[8];
    long long field_358;
    char padding_360[64];
    long long field_3a0;
    char padding_3a8[8];
    long long field_3b0;
    long long field_3b8;
    char padding_3c0[32];
    long long field_3e0;
    long long field_3e8;
    char padding_3f0[24];
    long long field_408;
    char padding_410[168];
    long long field_4b8;
    char padding_4c0[8];
    long long field_4c8;
    char padding_4d0[16];
    long long field_4e0;
    char padding_4e8[1560];
    long long field_b00;
} st_954a28_0;

extern long long g_afa390;

st_954a28_0 * sub_954a28(st_954a28_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long *v17;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_954a28_0 *v12;  // x19
    unsigned long v13;  // x8
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned long long idx;  // x20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0;
    v13 = a0->field_0;
    if (!(unsigned int)v13)
    {
LABEL_954a64:
        sub_9543e4(v12);
        sub_a6c2e4(v12->field_348, "ssl/s3_lib.c", 3888);
        sub_ad6958(v12->field_358, &g_afa390);
        sub_a6c2e4(v12->field_3a0, "ssl/s3_lib.c", 3890);
        sub_a6c4e8(v12->field_3b0, v12->field_3b8, "ssl/s3_lib.c", 3891);
        sub_a6c2e4(v12->field_3e0, "ssl/s3_lib.c", 3892);
        sub_a6c2e4(v12->field_3e8, "ssl/s3_lib.c", 3893);
        sub_a6c2e4(v12->field_408, "ssl/s3_lib.c", 3894);
        sub_a5a4c8(v12->field_4e0);
        v15 = *(long long *)&v12->padding_311[39];
        if (v15)
        {
            idx = 0;
            v17 = &v12->field_310;
            do
            {
                if (v17[idx])
                {
                    if (*(long long *)&v12->padding_168[416] == v17[idx])
                        *(unsigned long long *)&v12->padding_168[416] = 0;
                    sub_a5a4c8();
                    v17[idx] = 0;
                    v15 = *(long long *)&v12->padding_311[39];
                }
            } while ((idx += 1, v15 > idx));
        }
        *(unsigned long long *)&v12->padding_311[39] = 0;
        if (*(long long *)&v12->padding_168[416])
        {
            sub_a5a4c8(*(long long *)&v12->padding_168[416]);
            *(unsigned long long *)&v12->padding_168[416] = 0;
        }
        sub_9544bc(v12);
        sub_a6c2e4(v12->field_4b8, "ssl/s3_lib.c", 3915);
        sub_a6c2e4(v12->field_4c8, "ssl/s3_lib.c", 3916);
        _bzero(&v12->field_160, 912);
        v12->field_160 = v12->field_160 & 0x6000;
        v14 = sub_95f408(v12);
        if ((unsigned int)v14)
        {
            v12->field_48 = 0x300;
            sub_a6c2e4(v12->field_b00, "ssl/s3_lib.c", 3932);
            *(uint128_t *)&v12->field_b00 = 0;
            v14 = 1;
        }
    }
    else if (!(v13 >> 7 & 1))
    {
        v14 = 0;
    }
    else
    {
        v12 = sub_980dc8(v12);
        v14 = v12;
        if (v14)
            goto LABEL_954a64;
    }
    return v14;
}
