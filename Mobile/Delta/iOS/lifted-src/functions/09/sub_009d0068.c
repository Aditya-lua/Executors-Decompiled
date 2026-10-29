/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0068..0x9d00a0 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0068_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_9d0068_0;


unsigned int sub_9d0068(unsigned long long *a0, unsigned long a1, unsigned long a2, st_9d0068_0 *a3)
{
    if (a3->field_28 & 1 && !*(int *)*a0)
        return 0xffffffff;
}
