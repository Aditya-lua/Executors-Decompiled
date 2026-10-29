/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98aa8c..0x98ab2c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98aa8c_0 {
    char padding_0[168];
    char field_a8;
} st_98aa8c_0;

typedef struct st_98aa8c_1 {
    struct st_98aa8c_0 *field_0;
    char padding_8[48];
    unsigned int field_38;
} st_98aa8c_1;


st_98aa8c_1 * sub_98aa8c(st_98aa8c_1 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_tls.c", 553, "quic_app_data_pending");
        sub_a36abc(20, 0xc0101, 0);
        return 0;
    }
    a0->field_38 = 80;
    sub_a368c8();
    sub_a369bc("ssl/quic/quic_tls.c", 553, "quic_app_data_pending");
    sub_a36abc(20, 0xc0101, 0);
    a0->field_0->field_a8 = a0->field_0->field_a8 | 2;
    return 0;
}
