/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4ef0..0x9f4f04 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4ef0_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_9f4ef0_0;


st_9f4ef0_0 ** sub_9f4ef0(st_9f4ef0_0 **a0)
{
    if (!a0)
        return 0;
    goto *((void *)(*a0->field_18));
}
