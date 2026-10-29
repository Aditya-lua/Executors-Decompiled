/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6db94..0xa6dc50 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6db94(unsigned long long *a0, char *a1, unsigned long long a2)
{
    unsigned long long v2;  // x19
    unsigned long long v5;  // x8
    unsigned long long v6;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    if (!a2)
        return 0 + _strlen(a1);
    while (*((char *)a0 + v2))
    {
        if (a2 == v2 + 1)
            return 0 + a2 + _strlen(a1);
    }
    if (a2 - 1 == v2)
    {
        *((char *)a0 + v2) = 0;
        return 0 + v2 + _strlen(a1);
    }
    v5 = 0;
    while (1)
    {
        v6 = a1[v5];
        if (!v6)
        {
            *((char *)a0 + v2 + v5) = 0;
            return v5 + v2 + _strlen(a1);
        }
        *((char *)a0 + v5 + v2) = v6;
        v5 += 1;
        if (~v2 + a2 == v5)
        {
            *((char *)a0 + v2 + v5) = 0;
            return ~v2 + a2 + v2 + _strlen(a1);
        }
    }
}
