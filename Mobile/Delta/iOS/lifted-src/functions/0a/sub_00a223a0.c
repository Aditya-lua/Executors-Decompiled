/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa223a0..0xa22430 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a223a0(unsigned long a0, unsigned long long *iter, unsigned long a2)
{
    unsigned long long v3;  // x30
    char *v4;  // x0
    unsigned long long v13;  // x3
    unsigned long long v14;  // x3
    unsigned long long v15;  // x3
    unsigned long long v5;  // x2
    unsigned long long i;  // x2
    char *v7;  // x0
    unsigned long v8;  // x3
    unsigned long long v9;  // x2
    unsigned long long v10;  // x3
    unsigned long long v11;  // x3
    unsigned long long v12;  // x3
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = a0 + a2;
    v5 = 8;
    do
    {
        i = v5;
        v7 = v4;
        v8 = *iter;
        iter += 1;
        v9 = i - 1;
        *v7 = v8;
        v10 = v8 >> 8;
        v7[64] = v10;
        v11 = v10 >> 8;
        v7[128] = v11;
        v12 = v11 >> 8;
        v7[192] = v12;
        v13 = v12 >> 8;
        v7[0x100] = v13;
        v14 = v13 >> 8;
        v7[320] = v14;
        v15 = v14 >> 8;
        v7[384] = v15;
        v7[448] = v15 >> 8;
        v4 = v7 + 0x200;
        v5 = v9;
    } while (i != 1);
    return v7 + 0x200;
}
