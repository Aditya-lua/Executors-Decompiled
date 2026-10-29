/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ca938..0x9ca9ac (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ca938_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9ca938_0;

typedef struct st_9ca938_1 {
    long long field_0;
    char padding_8[8];
    struct st_9ca938_0 *field_10;
    char padding_18[8];
    struct st_9ca938_0 *field_20;
} st_9ca938_1;


st_9ca938_0 * sub_9ca938(unsigned int a0, st_9ca938_1 **a1)
{
    st_9ca938_0 *v2;  // x8
    st_9ca938_0 *v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a0)
    {
    case 5:
        v3 = (st_9ca938_0 *)(unsigned int)sub_9c1a94(*a1->field_0);
        if (v3 > 1 || !v3 && *a1->field_20)
            return 0;
        goto LABEL_9ca990;
    case 2:
        v2 = *a1->field_10;
        if (v2)
        {
            sub_a66ec0(v2->field_8, v2->field_0);
            return 1;
        }
    default:
LABEL_9ca990:
        return 1;
    }
}
