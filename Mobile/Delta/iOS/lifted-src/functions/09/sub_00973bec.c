/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x973bec..0x973c70 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_973bec(long long a0, char *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_c61590())
        return;
    sub_973a98(a0, "protocol", "quic");
    sub_973b78(a0, "dst_cid", a1 + 1, *a1);
}
