/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a66ec..0x9a670c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a66ec_0 {
    char padding_0[172];
    unsigned int field_ac;
    char padding_b0[1016];
    unsigned long long field_4a8;
} st_9a66ec_0;


long long sub_9a66ec(st_9a66ec_0 *a0)
{
    if (!a0->field_4a8)
        return 0;
    return a0->field_ac != 40;
}
