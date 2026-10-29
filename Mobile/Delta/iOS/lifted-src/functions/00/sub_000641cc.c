/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x641cc..0x64448 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_641cc_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char padding_80[10];
    char field_8a;
} st_641cc_6;

typedef struct st_641cc_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_641cc_4 *field_28;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    char padding_130[10];
    char field_13a;
} st_641cc_3;

typedef struct st_641cc_7 {
    struct st_641cc_2 *field_0;
    struct st_641cc_2 *field_8;
    struct st_641cc_2 *field_10;
    char padding_18[24];
    struct st_641cc_3 *field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    char padding_58[8];
    unsigned long long field_60;
    unsigned long long field_68;
    struct st_641cc_4 *field_70;
    uint128_t field_78;
    uint128_t field_88;
    uint128_t field_98;
    uint128_t field_a8;
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    uint128_t field_f8;
    uint128_t field_108;
    uint128_t field_118;
    uint128_t field_128;
    uint128_t field_138;
    uint128_t field_148;
    uint128_t field_158;
    uint128_t field_168;
    char padding_178[10];
    char field_182;
} st_641cc_7;

typedef struct st_641cc_0 {
    char padding_0[32];
    struct st_641cc_1 *field_20;
} st_641cc_0;

typedef struct st_641cc_5 {
    char padding_0[16];
    struct st_641cc_2 *field_10;
    struct st_641cc_2 *field_18;
    struct st_641cc_2 *field_20;
    char padding_28[24];
    struct st_641cc_3 *field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    char field_58;
    char padding_59[7];
    unsigned long long field_60;
    char padding_68[8];
    unsigned long long field_70;
    long long field_78;
    struct st_641cc_4 *field_80;
    uint128_t field_88;
    uint128_t field_98;
    uint128_t field_a8;
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    uint128_t field_f8;
    uint128_t field_108;
    uint128_t field_118;
    uint128_t field_128;
    uint128_t field_138;
    uint128_t field_148;
    uint128_t field_158;
    uint128_t field_168;
    uint128_t field_178;
    char padding_188[10];
    long long field_192;
} st_641cc_5;

typedef struct st_641cc_1 {
    unsigned long long field_0;
} st_641cc_1;

typedef struct st_641cc_4 {
    struct st_641cc_0 *field_0;
} st_641cc_4;

typedef struct st_641cc_2 {
    char field_0;
} st_641cc_2;


unsigned long long sub_641cc(st_641cc_5 *a0)
{
    unsigned long long v6;  // x0
    char *v7;  // x8
    unsigned long v16;  // x8
    unsigned long v17;  // x10
    st_641cc_3 *v18;  // x9
    unsigned long long v20;  // x10
    st_641cc_6 *v21;  // x8
    uint128_t v22;  // q1
    uint128_t v23;  // q1
    uint128_t v24;  // q1
    uint128_t v25;  // q1
    char *v8;  // x9
    unsigned long long count;  // x0
    st_641cc_0 **v27;  // x0
    unsigned long long n;  // x20
    unsigned long long v10;  // x10
    unsigned long long v11;  // x0
    st_641cc_7 *v12;  // x19
    long long v13;  // x0
    unsigned long long count1;  // x0
    char *v15;  // x8
    st_641cc_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_641cc_2 *v1;  // [bp-0x48]
    char v2;  // [bp-0x31]
    char v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_78)
        return 0xffffffff;
    v6 = sub_64064();
    v7 = a0->field_18;
    if (v7)
    {
        v8 = a0->field_20;
        if (!(v6 & 1))
            goto LABEL_64274;
LABEL_64210:
        n = 0;
        if (v7 == v8)
            goto LABEL_64298;
LABEL_6421c:
        v11 = *v7;
        v12 = &a0->field_10;
        if (a0->field_10 != &v2)
            return v11;
    }
    else
    {
        v7 = &v3;
        a0->field_10 = &v2;
        a0->field_18 = &v3;
        a0->field_20 = &v3;
        v8 = &v3;
        if (v6 & 1)
            goto LABEL_64210;
LABEL_64274:
        v10 = (v8 - a0->field_10) / 2;
        if (v10 < 4)
            n = v10;
        else
            n = 4;
        if (v7 != v8)
            goto LABEL_6421c;
LABEL_64298:
        _memmove(a0->field_10, &v8[-1 * n], n);
        if (a0->padding_188[2] == 1)
        {
            v13 = &a0->field_10[n];
            count1 = _fread(v13, 1, &a0->field_20[-1 * v13], a0->field_78);
            if (!count1)
                goto LABEL_64414;
            v15 = &a0->field_10[n];
            a0->field_18 = v15;
            a0->field_20 = &v15[count1];
            v11 = *v15;
            v12 = &a0->field_10;
            if (a0->field_10 != &v2)
                return v11;
        }
        else
        {
            v16 = a0->field_50;
            if (v16 != a0->field_48)
            {
                _memmove(a0->field_40);
                v16 = a0->field_48;
                v17 = a0->field_50;
            }
            else
            {
                v17 = v16;
            }
            v18 = a0->field_40;
            a0->field_48 = &v18->padding_0[v17 + -1 * v16];
            if (v18 != &a0->field_58)
                v20 = a0->field_60;
            else
                v20 = 8;
            a0->field_50 = &v18->padding_0[v20];
            v21 = (char *)&a0->field_f8 + 8;
            v22 = *(int128_t *)((char *)&a0->field_c8 + 8);
            v21->field_40 = *(int128_t *)((char *)&a0->field_b8 + 8);
            v21->field_50 = v22;
            v23 = *(int128_t *)((char *)&a0->field_e8 + 8);
            v21->field_60 = *(int128_t *)((char *)&a0->field_d8 + 8);
            v21->field_70 = v23;
            v24 = *(int128_t *)((char *)&a0->field_88 + 8);
            v21->field_0 = *(int128_t *)&(&a0->field_80)[1];
            v21->field_10 = v24;
            v25 = *(int128_t *)((char *)&a0->field_a8 + 8);
            v21->field_20 = *(int128_t *)((char *)&a0->field_98 + 8);
            v21->field_30 = v25;
            count = _fread();
            if (count)
            {
                v27 = a0->field_80;
                if (!v27)
                    sub_64d58(NULL);
                a0->field_50 = a0->field_48 + count;
                *v27->field_20();
            }
LABEL_64414:
            v11 = 0xffffffff;
            v12 = &a0->field_10;
            if (a0->field_10 != &v2)
                return 0xffffffff;
        }
    }
    memset(v12, 0, 24);
    return v11;
}
