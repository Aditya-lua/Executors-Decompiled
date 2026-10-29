/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a7150..0x1a718c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a7150_1 {
    char padding_0[8];
    struct st_1a7150_0 *field_8;
} st_1a7150_1;

typedef struct st_1a7150_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_1a7150_0;


st_1a7150_1 * sub_1a7150(st_1a7150_1 *a0, unsigned long a1, st_1a7150_0 *a2)
{
    st_1a7150_0 *iter;  // x8
    st_1a7150_0 *v1;  // x9
    unsigned long long i;  // x10
    unsigned long long v3;  // x10
    uint128_t v4;  // q0

    iter = a0->field_8;
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
    a0->field_8 = iter;
    return a0;
}
