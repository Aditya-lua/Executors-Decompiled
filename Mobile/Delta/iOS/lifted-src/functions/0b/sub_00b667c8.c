/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb667c8..0xb66864 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b667c8_0 {
    unsigned long long field_0;
    long long *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
    unsigned long long field_28;
} st_b667c8_0;


st_b667c8_0 * sub_b667c8(st_b667c8_0 *a0)
{
    unsigned long i;  // x21
    unsigned long long *v3;  // x22
    st_b667c8_0 *v4;  // x0
    unsigned long j;  // x22
    unsigned long v6;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_10;
    v3 = a0->field_8 + 1;
    for (v4 = a0; i; i -= 1)
    {
        if (*(long long *)((char *)v3 - 8))
            v4 = _free(*v3);
        v3 += 3;
    }
    if (a0->field_0)
        v4 = _free(a0->field_8);
    j = a0->field_28;
    v6 = a0->field_20;
    if (a0->field_28)
    {
        do
        {
            v4 = sub_bffd28(v6);
            v6 += 144;
            j -= 1;
        } while (j);
    }
    if (!a0->field_18)
        return v4;
    return _free();
}
