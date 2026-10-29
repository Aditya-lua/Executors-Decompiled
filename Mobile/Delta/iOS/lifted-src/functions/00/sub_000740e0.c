/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x740e0..0x74118 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_740e0_0 {
    char padding_0[16];
    struct st_740e0_1 *field_10;
} st_740e0_0;

typedef struct st_740e0_1 {
    char field_0;
} st_740e0_1;


st_740e0_0 * sub_740e0(st_740e0_0 *a0, st_740e0_1 **a1, unsigned long long i)
{
    char *iter;  // x8
    char *v1;  // x9
    char *v2;  // x10
    unsigned long long v3;  // x2

    iter = a0->field_10;
    if (i)
    {
        v1 = &iter[i];
        v2 = *a1;
        do
        {
            v3 = i;
            *iter = *v2;
            iter += 1;
            v2 = *a1 + 1;
            *a1 = v2;
            i = v3 - 1;
        } while (i);
        iter = v1;
    }
    a0->field_10 = iter;
    return a0;
}
