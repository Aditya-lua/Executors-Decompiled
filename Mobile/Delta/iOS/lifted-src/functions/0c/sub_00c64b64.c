/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc64b64..0xc64bb0 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c64b64(long long a0, unsigned int *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a368c8();
    sub_a369bc("ssl/record/rec_layer_s3.c", 132, "ossl_get_max_early_data");
    v2 = sub_9a58a4(sub_993ec8(a0));
    *a1 = 0;
    return v2;
}
