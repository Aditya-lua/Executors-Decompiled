/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6f30..0x9e6fac (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6f30_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[23];
    char field_20;
    char padding_21[23];
    char field_38;
    char padding_39[23];
    unsigned long long field_50;
    unsigned long long field_58;
} st_9e6f30_0;


st_9e6f30_0 * sub_9e6f30(st_9e6f30_0 *a0, st_9e6f30_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == a1)
        return a0;
    if (!sub_9e4c34(&a0->field_8, &a1->field_8) || !sub_9e4c34(&a0->field_20, &a1->field_20) || !sub_9e4c34(&a0->field_38, &a1->field_38))
        return 0;
    a0->field_0 = a1->field_0;
    a0->field_50 = a1->field_50;
    a0->field_58 = a1->field_58;
    return a0;
    return 0;
}
