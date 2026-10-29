/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989e08..0x989e58 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989e08_1 {
    char padding_0[7];
    struct st_989e08_0 *field_7;
} st_989e08_1;

typedef struct st_989e08_0 {
    char padding_0[8];
    struct st_989e08_0 *field_8;
} st_989e08_0;

typedef struct st_989e08_3 {
    struct st_989e08_2 *field_0;
    struct st_989e08_0 *field_8;
    struct st_989e08_0 *field_10;
} st_989e08_3;

typedef struct st_989e08_2 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    struct st_989e08_0 *field_10;
    char padding_18[32];
    struct st_989e08_1 *field_38;
    struct st_989e08_0 *field_40;
    char padding_48[24];
    struct st_989e08_0 *field_60;
} st_989e08_2;


st_989e08_3 * sub_989e08(st_989e08_3 *a0, st_989e08_2 *a1, st_989e08_0 *a2)
{
    st_989e08_0 *v0;  // x8
    st_989e08_1 *v1;  // x10
    st_989e08_1 *v2;  // x9
    st_989e08_0 *v3;  // x9
    st_989e08_0 *iter;  // x8

    v0 = a1->field_60;
    a0->field_0 = a1;
    a0->field_8 = v0;
    a0->field_10 = v0;
    if (!a2)
    {
        return a0;
    }
    else if (v0)
    {
        v1 = a1->field_38;
        v2 = &a1->field_40->padding_0[1];
        a1->field_40 = v2;
        if (v2 < v1)
            return a0;
        a1->field_40 = 0;
        v3 = &a1->field_8;
        iter = v0->field_8;
        if (iter == v3)
            iter = iter->field_8;
        if (iter == v3)
            iter = 0;
        a1->field_60 = iter;
        return a0;
    }
    else
    {
        return a0;
    }
}
