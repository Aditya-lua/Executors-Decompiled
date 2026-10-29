/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbee64..0xbeed0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bee64(unsigned int *a0, unsigned short *a1, unsigned long long a2)
{
    unsigned long long v2;  // x8
    unsigned long long i;  // x10
    unsigned long long v4;  // x10
    unsigned short *v5;  // x20
    unsigned int v6;  // w11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _bzero();
    v2 = a2 - 1;
    if (a2 != 1)
    {
        i = v2;
        do
        {
            v4 = i;
            v5 = (char *)a1 + 1;
            v6 = 2654435769 * *a1 >> 22;
            a0[v6] = a0[v6] + 1;
            a1 = v5;
            i = v4 - 1;
        } while (i);
    }
    *(unsigned long long *)&a0[0x400] = v2;
    return;
}
