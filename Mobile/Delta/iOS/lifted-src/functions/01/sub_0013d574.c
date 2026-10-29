/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13d574..0x13d620 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13d574_0 {
    char field_0;
} st_13d574_0;

extern long long g_f0d450;
extern long long g_f0d458;
extern char g_f0d468;

long long sub_13d574(unsigned long a0, unsigned long a1)
{
    long long v7;  // x0
    unsigned long v0;  // [bp-0x48]
    char v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    st_13d574_0 **v3;  // [bp-0x30], Other Possible Types: char
    st_13d574_0 *v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = &v3;
    v2 = a1;
    v3 = &v4;
    v0 = &g_f0d468;
    v1 = 1;
    std::__1::__shared_mutex_base::lock(&g_f0d468);
    v7 = sub_13e938(g_f0d450, g_f0d458, &v2);
    sub_dd88(&g_f0d450, v7, g_f0d458);
    if (v2)
        operatordelete(sub_13c448(v2));
    return sub_13e9ac(&v0);
}
