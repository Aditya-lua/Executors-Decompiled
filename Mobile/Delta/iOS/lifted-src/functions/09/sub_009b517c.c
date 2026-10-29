/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b517c..0x9b5208 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b517c_0 {
    char padding_0[2600];
    int field_a28;
    char padding_a2c[36];
    long long field_a50;
    long long field_a58;
} st_9b517c_0;


long long sub_9b517c(st_9b517c_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_c68d5c(a1, a0->field_a28, 1) && sub_a6ec4c(a1, a0->field_a50, a0->field_a58, 3))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_srvr.c", 0x1110, "tls_construct_cert_status_body");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
