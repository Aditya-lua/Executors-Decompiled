/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4fc4..0x1b501c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4fc4_0 {
    char padding_0[16];
    struct st_1b4fc4_0 *field_10;
} st_1b4fc4_0;


st_1b4fc4_0 * sub_1b4fc4(st_1b4fc4_0 *a0, st_1b4fc4_0 *i)
{
    st_1b4fc4_0 *v7;  // x8
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_1b4fc4_0 *v13;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a0->field_10;
    if (a0->field_10 == i)
        return a0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    do
    {
        v13 = v7;
        a0->field_10 = (char *)v13 - 48;
        v7 = a0->field_10;
    } while (a0->field_10 != i);
    return (char *)v13 - 48;
}
