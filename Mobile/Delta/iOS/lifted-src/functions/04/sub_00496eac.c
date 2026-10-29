/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x496eac..0x496f10 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_496eac_0 {
    char field_0;
} st_496eac_0;

extern unsigned long long g_438ea4;
extern char g_871d48;

void sub_496eac(void)
{
    unsigned long long v7;  // x30
    st_496eac_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_496eac_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_438ea4;
    v3 = &(&g_871d48)[(~&g_438ea4 | 32) + 1];
    v3();
}
