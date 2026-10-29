/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x638b4..0x638e0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_638b4_0 {
    char padding_0[8];
    struct st_638b4_0 *field_8;
    struct st_638b4_0 *field_10;
} st_638b4_0;


st_638b4_0 * sub_638b4(st_638b4_0 **a0)
{
    st_638b4_0 *v0;  // x8
    st_638b4_0 *v1;  // x10
    st_638b4_0 *v2;  // x9

    v0 = *a0;
    v1 = a0[1];
    v2 = a0 + 1;
    *a0 = v2;
    v1->field_10 = 0;
    a0[2] = 0;
    *(unsigned long long *)v2->padding_0 = 0;
    if (v0->field_8)
        return v0->field_8;
    return v0;
}
