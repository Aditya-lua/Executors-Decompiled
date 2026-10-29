/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x173f88..0x173fe0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_173f88_2 {
    char padding_0[8];
    struct st_173f88_1 *field_8;
} st_173f88_2;

typedef struct st_173f88_1 {
    struct st_173f88_1 *field_0;
    char field_8;
    char padding_9[19];
    int field_1c;
} st_173f88_1;

typedef struct st_173f88_0 {
    char field_0;
} st_173f88_0;


st_173f88_1 * sub_173f88(st_173f88_2 *a0, int *a1)
{
    st_173f88_1 *v2;  // x8
    st_173f88_1 *iter;  // x8
    st_173f88_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_173f88_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_8)
    {
        do
        {
            iter = v2;
            if (*a1 >= iter->field_1c)
            {
                if (*a1 > iter->field_1c)
                    iter = &iter->field_8;
                else
                    return 1;
            }
        } while ((v2 = iter->field_0, iter->field_0));
    }
    return 0;
}
