/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6d688..0xa6d768 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6d688_0 {
    struct st_a6d688_0 *field_0;
    struct st_a6d688_0 *field_8;
} st_a6d688_0;

extern st_a6d688_0 *g_f12eb0;
extern unsigned long long g_f12eb8;
extern st_a6d688_0 *g_f12ec0;
extern unsigned long long g_f12ec8;

void sub_a6d688(st_a6d688_0 *a0, st_a6d688_0 *a1)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // x10
    unsigned long v15;  // 4110
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long long v19;  // 4102
    unsigned long v20;  // 4110
    unsigned long long v21;  // 4102
    st_a6d688_0 *v22;  // x8
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &(&g_f12ec0->field_0)[g_f12ec8];
    if (g_f12ec0 <= a0)
    {
        v4 = arm64g_calculate_condition(v3 | 144, v9, v10, v11);
        v5 = 4;
        v6 = (v4 & 1 ? v2 : 0);
        v7 = (v4 & 1 ? a0 : 0);
        v8 = arm64g_calculate_condition(148, v6, v7, 0);
        if (v8 & 1)
            goto LABEL_a6d708;
LABEL_a6d6ac:
        v14 = (char *)g_f12eb0 + g_f12eb8;
        if (g_f12eb0 <= a1)
        {
            v15 = arm64g_calculate_condition(v5 | 144, v6, v7, 0);
            v16 = 4;
            v17 = (v15 & 1 ? v14 : 0);
            v18 = (v15 & 1 ? a1 : 0);
            v19 = arm64g_calculate_condition(148, v17, v18, 0);
            if (!(v19 & 1))
                goto LABEL_a6d6c8;
        }
        else
        {
            v20 = arm64g_calculate_condition(v5 | 144, v6, v7, 0);
            v16 = 0;
            v17 = (v20 & 1 ? v14 : 0);
            v18 = (v20 & 1 ? a1 : 0);
            v21 = arm64g_calculate_condition(144, v17, v18, 0);
            if (!(v21 & 1))
            {
LABEL_a6d6c8:
                v22 = a0->field_0;
                a1->field_0 = v22;
                if (!v22)
                {
                    a1->field_8 = a0;
                    a0->field_0 = a1;
                    return;
                }
                if (g_f12eb0 <= v22)
                {
                    v23 = arm64g_calculate_condition(v16 | 32, v17, v18, 0);
                    v24 = arm64g_calculate_condition(36, (v23 & 1 ? v22 : 0x20000000), (v23 & 1 ? v14 : 0), 0);
                    if (v24 & 1)
                    {
                        sub_a69928("assertion failed: temp->next == NULL || WITHIN_ARENA(temp->next)", "crypto/mem_sec.c", 399);
                        sub_a69928("assertion failed: (char **)temp->next->p_next == list", "crypto/mem_sec.c", 403);
                    }
                }
                else
                {
                    v25 = arm64g_calculate_condition(v16 | 32, v17, v18, 0);
                    v26 = arm64g_calculate_condition(32, (v25 & 1 ? v22 : 0x20000000), (v25 & 1 ? v14 : 0), 0);
                    if (v26 & 1)
                    {
                        sub_a69928("assertion failed: temp->next == NULL || WITHIN_ARENA(temp->next)", "crypto/mem_sec.c", 399);
                        sub_a69928("assertion failed: (char **)temp->next->p_next == list", "crypto/mem_sec.c", 403);
                    }
                }
                a1->field_8 = a0;
                if (v22->field_8 == a0)
                {
                    v22->field_8 = a1;
                    a0->field_0 = a1;
                    return;
                }
                sub_a69928("assertion failed: (char **)temp->next->p_next == list", "crypto/mem_sec.c", 403);
            }
        }
    }
    else
    {
        v12 = arm64g_calculate_condition(v3 | 144, v9, v10, v11);
        v5 = 0;
        v6 = (v12 & 1 ? v2 : 0);
        v7 = (v12 & 1 ? a0 : 0);
        v13 = arm64g_calculate_condition(144, v6, v7, 0);
        if (!(v13 & 1))
            goto LABEL_a6d6ac;
LABEL_a6d708:
        sub_a69928("assertion failed: WITHIN_FREELIST(list)", "crypto/mem_sec.c", 394);
    }
    sub_a69928("assertion failed: WITHIN_ARENA(ptr)", "crypto/mem_sec.c", 395);
    sub_a69928("assertion failed: temp->next == NULL || WITHIN_ARENA(temp->next)", "crypto/mem_sec.c", 399);
    sub_a69928("assertion failed: (char **)temp->next->p_next == list", "crypto/mem_sec.c", 403);
}
