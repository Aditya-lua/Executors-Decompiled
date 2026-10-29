/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbf0a4..0xbf124 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bf0a4(unsigned int *a0, unsigned short *a1, unsigned long long a2)
{
    unsigned long long v2;  // x8
    unsigned long long i;  // x9
    unsigned int v4;  // w11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _bzero();
    v2 = a2 - 1;
    if (a2 != 1)
    {
        i = 0;
        do
        {
            v4 = 2654435769 * *(short *)((char *)a1 + i) >> 22;
            a0[v4] = a0[v4] + 1;
            i += 5;
        } while (i < v2);
    }
    *(unsigned long long *)&a0[0x400] = v2 / 5;
    return;
}
