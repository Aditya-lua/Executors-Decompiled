/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x965c08..0x965e7c (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_965c08_1 {
    char padding_0[672];
    struct st_965c08_0 *field_2a0;
    struct st_965c08_0 *field_2a8;
    char padding_2b0[8];
    struct st_965c08_0 *field_2b8;
    struct st_965c08_0 *field_2c0;
    struct st_965c08_0 *field_2c8;
    char padding_2d0[64];
    char field_310;
    char padding_311[15];
    struct st_965c08_0 *field_320;
    struct st_965c08_0 *field_328;
    long long field_330;
    char padding_338[16];
    struct st_965c08_0 *field_348;
    long long field_350;
    char padding_358[8];
    struct st_965c08_0 *field_360;
    struct st_965c08_0 *field_368;
    long long field_370;
} st_965c08_1;

typedef struct st_965c08_0 {
    char padding_0[672];
    struct st_965c08_0 *field_2a0;
    struct st_965c08_0 *field_2a8;
    char padding_2b0[8];
    struct st_965c08_0 *field_2b8;
    struct st_965c08_0 *field_2c0;
    struct st_965c08_0 *field_2c8;
    char padding_2d0[64];
    struct st_965c08_0 *field_310;
    char padding_318[8];
    struct st_965c08_0 *field_320;
    struct st_965c08_0 *field_328;
    struct st_965c08_0 *field_330;
    char padding_338[16];
    struct st_965c08_0 *field_348;
    char padding_350[16];
    struct st_965c08_0 *field_360;
    struct st_965c08_0 *field_368;
    char padding_370[16];
    char field_380;
    char padding_381[23];
    unsigned int field_398;
} st_965c08_0;


st_965c08_0 * sub_965c08(st_965c08_1 *a0, st_965c08_0 *a1)
{
    st_965c08_0 *ptr;  // x19
    long long v3;  // x21
    st_965c08_0 *v12;  // x0
    long long v4;  // x20
    st_965c08_0 *v5;  // x0
    st_965c08_0 *v6;  // x0
    st_965c08_0 *v7;  // x0
    st_965c08_0 *v8;  // x0
    st_965c08_0 *v9;  // x0
    st_965c08_0 *v10;  // x0
    st_965c08_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = sub_a6bf4c(928, "ssl/ssl_sess.c", 140);
    if (!ptr)
        return ptr;
    v3 = 524299;
    _memcpy(ptr, a0, 904);
    ptr->field_348 = 0;
    *(uint128_t *)&ptr->field_2a0 = 0;
    ptr->field_2b8 = 0;
    *(uint128_t *)&ptr->field_2c0 = 0;
    *(uint128_t *)&ptr->field_360 = 0;
    *(uint128_t *)&ptr->field_310 = 0;
    *(uint128_t *)&ptr->field_320 = 0;
    memset(&ptr->field_380, 0, 24);
    /* unsupported instruction */;
    ptr->field_398 = 1;
    if (!sub_a6a660(2, ptr, &ptr->field_310))
    {
        v3 = 524303;
        v4 = 181;
    }
    else if (!a0->field_2c0)
    {
LABEL_965cb8:
        if (!a0->field_2c8 || !(v5 = sub_af23d8(a0->field_2c8), ptr->field_2c8 = v5, !v5))
        {
            if (a0->field_2b8)
            {
                if (sub_a5bba8(a0->field_2b8))
                {
                    ptr->field_2b8 = a0->field_2b8;
                }
                else
                {
                    sub_9662a0(ptr);
                    return 0;
                }
            }
            if (a0->field_2a0 && !(v6 = sub_a6d9b4(a0->field_2a0, "ssl/ssl_sess.c", 209), ptr->field_2a0 = v6, v6) || a0->field_2a8 && (v7 = sub_a6d9b4(a0->field_2a8, "ssl/ssl_sess.c", 214), ptr->field_2a8 = v7, !v7))
                goto LABEL_965de0;
            if (sub_a6a674(2, &ptr->field_310, &a0->field_310))
            {
                if (!a0->field_320 || (v8 = sub_a6d9b4(a0->field_320, "ssl/ssl_sess.c", 227), ptr->field_320 = v8, v8))
                {
                    if (a1 && a0->field_328)
                    {
                        v9 = sub_a6dac4(a0->field_328, a0->field_330, "ssl/ssl_sess.c", 233);
                        ptr->field_328 = v9;
                        if (!v9)
                        {
                            sub_9662a0(ptr);
                            return 0;
                        }
                    }
                    else
                    {
                        *(uint128_t *)&ptr->field_330 = 0;
                    }
                    if ((!a0->field_348 || (v10 = sub_a6dac4(a0->field_348, a0->field_350, "ssl/ssl_sess.c", 243), ptr->field_348 = v10, v10)) && (!a0->field_360 || (v11 = sub_a6d9b4(a0->field_360, "ssl/ssl_sess.c", 250), ptr->field_360 = v11, v11)))
                    {
                        if (!a0->field_368)
                            return ptr;
                        v12 = sub_a6dac4(a0->field_368, a0->field_370, "ssl/ssl_sess.c", 0x101);
                        ptr->field_368 = v12;
                        if (v12)
                            return ptr;
                    }
                }
                goto LABEL_965de0;
            }
            else
            {
                v3 = 524303;
                v4 = 222;
            }
        }
        else
        {
            v4 = 196;
        }
    }
    else if (sub_af3b1c(a0->field_2c0))
    {
        ptr->field_2c0 = a0->field_2c0;
        goto LABEL_965cb8;
    }
    else
    {
        v4 = 0xbb;
    }
    sub_a368c8();
    sub_a369bc("ssl/ssl_sess.c", v4, "ssl_session_dup_intern");
    sub_a36abc(20, v3, 0);
LABEL_965de0:
    sub_9662a0(ptr);
    return 0;
}
