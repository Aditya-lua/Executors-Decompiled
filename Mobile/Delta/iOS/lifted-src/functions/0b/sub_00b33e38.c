/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb33e38..0xb33e88 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b33e38(unsigned long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(160, "providers/implementations/kdfs/x942kdf.c", 340);
        if (v2)
        {
            *v2 = a0;
            *(unsigned int *)&v2[19] = 1;
        }
    }
    else
    {
        v2 = 0;
    }
    return (unsigned int)v2;
}
