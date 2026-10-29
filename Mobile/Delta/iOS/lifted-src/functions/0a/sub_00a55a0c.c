/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55a0c..0xa55a28 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55a0c_0 {
    char padding_0[112];
    unsigned long long field_70;
} st_a55a0c_0;


int sub_a55a0c(st_a55a0c_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0->field_70)
        return 0;
    goto *((void *)(a0->field_70));
}
