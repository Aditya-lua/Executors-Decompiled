/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9709b4..0x970bf0 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9709b4_0 {
    char padding_0[8];
    struct st_9709b4_0 *field_8;
    char padding_10[816];
    uint128_t field_340;
    uint128_t field_350;
    struct st_9709b4_0 *field_360;
    struct st_9709b4_0 *field_368;
    struct st_9709b4_0 *field_370;
    struct st_9709b4_0 *field_378;
    struct st_9709b4_0 *field_380;
    struct st_9709b4_0 *field_388;
    struct st_9709b4_0 *field_390;
    struct st_9709b4_0 *field_398;
    struct st_9709b4_0 *field_3a0;
    struct st_9709b4_0 *field_3a8;
    unsigned int field_3b0;
    char padding_3b4[4];
    unsigned long long field_3b8;
    char padding_3c0[2064];
    uint128_t field_bd0;
    uint128_t field_be0;
    struct st_9709b4_0 *field_bf0;
    struct st_9709b4_0 *field_bf8;
    struct st_9709b4_0 *field_c00;
    struct st_9709b4_0 *field_c08;
    struct st_9709b4_0 *field_c10;
    struct st_9709b4_0 *field_c18;
    struct st_9709b4_0 *field_c20;
    struct st_9709b4_0 *field_c28;
    struct st_9709b4_0 *field_c30;
    struct st_9709b4_0 *field_c38;
    unsigned int field_c40;
    char padding_c44[4];
    unsigned long long field_c48;
} st_9709b4_0;


int sub_9709b4(st_9709b4_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_9709b4_0 *v19;  // x0
    st_9709b4_0 *v20;  // x0
    st_9709b4_0 *v21;  // x0
    st_9709b4_0 *v22;  // x0
    st_9709b4_0 *v23;  // x0
    st_9709b4_0 *v24;  // x0
    st_9709b4_0 *v25;  // x0
    long long v26;  // x21
    st_9709b4_0 *v27;  // x0
    st_9709b4_0 *v28;  // x0
    unsigned long long v11;  // x22
    st_9709b4_0 *v29;  // x0
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_9709b4_0 *v16;  // x21
    long long v17;  // x20
    st_9709b4_0 *v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        v16 = a0->field_8;
        if (v16)
        {
            v17 = 524291;
            memset(&a0->field_bd0, 0, 128);
            a0->field_bd0 = v16->field_340;
            a0->field_be0 = v16->field_350;
            a0->field_c40 = v16->field_3b0;
            if ((!v16->field_368 || (v18 = sub_9e4b00(v16->field_368), a0->field_bf8 = v18, v18)) && (!v16->field_370 || (v19 = sub_9e4b00(v16->field_370), a0->field_c00 = v19, v19)) && (!v16->field_378 || (v20 = sub_9e4b00(v16->field_378), a0->field_c08 = v20, v20)) && (!v16->field_380 || (v21 = sub_9e4b00(v16->field_380), a0->field_c10 = v21, v21)) && (!v16->field_388 || (v22 = sub_9e4b00(v16->field_388), a0->field_c18 = v22, v22)) && (!v16->field_390 || (v23 = sub_9e4b00(v16->field_390), a0->field_c20 = v23, v23)) && (!v16->field_3a0 || (v24 = sub_9e4b00(v16->field_3a0), a0->field_c30 = v24, v24)) && (!v16->field_398 || !(v25 = sub_9e4b00(v16->field_398), a0->field_c28 = v25, !v25)))
            {
                v17 = 786691;
                if (v16->field_360 && (v27 = sub_a6d9b4(v16->field_360, "ssl/tls_srp.c", 115), a0->field_bf0 = v27, !v27))
                {
                    v26 = 116;
                }
                else if (!v16->field_3a8 || (v28 = sub_a6d9b4(v16->field_3a8, "ssl/tls_srp.c", 0x77), a0->field_c38 = v28, v28))
                {
                    a0->field_c48 = v16->field_3b8;
                    v29 = 1;
                    goto LABEL_970bcc;
                }
                else
                {
                    v26 = 120;
                }
            }
            else
            {
                v26 = 112;
            }
            sub_a368c8();
            sub_a369bc("ssl/tls_srp.c", v26, "ssl_srp_ctx_init_intern");
            sub_a36abc(20, v17, 0);
            sub_a6c2e4(a0->field_bf0, "ssl/tls_srp.c", 127);
            sub_a6c2e4(a0->field_c38, "ssl/tls_srp.c", 128);
            sub_9e48d4(a0->field_bf8);
            sub_9e48d4(a0->field_c00);
            sub_9e48d4(a0->field_c08);
            sub_9e48d4(a0->field_c10);
            sub_9e48d4(a0->field_c18);
            sub_9e48d4(a0->field_c20);
            sub_9e48d4(a0->field_c28);
            sub_9e48d4(a0->field_c30);
            v29 = 0;
            memset(&a0->field_bd0, 0, 128);
        }
        else
        {
            v29 = 0;
        }
LABEL_970bcc:
        a0 = v29;
    }
    return (unsigned int)a0;
}
