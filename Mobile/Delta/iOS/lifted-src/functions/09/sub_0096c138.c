/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96c138..0x96c3f0 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96c138_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[104];
    unsigned int field_78;
    char padding_7c[156];
    unsigned int field_118;
    char padding_11c[1892];
    struct st_96c138_0 *field_880;
} st_96c138_2;

typedef struct st_96c138_0 {
    char padding_0[32];
    struct st_96c138_1 *field_20;
} st_96c138_0;

typedef struct st_96c138_3 {
    char padding_0[20];
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    char padding_24[4];
    unsigned int field_28;
} st_96c138_3;

typedef struct st_96c138_1 {
    long long field_0;
} st_96c138_1;

extern char g_10002b0;

st_96c138_3 * sub_96c138(st_96c138_2 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v15;  // 4112
    unsigned long long v16;  // x0
    unsigned int v17;  // w0
    unsigned long long idx;  // x27
    unsigned long long v8;  // w24
    st_96c138_3 *v9;  // x22
    unsigned long long v10;  // x25
    unsigned long v11;  // x25
    unsigned long long v12;  // x9
    long long *v13;  // x8
    unsigned long v14;  // x9
    unsigned long long v0;  // [bp-0xa8]
    char v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = *(long long *)&a0[2].padding_11c[868];
    if (*(long long *)&a0[2].padding_11c[868])
    {
        v6 = a2;
        idx = 0;
        v8 = 0xffffffff;
        do
        {
            v9 = *(long long *)(*(long long *)&a0[2].padding_11c[860] + idx * 8);
            if (v9->field_14 == 64 || v9->field_14 == 675 || v9->field_1c == 6 || v9->field_1c == 116 || !sub_969d00(a0, v9) || v9->field_14 && !sub_95a688(a0->field_8, v9->field_18))
                continue;
            if (v6)
            {
                if (!sub_959f90(v6, &v1, a0->field_8) || v9->field_20 != v1 || (v10 = v6, !sub_96e9a4(a0, v9, a1, v10)))
                    continue;
                goto LABEL_96c2ec;
            }
            v11 = v9->field_20;
            if (v11 >> 31 & 1 || (int)a0->field_118 <= (int)v11)
                continue;
            v12 = 5544;
            if (!a0->field_78)
                v12 = 5528;
            if (*(long long *)((char *)a0 + v12) && _memchr())
            {
                v13 = a0->field_880->field_20;
                v14 = (char *)a0->field_880->field_20 + (unsigned int)v11 * 40;
                goto LABEL_96c2b4;
            }
            v13 = a0->field_880->field_20;
            v14 = (char *)a0->field_880->field_20 + (unsigned int)v11 * 40;
            if (!*(long long *)v14)
                continue;
LABEL_96c2b4:
            if (!*(long long *)(v14 + 8) || !sub_96e9a4(a0, v9, *(long long *)((char *)v13 + (unsigned int)v11 * 40), *(long long *)((char *)v13 + (unsigned int)v11 * 40 + 8)))
                continue;
            v10 = *(long long *)((char *)a0->field_880->field_20 + v9->field_20 * 40 + 8);
LABEL_96c2ec:
            if (v9->field_1c != 912)
            {
                if (v9->field_1c != 408)
                    break;
                v15 = arm64g_calculate_condition(0x11, v8, 1, 0);
                if (!(v15 & 1))
                {
                    if ((int)sub_a5b508(v10, &v1, 50, 0) >= 1)
                        v8 = (unsigned int)sub_a99eb4(&v1);
                    else
                        v8 = 0;
                }
                if (!v9->field_28 || v8 == v9->field_28)
                    break;
            }
            else if (v10 && v9->field_14 && !(v16 = sub_95a688(a0->field_8, v9->field_18), !v16 || (v0 = v16, (int)sub_a50ac8() < 1 || (v17 = sub_a5bdac(v10), (int)sub_a5bdac(v10) < (int)(sub_a50ac8(v0) * 2 + 2)))))
            {
                break;
            }
        } while ((idx += 1, (unsigned long long)*(long long *)&a0[2].padding_11c[868] > idx));
        v5 = *(long long *)&a0[2].padding_11c[868];
    }
    else
    {
        idx = 0;
        v9 = 0;
    }
    if (idx == v5)
        v9 = 0;
    if (*(long long *)&g_10002b0 == v2)
        return v9;
    ___stack_chk_fail(v9);
}
