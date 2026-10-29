/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55bbc..0xa55bdc (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55bbc_0 {
    char padding_0[184];
    unsigned long long field_b8;
} st_a55bbc_0;


int sub_a55bbc(st_a55bbc_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    if (!a0->field_b8)
        return 1;
    goto *((void *)(a0->field_b8));
}
