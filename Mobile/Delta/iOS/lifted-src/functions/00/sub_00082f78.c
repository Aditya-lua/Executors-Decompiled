/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82f78..0x83010 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_82f78(void* a0, unsigned long a1, long long a2, unsigned long long n)
{
    unsigned int v2;  // w8
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (n <= 31)
        v2 = 1;
    else
        v2 = 2;
    if (n <= 0xfff)
        v3 = v2;
    else
        v3 = v2 + 1;
    if (v3 + n > a1)
        return 0xffffffffffffffba;
    if ((unsigned int)v3 == 3)
    {
        *(unsigned int *)a0 = 12 | (unsigned int)n * 16;
    }
    else if ((unsigned int)v3 == 2)
    {
        *(unsigned short *)a0 = 4 | (unsigned short)n * 16;
    }
    else
    {
        *(char *)a0 = (char)n * 8;
    }
    _memcpy(a0 + v3, a2, n);
    return v3 + n;
}
