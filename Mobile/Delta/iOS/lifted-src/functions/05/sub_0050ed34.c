/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50ed34..0x50ed94 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50ed34_0 {
    char field_0;
} st_50ed34_0;

extern unsigned long long g_e81d98;
extern char g_f04740;

void sub_50ed34(void)
{
    st_50ed34_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_50ed34_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (g_f04740 & 1)
        return;
    g_f04740 = 1;
    (g_e81d98 - 0x93d11f00)();
}
