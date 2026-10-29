/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55b2c..0xa55b40 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55b2c_0 {
    char padding_0[152];
    unsigned long long field_98;
} st_a55b2c_0;


void sub_a55b2c(st_a55b2c_0 *a0, unsigned long a1)
{
    if (!a0->field_98)
        return;
    goto *((void *)(a0->field_98));
}
