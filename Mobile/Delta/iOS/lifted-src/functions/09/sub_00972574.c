/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972574..0x972688 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_972574_0 {
    char field_0;
    char padding_1[3];
    unsigned long long field_4;
    char field_5;
    char padding_6[34];
    long long field_28;
    struct st_972574_1 *field_30;
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
    unsigned long long field_48;
} st_972574_0;

typedef struct st_972574_1 {
    char field_0;
} st_972574_1;


st_972574_0 * sub_972574(st_972574_0 *a0, char *a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v18;  // x22
    char v19;  // w21
    unsigned long v20;  // x8
    char v21;  // x9
    char v22;  // x22
    char *v23;  // x8
    st_972574_0 *dst;  // x0
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_972574_0 *v13;  // x0
    unsigned long v14;  // x9
    unsigned long long v15;  // x8
    unsigned long long i;  // x22
    unsigned long long v17;  // 4119
    char v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if ((a0->padding_1)[1])
        return a0;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v13 = a0;
    if (v13->field_5)
    {
        a0->field_5 = 0;
        v13 = a0;
        if (v13->field_0 >> 1 & 1)
        {
            v13 = sub_9721c8(a0, 10);
            v14 = (a0->padding_1)[1 + 1];
            v15 = *(long long *)&a0->field_38 * 32;
            i = v15 + v14 * 4;
            v17 = arm64g_calculate_condition(2, v15, v14 * 4, 0);
            if (!(v17 & 1))
            {
                do
                {
                    v18 = i;
                    v13 = sub_972574(a0, "    ");
                    i = v18 - 1;
                } while (i);
            }
        }
    }
    while (1)
    {
        v19 = *a1;
        if (!v19)
            break;
        v20 = a0->field_28;
        v21 = (char)a0->field_30;
        if (v20 == a0->field_30)
        {
            v0 = 0;
            if (v20)
            {
                v22 = 0;
                do
                {
                    v13 = sub_9d4248(*(long long *)&a0->padding_6[23], *(long long *)&a0->padding_6[31] + v22, v20 - v22, &v0);
                    v20 = a0->field_30;
                    if (!(unsigned int)v13)
                    {
                        dst = _memmove(*(long long *)&a0->padding_6[31], *(long long *)&a0->padding_6[31] + v22, v20 - v22);
                        a0->field_30 = 0;
                        (a0->padding_1)[1] = 1;
                        return dst;
                    }
                } while ((v22 += v0, v22 < v20));
            }
            v21 = 0;
        }
        a1 += 1;
        v23 = *(long long *)&a0->padding_6[31];
        a0->field_30 = v21 + 1;
        v23[v21] = v19;
    }
    return v13;
}
