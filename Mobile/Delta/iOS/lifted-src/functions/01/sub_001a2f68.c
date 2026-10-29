/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2f68..0x1a2fa4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2f68_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_1a2f68_0;

typedef struct st_1a2f68_1 {
    char padding_0[16];
    struct st_1a2f68_0 *field_10;
} st_1a2f68_1;


st_1a2f68_1 * sub_1a2f68(st_1a2f68_1 *a0, unsigned long a1, st_1a2f68_0 *a2)
{
    st_1a2f68_0 *iter;  // x8
    st_1a2f68_0 *v1;  // x9
    unsigned long long i;  // x10
    unsigned long long v3;  // x10
    uint128_t v4;  // q0

    iter = a0->field_10;
    if (a1)
    {
        v1 = &iter[a1];
        i = a1 * 24;
        do
        {
            v3 = i;
            v4 = a2->field_0;
            iter->field_10 = a2->field_10;
            iter->field_0 = v4;
            iter += 1;
            i = v3 - 24;
        } while (i);
        iter = v1;
    }
    a0->field_10 = iter;
    return a0;
}
