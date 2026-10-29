/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18ab4..0xa18b3c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a18ab4(unsigned long a0, unsigned long a1, unsigned long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a13594();
    v3 = sub_a19fb4(sub_9de514(a3), 0, v2);
    if (!v3)
    {
        return v3;
    }
    else if (sub_a1ac74())
    {
        return v3;
    }
    else
    {
        sub_a1a174(v3);
        return 0;
    }
}
