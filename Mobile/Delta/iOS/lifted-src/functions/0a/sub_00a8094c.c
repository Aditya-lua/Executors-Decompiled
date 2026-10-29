/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8094c..0xa80958 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8094c_1 {
    char padding_0[8];
    struct st_a8094c_0 *field_8;
} st_a8094c_1;

typedef struct st_a8094c_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a8094c_0;


int sub_a8094c(st_a8094c_1 *a0)
{
    return a0->field_8->field_10;
}
