/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb06524..0xb06584 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b06524(void)
{
    unsigned long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(432, "providers/implementations/ciphers/cipher_aria_ccm.c", 25);
    if (!v2)
        return v2;
    sub_b5d514(v2, 192, sub_b0668c(192));
    return v2;
}
