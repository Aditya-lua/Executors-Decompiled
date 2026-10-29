/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5210..0xb522c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5210(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long i;  // x8

    if (a2 < 4)
        return a0;
    i = 3;
    do
    {
        i += 4;
    } while (i < a2);
    return a0;
}
