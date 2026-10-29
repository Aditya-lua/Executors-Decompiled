/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48284..0xa4839c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a48284(long long a0, char *a1, char *a2, unsigned long long i)
{
    char *v5;  // x20
    char *v6;  // x21
    unsigned long long v7;  // x24
    unsigned long long j;  // x26
    unsigned long long v9;  // x28
    char v10;  // x19
    long long v11;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x62]
    char v2;  // [bp-0x61]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    if (!i)
        return 1;
    v5 = a2;
    v6 = a1;
    if (i < 0x8000000)
        v7 = i;
    else
        v7 = 0x8000000;
    do
    {
        v0 = i;
        if (v7)
        {
            j = 0;
            do
            {
                v9 = j >> 3;
                v10 = (char)j & 7;
                v2 = (v5[v9] >> ((v10 ^ 7) & 31)) * 128;
                v11 = sub_9ffdd8(a0);
                sub_9f8f74(&v2, &v1, 1, 1, v11, a0 + 40, sub_a50720(a0));
                v6[v9] = (v1 & 128) >> (v10 & 31) | (char)(-0x81 >> (v10 & 31)) & v6[v9];
                j += 1;
            } while (v7 * 8 != j);
        }
        v5 = &v5[v7];
        v6 = &v6[v7];
        i = v0 - v7;
        if (i < v7)
            v7 = i;
    } while (i);
    return 1;
}
