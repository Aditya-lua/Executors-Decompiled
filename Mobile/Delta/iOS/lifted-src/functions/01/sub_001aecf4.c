/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aecf4..0x1aed64 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aecf4_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_1aecf4_0;


st_1aecf4_0 * sub_1aecf4(st_1aecf4_0 *a0, unsigned long i)
{
    unsigned long v3;  // x21
    st_1aecf4_0 *v4;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_10;
    if (a0->field_10 == i)
        return a0;
    do
    {
        a0->field_10 = v3 - 96;
        v0 = v3 - 40;
        sub_14fdc(&v0);
        v0 = v3 - 64;
        v4 = sub_127c0(&v0);
        v3 = a0->field_10;
    } while (a0->field_10 != i);
    return v4;
}
