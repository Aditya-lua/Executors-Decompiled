/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa313bc..0xa3140c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a313bc_0 {
    char padding_0[120];
    struct st_a313bc_1 *field_78;
} st_a313bc_0;

typedef struct st_a313bc_1 {
    unsigned long long field_0;
} st_a313bc_1;


long long sub_a313bc(long long *a0)
{
    long long v2;  // x21
    long long v3;  // x20
    st_a313bc_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[3];
    v3 = a0[4];
    if (a0[2])
    {
        v4 = sub_a2d030(a0[2]);
        v4->field_78();
    }
    a0[4] = 0;
    if (v2 != v3)
        return 0;
    a0[3] = 0;
    return 0;
}
