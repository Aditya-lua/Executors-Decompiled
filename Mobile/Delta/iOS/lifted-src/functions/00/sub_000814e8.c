/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x814e8..0x81850 (872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_814e8_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[40];
    struct st_814e8_2 *field_48;
    char padding_50[2112];
    unsigned long long field_890;
    unsigned long long field_898;
    char padding_8a0[8];
    unsigned long long field_8a8;
    char padding_8b0[8];
    unsigned long long field_8b8;
    char padding_8c0[8];
    unsigned long long field_8c8;
    unsigned long long field_8d0;
    char padding_8d8[8];
    unsigned int field_8e0;
    char padding_8e4[32];
    unsigned int field_904;
    char padding_908[184];
    unsigned long long field_9c0;
    unsigned int field_9c8;
    char padding_9cc[44];
    struct st_814e8_2 *field_9f8;
} st_814e8_3;

typedef struct st_814e8_4 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[32];
    unsigned int field_2c;
    char padding_30[184];
    unsigned long long field_e8;
    unsigned int field_f0;
    char padding_f4[44];
    struct st_814e8_2 *field_120;
} st_814e8_4;

typedef struct st_814e8_1 {
    char padding_0[244];
    unsigned int field_f4;
    char padding_f8[12];
    unsigned int field_104;
    char padding_108[4];
    unsigned int field_10c;
    char padding_110[40];
    unsigned int field_138;
    char padding_13c[20];
    struct st_814e8_2 *field_150;
    char padding_158[56];
    unsigned int field_190;
    char padding_194[44];
    struct st_814e8_2 *field_1c0;
    char padding_1c8[520];
    unsigned long long field_3d0;
    unsigned long long field_3d8;
    unsigned long long field_3e0;
    unsigned long long field_3e8;
    char padding_3f0[40];
    struct st_814e8_2 *field_418;
    char field_420;
    char padding_421[2111];
    unsigned long long field_c60;
    unsigned long long field_c68;
    char field_c70;
    char padding_c71[7];
    unsigned long long field_c78;
    char padding_c80[8];
    unsigned long long field_c88;
    char padding_c90[8];
    unsigned long long field_c98;
    unsigned long long field_ca0;
    char field_ca8;
    char padding_ca9[7];
    unsigned int field_cb0;
    char padding_cb4[32];
    unsigned int field_cd4;
    char padding_cd8[184];
    unsigned long long field_d90;
    unsigned int field_d98;
    char padding_d9c[44];
    struct st_814e8_2 *field_dc8;
} st_814e8_1;

typedef struct st_814e8_2 {
    unsigned long long field_0;
} st_814e8_2;

typedef struct st_814e8_0 {
    char field_0;
} st_814e8_0;


unsigned long long * sub_814e8(st_814e8_1 *a0, long long a1, long long a2)
{
    unsigned long long index;  // x22
    unsigned int v11;  // w8
    unsigned long long *v20;  // x0
    unsigned long long v21;  // 4106
    long long v22;  // x0
    long long n;  // x22
    unsigned long long *v24;  // x0
    unsigned int v12;  // w9
    long long v13;  // x0
    unsigned long long idx;  // x23
    unsigned long v15;  // x4
    char *v16;  // x0
    st_814e8_4 *v17;  // x1
    st_814e8_3 *v18;  // x2
    unsigned long v19;  // x3
    unsigned long v0;  // [bp-0x80]
    st_814e8_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_814e8_0 *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    unsigned long long *v4;  // [bp-0x60]
    unsigned long long *v5;  // [bp-0x58]
    unsigned long long *v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v2 = &v1;
    v1 = &v2;
    if (6 < (unsigned long long)a2)
    {
        a0->field_3e8 = a0->field_3e0;
        a0->field_3d8 = a0->field_3d0;
        *(unsigned int *)&a0->field_418 = 0;
        index = a0->field_c98;
        a0->field_d90 = index;
        a0->field_d98 = a0->field_138;
        v11 = a1 - a0->field_cb0;
        if (v11 > a0->field_cd4 + 384)
        {
            v12 = v11 - a0->field_cd4 - 384;
            if (v12 >= 192)
                v12 = 192;
            a0->field_cd4 = v11 - v12;
        }
        v13 = sub_7d9f4(&a0->field_ca8);
        idx = a0->field_ca0;
        *(int *)(idx + 5616) = *(int *)(index + 5616);
        *(int *)(idx + 5620) = *(int *)(index + 5620);
        *(int *)(idx + 5624) = *(int *)(index + 5624);
        if (a0->field_c88 > a0->field_c78)
        {
            if (!a0->field_1c0)
            {
                v15 = a0->field_190;
                v16 = &a0->field_c70;
                v17 = &a0->field_ca8;
                v18 = &a0->field_3d0;
                v19 = idx + 5616;
            }
            else
            {
                return 0xffffffffffffffd7;
            }
        }
        else
        {
            if ((int)a0->field_150 == 1)
            {
                v4 = 0;
                v5 = 0;
                v6 = 0;
                if (a0->field_1c0)
                    return 0xffffffffffffffd7;
                v3 = a0->field_c60;
                v7 = a0->field_c68;
                v20 = sub_b4c50(&a0->field_420, &v3, &a0->field_150, a1, a2);
                v21 = arm64g_calculate_condition(130, v20, 120, 0);
                if (v21 & 1)
                    return v20;
                v15 = a0->field_190;
                v16 = &v3;
                v17 = &a0->field_ca8;
                v18 = &a0->field_3d0;
                v19 = a0->field_ca0 + 5616;
            }
            else
            {
                if (a0->field_1c0)
                {
                    v0 = 1 << ((char)a0->field_f4 & 63);
                    a0->field_1c0();
                }
                v24 = sub_828cc(a0->field_10c, a0->field_190, v13);
                a0->field_dc8 = 0;
                v24();
            }
        }
        v22 = sub_b4dd8(v16, v17, v18, v19, v15, a1, a2);
        n = v22;
        _memcpy(a0->field_3e8, a1 + a2 - v22, n);
        a0->field_3e8 = a0->field_3e8 + n;
        return 0;
    }
    else if (a0->field_10c >= 7)
    {
        sub_b4368(&a0->field_c70, a2);
        return 1;
    }
    else
    {
        sub_b52f4(&a0->field_c70, a2, a0->field_104);
        return 1;
    }
}
