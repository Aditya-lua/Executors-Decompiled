/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969d00..0x969e24 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_969d00_2 {
    unsigned int field_0;
    char padding_4[212];
    struct st_969d00_1 *field_d8;
} st_969d00_2;

typedef struct st_969d00_3 {
    char padding_0[24];
    struct st_969d00_2 *field_18;
    char padding_20[40];
    unsigned long long field_48;
    char padding_50[2416];
    unsigned long long field_9c0;
} st_969d00_3;

typedef struct st_969d00_0 {
    unsigned int field_0;
    char padding_4[40];
    unsigned int field_2c;
} st_969d00_0;

typedef struct st_969d00_1 {
    char padding_0[80];
    char field_50;
} st_969d00_1;


unsigned long long sub_969d00(st_969d00_3 *a0, st_969d00_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // x8
    unsigned long long v18;  // x9
    unsigned long long v19;  // w19
    unsigned int v20;  // w21
    unsigned long long v21;  // 4134
    unsigned long v22;  // 4112
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long long v26;  // 4102
    unsigned long long v9;  // x20
    unsigned long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w8
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // w19
    unsigned long long v16;  // w2
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1->field_2c)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_18->field_0;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
    {
        v13 = v12;
        v14 = 0x10000;
        if (v12 == 0x10000)
        {
            v15 = *(int *)&a0->padding_50[2412];
            v16 = (int)a0->field_9c0;
            v17 = 56;
            v18 = 52;
        }
        else
        {
            v15 = (int)a0->field_48;
            v17 = 56;
            v18 = 52;
            goto LABEL_969d8c;
        }
    }
    else
    {
        v13 = v12;
        v14 = 0x1ffff;
        if (v12 == 0x1ffff)
        {
            v15 = *(int *)&a0->padding_50[2412];
            v16 = (int)a0->field_9c0;
            v17 = 64;
            v18 = 60;
        }
        else
        {
            v15 = (int)a0->field_48;
            v17 = 64;
            v18 = 60;
LABEL_969d8c:
            v16 = v15;
        }
    }
    v19 = v15;
    v20 = *(int *)((char *)a1 + v17);
    v21 = arm64g_calculate_condition(0x11, *(int *)((char *)a1 + v18), 1, 0);
    if (v21 & 1)
    {
        v22 = arm64g_calculate_condition(19, v13, v14, 0);
        v23 = 1;
        v24 = (v22 & 1 ? v20 : 0x40000000);
        v25 = v22 & 1;
        v26 = arm64g_calculate_condition(1, v24, v25, 0);
        if (!(v26 & 1))
            goto LABEL_969da4;
    }
    else
    {
        v27 = arm64g_calculate_condition(19, v13, v14, 0);
        v23 = 0;
        v24 = (v27 & 1 ? v20 : 0x40000000);
        v25 = v27 & 1;
        v28 = arm64g_calculate_condition(0, v24, v25, 0);
        if (!(v28 & 1))
        {
LABEL_969da4:
            if (*(int *)((char *)a1 + v18))
            {
                v29 = arm64g_calculate_condition(v23 | 16, v24, v25, 0);
                v30 = arm64g_calculate_condition(3, (v29 & 1 ? v16 : 0x40000000), 0, 0);
LABEL_969dd0:
                if (!v20 || !v19 || !(sub_9ae69c() >> 31 & 1))
                    return sub_96b14c() != 0;
            }
            else
            {
                v31 = arm64g_calculate_condition(v23 | 16, v24, v25, 0);
                v32 = arm64g_calculate_condition(0, (v31 & 1 ? v16 : 0x40000000), 0, 0);
                if (v32 & 1 || 0 >= (int)sub_9ae69c())
                    goto LABEL_969dd0;
            }
        }
    }
    return 0;
}
