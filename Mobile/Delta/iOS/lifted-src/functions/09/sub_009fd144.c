/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd144..0x9fd150 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd144_0 {
    char padding_0[200];
    unsigned long long field_c8;
} st_9fd144_0;

typedef struct st_9fd144_1 {
    char padding_0[32];
    struct st_9fd144_0 *field_20;
} st_9fd144_1;


long long sub_9fd144(st_9fd144_1 *a0)
{
    return a0->field_20->field_c8;
}
