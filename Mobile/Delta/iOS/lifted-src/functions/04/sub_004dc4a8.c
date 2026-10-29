/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dc4a8..0x4dc50c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dc4a8_0 {
    char field_0;
} st_4dc4a8_0;

extern unsigned int g_f03938;
extern char g_f03940;

long long sub_4dc4a8(void)
{
    unsigned long v5;  // x0
    st_4dc4a8_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_4dc4a8_0 *v1;  // [bp-0x20]
    char v2;  // [bp-0x11]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (~((g_f03940 ^ 254) + g_f03940 + (~g_f03940 & 1)))
        return v5;
    g_f03940 = 1;
    g_f03938 = sub_403cbc(&v2);
    return g_f03938;
}
