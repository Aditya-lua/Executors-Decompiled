/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf574..0x9cf584 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf574_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9cf574_0;


long long sub_9cf574(unsigned long long *a0, st_9cf574_0 *a1)
{
    return *a0 + a1->field_10;
}
