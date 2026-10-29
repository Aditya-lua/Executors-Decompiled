/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a29b0..0x9a2a64 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a29b0_1 {
    char padding_0[1246];
    unsigned short field_4de;
    long long field_4e0;
    unsigned short field_4e8;
    char padding_4ea[1046];
    struct st_9a29b0_0 *field_900;
} st_9a29b0_1;

typedef struct st_9a29b0_0 {
    char padding_0[776];
    unsigned int field_308;
} st_9a29b0_0;


long long sub_9a29b0(st_9a29b0_1 *a0, unsigned int a1, unsigned long a2)
{
    long long v2;  // x0
    st_9a29b0_1 *v3;  // x0
    long long v4;  // x1
    long long v5;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_4de = a1;
    a0->field_4e8 = a1;
    a0->field_900->field_308 = a1;
    v2 = sub_956d2c();
    a0->field_4e0 = v2;
    if (v2)
    {
        if ((int)sub_96d378() > 0)
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 637, "tls_accept_ksgroup");
        v3 = a0;
        v4 = 47;
        v5 = 306;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 630, "tls_accept_ksgroup");
        v3 = a0;
        v4 = 80;
        v5 = 314;
    }
    sub_9a58a4(v3, v4, v5, 0);
    return 0;
}
