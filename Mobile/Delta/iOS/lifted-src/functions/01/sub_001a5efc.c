/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5efc..0x1a5f48 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5efc_1 {
    struct st_1a5efc_2 *field_0;
    char padding_8[16];
    struct st_1a5efc_1 *field_18;
} st_1a5efc_1;

typedef struct st_1a5efc_0 {
    unsigned long long field_0;
} st_1a5efc_0;

typedef struct st_1a5efc_2 {
    struct st_1a5efc_0 *field_0;
} st_1a5efc_2;


st_1a5efc_1 * sub_1a5efc(st_1a5efc_1 *a0)
{
    st_1a5efc_1 *v2;  // x0
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    a0->field_18 = 0;
    if (v2 == a0)
    {
        v3 = 32;
    }
    else if (v2)
    {
        v3 = 40;
    }
    else
    {
        return a0;
    }
    (*(long long *)((char *)v2->field_0 + v3))();
}
