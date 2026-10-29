/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a11ec..0x9a1208 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a11ec_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9a11ec_0;


long long sub_9a11ec(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, st_9a11ec_0 *a4)
{
    if (!a4->field_10)
        return a0;
    goto *((void *)(a4->field_10));
}
