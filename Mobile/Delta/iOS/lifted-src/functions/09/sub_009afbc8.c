/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9afbc8..0x9afc38 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9afbc8(long long a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_c68d5c(a1, 1, 1))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_lib.c", 979, "tls_construct_change_cipher_spec");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
