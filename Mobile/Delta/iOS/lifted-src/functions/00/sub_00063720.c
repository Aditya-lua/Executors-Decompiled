/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63720..0x637b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63720_0 {
    char padding_0[144];
    unsigned int field_90;
} st_63720_0;

typedef struct st_63720_1 {
    char padding_0[56];
    struct st_63720_2 *field_38;
} st_63720_1;

typedef struct st_63720_2 {
    unsigned long long field_0;
} st_63720_2;

extern char g_1000140;

int sub_63720(st_63720_0 *a0, unsigned int a1)
{
    unsigned int v3;  // w19
    unsigned long long v4;  // 4148
    st_63720_1 **v5;  // x0
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_90;
    v4 = arm64g_calculate_condition(0x11, v3, 1, 0);
    if (v4 & 1)
    {
        a0->field_90 = a1;
        return (char)v3;
    }
    std::__1::ios_base::getloc();
    v5 = std::__1::locale::use_facet(&v0, &g_1000140);
    *v5->field_38();
}
