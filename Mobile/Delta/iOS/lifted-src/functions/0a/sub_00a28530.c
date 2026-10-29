/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa28530..0xa28580 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a28530_0 {
    char padding_0[24];
    long long field_18;
} st_a28530_0;


int sub_a28530(unsigned long a0, st_a28530_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a1b4f4())
    {
        return 1;
    }
    else if (sub_9e4828(a1->field_18))
    {
        return 1;
    }
}
