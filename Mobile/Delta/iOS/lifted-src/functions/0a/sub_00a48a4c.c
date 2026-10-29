/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48a4c..0xa48b60 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a48a4c(long long a0, char *a1, char *a2, unsigned long a3)
{
    unsigned long i;  // x22
    unsigned long long v6;  // x8
    unsigned long v7;  // x26
    unsigned long long v8;  // x28
    char v9;  // x27
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    long long v0;  // [bp-0x70]
    char v1;  // [bp-0x62]
    char v2;  // [bp-0x61]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    i = a3;
    v1 = 0;
    v6 = i * 8;
    if (!sub_a50de8())
        i = v6;
    if (!i)
        return 1;
    v7 = 0;
    do
    {
        v8 = v7 >> 3;
        v9 = (char)v7 & 7;
        v2 = (a2[v8] >> ((v9 ^ 7) & 31)) * 128;
        v10 = sub_9ffdd8(a0);
        v11 = sub_9ffdd8(a0);
        v12 = sub_9ffdd8(a0);
        *(unsigned int *)&v0 = sub_a50720(a0);
        sub_9f8794(&v2, &v1, 1, 1, v10, v11 + 128, v12 + 0x100, a0 + 40, v0);
        a1[v8] = (v1 & 128) >> (v9 & 31) | (char)(-0x81 >> (v9 & 31)) & a1[v8];
        v7 += 1;
    } while (i != v7);
    return 1;
}
