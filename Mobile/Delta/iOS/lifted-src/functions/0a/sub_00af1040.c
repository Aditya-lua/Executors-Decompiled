/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1040..0xaf10e4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_af1040(char *a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (a4 >> 15 & 1)
    {
        v3 = v2;
        if (v3 > a3)
        {
            v3 = v2;
            while (1)
            {
                if (!*a0 || *a0 == 46 & (unsigned int)a4 >> 4 & 1)
                    break;
                a0 += 1;
                v3 -= 1;
                if (a3 >= v3)
                    return !_memcmp();
            }
        }
        if (v3 == a3)
            return !_memcmp();
    }
    if (v2 != a3)
        return 0;
    return !_memcmp();
}
