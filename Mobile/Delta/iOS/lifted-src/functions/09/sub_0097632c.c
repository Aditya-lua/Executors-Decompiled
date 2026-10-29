/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97632c..0x9763a8 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97632c_1 {
    struct st_97632c_0 *field_0;
    struct st_97632c_0 *field_8;
    char padding_10[52];
    struct st_97632c_0 *field_44;
} st_97632c_1;

typedef struct st_97632c_0 {
    char padding_0[16];
    struct st_97632c_0 *field_10;
    struct st_97632c_0 *field_18;
    char padding_20[52];
    struct st_97632c_0 *field_54;
} st_97632c_0;


st_97632c_0 ** sub_97632c(st_97632c_0 **a0, st_97632c_0 *a1)
{
    st_97632c_0 *v0;  // x9
    st_97632c_1 *v1;  // x8
    st_97632c_0 *v2;  // x10
    st_97632c_0 *v3;  // x8

    if (*(int *)&(a1->padding_20)[1])
        return a0;
    if (*a0 == a1)
        *a0 = a1->field_18;
    v0 = a1->field_10;
    v1 = &a1->field_10;
    if (a0[1] == a1)
        a0[1] = v0;
    v2 = a1->field_18;
    if (v0)
        v0->field_18 = v2;
    if (v2)
        v2->field_10 = v0;
    v1->field_0 = 0;
    v1->field_8 = 0;
    v3 = a0[3];
    a1->field_10 = v3;
    a0[3] = a1;
    if (v3)
        v3->field_18 = a1;
    if (!a0[2])
        a0[2] = a1;
    *(unsigned int *)&(a1->padding_20)[1] = 1;
    return a0;
}
