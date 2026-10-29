/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58ad4..0x58b10 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_58ad4(float *a0, unsigned int *a1)
{
    if (*a0 != *a1)
    {
        return 0;
    }
    else if (a0[1] == *(float *)&a1[1])
    {
        return a0[2] == *(float *)&a1[2];
    }
    else
    {
        return 0;
    }
}
