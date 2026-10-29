/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2abeb8..0x2abf10 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2abeb8_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[15];
    unsigned long long field_20;
} st_2abeb8_1;

typedef struct st_2abeb8_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[15];
    unsigned long long field_20;
} st_2abeb8_0;

extern char g_e7b9a0;
extern char g_e7ba30;

st_2abeb8_0 * sub_2abeb8(st_2abeb8_0 *a0, st_2abeb8_1 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = &g_e7b9a0;
    a0->field_8 = a1->field_8;
    std::runtime_error::runtime_error(&a0->field_10, &a1->field_10);
    a0->field_0 = &g_e7ba30;
    a0->field_20 = a1->field_20;
    return a0;
}
