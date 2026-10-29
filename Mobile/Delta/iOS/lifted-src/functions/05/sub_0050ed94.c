/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50ed94..0x50ee04 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50ed94_0 {
    char field_0;
} st_50ed94_0;

extern unsigned long long g_e81da0;
extern char g_f04750;

void sub_50ed94(void)
{
    st_50ed94_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_50ed94_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (~(char)(g_f04750 - (g_f04750 | 1)))
        return;
    g_f04750 = 1;
    (g_e81da0 - 0xf11f7e00)();
}
