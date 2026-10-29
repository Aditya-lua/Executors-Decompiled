/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80958..0xa80964 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80958_1 {
    char padding_0[8];
    struct st_a80958_0 *field_8;
} st_a80958_1;

typedef struct st_a80958_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_a80958_0;


long long sub_a80958(st_a80958_1 *a0)
{
    return a0->field_8->field_40;
}
