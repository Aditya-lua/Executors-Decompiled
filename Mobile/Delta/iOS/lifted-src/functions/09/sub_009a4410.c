/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a4410..0x9a44f0 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a4410_0 {
    char padding_0[8];
    long long field_8;
} st_9a4410_0;

typedef struct st_9a4410_1 {
    char padding_0[2968];
    struct st_9a4410_0 *field_b98;
} st_9a4410_1;


st_9a4410_0 * sub_9a4410(st_9a4410_1 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_b98)
        return 2;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_c68d5c(a1, 14, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, 2, 2) && sub_c68d5c(a1, a0->field_b98->field_8, 2) && sub_c68d5c(a1, 0, 1) && sub_a6e970(a1))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 1859, "tls_construct_stoc_use_srtp");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
