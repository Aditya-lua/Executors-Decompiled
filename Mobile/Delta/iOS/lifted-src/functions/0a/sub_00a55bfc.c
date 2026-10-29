/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55bfc..0xa55c1c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55bfc_0 {
    char padding_0[200];
    unsigned long long field_c8;
} st_a55bfc_0;


int sub_a55bfc(st_a55bfc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    if (!a0->field_c8)
        return 0;
    goto *((void *)(a0->field_c8));
}
