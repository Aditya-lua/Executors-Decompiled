/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad488..0x9ad538 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ad488(long long a0, unsigned long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a1 >= 1)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_dtls.c", 1069, "dtls1_read_failed");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    if (!sub_953c14(a0) || sub_9a5950(a0) || sub_9a5694(a0))
        return a1;
    sub_9d3d74(sub_95f850(a0), 1);
    return a1;
}
