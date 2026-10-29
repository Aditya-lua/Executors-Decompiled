/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97846c..0x978500 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97846c_0 {
    char padding_0[1048];
    long long field_418;
    char padding_420[344];
    unsigned long long field_578;
    char padding_580[120];
    struct st_97846c_0 *field_5f8;
} st_97846c_0;


st_97846c_0 * sub_97846c(st_97846c_0 *a0)
{
    st_97846c_0 *v2;  // x0
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4110
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    st_97846c_0 *v7;  // x8
    unsigned long long v8;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_578 && !(v2 = sub_975f2c(a0->field_418), v2 * 3 > 0xffffffffffffffff || (v3 = v2 * 3, v4 = arm64g_calculate_condition(2, v3, 1, 0), v4 & 1)))
    {
        v5 = 1000000 * a0->field_578;
        if (v3 < v5)
            v3 = v5;
        v6 = v3 >> 1;
        if (v6 >= 25000000000)
            v6 = 25000000000;
        v2 = sub_981238();
        v7 = &v2->padding_0[v6];
        v8 = arm64g_calculate_condition(50, v2, v6, 0);
        if (!(v8 & 1))
            v7 = 0xffffffffffffffff;
    }
    else
    {
        v7 = 0xffffffffffffffff;
    }
    a0->field_5f8 = v7;
    return v2;
}
