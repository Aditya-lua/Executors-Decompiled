/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50fb48..0x50fba4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50fb48_0 {
    char field_0;
} st_50fb48_0;

extern unsigned int g_f04798;
extern char g_f047a0;

long long sub_50fb48(void)
{
    unsigned long v5;  // x0
    st_50fb48_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_50fb48_0 *v1;  // [bp-0x20]
    char v2;  // [bp-0x11]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (~(char)(g_f047a0 - (g_f047a0 | 1)))
        return v5;
    g_f047a0 = 1;
    g_f04798 = sub_50ee04(&v2);
    return g_f04798;
}
