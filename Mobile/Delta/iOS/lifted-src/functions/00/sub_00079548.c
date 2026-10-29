/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79548..0x79570 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_79548(unsigned int *a0, char *a1, long long a2)
{
    char *i;  // x1
    unsigned long idx;  // x9

    if (a2 < 1)
        return a0;
    i = a1;
    do
    {
        idx = *i;
        i += 1;
        a0[idx] = a0[idx] + 1;
    } while (i < &a1[a2]);
    return a0;
}
