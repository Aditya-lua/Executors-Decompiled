/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f51c..0x3f5c4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f51c_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[28];
    unsigned long long field_28;
} st_3f51c_1;

typedef struct st_3f51c_0 {
    char field_0;
} st_3f51c_0;

extern unsigned long long g_e66298;
extern unsigned long long g_e662a8;
extern unsigned int g_f00c20;

long long sub_3f51c(unsigned long a0, st_3f51c_1 *a1)
{
    unsigned long long *v2;  // x10
    st_3f51c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3f51c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = &g_e66298;
    if (a1)
    {
        if (a1->field_8 == g_f00c20)
            v2 = &g_e662a8;
        goto *((void *)(*v2));
    }
    else
    {
        goto *((void *)(g_e66298));
    }
}
