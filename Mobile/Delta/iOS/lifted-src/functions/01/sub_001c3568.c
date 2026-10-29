/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3568..0x1c35ec (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3568_0 {
    char field_0;
} st_1c3568_0;

extern char g_1000140;
extern char g_1000168;

unsigned long long * sub_1c3568(unsigned long long *a0)
{
    st_1c3568_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1c3568_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0[1] = std::__1::locale::use_facet(std::__1::locale::locale(), &g_1000140);
    a0[2] = std::__1::locale::use_facet(a0, &g_1000168);
    memset(a0 + 3, 0, 40);
    return a0;
}
