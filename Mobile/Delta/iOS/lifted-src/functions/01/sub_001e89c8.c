/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e89c8..0x1e89ec (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e89c8_1 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_1e89c8_1;

typedef struct st_1e89c8_0 {
    char padding_0[88];
    struct st_1e89c8_1 *field_58;
} st_1e89c8_0;


int sub_1e89c8(st_1e89c8_0 *a0)
{
    unsigned int *v0;  // x8

    v0 = &a0->field_58->field_0;
    *v0 = 0;
    v0[3] = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
