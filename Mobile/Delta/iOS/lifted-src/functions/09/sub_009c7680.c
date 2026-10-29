/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7680..0x9c76f4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c7680(unsigned int a0, unsigned long long a1, unsigned int a2)
{
    unsigned int v0;  // w8
    unsigned int i;  // w2
    unsigned int v3;  // w8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x9

    if (a1 >> 31 & 1)
        return 0xffffffff;
    v0 = 1;
    if ((int)a2 >= 31)
    {
        do
        {
            i = a2;
            v0 += 1;
            a2 = i >> 7;
        } while (127 < i);
    }
    if (a0 == 2)
    {
        v3 = v0 + 3;
    }
    else
    {
        v3 = v0 + 1;
        if ((int)a1 >= 128)
        {
            v4 = a1;
            do
            {
                v5 = v4;
                v3 += 1;
                v4 = (unsigned int)v5 >> 8;
            } while (0xff < (unsigned int)v5);
        }
    }
    if ((int)v3 >= (int)((unsigned int)a1 ^ 0x7fffffff))
        return 0xffffffff;
    return v3 + a1 & 0xffffffff;
}
