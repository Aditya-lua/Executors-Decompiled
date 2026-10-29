/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf274..0x9cf284 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf274_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_9cf274_1;

typedef struct st_9cf274_0 {
    unsigned int field_0;
} st_9cf274_0;


int sub_9cf274(st_9cf274_0 **a0, st_9cf274_1 *a1)
{
    return *(int *)((char *)*a0 + a1->field_8);
}
