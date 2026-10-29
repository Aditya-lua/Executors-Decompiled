/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed234..0xbed3f4 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bed234_0 {
    struct st_bed234_1 *field_0;
    unsigned long long field_8;
} st_bed234_0;

typedef struct st_bed234_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_bed234_2;

typedef struct st_bed234_1 {
    char field_0;
} st_bed234_1;

extern char g_e08114;
extern char g_e09d80;

st_bed234_2 * sub_bed234(st_bed234_2 *a0, st_bed234_0 *a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x10
    char *v10;  // x15
    unsigned int v11;  // w15
    unsigned int v12;  // w15
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4112
    char *v15;  // x14
    unsigned long long v16;  // 4117
    char *v17;  // x15
    unsigned int v18;  // w15
    unsigned long long v19;  // 4116
    char *v2;  // x8
    unsigned long long v20;  // 4116
    char *v21;  // x14
    unsigned long long v22;  // 4117
    char *v23;  // x14
    unsigned long long v24;  // 4117
    unsigned long v4;  // x14
    unsigned long long v5;  // x11
    unsigned int v6;  // w14
    unsigned int v7;  // w15
    char *v8;  // x14
    unsigned long long v9;  // 4117

    v0 = a1->field_8;
    if (!v0)
    {
        *(unsigned long long *)a0->padding_0 = 0;
        return a0;
    }
    v1 = 0;
    v2 = a1->field_0;
    while (1)
    {
        v4 = v2[v1];
        v5 = v1 + 1;
        if (!(v4 >> 31 & 1))
            continue;
        v6 = (unsigned int)v4 & 0xff;
        v7 = (&g_e08114)[v4 & 0xff];
        if (v7 == 4)
        {
            v17 = &v2[v5];
            if (v5 >= v0)
                v17 = &g_e09d80;
            v18 = *v17;
            switch (v6)
            {
            case 240:
                if (v18 - 144 >= 48)
                {
                    a1->field_0 = &v2[v5];
                    a1->field_8 = v0 - v5;
                    *(char **)a0->padding_0 = v2;
                    a0->field_8 = v1;
                    a0->field_10 = &v2[v1];
                    a0->field_18 = v5 - v1;
                    return a0;
                }
                break;
            case 244:
                v19 = arm64g_calculate_condition(209, (char)v18, 113, 0);
                if (!(v19 & 1))
                {
                    a1->field_0 = &v2[v5];
                    a1->field_8 = v0 - v5;
                    *(char **)a0->padding_0 = v2;
                    a0->field_8 = v1;
                    a0->field_10 = &v2[v1];
                    a0->field_18 = v5 - v1;
                    return a0;
                }
                break;
            default:
                if (2 < v6 - 241 || !(v20 = arm64g_calculate_condition(161, (char)v18, 64, 0), !(v20 & 1)))
                {
                    a1->field_0 = &v2[v5];
                    a1->field_8 = v0 - v5;
                    *(char **)a0->padding_0 = v2;
                    a0->field_8 = v1;
                    a0->field_10 = &v2[v1];
                    a0->field_18 = v5 - v1;
                    return a0;
                }
            }
            v5 = v1 + 2;
            v21 = &v2[v5];
            if (v5 >= v0)
                v21 = &g_e09d80;
            v22 = arm64g_calculate_condition(193, *v21, 65, 0);
            if (v22 & 1)
            {
                a1->field_0 = &v2[v5];
                a1->field_8 = v0 - v5;
                *(char **)a0->padding_0 = v2;
                a0->field_8 = v1;
                a0->field_10 = &v2[v1];
                a0->field_18 = v5 - v1;
                return a0;
            }
            v5 = v1 + 3;
            v23 = &v2[v5];
            if (v5 >= v0)
                v23 = &g_e09d80;
            v24 = arm64g_calculate_condition(209, *v23, 65, 0);
            if (!(v24 & 1))
            {
                a1->field_0 = &v2[v5];
                a1->field_8 = v0 - v5;
                *(char **)a0->padding_0 = v2;
                a0->field_8 = v1;
                a0->field_10 = &v2[v1];
                a0->field_18 = v5 - v1;
                return a0;
            }
            v5 = v1 + 4;
LABEL_bed25c:
            v1 = v5;
            if (v0 <= v5)
            {
LABEL_bed3cc:
                a1->field_0 = &v2[v5];
                a1->field_8 = v0 - v5;
                *(char **)a0->padding_0 = v2;
                a0->field_8 = v1;
                a0->field_10 = &v2[v1];
                a0->field_18 = v5 - v1;
                return a0;
            }
        }
        else if (v7 == 3)
        {
            v10 = &v2[v5];
            if (v5 >= v0)
                v10 = &g_e09d80;
            v11 = *v10;
            switch (v6)
            {
            case 224:
                if ((v11 & 224) != 160)
                {
                    a1->field_0 = &v2[v5];
                    a1->field_8 = v0 - v5;
                    *(char **)a0->padding_0 = v2;
                    a0->field_8 = v1;
                    a0->field_10 = &v2[v1];
                    a0->field_18 = v5 - v1;
                    return a0;
                }
                break;
            case 237:
                v12 = (char)v11;
                v13 = arm64g_calculate_condition(209, v12, 97, 0);
                if (!(v13 & 1))
                {
                    a1->field_0 = &v2[v5];
                    a1->field_8 = v0 - v5;
                    *(char **)a0->padding_0 = v2;
                    a0->field_8 = v1;
                    a0->field_10 = &v2[v1];
                    a0->field_18 = v5 - v1;
                    return a0;
                }
                break;
            default:
                v12 = (char)v11;
                if (v6 - 225 >= 12 && (v6 & 254) != 0xee || !(v14 = arm64g_calculate_condition(161, v12, 64, 0), !(v14 & 1)))
                    goto LABEL_bed3cc;
                else
                    break;
            }
            v5 = v1 + 2;
            v15 = &v2[v5];
            if (v5 >= v0)
                v15 = &g_e09d80;
            v16 = arm64g_calculate_condition(161, *v15, 64, 0);
            if (v16 & 1)
            {
                a1->field_0 = &v2[v5];
                a1->field_8 = v0 - v5;
                *(char **)a0->padding_0 = v2;
                a0->field_8 = v1;
                a0->field_10 = &v2[v1];
                a0->field_18 = v5 - v1;
                return a0;
            }
            v5 = v1 + 3;
            goto LABEL_bed25c;
        }
        else if (v7 == 2)
        {
            v8 = &v2[v5];
            if (v5 >= v0)
                v8 = &g_e09d80;
            v9 = arm64g_calculate_condition(161, *v8, 64, 0);
            if (v9 & 1)
            {
                a1->field_0 = &v2[v5];
                a1->field_8 = v0 - v5;
                *(char **)a0->padding_0 = v2;
                a0->field_8 = v1;
                a0->field_10 = &v2[v1];
                a0->field_18 = v5 - v1;
                return a0;
            }
            v5 = v1 + 2;
            goto LABEL_bed25c;
        }
        else
        {
            a1->field_0 = &v2[v5];
            a1->field_8 = v0 - v5;
            *(char **)a0->padding_0 = v2;
            a0->field_8 = v1;
            a0->field_10 = &v2[v1];
            a0->field_18 = v5 - v1;
            return a0;
        }
    }
}
