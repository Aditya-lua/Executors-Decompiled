/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50fba4..0x50fc10 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50fba4_0 {
    char field_0;
} st_50fba4_0;

extern unsigned int g_f04788;
extern char g_f04790;

long long sub_50fba4(void)
{
    unsigned int v5;  // w9
    unsigned long v7;  // x0
    st_50fba4_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_50fba4_0 *v1;  // [bp-0x20]
    char v2;  // [bp-0x11]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = g_f04790 + 1;
    if ((-((v5 & (~g_f04790 | 1)) * 2) & 254) != ((v5 ^ (~g_f04790 | 1)) & 0xff))
        return v7;
    g_f04790 = 1;
    g_f04788 = sub_50f5f8(&v2);
    return g_f04788;
}
