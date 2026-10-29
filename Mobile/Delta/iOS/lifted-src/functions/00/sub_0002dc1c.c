/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2dc1c..0x2dc60 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2dc1c_0 {
    char padding_0[16];
    struct st_2dc1c_0 *field_10;
} st_2dc1c_0;


st_2dc1c_0 * sub_2dc1c(st_2dc1c_0 *a0, st_2dc1c_0 *i)
{
    st_2dc1c_0 *v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_2dc1c_0 *v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_10;
    if (a0->field_10 == i)
        return a0;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    do
    {
        v9 = v5;
        a0->field_10 = (char *)v9 - 32;
        v5 = a0->field_10;
    } while (a0->field_10 != i);
    return (char *)v9 - 32;
}
