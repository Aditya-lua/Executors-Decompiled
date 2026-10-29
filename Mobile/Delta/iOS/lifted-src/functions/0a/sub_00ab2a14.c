/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2a14..0xab2a3c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab2a14(int a0)
{
    unsigned int v0;  // w10

    if ((unsigned int)a0 < 0x2000)
        v0 = 4;
    else
        v0 = 5;
    if ((unsigned int)a0 < 0x1000)
        v0 = 3;
    if (a0 >= 0x400)
        return v0;
    return 2;
}
