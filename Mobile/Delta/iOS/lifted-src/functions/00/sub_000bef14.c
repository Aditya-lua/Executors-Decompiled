/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbef14..0xbef90 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bef14(unsigned int *a0, char *a1, unsigned long long a2)
{
    unsigned long long v2;  // x8
    unsigned long long i;  // x9
    unsigned long idx;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _bzero();
    *(unsigned long long *)&a0[0x400] = 0;
    v2 = a2 - 1;
    if (a2 != 1)
    {
        i = 0;
        do
        {
            idx = a1[i];
            a0[idx] = a0[idx] + 1;
            i += 43;
        } while (i < v2);
    }
    *(unsigned long long *)&a0[0x400] = v2 / 43;
    return;
}
