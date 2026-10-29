/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9710e8..0x971220 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9710e8_0 {
    char padding_0[3040];
    struct st_9710e8_1 *field_be0;
    char padding_be8[16];
    long long field_bf8;
    long long field_c00;
    char padding_c08[8];
    long long field_c10;
    char padding_c18[40];
    int field_c40;
} st_9710e8_0;

typedef struct st_9710e8_1 {
    unsigned long long field_0;
} st_9710e8_1;


unsigned long long sub_9710e8(st_9710e8_0 *a0)
{
    st_9710e8_0 *v2;  // x19
    int v3;  // w0
    long long v4;  // x1
    long long v5;  // x1
    long long v6;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (!(sub_9e53a8(a0->field_c00, v2->field_bf8) >> 31 & 1) || !(sub_9e53a8(v2->field_c10, v2->field_bf8) >> 31 & 1) || sub_9e4828(v2->field_c10))
    {
        sub_a368c8();
        sub_a369bc("ssl/tls_srp.c", 398, "srp_verify_server_param");
        v5 = 47;
        v6 = 390;
    }
    else
    {
        v3 = sub_9e46a8(v2->field_bf8);
        if (v2->field_c40 > v3)
        {
            sub_a368c8();
            v4 = 403;
        }
        else if (v2->field_be0)
        {
            v2->field_be0();
        }
        else
        {
            if (sub_ad5dbc(v2->field_c00, v2->field_bf8))
                return 1;
            sub_a368c8();
            v4 = 416;
        }
        sub_a369bc("ssl/tls_srp.c", v4, "srp_verify_server_param");
        v5 = 71;
        v6 = 241;
    }
    sub_9a58a4(v2, v5, v6, 0);
    return 0;
}
