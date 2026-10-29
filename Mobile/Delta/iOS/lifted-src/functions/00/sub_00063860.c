/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63860..0x638b4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63860_0 {
    char padding_0[16];
    struct st_63860_0 *field_10;
} st_63860_0;

typedef struct st_63860_1 {
    long long field_0;
    struct st_63860_0 *field_8;
    long long field_10;
} st_63860_1;


st_63860_1 * sub_63860(st_63860_1 *a0)
{
    st_63860_0 *v2;  // x8
    st_63860_0 *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_62aa0(a0->field_0, a0->field_10);
    if (!a0->field_8)
        return a0;
    v2 = a0->field_8->field_10;
    if (a0->field_8->field_10)
    {
        do
        {
            v3 = v2;
            v2 = v3->field_10;
        } while (v3->field_10);
        a0->field_8 = v3;
    }
    sub_62aa0(a0->field_0);
    return a0;
}
