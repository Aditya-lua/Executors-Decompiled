/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03a04..0xa03a10 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03a04_1 {
    char padding_0[160];
    struct st_a03a04_0 *field_a0;
} st_a03a04_1;

typedef struct st_a03a04_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_a03a04_0;


long long sub_a03a04(unsigned long a0, unsigned long a1, unsigned long a2, st_a03a04_1 *a3)
{
    goto *((void *)(a3->field_a0->field_18));
}
