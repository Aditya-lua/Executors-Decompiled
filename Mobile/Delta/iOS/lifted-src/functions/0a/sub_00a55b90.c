/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55b90..0xa55bac (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55b90_0 {
    char padding_0[80];
    unsigned long long field_50;
} st_a55b90_0;


int sub_a55b90(st_a55b90_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0->field_50)
        return 1;
    goto *((void *)(a0->field_50));
}
