/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe04fc..0xe053c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e04fc_0 {
    char padding_0[16];
    struct st_e04fc_1 *field_10;
    char padding_18[24];
    unsigned int field_30;
} st_e04fc_0;

typedef struct st_e04fc_1 {
    char field_0;
} st_e04fc_1;


st_e04fc_0 * sub_e04fc(st_e04fc_0 *a0, unsigned int *a1, unsigned long long *a2)
{
    char *v0;  // x8
    unsigned long v1;  // x9
    unsigned long v2;  // x10
    unsigned long v3;  // x10

    v0 = a0->field_10;
    v1 = *a1;
    if (v0[*a2] <= (unsigned int)v1)
        return a0;
    v2 = *a2 + 1;
    do
    {
        v3 = v2;
        *a2 = v3;
        v1 += a0->field_30;
        *a1 = v1;
        v2 = v3 + 1;
    } while ((unsigned int)v1 < v0[v3]);
    return a0;
}
