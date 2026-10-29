/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa69148..0xa691c4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_a69148(long long *a0, unsigned int a1, unsigned long a2)
{
    long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if ((int)a1 < 1)
    {
        return 0;
    }
    else if (sub_a7c17c(a0[2]))
    {
        if (sub_ad69f8(a0[3], a1 - 1))
            v2 = sub_ad69f8();
        else
            v2 = 0;
        sub_a7c1b4(a0[2]);
        return v2;
    }
    else
    {
        return 0;
    }
}
