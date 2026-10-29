/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c7a8..0xb4c884 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4c7a8_1 {
    char padding_0[28];
    char field_1c;
    char padding_1d[275];
    char field_130;
    char padding_131[55];
    long long field_168;
    struct st_b4c7a8_0 *field_170;
} st_b4c7a8_1;

typedef struct st_b4c7a8_0 {
    struct st_b4c7a8_0 *field_0;
} st_b4c7a8_0;

extern long long g_b4bf48;

st_b4c7a8_0 ** sub_b4c7a8(st_b4c7a8_1 *a0, st_b4c7a8_0 **a1, long long a2, long long a3, long long a4)
{
    st_b4c7a8_0 **v2;  // x0
    st_b4c7a8_0 **v3;  // x0
    st_b4c7a8_0 **v4;  // x0
    st_b4c7a8_0 **v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b4c5fc(a0, a2, &g_b4bf48, a3, a4);
    if (!(unsigned int)v3)
        return v3;
    if (a1 && (!*(char *)a1 || sub_a6e200(&a0->field_130, a1)))
    {
        v4 = sub_b4c884(a0, a1, 0);
        if (!(unsigned int)v4)
            return v4;
    }
    a0->field_1c = a0->field_1c & 0xfffffffd;
    v5 = a0->field_170;
    if (v5 || (v5 = sub_a3f728(NULL), a0->field_170 = v5, v5))
    {
        if (sub_a3f7f0(v5, a0->field_168, a3))
            return 1;
    }
    sub_a3f73c();
    a0->field_170 = 0;
    return 0;
}
