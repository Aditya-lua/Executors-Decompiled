/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963788..0x9639ec (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_963788_2 {
    struct st_963788_0 *field_0;
    struct st_963788_1 *field_8;
} st_963788_2;

typedef struct st_963788_1 {
    unsigned short field_0;
} st_963788_1;

typedef struct st_963788_3 {
    char padding_0[928];
    struct st_963788_1 *field_3a0;
    struct st_963788_1 *field_3a8;
} st_963788_3;

typedef struct st_963788_0 {
    struct st_963788_1 *field_0;
    unsigned short field_1;
} st_963788_0;


unsigned short * sub_963788(st_963788_3 *a0, st_963788_2 *a1, unsigned short *a2)
{
    unsigned short *v2;  // x8
    unsigned short *v3;  // x9
    unsigned short *v12;  // x10
    unsigned short *v13;  // x20
    unsigned short *v14;  // x20
    unsigned short *v15;  // x0
    st_963788_3 *v4;  // x0
    long long v5;  // x1
    long long v6;  // x2
    st_963788_1 **v7;  // x21
    unsigned short *v8;  // x20
    st_963788_0 *v9;  // x22
    unsigned short *iter;  // x0
    unsigned short *v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2)
    {
        v3 = 2;
        if (a2)
            v3 = 3;
        if ((char *)v2 - v3 * v2 / v3)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 0x1ba8, "ssl_cache_cipherlist");
            v4 = a0;
            v5 = 50;
            v6 = 151;
        }
        else
        {
            v7 = &a0->field_3a0;
            sub_a6c2e4(a0->field_3a0, "ssl/ssl_lib.c", 0x1bac);
            *(uint128_t *)&a0->field_3a0 = 0;
            if (a2)
            {
                v8 = a1->field_8;
                v9 = a1->field_0;
                iter = sub_a6bf4c(v8 * 12297829382473034411 >> 64 & 0xfffffffffffffffe, "ssl/ssl_lib.c", 0x1bbd);
                *v7 = iter;
                if (iter)
                {
                    a0->field_3a8 = 0;
                    if (!v8)
                        return 1;
                    v11 = 0;
                    v12 = (char *)&v9->field_0 + 1;
                    while (1)
                    {
                        v13 = v8;
                        if (!*((char *)v12 - 1))
                        {
                            if (v13 < 3)
                                break;
                            *iter = *v12;
                            v11 += 1;
                            a0->field_3a8 = v11;
                        }
                        else if (v13 <= 2)
                        {
                            break;
                        }
                        iter += 1;
                        v12 = (char *)&v12[1] + 1;
                        v8 = (char *)v13 - 3;
                        if (v13 == 3)
                            return 1;
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/ssl_lib.c", 0x1bcc, "ssl_cache_cipherlist");
                    sub_9a58a4(a0, 50, 240, 0);
                    sub_a6c2e4(a0->field_3a0, "ssl/ssl_lib.c", 0x1bcd);
                    *v7 = 0;
                    v7[1] = 0;
                    return 0;
                }
                sub_a368c8();
                sub_a369bc("ssl/ssl_lib.c", 0x1bc0, "ssl_cache_cipherlist");
                v4 = a0;
                v5 = 80;
                v6 = 524303;
            }
            else
            {
                sub_a6c2e4(0, "include/internal/packet.h", 454);
                *v7 = 0;
                v7[1] = 0;
                v14 = a1->field_8;
                if (!v14)
                    return 1;
                v15 = sub_a6dac4(a1->field_0, v14, "include/internal/packet.h", 463);
                *v7 = v15;
                if (v15)
                {
                    a0->field_3a8 = v14;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("ssl/ssl_lib.c", 0x1bd7, "ssl_cache_cipherlist");
                v4 = a0;
                v5 = 80;
                v6 = 786691;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 0x1ba3, "ssl_cache_cipherlist");
        v4 = a0;
        v5 = 50;
        v6 = 183;
    }
    sub_9a58a4(v4, v5, v6, 0);
    return 0;
}
