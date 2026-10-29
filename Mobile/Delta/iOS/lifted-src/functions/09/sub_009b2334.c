/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2334..0x9b23b0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9b2334(long long *a0)
{
    long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[377])
    {
        if (sub_a40520(a0[54]))
            return 1;
        v2 = 2881;
    }
    else
    {
        v2 = 2876;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_lib.c", v2, "tls13_restore_handshake_digest_for_pha");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
