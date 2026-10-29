/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe860..0xafe8bc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_afe860(long long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(72, "providers/implementations/asymciphers/rsa_enc.c", 87);
    if (!v2)
        return v2;
    *v2 = sub_9f2aec(a0);
    return v2;
}
