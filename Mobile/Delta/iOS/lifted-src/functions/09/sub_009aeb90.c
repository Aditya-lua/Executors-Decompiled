/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aeb90..0x9aecf0 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aeb90_1 {
    int field_0;
    char padding_4[212];
    struct st_9aeb90_0 *field_d8;
} st_9aeb90_1;

typedef struct st_9aeb90_2 {
    char padding_0[24];
    struct st_9aeb90_1 *field_18;
    char padding_20[140];
    unsigned int field_ac;
    char padding_b0[248];
    long long field_1a8;
    char padding_1b0[1752];
    char field_888;
    char padding_889[63];
    long long field_8c8;
} st_9aeb90_2;

typedef struct st_9aeb90_3 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned short field_20;
} st_9aeb90_3;

typedef struct st_9aeb90_0 {
    char padding_0[80];
    char field_50;
} st_9aeb90_0;

typedef struct st_9aeb90_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned short field_60;
} st_9aeb90_4;


unsigned long long sub_9aeb90(st_9aeb90_2 *a0, st_9aeb90_4 *a1, st_9aeb90_4 **a2, unsigned long long *a3)
{
    uint128_t v3;  // q0
    st_9aeb90_3 *v4;  // x8
    uint128_t v5;  // q1
    long long *v6;  // x22
    st_9aeb90_4 *v7;  // x23
    unsigned long long v8;  // x0
    long long v9;  // x8
    unsigned long long v10;  // x0
    long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        v3 = CONCAT(0x2020202020202020, 0x2020202020202020);
        a1->field_20 = v3;
        a1->field_30 = v3;
        a1->field_0 = v3;
        a1->field_10 = v3;
        if (a0->field_ac - 43 < 2)
            v4 = "TLS 1.3, server CertificateVerify";
        else
            v4 = "TLS 1.3, client CertificateVerify";
        v5 = v4->field_10;
        a1->field_40 = v4->field_0;
        a1->field_50 = v5;
        a1->field_60 = v4->field_20;
        if (a0->field_ac == 43 || a0->field_ac == 33)
        {
            v6 = &a0->field_8c8;
            v7 = a1;
            _memcpy(a1 + 1, &a0->field_888, a0->field_8c8);
        }
        else
        {
            v6 = &v0;
            v7 = a1;
            v8 = sub_962d78(a0, a1 + 1, 64, &v0);
            if (!(unsigned int)v8)
                return v8;
        }
        v9 = *v6;
        *a2 = v7;
        *a3 = v9 + 98;
    }
    else
    {
        v10 = sub_9d46fc(a0->field_1a8, 3, 0, a2);
        if ((long long)v10 < 1)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 304, "get_cert_verify_tbs_data");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            return 0;
        }
        *a3 = v10;
    }
    return 1;
}
