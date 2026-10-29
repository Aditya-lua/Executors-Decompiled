/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x730fc..0x73134 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_730fc_1 {
    struct st_730fc_0 *field_0;
    struct st_730fc_0 *field_8;
} st_730fc_1;

typedef struct st_730fc_0 {
    char field_0;
} st_730fc_0;


long long sub_730fc(unsigned long a0, st_730fc_0 **a1, st_730fc_0 **a2, char *iter)
{
    char *i;  // x9
    st_730fc_1 *v1;  // x8

    i = *a1;
    if (i != *a2)
    {
        do
        {
            *iter = *i;
            iter += 1;
            i = *a1 + 1;
            *a1 = i;
        } while (i != *a2);
    }
    v1->field_0 = i;
    v1->field_8 = iter;
    return a0;
}
