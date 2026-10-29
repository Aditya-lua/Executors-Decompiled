/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00454..0xa005ec (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d371d0;

unsigned long long sub_a00454(unsigned long a0, unsigned int a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (15 >= a1 + 0xffffefff)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        goto *((void *)(sub_a00494 + (&g_d371d0)[0xffffefff + a1] * 4));
    }
    else if (a1 == 2)
    {
        return 1;
    }
    else
    {
        return 0xfffffffe;
    }
}
