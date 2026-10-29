/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ca5c8..0x3ca60c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3ca5c8(unsigned long long a0, char *a1, char *a2)
{
    if (!(a0 >> 7 & 1))
    {
        if (a0 >> 6 & 1)
            goto LABEL_3ca5e8;
LABEL_3ca5d0:
        if (a0 >> 5 & 1)
            goto LABEL_3ca5f4;
LABEL_3ca5d4:
        if (!(a0 >> 4 & 1))
            return a0;
    }
    else
    {
        *a1 = *a2;
        if (!(a0 >> 6 & 1))
            goto LABEL_3ca5d0;
LABEL_3ca5e8:
        a1[1] = a2[1];
        if (!(a0 >> 5 & 1))
            goto LABEL_3ca5d4;
LABEL_3ca5f4:
        a1[2] = a2[2];
        if (!(a0 >> 4 & 1))
            return a0;
    }
    a1[3] = a2[3];
    return a0;
}
