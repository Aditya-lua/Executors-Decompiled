/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60658..0x606ec (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60658_0 {
    char padding_0[144];
    unsigned int field_90;
} st_60658_0;

typedef struct st_60658_1 {
    char padding_0[56];
    struct st_60658_2 *field_38;
} st_60658_1;

typedef struct st_60658_2 {
    unsigned long long field_0;
} st_60658_2;

extern char g_1000140;

int sub_60658(st_60658_0 *a0)
{
    unsigned long long v3;  // 4140
    st_60658_1 **v4;  // x0
    char v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = arm64g_calculate_condition(1, a0->field_90, 1, 0);
    if (!(v3 & 1))
        return (char)a0->field_90;
    std::__1::ios_base::getloc();
    v4 = std::__1::locale::use_facet(&v0, &g_1000140);
    *v4->field_38();
}
