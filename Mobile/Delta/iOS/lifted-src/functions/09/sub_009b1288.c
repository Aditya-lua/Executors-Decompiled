/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1288..0x9b12f8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9b1288(unsigned int a0, unsigned int a1, unsigned int *a2)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v2;  // w10

    switch (a1)
    {
    case 0:
        *a2 = a1;
        return 1;
    case 256:
        v0 = a1 - 0x300;
        v1 = 1;
        break;
    default:
        v0 = a1 - 0x300;
        v2 = a1 + 0xffff0103;
        v1 = 3 > v2;
        if (v0 >= 5 && 2 < v2)
            return 0;
    }
    switch (a0)
    {
    case 131071:
        if (v1)
        {
            *a2 = a1;
            return 1;
        }
        return 1;
    case 65536:
        if (5 > v0)
        {
            *a2 = a1;
            return 1;
        }
        return 1;
    default:
        return 1;
    }
}
