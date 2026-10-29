/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5cdc..0x1a5d34 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5cdc_0 {
    char field_0;
} st_1a5cdc_0;

extern char g_cc33d4;

long long sub_1a5cdc(long long a0, char *a1, long long a2, unsigned long a3)
{
    st_1a5cdc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1a5cdc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return a3;
    return sub_1a5cdc(a0, a1 + 1, a2 - 1, a3 * 33 & 0x3ffffffffffffff ^ (&g_cc33d4)[*a1]);
}
