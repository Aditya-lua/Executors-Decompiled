/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1204c..0xb12070 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b1204c_0 {
    char padding_0[424];
    unsigned int field_1a8;
} st_b1204c_0;


int sub_b1204c(st_b1204c_0 *a0)
{
    if (1 < a0->field_1a8)
        return 0;
    a0->field_1a8 = 1;
}
