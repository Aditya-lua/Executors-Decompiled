/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc455e0..0xc45680 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c455e0_0 {
    unsigned long long field_0;
    long long *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    long long *field_20;
    unsigned long long field_28;
} st_c455e0_0;


st_c455e0_0 * sub_c455e0(st_c455e0_0 *a0)
{
    unsigned long v2;  // x21
    st_c455e0_0 *v3;  // x0
    unsigned long long *v4;  // x22
    unsigned long v5;  // x21
    unsigned long i;  // x21
    unsigned long long *v7;  // x22
    unsigned long v8;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    v3 = a0;
    if (v3->field_10)
    {
        v4 = a0->field_8 + 1;
        v3 = a0;
        do
        {
            v5 = v2;
            if (*(long long *)((char *)v4 - 8))
                v3 = _free(*v4);
        } while ((v4 += 3, v2 = v5 - 1, v5 != 1));
    }
    if (a0->field_0)
        v3 = _free(a0->field_8);
    i = a0->field_28;
    if (a0->field_28)
    {
        v7 = a0->field_20 + 1;
        do
        {
            v8 = i;
            v3 = _munmap(*(long long *)((char *)v7 - 8), *v7);
            v7 += 2;
            i = v8 - 1;
        } while (i);
    }
    if (!a0->field_18)
        return v3;
    return _free();
}
