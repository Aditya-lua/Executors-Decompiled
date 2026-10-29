/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ed950..0x1ed9a0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ed950_1 {
    struct st_1ed950_2 *field_0;
    unsigned long long field_8;
} st_1ed950_1;

typedef struct st_1ed950_2 {
    unsigned int field_0;
} st_1ed950_2;

typedef struct st_1ed950_0 {
    char field_0;
} st_1ed950_0;


st_1ed950_1 * sub_1ed950(st_1ed950_1 *a0)
{
    unsigned long long v2;  // x10
    unsigned long long i;  // x8
    unsigned int *iter;  // x9
    unsigned int *node;  // x10
    unsigned long long v6;  // x8
    unsigned int v7;  // w11
    st_1ed950_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1ed950_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    if (v2 < 2)
        return a0;
    i = v2 >> 1;
    iter = a0->field_0;
    node = (char *)&a0->field_0[v2] - 4;
    do
    {
        v6 = i;
        v7 = *iter;
        *iter = *node;
        iter += 1;
        *node = v7;
        node = (char *)node - 4;
        i = v6 - 1;
    } while (i);
    return a0;
}
