/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5c70..0x9e5c94 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5c70_1 {
    unsigned int field_0;
} st_9e5c70_1;

typedef struct st_9e5c70_0 {
    struct st_9e5c70_1 *field_0;
    int field_8;
} st_9e5c70_0;


unsigned int sub_9e5c70(st_9e5c70_0 *a0)
{
    if (a0->field_8 < 1)
        return 0;
    return *(int *)a0->field_0 & 1;
}
