/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45690..0xb4570c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b45690(long long a0, unsigned long a1, long long *a2, long long a3)
{
    long long v2;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a1abe8(a0 + 8);
    if (!sub_a2f9e0(v2))
    {
        return 0;
    }
    else if ((unsigned long long)a3 >= (unsigned long long)v2)
    {
        *a2 = v2;
    }
    else
    {
        return 0;
    }
}
