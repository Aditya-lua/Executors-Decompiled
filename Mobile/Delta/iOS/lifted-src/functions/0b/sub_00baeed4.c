/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaeed4..0xbaef90 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_baeed4_0 {
    unsigned long long field_0;
    long long *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[32];
    unsigned long long field_48;
    char padding_50[16];
    unsigned long long field_60;
    unsigned long long field_68;
} st_baeed4_0;


st_baeed4_0 * sub_baeed4(st_baeed4_0 *a0)
{
    st_baeed4_0 *v2;  // x0
    unsigned long i;  // x21
    unsigned long long *v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_20)
        v2 = _free(a0->field_18 - (a0->field_20 * 8 + 15 & 0xfffffffffffffff8));
    i = a0->field_10;
    for (v4 = a0->field_8 + 1; i; i -= 1)
    {
        if (*(long long *)((char *)v4 - 8))
            v2 = _free(*v4);
        v4 += 5;
    }
    if (a0->field_0)
        v2 = _free(a0->field_8);
    if (a0->field_68)
        v2 = _free(a0->field_60 - (a0->field_68 * 8 + 15 & 0xfffffffffffffff8));
    if (!a0->field_48)
        return v2;
    return _free();
}
