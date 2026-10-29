/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa22430..0xa224c8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_fffffffffffffffc;

unsigned long long * sub_a22430(unsigned long long *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // x30
    unsigned long long v4;  // x3
    char *v5;  // x1
    unsigned long long v6;  // x2
    unsigned long long *v7;  // x0
    unsigned long long i;  // x2
    unsigned long long v9;  // x2
    char *v10;  // x1
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    if (!a2)
        v4 = 0;
    else
        v4 = (char *)&g_fffffffffffffffc + 3;
    v5 = a1 + a2 + v4;
    v6 = 8;
    do
    {
        v7 = a0;
        i = v6;
        v9 = i - 1;
        v10 = v5 + 0x200;
        *v7 = (*v5 | v5[64] * 0x100 | (v5[128] | v5[192] * 0x100) * 0x10000 | (v5[0x100] | v5[320] * 0x100) * 0x100000000 | (v5[384] | v5[448] * 0x100) * 0x1000000000000) & v4;
        v6 = v9;
        v5 = v10;
        a0 = v7 + 1;
    } while (i != 1);
    return v7 + 1;
}
