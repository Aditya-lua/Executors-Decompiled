/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c3cc..0x97c440 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c3cc_0 {
    struct st_97c3cc_0 *field_0;
    struct st_97c3cc_0 *field_8;
} st_97c3cc_0;

typedef struct st_97c3cc_1 {
    char padding_0[104];
    struct st_97c3cc_0 *field_68;
} st_97c3cc_1;


long long * sub_97c3cc(long long *a0, st_97c3cc_1 *a1)
{
    st_97c3cc_0 *v2;  // x21
    long long *v3;  // x0
    st_97c3cc_0 *v4;  // x8
    st_97c3cc_0 *v5;  // x9
    st_97c3cc_0 **v6;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_68;
    if (!v2)
        return a0;
    do
    {
        v3 = sub_9766cc(*a0, v2);
        v4 = v2->field_8;
        if ((unsigned int)v3)
        {
            v5 = v2->field_0;
            v6 = &v5->field_8;
            if (!v5)
                v6 = &a1->field_68;
            *v6 = v4;
            if (v4)
                v4->field_0 = v5;
            v2->field_0 = 0;
            v2->field_8 = 0;
        }
    } while ((v2 = v4, v2));
    return v3;
}
