/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b768..0x97b79c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b768_0 {
    struct st_97b768_0 *field_0;
    struct st_97b768_0 *field_8;
    char padding_10[265];
    struct st_97b768_0 *field_119;
} st_97b768_0;

typedef struct st_97b768_1 {
    char padding_0[64];
    struct st_97b768_0 *field_40;
    struct st_97b768_0 *field_48;
    unsigned long long field_50;
} st_97b768_1;


st_97b768_1 * sub_97b768(st_97b768_1 *a0, st_97b768_0 *a1)
{
    st_97b768_0 *v0;  // x8

    v0 = a0->field_48;
    if (v0)
        v0->field_0 = a1;
    a1->field_0 = 0;
    a1->field_8 = v0;
    a0->field_48 = a1;
    if (!a0->field_40)
        a0->field_40 = a1;
    a0->field_50 = a0->field_50 + 1;
    (a1->padding_10)[1] = 0;
    return a0;
}
