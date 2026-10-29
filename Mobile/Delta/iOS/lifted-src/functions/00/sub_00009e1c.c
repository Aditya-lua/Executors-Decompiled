/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e1c..0x9e4c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e1c_0 {
    char padding_0[20];
    unsigned int field_14;
    struct st_9e1c_1 *field_18;
} st_9e1c_0;

typedef struct st_9e1c_1 {
    char field_0;
} st_9e1c_1;


long long sub_9e1c(st_9e1c_0 *a0)
{
    return *(char *)&a0->field_18[a0->field_14] != 39;
}
