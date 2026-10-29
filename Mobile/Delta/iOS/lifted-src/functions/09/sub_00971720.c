/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971720..0x9717bc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_971720(unsigned long long *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "max_dgram_payload_len"))
        a0[15] = 0;
    if (sub_a6fbc4(a1, "cur_cwnd_size"))
        a0[16] = 0;
    if (sub_a6fbc4(a1, "min_cwnd_size"))
        a0[0x11] = 0;
    if (sub_a6fbc4(a1, "bytes_in_flight"))
        a0[18] = 0;
    if (!sub_a6fbc4(a1, "cur_state"))
        return 1;
    a0[19] = 0;
    return 1;
}
