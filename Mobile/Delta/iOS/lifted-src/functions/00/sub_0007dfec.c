/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7dfec..0x7e0b8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7dfec_1 {
    char padding_0[32];
    long long field_20;
} st_7dfec_1;

typedef struct st_7dfec_0 {
    char field_0;
} st_7dfec_0;


st_7dfec_1 * sub_7dfec(st_7dfec_1 *a0)
{
    st_7dfec_1 *v8;  // w0
    st_7dfec_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_7dfec_0 *v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x40]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 0;
    v3 = *(long long *)&a0[151].padding_0[16];
    v2 = *(int128_t *)&a0[151].padding_0[0];
    v8 = (st_7dfec_1 *)(unsigned int)sub_7d9cc(&a0->field_20, a0);
    v4 = *(int128_t *)&a0[151].padding_0[0];
    v5 = *(long long *)&a0[151].padding_0[16];
    memset(&a0->field_20, 0, 72);
    sub_80164(a0->field_20, &v4);
    if (!v8)
    {
        v4 = v2;
        v5 = v3;
        sub_80164(a0, &v4);
        return 0;
    }
    return 0;
}
