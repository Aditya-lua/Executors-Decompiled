/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae450..0x2ae49c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ae450_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_2ae450_0;

typedef struct st_2ae450_1 {
    char padding_0[8];
    unsigned int field_8;
} st_2ae450_1;

extern char g_e7b9a0;
extern char g_e7b9e0;

st_2ae450_0 * sub_2ae450(st_2ae450_0 *a0, st_2ae450_1 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = &g_e7b9a0;
    a0->field_8 = a1->field_8;
    std::runtime_error::runtime_error((char *)&a0[1].field_0 + 4, &a1[1].padding_0[4]);
    a0->field_0 = &g_e7b9e0;
    return a0;
}
