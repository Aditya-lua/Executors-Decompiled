/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36c8c..0xa36cd4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a36c8c_0 {
    char padding_0[896];
    int field_380;
    unsigned int field_384;
} st_a36c8c_0;


st_a36c8c_0 * sub_a36c8c(void)
{
    st_a36c8c_0 *v2;  // x0
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (v2)
    {
        v3 = v2->field_380;
        if (v2->field_384 == (unsigned int)v3)
            return 0;
        *(int *)&v2->padding_0[64 + 4 * v3] = *(int *)&v2->padding_0[64 + 4 * v3] + 1;
        v2 = 1;
    }
    return (unsigned int)v2;
}
