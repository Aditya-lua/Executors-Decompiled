/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc5c4..0xbc5f4 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e6c708;

long long sub_bc5c4(void* a0, unsigned int a1)
{
    unsigned int v0;  // w8
    unsigned long v1;  // x9
    unsigned long v2;  // x10

    v0 = (int)a0[272];
    v1 = 3;
    v2 = v0 - 3;
    if (v0 < 3)
        v2 = 0;
    if (5 < v0)
        v2 = v1;
    return *(long long *)&(&g_e6c708)[32 * a1 + 8 * v2];
}
