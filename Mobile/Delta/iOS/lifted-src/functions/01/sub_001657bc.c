/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1657bc..0x1657e8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1657bc_1 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_1657bc_1;

typedef struct st_1657bc_2 {
    struct st_1657bc_0 *field_0;
} st_1657bc_2;

typedef struct st_1657bc_0 {
    char padding_0[88];
    struct st_1657bc_1 *field_58;
} st_1657bc_0;


st_1657bc_2 ** sub_1657bc(st_1657bc_2 **a0, char *a1)
{
    st_1657bc_0 *v0;  // x8
    unsigned int *v1;  // x10

    v0 = *(long long *)*a0;
    v1 = &v0->field_58->field_0;
    *v1 = *a1;
    v1[3] = 1;
    v0->field_58 = v0->field_58 + 1;
    return a0;
}
