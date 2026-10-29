/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53f50..0xc54038 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c53f50_0 {
    unsigned long long field_0;
    char padding_8[512];
    long long field_208;
    long long field_210;
    unsigned long long field_218;
    long long *field_220;
    unsigned long long field_228;
    unsigned long long field_230;
    long long *field_238;
    unsigned long long field_240;
} st_c53f50_0;


st_c53f50_0 * sub_c53f50(st_c53f50_0 *a0)
{
    st_c53f50_0 *v2;  // x0
    unsigned long v3;  // x21
    unsigned long long *v4;  // x22
    unsigned long v5;  // x21
    unsigned long i;  // x21
    unsigned long long *v7;  // x22
    unsigned long v8;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 0x8000000000000000)
        return a0;
    sub_c48fb0();
    v2 = _munmap(a0->field_208, a0->field_210);
    v3 = a0->field_228;
    if (a0->field_228)
    {
        v4 = a0->field_220 + 1;
        do
        {
            v5 = v3;
            if (*(long long *)((char *)v4 - 8))
                v2 = _free(*v4);
        } while ((v4 += 3, v3 = v5 - 1, v5 != 1));
    }
    if (a0->field_218)
        v2 = _free(a0->field_220);
    i = a0->field_240;
    if (a0->field_240)
    {
        v7 = a0->field_238 + 1;
        do
        {
            v8 = i;
            v2 = _munmap(*(long long *)((char *)v7 - 8), *v7);
            v7 += 2;
            i = v8 - 1;
        } while (i);
    }
    if (!a0->field_230)
        return v2;
    return _free();
}
