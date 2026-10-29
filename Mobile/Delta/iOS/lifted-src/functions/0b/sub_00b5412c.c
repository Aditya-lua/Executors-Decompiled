/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5412c..0xb541e8 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5412c_0 {
    char padding_0[336];
    struct st_b5412c_0 *field_150;
    struct st_b5412c_0 *field_158;
} st_b5412c_0;


st_b5412c_0 * sub_b5412c(st_b5412c_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b5412c_0 *v8;  // x0
    st_b5412c_0 *v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_a6fbc4(a1, "algorithm-id"))
    {
        v8 = sub_a715c0();
        if (!(unsigned int)v8)
            return v8;
    }
    if (sub_a6fbc4(a1, "digest-size"))
    {
        v8 = sub_a70efc();
        if (!(unsigned int)v8)
            return v8;
    }
    v9 = sub_a6fbc4(a1, "digest");
    if (!v9)
        return 1;
    if (a0->field_158)
    {
        v8 = sub_a71468(v9, sub_a50a58(a0->field_158));
        if (!(unsigned int)v8)
            return v8;
    }
    else
    {
        v8 = sub_a71468();
        if (!(unsigned int)v8)
            return v8;
    }
    return 1;
}
