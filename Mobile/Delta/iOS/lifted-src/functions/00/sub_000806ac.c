/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x806ac..0x80714 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_806ac(unsigned long long *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long *v0;  // x8

    if (a1 > a2)
        return 0xffffffffffffff96;
    if (!a1 && a3)
        return 0xffffffffffffff96;
    if (!a3)
    {
        *a0 = 0;
        a0[1] = 0;
        return 1;
    }
    v0 = &a0[2 * a1];
    if (!*(int *)((char *)v0 - 16) && !*(int *)((char *)v0 - 8))
    {
        return a1;
    }
    else if (a1 == a2)
    {
        return 0xffffffffffffff96;
    }
    else
    {
        *v0 = 0;
        v0[1] = 0;
        return a1 + 1;
    }
}
