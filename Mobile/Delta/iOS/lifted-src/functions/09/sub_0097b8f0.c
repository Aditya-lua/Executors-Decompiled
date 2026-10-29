/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b8f0..0x97b928 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b8f0_1 {
    char padding_0[136];
    struct st_97b8f0_0 *field_88;
} st_97b8f0_1;

typedef struct st_97b8f0_0 {
    char padding_0[8];
    struct st_97b8f0_0 *field_8;
} st_97b8f0_0;


st_97b8f0_1 * sub_97b8f0(st_97b8f0_1 *a0, long long a1)
{
    st_97b8f0_0 *v2;  // x20
    st_97b8f0_0 *v3;  // x20
    st_97b8f0_1 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_88;
    if (!a0->field_88)
        return a0;
    do
    {
        v3 = v2;
        v4 = sub_981250(v3, a1);
        v2 = v3->field_8;
    } while (v3->field_8);
    return v4;
}
