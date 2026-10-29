/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5a99c..0x5a9ec (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5a99c_2 {
    struct st_5a99c_1 *field_0;
    struct st_5a99c_2 *field_8;
} st_5a99c_2;

typedef struct st_5a99c_0 {
    char padding_0[8];
    struct st_5a99c_1 *field_8;
} st_5a99c_0;

typedef struct st_5a99c_1 {
    struct st_5a99c_0 *field_0;
} st_5a99c_1;

typedef struct st_5a99c_3 {
    char field_0;
} st_5a99c_3;

extern st_5a99c_2 g_f011d0;

st_5a99c_0 ** sub_5a99c(st_5a99c_0 *a0, st_5a99c_2 *a1)
{
    st_5a99c_2 *v2;  // x1
    st_5a99c_3 **v0;  // [bp-0x10], Other Possible Types: char
    st_5a99c_3 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1 != &g_f011d0.field_0)
    {
        do
        {
            v2 = a1;
            if (*(long long *)v2->field_0 == a0)
                return v2->field_0;
        } while ((a1 = v2->field_8, v2->field_8 != &g_f011d0.field_0));
    }
    return a0->field_8;
}
