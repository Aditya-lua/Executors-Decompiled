/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19b2bc..0x19b2e8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19b2bc_0 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_19b2bc_0;

typedef struct st_19b2bc_1 {
    char padding_0[88];
    struct st_19b2bc_0 *field_58;
    char padding_60[8];
    unsigned long long field_68;
} st_19b2bc_1;


int sub_19b2bc(st_19b2bc_1 *a0)
{
    unsigned long v0;  // x9
    st_19b2bc_0 *v1;  // x8

    v0 = a0->field_68;
    v1 = a0->field_58;
    if (v0)
    {
        v1->field_0 = v0;
        v0 = 6;
    }
    v1->field_c = v0;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
