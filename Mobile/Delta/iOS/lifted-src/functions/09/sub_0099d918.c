/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d918..0x99d9b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99d918_0 {
    char padding_0[2480];
    char field_9b0;
} st_99d918_0;


long long sub_99d918(st_99d918_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_9b0 & 1)
        return 2;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_c68d5c(a1, 23, 2) && sub_c68d5c(a1, 0, 2))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 563, "tls_construct_ctos_ems");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
