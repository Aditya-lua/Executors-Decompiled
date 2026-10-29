/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985584..0x9857d8 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985584_0 {
    struct st_985584_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_985584_0 *field_8;
    unsigned long long field_10;
} st_985584_0;

typedef struct st_985584_1 {
    char padding_0[848];
    struct st_985584_0 *field_350;
    char padding_358[24];
    struct st_985584_0 *field_370;
    struct st_985584_0 *field_378;
    unsigned long long field_380;
    struct st_985584_0 *field_388;
    struct st_985584_0 *field_390;
    unsigned long long field_398;
    unsigned long long field_3a0;
    unsigned long long field_3a8;
    char padding_3b0[56];
    struct st_985584_0 *field_3e8;
} st_985584_1;

extern char g_10002b0;

st_985584_0 * sub_985584(st_985584_1 *a0)
{
    st_985584_0 *v6;  // x24
    st_985584_0 *v7;  // x21
    st_985584_0 *v16;  // x8
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    st_985584_0 *v21;  // w0
    st_985584_0 *i;  // x8
    st_985584_0 *v23;  // x20
    st_985584_0 *v24;  // x8
    st_985584_0 *v25;  // x9
    st_985584_0 *v8;  // x20
    st_985584_0 *v26;  // x10
    st_985584_0 *v27;  // x9
    st_985584_0 *v28;  // x0
    st_985584_0 **iter;  // x25
    st_985584_0 *v10;  // x26
    unsigned long v11;  // x8
    st_985584_0 *v12;  // x20
    st_985584_0 *v13;  // x8
    st_985584_0 *v14;  // w0
    unsigned long v15;  // cc_dep1
    char v0;  // [bp-0x570]
    char v1;  // [bp-0x568]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = a0->field_388;
    if (!v6)
    {
        v28 = 1;
    }
    else if (a0->field_350)
    {
        v7 = 0;
        while (1)
        {
            v8 = 0;
            iter = &v1 + 16;
            while (1)
            {
                v10 = v8;
                v11 = v6->field_8;
                *(st_985584_0 **)((char *)iter - 16) = &v6[7].field_10;
                *(unsigned long *)((char *)iter - 8) = v11;
                iter[2] = 0;
                v12 = v6 + 1;
                if (!sub_717b8(v12))
                    v13 = 0;
                else
                    v13 = v12;
                *iter = v13;
                v14 = (st_985584_0 *)(unsigned int)sub_717b8();
                v15 = v14;
                if (!v14)
                    v16 = 0;
                else
                    v16 = &v6[4].padding_2[3];
                iter[1] = v16;
                v8 = (char *)&v10->field_0 + 1;
                v6 = v6->field_0;
                iter += 5;
                if (v6)
                {
                    v17 = arm64g_calculate_condition(19, v15, 0, 0);
                    v18 = arm64g_calculate_condition(52, (v17 & 1 ? v10 : 0x20000000), (v17 & 1 ? 31 : 0), 0);
                    if (!(v18 & 1))
                        break;
                }
                else
                {
                    v19 = arm64g_calculate_condition(19, v15, 0, 0);
                    v20 = arm64g_calculate_condition(48, (v19 & 1 ? v10 : 0x20000000), (v19 & 1 ? 31 : 0), 0);
                    if (!(v20 & 1))
                        break;
                }
            }
            sub_a36c8c();
            v21 = (st_985584_0 *)(unsigned int)sub_9d427c(a0->field_350, &v1, 40, v8, 0, &v0);
            if (v21 && !v0)
            {
                sub_a36e70();
                goto LABEL_985784;
            }
            if (!v21)
                break;
            sub_a36e70();
            i = (st_985584_0 *)v0;
            if (i)
            {
                v23 = 0;
                do
                {
                    if (a0->field_3e8)
                        a0->field_3e8();
                    v24 = a0->field_388;
                    v25 = v24->field_0;
                    v26 = *(long long *)&v24->field_1;
                    a0->field_388 = v25;
                    if (a0->field_390 == v24)
                    {
                        a0->field_390 = v26;
                        if (!v26)
                            continue;
                    }
                    else if (!v26)
                    {
                        continue;
                    }
                    v26->field_0 = v25;
                    if (v25)
                        *(st_985584_0 **)&v25->field_1 = v26;
                    a0->field_398 = a0->field_398 - 1;
                    v24->field_0 = 0;
                    *(unsigned long long *)&v24->field_1 = 0;
                    a0->field_3a0 = a0->field_3a0 - 1;
                    a0->field_3a8 = a0->field_3a8 - (char *)v24->field_8;
                    v27 = a0->field_378;
                    if (v27)
                        v27->field_0 = v24;
                    v24->field_0 = 0;
                    *(st_985584_0 **)&v24->field_1 = v27;
                    a0->field_378 = v24;
                    if (!a0->field_370)
                        a0->field_370 = v24;
                    a0->field_380 = a0->field_380 + 1;
                    v23 = (char *)&v23->field_0 + 1;
                    i = (st_985584_0 *)v0;
                } while (i > v23);
            }
            v7 += i;
            v6 = a0->field_388;
            if (!a0->field_388)
                goto LABEL_985784;
        }
        if (sub_9d3b0c(sub_a36000()))
        {
            sub_a36cd4();
LABEL_985784:
            if (!v7)
                v28 = 0xffffffff;
            else
                v28 = 0;
        }
        else
        {
            sub_a36e70();
            v28 = 0xfffffffe;
        }
    }
    else
    {
        v28 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v28;
    ___stack_chk_fail();
}
