/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbce0e8..0xbce208 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bce0e8_0 {
    unsigned long long field_0;
} st_bce0e8_0;

extern char g_e06709;

long long sub_bce0e8(st_bce0e8_0 **a0, long long a1)
{
    char v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_bcd690(a1, 0, *a0);
    if (v2 != 2)
        return v2;
    goto *((void *)(sub_bce138 + (&g_e06709)[*(long long *)*a0] * 4));
}
