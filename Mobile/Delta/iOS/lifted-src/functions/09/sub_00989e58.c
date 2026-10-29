/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989e58..0x989e94 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989e58_0 {
    char padding_0[8];
    struct st_989e58_0 *field_8;
} st_989e58_0;

typedef struct st_989e58_1 {
    char padding_0[16];
    struct st_989e58_0 *field_10;
} st_989e58_1;

typedef struct st_989e58_2 {
    struct st_989e58_1 *field_0;
    struct st_989e58_0 *field_8;
    struct st_989e58_0 *field_10;
} st_989e58_2;


st_989e58_2 * sub_989e58(st_989e58_2 *a0)
{
    st_989e58_0 *v0;  // x9
    st_989e58_0 *iter;  // x8

    if (!a0->field_10)
        return a0;
    v0 = &a0->field_0->padding_0[8];
    iter = a0->field_10->field_8;
    if (iter == v0)
        iter = iter->field_8;
    if (iter == v0)
        iter = 0;
    if (iter == a0->field_8)
        iter = 0;
    a0->field_10 = iter;
    return a0;
}
