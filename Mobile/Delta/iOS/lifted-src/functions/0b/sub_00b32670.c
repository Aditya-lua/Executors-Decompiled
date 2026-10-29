/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb32670..0xb326b8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b32670(unsigned long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(104, "providers/implementations/kdfs/sskdf.c", 316);
        if (v2)
            *v2 = a0;
    }
    else
    {
        v2 = 0;
    }
    return (unsigned int)v2;
}
