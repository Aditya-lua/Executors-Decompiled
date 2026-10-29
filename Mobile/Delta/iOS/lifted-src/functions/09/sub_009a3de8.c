/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3de8..0x9a3ec4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a3de8_0 {
    char padding_0[768];
    struct st_9a3de8_1 *field_300;
    char padding_308[1912];
    unsigned long long field_a80;
} st_9a3de8_0;

typedef struct st_9a3de8_1 {
    char padding_0[28];
    char field_1c;
    char padding_1d[3];
    char field_20;
} st_9a3de8_1;


long long sub_9a3de8(st_9a3de8_0 *a0, long long a1)
{
    long long v0;  // [bp-0x30]
    long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((a0->field_300->field_1c >> 2 & 1 || a0->field_300->field_20 >> 3 & 1) && a0->field_a80)
    {
        sub_96908c();
        if (sub_c68d5c(a1, 11, 2) && sub_c6876c(a1, 2) && sub_a6ec4c(a1, v1, v0, 1) && sub_a6e970(a1))
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 1669, "tls_construct_stoc_ec_pt_formats");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    return 2;
}
