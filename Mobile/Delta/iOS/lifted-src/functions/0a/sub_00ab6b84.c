/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab6b84..0xab6cb8 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab6b84_0 {
    char padding_0[128];
    struct st_ab6b84_0 *field_80;
} st_ab6b84_0;

typedef struct st_ab6b84_2 {
    char padding_0[96];
    struct st_ab6b84_0 *field_60;
    char padding_68[16];
    struct st_ab6b84_3 *field_78;
    char padding_80[24];
    struct st_ab6b84_1 *field_98;
} st_ab6b84_2;

typedef struct st_ab6b84_3 {
    unsigned int field_0;
} st_ab6b84_3;

typedef struct st_ab6b84_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ab6b84_0 *field_8;
    unsigned int field_10;
    char padding_14[12];
    struct st_ab6b84_0 *field_20;
    struct st_ab6b84_0 *field_28;
    unsigned int field_30;
} st_ab6b84_1;


st_ab6b84_0 * sub_ab6b84(st_ab6b84_2 *a0, long long a1)
{
    st_ab6b84_1 *v2;  // x22
    st_ab6b84_0 *v3;  // x0
    st_ab6b84_0 *v12;  // x0
    st_ab6b84_0 *v4;  // x0
    st_ab6b84_0 *v5;  // x21
    st_ab6b84_0 *v6;  // x0
    st_ab6b84_0 *v7;  // x23
    st_ab6b84_0 *v8;  // x22
    st_ab6b84_1 *v9;  // x8
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4116
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (v2->field_8 || (v3 = sub_9e4958(), v2->field_8 = v3, v3 && sub_9e4d58()))
    {
        v4 = sub_ab11bc();
        if (v4)
        {
            v5 = v4;
            if (a0->field_60)
            {
                v6 = sub_9e5ce8();
                if (!v6)
                {
                    sub_ab1360(v5);
                    return 0;
                }
                v7 = v6;
                sub_a5ce38();
            }
            else
            {
                v7 = 0;
            }
            v8 = sub_aafeec(v5, v2->field_0, v2->field_10, v2->field_8, v7);
            sub_9e5cfc(v7);
            if ((int)(unsigned int)v8 < 1)
            {
                sub_ab1360(v5);
                return v8;
            }
            if (*(int *)a0->field_78 == 912)
            {
                v9 = a0->field_98;
                if (!v9->field_20 && !v9->field_28)
                {
                    v10 = arm64g_calculate_condition(0x11, v9->field_30, 2, 0);
                    if (v10 & 1)
                        goto LABEL_ab6c68;
                }
                else
                {
LABEL_ab6c68:
                    v11 = arm64g_calculate_condition(1, v9->field_30, 2, 0);
                    v12 = sub_aac648();
                    v5->field_80 = v12;
                    if (!v12)
                    {
                        sub_ab1360(v5);
                        return 0;
                    }
                }
            }
            sub_a5ab14(a1);
            return v8;
        }
    }
    return 0;
}
