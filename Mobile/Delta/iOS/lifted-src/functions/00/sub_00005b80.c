/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5b80..0x5c20 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5b80_0 {
    char field_0;
} st_5b80_0;

typedef struct st_5b80_1 {
    char padding_0[8];
    unsigned int field_8;
} st_5b80_1;

extern unsigned long long g_e614e0;
extern unsigned long long g_e614e8;
extern unsigned int g_f00b50;

void sub_5b80(st_5b80_1 *a0)
{
    unsigned long long *v2;  // x10
    st_5b80_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_5b80_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = &g_e614e8;
    if (a0)
    {
        if (a0->field_8 == g_f00b50)
            v2 = &g_e614e0;
        goto *((void *)(*v2));
    }
    else
    {
        goto *((void *)(g_e614e8));
    }
}
