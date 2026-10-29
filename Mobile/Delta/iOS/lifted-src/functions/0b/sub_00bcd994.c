/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcd994..0xbcdab4 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcd994_0 {
    unsigned long long field_0;
} st_bcd994_0;

extern char g_e066f2;

long long sub_bcd994(st_bcd994_0 **a0, long long a1)
{
    char v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_bcd690(a1, 0, *a0);
    if (v2 != 2)
        return v2;
    goto *((void *)(sub_bcd9e4 + (&g_e066f2)[*(long long *)*a0] * 4));
}
