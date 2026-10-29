/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa7894..0xaa7904 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aa7904;

unsigned int * sub_aa7894(unsigned int *a0, long long a1, unsigned int *a2)
{
    unsigned int *v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
    {
        return 0;
    }
    else if (a2)
    {
        v0 = (unsigned int *)(unsigned int)sub_aa7b04(a1, a2, 0);
        if (!v0)
            return 0;
        return sub_a67850(&v0, a0 + 2, *a0, 24, &g_aa7904, 0);
    }
    else
    {
        return 0;
    }
}
