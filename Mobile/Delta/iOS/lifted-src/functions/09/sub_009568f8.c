/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9568f8..0x956b1c (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9568f8_0 {
    char padding_0[8];
    struct st_9568f8_1 *field_8;
} st_9568f8_0;

typedef struct st_9568f8_2 {
    char padding_0[216];
    struct st_9568f8_0 *field_d8;
} st_9568f8_2;

typedef struct st_9568f8_3 {
    char padding_0[28];
    unsigned int field_1c;
} st_9568f8_3;

typedef struct st_9568f8_1 {
    unsigned long long field_0;
} st_9568f8_1;

typedef struct st_9568f8_4 {
    char padding_0[24];
    struct st_9568f8_2 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[644];
    struct st_9568f8_3 *field_300;
    char padding_308[184];
    long long field_3c0;
    long long field_3c8;
} st_9568f8_4;


unsigned long long sub_9568f8(st_9568f8_4 *a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    long long n;  // x24
    unsigned long v3;  // x28
    long long n1;  // x25
    long long v5;  // x22
    unsigned long long v6;  // x0
    unsigned short *v8;  // x26
    unsigned long v9;  // x0
    unsigned short *v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    n = a2;
    v3 = a0->field_300->field_1c;
    if (!(v3 & 456))
        a0->field_18->field_d8->field_8();
    n1 = a0->field_3c8;
    if (!(v3 & 8))
        v5 = n;
    else
        v5 = n1;
    v6 = sub_a6bf4c();
    if (v6)
    {
        v8 = v6;
        *v8 = (((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        v9 = v8 + 1;
        if (!(v3 >> 3 & 1))
            _memcpy(v9, a1, n);
        else
            _bzero(v9, n1);
        v10 = v9 + v5;
        *v10 = (((((n1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | n1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((n1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | n1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        _memcpy(v10 + 1, a0->field_3c0, n1);
        sub_a6c4e8(a0->field_3c0, n1, "ssl/s3_lib.c", 0x1478);
        *(uint128_t *)&a0->field_3c0 = 0;
        a0->field_18->field_d8->field_8();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x146b, "ssl_generate_master_secret");
        sub_9a58a4(a0, 80, 0x8000f, 0);
        if (a1)
        {
            if (a3)
            {
                sub_a6c4e8(a1, v5, "ssl/s3_lib.c", 0x1495);
            }
            else
            {
                sub_a66ec0(a1, v5);
                if (a0->field_78)
                    return v6;
                *(uint128_t *)&a0->padding_308[168] = 0;
                return v6;
            }
        }
        if (a0->field_78)
            return v6;
        *(uint128_t *)&a0->padding_308[168] = 0;
        return v6;
    }
}
