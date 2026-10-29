/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43a824..0x43a8c0 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d1c0fc;
extern char g_d1c1fc;

long long sub_43a824(char *a0, unsigned int *a1, unsigned int a2)
{
    char v0;  // x9
    unsigned int v1;  // w10
    unsigned int v2;  // w12
    unsigned int v3;  // w10
    unsigned long v4;  // x8

    v0 = (&g_d1c0fc)[a2];
    if (*a0)
    {
        v1 = (a2 + 63 ^ -(a2 | 63)) + (a2 + 63 & -(a2 | 63)) * 2;
        v2 = *a1 * 64;
        v3 = v1 + v2 + ((*a1 * 128 ^ 0xfffffffe) + v2 | ~v1 | 1) + 1;
    }
    else
    {
        v3 = (0xff >> (v0 & 31)) + 1 + ((0xff >> (v0 & 31)) + 1 + (-0x100 >> (v0 & 31)) * 2 | a2);
    }
    *a1 = v3;
    v4 = (&g_d1c1fc)[16 * *a0 + v0];
    *a0 = v4;
    return v4;
}
