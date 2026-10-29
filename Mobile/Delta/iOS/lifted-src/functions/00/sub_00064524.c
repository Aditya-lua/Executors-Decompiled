/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64524..0x645e4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64524_1 {
    char padding_0[120];
    unsigned long long field_78;
    char padding_80[264];
    unsigned int field_188;
    unsigned int field_18c;
} st_64524_1;

typedef struct st_64524_0 {
    char field_0;
} st_64524_0;


st_64524_1 * sub_64524(st_64524_1 *a0, unsigned long long a1, unsigned long long a2)
{
    st_64524_1 *v4;  // x19
    st_64524_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_64524_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_78 = a1;
    if (!a1)
        return 0;
    a0->field_188 = a2;
    if (a0->field_18c == 0x22)
    {
        _setbuf(a1, 0);
        a0->field_18c = 0;
        if (!(a2 >> 1 & 1))
            return a0;
    }
    else if (!(a2 >> 1 & 1))
    {
        return a0;
    }
    a0->field_18c = 0;
    v4 = a0;
    if (!_fseek(a0->field_78, 0, 2))
        return v4;
    _fclose(v4->field_78);
    v4->field_78 = 0;
    return 0;
}
