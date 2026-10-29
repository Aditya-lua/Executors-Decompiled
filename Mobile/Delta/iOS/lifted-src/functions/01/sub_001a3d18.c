/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3d18..0x1a3d88 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3d18_0 {
    char padding_0[24];
    struct st_1a3d18_1 *field_18;
} st_1a3d18_0;

typedef struct st_1a3d18_2 {
    struct st_1a3d18_0 *field_0;
    char padding_8[16];
    struct st_1a3d18_2 *field_18;
} st_1a3d18_2;

typedef struct st_1a3d18_1 {
    unsigned long long field_0;
} st_1a3d18_1;


void sub_1a3d18(st_1a3d18_2 *a0, st_1a3d18_2 *a1)
{
    st_1a3d18_2 *v2;  // x9
    st_1a3d18_2 **v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_18;
    v3 = &a1->field_18;
    if (!v2)
    {
        v3 = &a0->field_18;
    }
    else if (v2 != a1)
    {
        a0->field_18 = v2;
    }
    else
    {
        a0->field_18 = a0;
        *v3->field_0->field_18();
    }
    *v3 = 0;
    return;
}
