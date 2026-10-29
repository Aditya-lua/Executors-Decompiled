/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb586bc..0xb586e4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b586bc_0 {
    char padding_0[72];
    unsigned int field_48;
    char padding_4c[116];
    char field_c0;
    char padding_c1[255];
    unsigned int field_1c0;
} st_b586bc_0;


int sub_b586bc(st_b586bc_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_aaa3dc(&a0->field_c0, a0->field_48, a1, a0->field_1c0);
    return 1;
}
