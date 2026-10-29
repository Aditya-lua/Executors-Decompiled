/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41658..0xb4176c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b41658_0 {
    long long field_0;
    char padding_8[8];
    struct st_b41658_0 *field_10;
    unsigned int field_18;
    char padding_1c[4];
    long long field_20;
    unsigned int field_28;
    char padding_2c[4];
    char field_30;
    char padding_31[23];
    unsigned long long field_48;
    unsigned long long field_50;
} st_b41658_0;

extern long long g_b42020;

st_b41658_0 * sub_b41658(st_b41658_0 *a0, unsigned long a1, unsigned long a2)
{
    st_b41658_0 *v2;  // w0
    st_b41658_0 *v3;  // x20
    st_b41658_0 *v4;  // x19
    st_b41658_0 *v5;  // x21
    st_b41658_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b41658_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        if ((int)a0->field_10 != 0x1000)
        {
            if ((int)a0->field_10)
                return 0;
            if (sub_ab8c18(&a0->field_30))
                goto LABEL_b416a4;
            v3 = 0;
            v4 = 0;
            v5 = 0;
        }
        else
        {
LABEL_b416a4:
            v6 = sub_ab1354(a0->field_0);
            if (!v6)
                return v6;
            v4 = v6;
            a0->field_48 = a1;
            a0->field_50 = a2;
            v5 = sub_9e5ce8();
            if (v5)
                sub_9e5d24(v5, &g_b42020, a0);
            if (sub_aafeec(v4, a0->field_18, a0->field_28, a0->field_20, v5) && sub_ab8c50(sub_ab1c98(v4), &a0->field_30))
            {
                sub_ab1ca0(v4, 0xf000);
                sub_ab1cbc(v4, (int)a0->field_10);
                v3 = v4;
                v4 = 0;
            }
            else
            {
                v3 = 0;
            }
        }
        sub_9e5cfc(v5);
        sub_ab1360(v4);
        return v3;
    }
    else
    {
        return 0;
    }
}
