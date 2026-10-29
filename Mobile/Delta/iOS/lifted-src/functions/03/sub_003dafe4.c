/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3dafe4..0x3db040 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3dafe4_0 {
    char field_0;
} st_3dafe4_0;

extern unsigned long long g_403768;
extern char g_806ed0;

void sub_3dafe4(void)
{
    unsigned long long v7;  // x30
    st_3dafe4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3dafe4_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_403768;
    v3 = &(&g_806ed0)[(~&g_403768 | 0xffffffffffffffdf) + (~&g_403768 | 32) + 0x22];
    v3();
}
