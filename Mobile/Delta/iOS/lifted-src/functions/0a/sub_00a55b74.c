/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55b74..0xa55b90 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55b74_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_a55b74_0;


int sub_a55b74(st_a55b74_0 *a0, unsigned long a1, unsigned long a2)
{
    if (!a0->field_40)
        return 1;
    goto *((void *)(a0->field_40));
}
