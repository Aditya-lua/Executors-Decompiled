/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f220..0x3f254 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3f220(unsigned long long i)
{
    char v0;  // x8
    unsigned long long v1;  // x9

    v0 = 1;
    if (i >= 2)
    {
        v1 = 0;
        do
        {
            v1 += 1;
        } while (1 << ((char)v1 & 31) < i);
        v0 = (char)v1 + 1;
    }
    if (i)
        return v0;
    return 0;
}
