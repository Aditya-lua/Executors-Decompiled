/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959e00..0x959e54 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_d27b38[4];

int sub_959e00(unsigned long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
        v2 = sub_962ee4(a1);
    else
        v2 = sub_962ea8();
    v3 = v2 & ~((int)(v2) >> 31);
    if ((int)v3 >= 5)
        v3 = 5;
    if (a2)
        *a2 = v3;
    return g_d27b38[v3];
}
