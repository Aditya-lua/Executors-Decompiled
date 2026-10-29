/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52fe4..0xb530a0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52fe4_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[12];
    char field_1c;
    char padding_1d[3];
    long long field_20;
    struct st_b52fe4_0 *field_28;
} st_b52fe4_1;

typedef struct st_b52fe4_0 {
    struct st_b52fe4_0 *field_0;
} st_b52fe4_0;


st_b52fe4_0 ** sub_b52fe4(st_b52fe4_1 *a0, st_b52fe4_0 **a1, unsigned long a2, long long a3)
{
    st_b52fe4_0 **v2;  // x0
    st_b52fe4_0 **v3;  // x0
    st_b52fe4_0 **v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b51f10();
    if (!(unsigned int)v2)
        return v2;
    if (a1 && (!*(char *)a1 || sub_a6e200(&a0[1].padding_0[4], a1)))
    {
        v3 = sub_b52328(a0, a1, a0->field_8);
        if (!(unsigned int)v3)
            return v3;
    }
    a0->field_1c = a0->field_1c & 0xfffffffd;
    v4 = a0->field_28;
    if (v4 || (v4 = sub_a3f728(NULL), a0->field_28 = v4, v4))
    {
        if (sub_a3f7f0(v4, a0->field_20, a3))
            return 1;
    }
    sub_a3f73c();
    a0->field_28 = 0;
    return 0;
}
