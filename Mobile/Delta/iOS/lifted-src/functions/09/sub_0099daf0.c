/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99daf0..0x99dbe4 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99daf0_0 {
    char padding_0[2480];
    unsigned long long field_9b0;
    char padding_9b8[344];
    long long field_b10;
} st_99daf0_0;


unsigned long long sub_99daf0(st_99daf0_0 *a0, long long a1)
{
    long long v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_c68d5c(a1, 45, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 1) && sub_c68d5c(a1, 1, 1) && (!(a0->field_9b0 >> 10 & 1) || sub_c68d5c(a1, 0, 1)) && sub_a6e970(a1) && sub_a6e970(a1))
    {
        if (!(a0->field_9b0 & 0x400))
            v2 = 2;
        else
            v2 = 3;
        *(int *)&a0->field_b10 = v2;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 627, "tls_construct_ctos_psk_kex_modes");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
