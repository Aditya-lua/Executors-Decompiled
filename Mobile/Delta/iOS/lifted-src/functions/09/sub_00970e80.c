/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970e80..0x9710e8 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_970e80_0 {
    char padding_0[8];
    struct st_970e80_1 *field_8;
    char padding_10[3032];
    struct st_970e80_2 *field_be8;
    char padding_bf0[8];
    long long field_bf8;
    char padding_c00[16];
    long long field_c10;
    long long field_c18;
} st_970e80_0;

typedef struct st_970e80_2 {
    unsigned long long field_0;
} st_970e80_2;

typedef struct st_970e80_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_970e80_1;


unsigned long long * sub_970e80(st_970e80_0 *a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_ad5d28(a0->field_c10, a0->field_bf8))
    {
        v2 = sub_ad5464(a0->field_c18, a0->field_c10, a0->field_bf8, a0->field_8->field_0, a0->field_8->field_470);
        if (v2 && a0->field_be8)
            a0->field_be8();
    }
    else
    {
        v2 = 0;
    }
    sub_a368c8();
    sub_a369bc("ssl/tls_srp.c", 350, "srp_generate_client_master_secret");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    sub_9e4838();
    sub_9e4838(0);
    sub_9e4838(v2);
    return 0;
}
