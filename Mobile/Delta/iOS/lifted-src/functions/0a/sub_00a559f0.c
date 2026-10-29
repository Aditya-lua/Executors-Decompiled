/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa559f0..0xa55a0c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a559f0_0 {
    char padding_0[128];
    unsigned long long field_80;
} st_a559f0_0;


int sub_a559f0(st_a559f0_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0->field_80)
        return 0;
    goto *((void *)(a0->field_80));
}
