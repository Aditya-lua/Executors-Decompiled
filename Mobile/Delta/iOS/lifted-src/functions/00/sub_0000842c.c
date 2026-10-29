/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x842c..0x84a8 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_842c_0 {
    unsigned short field_0;
    char field_2;
} st_842c_0;

extern st_842c_0 g_cbe7d0;

long long sub_842c(unsigned int a0)
{
    st_842c_0 *v3;  // x0
    unsigned int v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    v3 = sub_83dc("\"", &v0, 1786);
    if (v3 == &g_cbe7d0.field_0)
    {
        return 0;
    }
    else if ((v3->field_0 | v3->field_2 * 0x10000) == a0)
    {
        return v3 + 1;
    }
    else
    {
        return 0;
    }
}
