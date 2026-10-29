/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95cbf4..0x95ccec (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95cbf4_0 {
    unsigned int field_0;
    char padding_4[276];
    unsigned long long field_118;
    char padding_120[1888];
    unsigned long long field_880;
} st_95cbf4_0;

typedef struct st_95cbf4_2 {
    long long field_0;
} st_95cbf4_2;

typedef struct st_95cbf4_1 {
    char padding_0[32];
    struct st_95cbf4_0 *field_20;
    char padding_28[8];
    struct st_95cbf4_2 *field_30;
    char padding_38[8];
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
} st_95cbf4_1;


st_95cbf4_0 * sub_95cbf4(st_95cbf4_1 *a0, st_95cbf4_0 *a1)
{
    st_95cbf4_0 *v2;  // x20
    unsigned long long i;  // x22
    st_95cbf4_0 *v4;  // x0
    unsigned long v5;  // x8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    *(unsigned long long *)&a0->padding_0[24] = 0;
    a0->field_20 = a1;
    if (a0->padding_38)
    {
        i = 0;
        do
        {
            sub_a6c2e4(*(long long *)&a0->field_30[i], "ssl/ssl_conf.c", 1104);
            i += 1;
        } while (i < a0->padding_38);
    }
    v4 = sub_a6c2e4(a0->field_30, "ssl/ssl_conf.c", 1105);
    a0->field_30 = 0;
    *(unsigned long long *)a0->padding_38 = 0;
    if (!v2)
    {
        *(unsigned long long *)a0->padding_28 = 0;
        *(uint128_t *)&a0->field_40 = 0;
        *(uint128_t *)&a0->field_50 = 0;
        return v4;
    }
    v5 = v2->field_0;
    if ((unsigned int)v5)
    {
        if (v5 >> 7 & 1)
        {
            v2 = sub_980dc8(v2);
            if (!v2)
                return v2;
        }
        else
        {
            return v4;
        }
    }
    *(st_95cbf4_0 **)a0->padding_28 = &v2[1].padding_120[8];
    a0->field_50 = &v2[1].padding_120[20];
    a0->field_58 = &v2[1].padding_120[24];
    a0->field_40 = v2->field_880 + 28;
    a0->field_48 = &v2[1].padding_4[196];
    v6 = sub_a6bffc(v2->field_118 * 8, "ssl/ssl_conf.c", 1165);
    a0->field_30 = v6;
    if (!v6)
        return v6;
    *(unsigned long long *)a0->padding_38 = v2->field_118;
    return v6;
}
