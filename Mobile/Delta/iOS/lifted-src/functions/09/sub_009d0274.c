/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0274..0x9d02ac (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0274_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_9d0274_0;


unsigned int sub_9d0274(unsigned long long *a0, unsigned long a1, unsigned long a2, st_9d0274_0 *a3)
{
    if (a3->field_28 & 1 && !*(long long *)*a0)
        return 0xffffffff;
}
