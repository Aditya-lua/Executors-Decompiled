/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42bcc..0xb42c1c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b42bcc(void)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(368, "providers/implementations/macs/blake2_mac_impl.c", 49);
    if (!v2)
        return v2;
    sub_b0c984(v2 + 240);
    return v2;
}
