/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959d80..0x959de0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_959d80(long long *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && a3)
    {
        v2 = sub_9ffbf8(a1);
        if (!(unsigned int)v2)
            return v2;
    }
    if (!a2)
        v3 = 120;
    else
        v3 = 112;
    sub_af295c();
    *(long long *)((char *)a0 + v3) = a1;
    return 1;
}
