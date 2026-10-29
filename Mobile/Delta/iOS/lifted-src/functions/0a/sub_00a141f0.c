/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa141f0..0xa14398 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a141f0_1 {
    char padding_0[32];
    struct st_a141f0_0 *field_20;
} st_a141f0_1;

typedef struct st_a141f0_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
} st_a141f0_0;


int sub_a141f0(long long a0, st_a141f0_1 *a1)
{
    st_a141f0_0 *v12;  // x8
    unsigned long long v14;  // x0
    unsigned long long v15;  // x21
    unsigned long v16;  // x20
    long long v0;  // [bp-0xb8]
    long long v1;  // [bp-0xac]
    unsigned long v2;  // [bp-0xa8]
    uint128_t v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x90]
    uint128_t v5;  // [bp-0x80]
    uint128_t v6;  // [bp-0x70]
    uint128_t v7;  // [bp-0x60]
    uint128_t v8;  // [bp-0x50]
    unsigned long v9;  // [bp-0x40]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a1->field_20;
    v3 = v12->field_0;
    v4 = v12->field_10;
    v5 = v12->field_20;
    v9 = v12->field_60;
    v7 = v12->field_40;
    v8 = v12->field_50;
    v6 = v12->field_30;
    v2 = 0;
    if (sub_a14c64(&v1, &v0, &v3))
    {
        sub_a198cc(&v3, sub_a198c4(&v3) | 1);
        v14 = sub_a1633c(&v3, &v2);
        if ((int)v14 > 0)
        {
            v15 = v14;
            v16 = v1;
            if (sub_9ca82c(a0, sub_a99624(408), 0, v16, v0, v2, v15))
                return 1;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_ameth.c", 192, "eckey_priv_encode");
            sub_a36abc(16, 0x8000d, 0);
            sub_a6c4e8(v2, v15 & 0xffffffff, "crypto/ec/ec_ameth.c", 193);
            if ((unsigned int)v16 == 16)
                goto LABEL_a14324;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_ameth.c", 186, "eckey_priv_encode");
            sub_a36abc(16, 0x80010, 0);
            if (v1 == 16)
            {
LABEL_a14324:
                sub_9c7940(v0);
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_ameth.c", 171, "eckey_priv_encode");
        sub_a36abc(16, 142, 0);
    }
    return 0;
}
