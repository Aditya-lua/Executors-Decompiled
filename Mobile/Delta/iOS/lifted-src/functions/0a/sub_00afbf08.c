/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafbf08..0xafbf48 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afbf08_2 {
    struct st_afbf08_0 *field_0;
    struct st_afbf08_1 *field_8;
} st_afbf08_2;

typedef struct st_afbf08_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_afbf08_0 *field_8;
} st_afbf08_1;

typedef struct st_afbf08_0 {
    struct st_afbf08_0 *field_0;
} st_afbf08_0;


int sub_afbf08(st_afbf08_0 **a0, st_afbf08_0 **a1, unsigned int *a2, st_afbf08_0 **a3, st_afbf08_2 *a4)
{
    if (a0)
        *a0 = *(long long *)a4->field_0;
    if (a1)
    {
        *a1 = a4->field_8->field_8;
        *a2 = a4->field_8->field_0;
    }
    if (a3)
        *a3 = a4->field_0;
    return 1;
}
