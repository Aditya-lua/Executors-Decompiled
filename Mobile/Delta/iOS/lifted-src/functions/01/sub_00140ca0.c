/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x140ca0..0x140cc8 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_140ca0(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    if (a0 != a1)
    {
        do
        {
        } while (*a0 != *a2 && (a0 += 1, a0 != a1));
    }
    return a0;
}
