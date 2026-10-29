/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991a84..0x991b0c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991a84_2 {
    struct st_991a84_0 *field_0;
    struct st_991a84_0 *field_8;
    unsigned long long field_10;
} st_991a84_2;

typedef struct st_991a84_1 {
    char padding_0[8];
    struct st_991a84_0 *field_8;
    unsigned long long field_10;
} st_991a84_1;

typedef struct st_991a84_0 {
    struct st_991a84_0 *field_0;
    struct st_991a84_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_991a84_0;


st_991a84_0 * sub_991a84(st_991a84_2 *a0, st_991a84_1 *a1)
{
    st_991a84_0 *v0;  // x0
    st_991a84_0 *v1;  // x9
    st_991a84_0 *v2;  // x10

    v0 = a1->field_8;
    if (!v0)
    {
        return v0;
    }
    else if (a1->field_10 - 1 == v0->field_18)
    {
        a1->field_10 = v0->field_10;
        if (a0->field_0 == v0)
            a0->field_0 = v0->field_0;
        v1 = v0->field_8;
        if (a0->field_8 == v0)
            a0->field_8 = v1;
        v2 = v0->field_0;
        if (v1)
            v1->field_0 = v2;
        if (v2)
            v2->field_8 = v1;
        a0->field_10 = a0->field_10 - 1;
        v0->field_0 = 0;
        v0->field_8 = 0;
    }
    else
    {
        return v0;
    }
}
