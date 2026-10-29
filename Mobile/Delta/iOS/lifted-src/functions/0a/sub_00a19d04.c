/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19d04..0xa19d2c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19d04_1 {
    char padding_0[24];
    struct st_a19d04_0 *field_18;
} st_a19d04_1;

typedef struct st_a19d04_0 {
    struct st_a19d04_0 *field_0;
} st_a19d04_0;


st_a19d04_0 ** sub_a19d04(st_a19d04_1 *a0)
{
    if (!a0->field_18)
    {
        return 0;
    }
    else if (*(long long *)a0->field_18)
    {
        return 1 & ~((unsigned int)(*(int *)*(long long *)a0->field_18) >> 2);
    }
    else
    {
        return 0;
    }
}
