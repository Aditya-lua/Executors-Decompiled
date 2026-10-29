/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9946a4..0x9947c8 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9946a4_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    long long field_10;
} st_9946a4_0;

typedef struct st_9946a4_1 {
    char padding_0[48];
    unsigned short field_30;
} st_9946a4_1;


long long sub_9946a4(st_9946a4_1 *a0, long long a1, st_9946a4_0 *a2, unsigned long a3, long long *a4)
{
    long long v2;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a4 = 0;
    if (!*(long long *)&a0[83].padding_0[10])
        v2 = a2->field_10;
    else
        v2 = a2->field_10 + 0x400;
    if (sub_c68d5c() && sub_c68d5c(a1, a2->field_4, 2) && sub_c68d5c(a1, a0->field_30, 2) && sub_a6ebd4(a1, &a0[81].field_30, 6) && sub_c6876c(a1, 2) && (!*(long long *)&a0[82].padding_0[44] || sub_a6e830(a1)) && (!v2 || sub_c68684(a1, v2, a4)))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/record/methods/dtls_meth.c", 663, "dtls_prepare_record_header");
    sub_996e84(a0, 80, 0xc0103, 0);
    return 0;
}
