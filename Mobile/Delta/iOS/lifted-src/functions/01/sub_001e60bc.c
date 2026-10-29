/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e60bc..0x1e60e4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e60bc_0 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1e60bc_0;

typedef struct st_1e60bc_1 {
    char padding_0[88];
    struct st_1e60bc_0 *field_58;
} st_1e60bc_1;


int sub_1e60bc(st_1e60bc_1 *a0)
{
    st_1e60bc_0 *v0;  // x8

    v0 = a0->field_58;
    v0->field_0 = 0x4000000000000000;
    v0->field_c = 3;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
