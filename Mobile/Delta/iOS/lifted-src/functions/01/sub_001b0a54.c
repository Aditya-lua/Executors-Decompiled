/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b0a54..0x1b0d50 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e70f60;

char * sub_1b0a54(unsigned long a0, char *a1, char *a2)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 == a2)
        return a1;
    v2 = *a1;
    v3 = 48;
    if (v2 == 100)
        v3 = 64;
    if (v2 == 0x44)
        v3 = 32;
    if (v2 == 115)
        v3 = 56;
    if (v2 == 83)
        v3 = 40;
    if (v2 == 0x77)
        v3 = 8;
    if (v2 == 87)
        v3 = 0;
    goto *((void *)(*(long long *)((char *)&g_e70f60 + v3)));
}
