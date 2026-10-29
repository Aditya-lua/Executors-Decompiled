/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00db8..0xa00e14 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a00db8_0 {
    char padding_0[192];
    unsigned long long field_c0;
} st_a00db8_0;

typedef struct st_a00db8_2 {
    char padding_0[32];
    unsigned long long field_20;
} st_a00db8_2;

typedef struct st_a00db8_1 {
    char padding_0[32];
    struct st_a00db8_0 *field_20;
} st_a00db8_1;


st_a00db8_0 * sub_a00db8(st_a00db8_1 *a0, st_a00db8_2 *a1)
{
    st_a00db8_0 *v2;  // x0
    st_a00db8_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    if (!v2)
    {
        v2 = sub_a01fc8(NULL);
        a0->field_20 = v2;
        if (!v2)
            return v2;
    }
    v3 = sub_a60efc(&v2->padding_0[8], a1->field_20 + 8);
    if (!(unsigned int)v3)
        return v3;
    a0->field_20->field_c0 = a0->field_20->field_c0 + 1;
    return 1;
}
