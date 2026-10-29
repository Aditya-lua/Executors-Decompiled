/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5054..0x9d5070 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d5054_1 {
    char padding_0[48];
    unsigned int field_30;
    unsigned int field_34;
} st_9d5054_1;

typedef struct st_9d5054_0 {
    char padding_0[48];
    unsigned int field_30;
    unsigned int field_34;
    char padding_38[16];
    struct st_9d5054_1 *field_48;
} st_9d5054_0;


st_9d5054_0 * sub_9d5054(st_9d5054_0 *a0)
{
    unsigned int v0;  // w8

    v0 = a0->field_48->field_34;
    a0->field_30 = a0->field_30 | a0->field_48->field_30 & 15;
    a0->field_34 = v0;
    return a0;
}
