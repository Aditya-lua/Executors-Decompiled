/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd864..0x9fd8d8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fd864(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffd38();
    v3 = sub_a6116c(sub_12738(a0), a1, a2);
    if (!(unsigned int)v3)
        return v3;
    if ((long long)v2 < 1)
        return 1;
    v4 = sub_a6f8b4(a1, a2, "priv_len", v2);
    if (!(unsigned int)v4)
        return v4;
    return 1;
}
