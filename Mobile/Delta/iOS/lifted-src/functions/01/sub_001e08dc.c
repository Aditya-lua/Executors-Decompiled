/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e08dc..0x1e095c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e08dc_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
    int field_24;
} st_1e08dc_0;

typedef struct st_1e08dc_1 {
    char field_0;
} st_1e08dc_1;

typedef struct st_1e08dc_3 {
    unsigned long long field_0;
} st_1e08dc_3;

typedef struct st_1e08dc_2 {
    char padding_0[288];
    struct st_1e08dc_3 *field_120;
} st_1e08dc_2;

extern st_1e08dc_2 *g_f0d3d8;

unsigned long long sub_1e08dc(st_1e08dc_0 *a0)
{
    unsigned long long v4;  // x0
    st_1e08dc_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_1e08dc_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_0;
    if (!v4)
    {
        return v4;
    }
    else if (*(int *)((char *)&a0->field_20 + 4) >= 1)
    {
        g_f0d3d8->field_120();
    }
    else if ((int)a0->field_20 >= 1)
    {
        g_f0d3d8->field_120();
    }
    else
    {
        a0->field_20 = 0;
        return v4;
    }
}
