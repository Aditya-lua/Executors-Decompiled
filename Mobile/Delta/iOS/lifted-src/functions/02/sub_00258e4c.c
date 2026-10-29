/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x258e4c..0x258ec0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_258e4c_1 {
    char padding_0[104];
    struct st_258e4c_1 *field_68;
} st_258e4c_1;

typedef struct st_258e4c_0 {
    char field_0;
} st_258e4c_0;

typedef struct st_258e4c_3 {
    struct st_258e4c_1 *field_0;
} st_258e4c_3;

typedef struct st_258e4c_2 {
    char padding_0[128];
    struct st_258e4c_3 *field_80;
} st_258e4c_2;

typedef struct st_258e4c_4 {
    char padding_0[96];
    struct st_258e4c_2 *field_60;
} st_258e4c_4;

extern unsigned long long g_e7a9b8;
extern unsigned long long g_e7a9c0;
extern st_258e4c_4 *g_f0d198;

void sub_258e4c(st_258e4c_1 *iter)
{
    unsigned long long *v2;  // x8
    st_258e4c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_258e4c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = &g_e7a9c0;
    while (1)
    {
        iter = iter->field_68;
        if (!iter)
            break;
        if (iter == *(long long *)g_f0d198->field_60->field_80)
        {
            v2 = &g_e7a9b8;
            break;
        }
    }
    goto *((void *)(*v2));
}
