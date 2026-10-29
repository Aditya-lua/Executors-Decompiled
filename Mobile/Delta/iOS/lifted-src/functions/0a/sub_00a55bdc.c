/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55bdc..0xa55bfc (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55bdc_0 {
    char padding_0[192];
    unsigned long long field_c0;
} st_a55bdc_0;


int sub_a55bdc(st_a55bdc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    if (!a0->field_c0)
        return 0;
    goto *((void *)(a0->field_c0));
}
