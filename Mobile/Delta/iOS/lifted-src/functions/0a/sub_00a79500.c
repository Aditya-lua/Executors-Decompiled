/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79500..0xa79554 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a79500(unsigned long long a0, unsigned long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_c692a4();
        if (v2 >> 31 & 1)
        {
            a0 = 0;
        }
        else if ((unsigned int)v2)
        {
            a0 = 1;
        }
    }
    return a0;
}
