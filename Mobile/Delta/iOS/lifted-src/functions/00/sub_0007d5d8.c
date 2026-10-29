/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d5d8..0x7d6c4 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d5d8_0 {
    unsigned long long field_0;
    unsigned int field_4;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    char padding_14[4];
    unsigned int field_18;
} st_7d5d8_0;


long long sub_7d5d8(st_7d5d8_0 *a0, unsigned int a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned int v17;  // w12
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // x13
    unsigned long long v20;  // 4122
    unsigned long long v21;  // 4122
    unsigned long long v22;  // 4112
    unsigned long long v23;  // x11
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4110
    unsigned long long v9;  // x20
    unsigned long long v27;  // x10
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w21
    unsigned long long v13;  // x8
    char v14;  // x9
    unsigned long long v15;  // w10
    unsigned long v16;  // x11
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = (unsigned int)a0->padding_14;
    if (sub_7cd78())
    {
        v13 = (4 << ((char)*(int *)((char *)&a0->field_0 + 4) & 63)) + 128;
        v14 = a0->field_4;
        if (a3)
            goto LABEL_7d638;
    }
    else
    {
        v13 = 128;
        v14 = a0->field_4;
        if (a3)
        {
LABEL_7d638:
            if (a0->padding_c == 3)
            {
                v15 = (int)a0->field_0;
                if ((unsigned int)a0->field_0 >= 0x11)
                    v15 = 0x11;
                goto LABEL_7d65c;
            }
        }
    }
    v15 = 0;
LABEL_7d65c:
    v16 = 1 << (v14 & 63);
    v17 = v12 - 6;
    v18 = v12;
    if (6 < v12)
    {
        v19 = 0x24700;
        v20 = arm64g_calculate_condition(33, v17, 3, 0);
        if (!(v20 & 1))
            goto LABEL_7d67a;
LABEL_7d679:
        v22 = arm64g_calculate_condition(35, v18, 6, 0);
        v23 = v16 + 63 & 0xffffffffffffffc0;
        v24 = arm64g_calculate_condition(19, (v22 & 1 ? a1 : 0), v22 & 1, 0);
        if (!(v24 & 1))
            goto LABEL_7d686;
LABEL_7d685:
        v23 = 0;
    }
    else
    {
        v19 = 0;
        v21 = arm64g_calculate_condition(33, v17, 3, 0);
        if (v21 & 1)
            goto LABEL_7d679;
LABEL_7d67a:
        v25 = arm64g_calculate_condition(35, v18, 6, 0);
        v23 = v16 + 63 & 0xffffffffffffffc0;
        v26 = arm64g_calculate_condition(16, (v25 & 1 ? a1 : 0), v25 & 1, 0);
        if (v26 & 1)
            goto LABEL_7d685;
LABEL_7d686:
    }
    if (!a3)
        v19 = 0;
    if (!v15)
        v27 = 0;
    else
        v27 = 4 << ((char)v15 & 63);
    return v13 + v27 + (4 << (v14 & 63)) + v19 + v23;
}
