/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998fb4..0x9990ac (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998fb4_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    long long field_10;
} st_998fb4_0;


long long sub_998fb4(long long a0, long long a1, st_998fb4_0 *a2, unsigned long a3, long long *a4)
{
    long long v2;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a4 = 0;
    if (!*(long long *)(a0 + 4160))
        v2 = a2->field_10;
    else
        v2 = a2->field_10 + 0x400;
    if (sub_c68d5c() && sub_c68d5c(a1, a2->field_4, 2) && sub_c6876c(a1, 2) && (!*(long long *)(a0 + 4144) || sub_a6e830(a1)) && (!v2 || sub_c68684(a1, v2, a4)))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/record/methods/tls_common.c", 1635, "tls_prepare_record_header_default");
    sub_996e84(a0, 80, 0xc0103, 0);
    return 0;
}
