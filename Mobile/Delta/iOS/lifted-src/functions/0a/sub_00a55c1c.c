/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55c1c..0xa55c40 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55c1c_0 {
    char padding_0[224];
    unsigned long long field_e0;
} st_a55c1c_0;


int sub_a55c1c(st_a55c1c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    if (!a0->field_e0)
        return 0;
    goto *((void *)(a0->field_e0));
}
