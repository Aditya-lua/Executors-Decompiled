/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984434..0x9844c8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_984434_0 {
    struct st_984434_0 *field_0;
    struct st_984434_0 *field_8;
} st_984434_0;

typedef struct st_984434_1 {
    char padding_0[48];
    struct st_984434_0 *field_30;
    struct st_984434_0 *field_38;
    unsigned long long field_40;
    struct st_984434_0 *field_48;
    struct st_984434_0 *field_50;
    unsigned long long field_58;
    char padding_60[961];
    struct st_984434_0 *field_421;
} st_984434_1;


st_984434_1 * sub_984434(st_984434_1 *a0)
{
    st_984434_0 *i;  // x8
    st_984434_0 *v1;  // x9
    st_984434_0 *v2;  // x10
    st_984434_0 *v3;  // x9

    if ((a0->padding_60)[1])
        return a0;
    (a0->padding_60)[1] = 1;
    i = a0->field_48;
    if (!i)
        return a0;
    do
    {
        v1 = i->field_0;
        v2 = i->field_8;
        a0->field_48 = v1;
        if (a0->field_50 == i)
        {
            a0->field_50 = v2;
            if (!v2)
                continue;
        }
        else if (!v2)
        {
            continue;
        }
        v2->field_0 = v1;
        if (v1)
            v1->field_8 = v2;
        a0->field_58 = a0->field_58 - 1;
        i->field_0 = 0;
        i->field_8 = 0;
        v3 = a0->field_38;
        if (v3)
            v3->field_0 = i;
        i->field_0 = 0;
        i->field_8 = v3;
        a0->field_38 = i;
        if (!a0->field_30)
            a0->field_30 = i;
        i = a0->field_48;
        a0->field_40 = a0->field_40 + 1;
    } while (i);
    return a0;
}
