/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954420..0x9544bc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_954420(long long *a0)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9d3c1c(sub_9d8844());
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_enc.c", 225, "ssl3_init_finished_mac");
        sub_9a58a4(a0, 80, 0x80020, 0);
        return 0;
    }
    v3 = v2;
    sub_9d3c28(a0[53]);
    a0[53] = 0;
    sub_a3f73c(a0[54]);
    a0[53] = v3;
    a0[54] = 0;
    sub_9d46fc(v3, 9, 1, 0);
    return 1;
}
