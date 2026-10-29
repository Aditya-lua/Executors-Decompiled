/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ae710..0x3ae784 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ae710_0 {
    char field_0;
} st_3ae710_0;

extern unsigned long long g_e7d0e0;
extern char g_1000290;
extern char g_10002c8;

double sub_3ae710(unsigned long long a0)
{
    unsigned long long str;  // x0
    double v10;  // d0
    double v11;  // d0
    st_3ae710_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_3ae710_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    double v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return v11;
    str = _strdup();
    if (!str)
        return v10;
    v2 = &g_1000290;
    v3 = 1.591496843e-314;
    v4 = 3868856;
    v5 = &g_e7d0e0;
    v6 = str;
    _dispatch_async(&g_10002c8, &v2);
    return 1.591496843e-314;
}
