/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ac90..0xa3acac (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ac90_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_a3ac90_0;


int sub_a3ac90(st_a3ac90_0 *a0, unsigned long a1)
{
    if (!a0->field_10)
    {
        a0->field_10 = a1;
        return 1;
    }
    return 0;
}
