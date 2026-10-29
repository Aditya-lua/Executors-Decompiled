/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9b8a8..0xb9b9ac (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9b8a8_1 {
    char padding_0[8];
    struct st_b9b8a8_0 *field_8;
    unsigned long long field_10;
} st_b9b8a8_1;

typedef struct st_b9b8a8_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[232];
    char field_108;
    char padding_109[23];
    unsigned long long field_120;
} st_b9b8a8_0;


st_b9b8a8_1 * sub_b9b8a8(st_b9b8a8_1 *a0)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x21
    st_b9b8a8_0 *v4;  // x23
    unsigned long long v5;  // x24
    st_b9b8a8_1 *dst;  // x0
    st_b9b8a8_0 *iter;  // x20
    unsigned long long v8;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if (!v2)
        return a0;
    v3 = 0;
    v4 = a0->field_8;
    while (1)
    {
        v5 = v3 + 1;
        if (v4->field_18 == 12)
            break;
        v4 = &v4->field_108;
        v3 = v5;
        if (v2 == v3)
            return a0;
    }
    dst = sub_b9a8fc(v4);
    if (v2 > v5)
    {
        iter = &v4->field_108;
        v8 = v3 + 1;
        do
        {
            if (iter->field_18 != 12)
            {
                dst = _memcpy(&(a0->field_8->padding_0)[11 * v3], iter, 264);
                v3 += 1;
            }
            else
            {
                dst = sub_b9a8fc(iter);
            }
        } while ((v8 += 1, iter = &iter->field_108, v2 > v8));
    }
    a0->field_10 = v3;
    return dst;
}
