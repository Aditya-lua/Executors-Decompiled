/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc569c..0xc5704 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c569c(unsigned long long a0, unsigned long long a1, unsigned long a2, unsigned long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 > a1)
    {
        return 0xffffffffffffffba;
    }
    else if (a0)
    {
        _memmove();
        return a3;
    }
    else if (!a3)
    {
        return 0;
    }
    else
    {
        return 0xffffffffffffffb6;
    }
}
