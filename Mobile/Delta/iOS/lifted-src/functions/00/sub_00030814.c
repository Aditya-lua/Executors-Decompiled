/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30814..0x30848 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_30814(int i)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w9

    if (2 > i)
        return 0;
    v0 = 0;
    do
    {
        v1 = v0;
        v0 = v1 + 1;
    } while ((int)(4 << ((char)v1 & 31)) <= i);
    return v1 + 1;
}
