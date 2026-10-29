/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f3e0..0x97f44c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_97f3e0(unsigned long a0, unsigned long long a1, long long a2)
{
    long long *v3;  // x2
    long long *v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_97f48c())
        return 0;
    v3 = v0;
    if ((unsigned int)a1 == 15)
    {
        sub_979b34(v0[20], a2);
        v3 = v0;
    }
    return sub_955364(v3[15], a1, a2);
}
