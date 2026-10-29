/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeaec8..0xbeafa0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_beaec8(char a0, char *a1, unsigned long long a2)
{
    unsigned long v0;  // x9
    char *v1;  // x8
    unsigned long long v2;  // x10
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v5;  // x12
    unsigned long long *v6;  // x14
    unsigned long v7;  // x15
    unsigned long v8;  // x14
    unsigned long long v9;  // x11

    v0 = a0;
    v1 = a1 + 7 & 0xfffffffffffffff8;
    v2 = v1 - a1;
    if (v1 == a1)
    {
        v3 = a2 - 16;
    }
    else
    {
        v4 = 0;
        do
        {
            if (a1[v4] == (unsigned int)v0)
                return 1;
        } while ((v4 += 1, v2 != v4));
        v3 = a2 - 16;
        if (v2 > v3)
            goto LABEL_beaf5c;
    }
    v5 = 0x101010101010101 * v0;
    do
    {
        v6 = &a1[v2];
        v7 = *v6 ^ v5;
        v8 = v6[1] ^ v5;
    } while (!(~((0x101010101010100 - v7 | v7) & (0x101010101010100 - v8 | v8)) & 0x8080808080808080) && (v2 += 16, v2 <= v3));
LABEL_beaf5c:
    if (a2 == v2)
        return 0;
    v9 = 0;
    while (a1[v9 + v2] != (unsigned int)v0)
    {
        v9 += 1;
        if (a2 - v2 == v9)
            return 0;
    }
    return 1;
}
