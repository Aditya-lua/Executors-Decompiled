/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b4d0..0xa5b508 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5b4d0_0 {
    char padding_0[8];
    struct st_a5b4d0_0 *field_8;
    char padding_10[160];
    struct st_a5b4d0_0 *field_b0;
} st_a5b4d0_0;


int sub_a5b4d0(st_a5b4d0_0 *a0, unsigned long a1)
{
    st_a5b4d0_0 *v0;  // x8

    if (a0)
    {
        v0 = a0->field_8;
        if (v0)
        {
            if (v0->field_b0)
                goto *((void *)(v0->field_b0));
            else
                a0 = 0xfffffffe;
        }
    }
    return (unsigned int)a0;
}
