/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50638..0xa50654 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50638_0 {
    struct st_a50638_0 *field_0;
    char field_4;
} st_a50638_0;


int sub_a50638(st_a50638_0 *a0)
{
    if (a0)
    {
        if (a0->field_0)
            return *(int *)((char *)&a0->field_0->field_0 + 4);
        a0 = 0;
    }
    return (unsigned int)a0;
}
