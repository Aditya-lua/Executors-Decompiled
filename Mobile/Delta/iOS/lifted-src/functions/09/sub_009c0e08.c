/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0e08..0x9c0e70 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c0e08(long long a0, long long a1)
{
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned int v0;  // [bp-0x38]
    unsigned int v1;  // [bp-0x34]
    long long v2;  // [bp-0x30]
    long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = 24;
    v0 = _strlen(a1);
    v2 = a1;
    v3 = 0;
    v6 = sub_9c4808(0, &v0);
    if (!(unsigned int)v6)
        return v6;
    if (!a0)
        return 1;
    v7 = sub_9c7710(a0, &v0);
    if (!(unsigned int)v7)
        return v7;
    return 1;
}
