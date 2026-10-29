/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7e5c4..0xa7e688 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a7e5c4(unsigned long a0, long long a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long i;  // x8
    unsigned int *v7;  // x12
    unsigned int v8;  // w13
    unsigned int v9;  // w12
    unsigned long long v10;  // x14
    char *v0;  // [bp-0x28], Other Possible Types: char
    char *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6e830(a1, 128, &v0);
    if (!(unsigned int)v4)
        return v4;
    v5 = 0;
    do
    {
        i = v5;
        v7 = a0 + i;
        v8 = *v7;
        v9 = v7[1];
        v10 = i + 8;
        v1 = v0 + 1;
        *v0 = (char)~((int)((unsigned int)(4 - v8) & v8 + 0xff801ffa) >> 31) & (char)(4 - v8) | (char)((int)((unsigned int)(4 - v8) & v8 + 0xff801ffa) >> 31) & (char)(5 - v8) | ((char)~((int)((unsigned int)(4 - v9) & v9 + 0xff801ffa) >> 31) & (char)(4 - v9) | (char)((int)((unsigned int)(4 - v9) & v9 + 0xff801ffa) >> 31) & (char)(5 - v9)) * 16;
        v0 = v1;
        v5 = v10;
    } while (i < 1016);
    return 1;
}
