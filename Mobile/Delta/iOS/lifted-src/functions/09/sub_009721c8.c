/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9721c8..0x97228c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9721c8_0 {
    char padding_0[4];
    unsigned long long field_4;
    char padding_c[4];
    unsigned long long field_10;
    char padding_18[16];
    long long field_28;
    struct st_9721c8_1 *field_30;
    unsigned long long field_38;
    unsigned long long field_40;
} st_9721c8_0;

typedef struct st_9721c8_1 {
    char field_0;
} st_9721c8_1;


st_9721c8_0 * sub_9721c8(st_9721c8_0 *a0, char a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    char *v18;  // x8
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_9721c8_0 *v13;  // x0
    unsigned long v14;  // x8
    unsigned long v15;  // x9
    unsigned long v16;  // x21
    st_9721c8_0 *dst;  // x0
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if ((a0->padding_0)[1])
        return a0;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v13 = a0;
    if (v13->padding_c[0])
        v13 = sub_97228c(a0);
    v14 = a0->field_30;
    v15 = a0->field_38;
    if (v14 == a0->field_38)
    {
        v0 = 0;
        if (v14)
        {
            v16 = 0;
            do
            {
                v13 = sub_9d4248(*(long long *)&a0->padding_18[8], a0->field_28 + v16, v14 - v16, &v0);
                v14 = a0->field_38;
                if (!(unsigned int)v13)
                {
                    dst = _memmove(a0->field_28, a0->field_28 + v16, v14 - v16);
                    a0->field_38 = 0;
                    (a0->padding_0)[1] = 1;
                    return dst;
                }
            } while ((v16 += v0, v16 < v14));
        }
        v15 = 0;
    }
    v18 = a0->field_28;
    a0->field_38 = v15 + 1;
    v18[v15] = a1;
    return v13;
}
