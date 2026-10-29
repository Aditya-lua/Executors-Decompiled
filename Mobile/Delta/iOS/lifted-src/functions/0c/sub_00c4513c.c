/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4513c..0xc45340 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4513c_5 {
    char padding_0[8];
    struct st_c4513c_3 *field_8;
    unsigned int field_10;
} st_c4513c_5;

typedef struct st_c4513c_3 {
    char padding_0[24];
    struct st_c4513c_4 *field_18;
} st_c4513c_3;

typedef struct st_c4513c_1 {
    char padding_0[56];
    long long field_38;
    long long field_40;
} st_c4513c_1;

typedef struct st_c4513c_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[55];
    long long field_40;
    long long field_48;
} st_c4513c_0;

typedef struct st_c4513c_4 {
    unsigned long long field_0;
} st_c4513c_4;

extern unsigned long long g_c3efb4;
extern long long g_cba67f;
extern long long g_e0d604;
extern long long g_e0d6db;
extern long long g_efcad8;
extern long long g_efce00;
extern long long g_efce30;
extern long long g_efd4c8;

unsigned long long sub_c4513c(st_c4513c_0 *a0, st_c4513c_5 *a1)
{
    long long v9;  // x20
    long long v10;  // x21
    char v11;  // x0
    unsigned long long v13;  // 4110
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long v16;  // x8
    unsigned long long *v0;  // [bp-0x88]
    uint128_t v1;  // [bp-0x80], Other Possible Types: char, unsigned long
    long long v2;  // [bp-0x78]
    st_c4513c_5 *v3;  // [bp-0x70], Other Possible Types: long long
    st_c4513c_1 **v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    char v6;  // [bp-0x51]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    if (a0->field_0 == 2)
    {
        v9 = a0->field_48;
        if (!a0->field_48)
            return 0;
        v10 = a0->field_40;
        while (1)
        {
            sub_be8f00(&v1, v10, v9);
            if (v1 != 1)
                break;
            if (sub_be7850(a1, &g_e0d6db, 3) & 1)
            {
                return 1;
            }
            else if ((char)v3 & 1)
            {
                v11 = v2 + *(char *)((void*)&v3 + 1);
                if ((unsigned long long)v9 < v11)
                {
                    sub_c73bb0(v11, v9, v9, &g_efd4c8);
                    sub_c73d64("`fmt::Error` from `SizeLimitedFmtAdapter` was discardedSizeLimitExhaustedParseIntErrorEmptyInvalidDigitPosOverflowNegOverflow00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899", 55, &v6, &g_efcad8, &g_efce30);
                }
                v10 += v11;
                v13 = arm64g_calculate_condition(20, v9, v11, 0);
                v9 -= v11;
                if (!(v13 & 1))
                    return 0;
            }
            else
            {
                return 0;
            }
        }
        v14 = sub_be7850(a1, v2, v3);
        if (!(unsigned int)v14)
            return v14;
        return 1;
    }
    if (a0->field_0 != 1)
        a1->field_8->field_18();
    v0 = &a0->field_8;
    v1 = 0xf42400000000000000000;
    v3 = a1;
    if (!(a1->field_10 >> 23 & 1))
    {
        v4 = &v0;
        v5 = &g_c3efb4;
        v15 = sub_be769c(&v1, &g_efce00, &g_cba67f, &v4);
        v16 = *(unsigned int *)&v1;
        if ((unsigned int)v15)
            goto LABEL_c45294;
    }
    else
    {
        v4 = &v0;
        v5 = &g_c3efb4;
        v15 = sub_be769c(&v1, &g_efce00, &g_e0d604, &v4);
        v16 = *(unsigned int *)&v1;
        if ((unsigned int)v15)
        {
LABEL_c45294:
            if (v16 & 1)
                a1->field_8->field_18();
        }
    }
    if (v15 & 1)
    {
        return 1;
    }
    else if (!(unsigned int)v16)
    {
        a1->field_8->field_18();
    }
    else
    {
        sub_c73d64("`fmt::Error` from `SizeLimitedFmtAdapter` was discardedSizeLimitExhaustedParseIntErrorEmptyInvalidDigitPosOverflowNegOverflow00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899", 55, &v6, &g_efcad8, &g_efce30);
    }
}
