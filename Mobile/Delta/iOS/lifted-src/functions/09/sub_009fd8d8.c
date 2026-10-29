/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd8d8..0x9fd968 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fd8d8(unsigned long long a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (!a0)
        return a0;
    sub_9ffd58();
    if (a3 && v1)
    {
        v4 = sub_a6fa7c(a1, a2, "priv");
        if (!(unsigned int)v4)
            return v4;
    }
    if (!v0)
        return 1;
    v5 = sub_a6fa7c(a1, a2, "pub");
    if (!(unsigned int)v5)
        return v5;
    return 1;
}
