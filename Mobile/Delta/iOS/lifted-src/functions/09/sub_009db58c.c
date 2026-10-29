/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db58c..0x9db6d0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9db58c_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_9db58c_0;

typedef struct st_9db58c_1 {
    long long field_0;
    int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9db58c_1;


unsigned long long sub_9db58c(st_9db58c_0 *a0, st_9db58c_1 *a1, st_9db58c_1 *a2)
{
    unsigned int v2;  // w23
    unsigned long long v3;  // x0
    unsigned long long v12;  // x0
    unsigned long long *iter;  // x8
    unsigned long long *node;  // x9
    unsigned int v15;  // w10
    unsigned long v16;  // x11
    unsigned long long v17;  // 4122
    unsigned long long v19;  // 4113
    unsigned long long v4;  // x0
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    st_9db58c_1 *v7;  // x22
    unsigned long long v8;  // 4105
    unsigned long long v9;  // 4105
    unsigned long long v10;  // w24
    unsigned long v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    if (v2 == a2->field_10)
    {
        v3 = sub_9e53a8(a1, a2);
        if ((int)v3 >= 1)
        {
            v2 = a1->field_10;
            v4 = sub_9db498(a0, a1, a2);
        }
        else if (!(v3 >> 31 & 1))
        {
            sub_9e5b4c(a0);
            v2 = 0;
LABEL_9db690:
            v4 = 1;
        }
        else
        {
            v2 = !a2->field_10;
            v4 = sub_9db498(a0, a2, a1);
        }
        a0->field_10 = v2;
        return v4;
    }
    else
    {
        v5 = a1->field_8;
        v6 = a2->field_8;
        if (a1->field_8 < a2->field_8)
        {
            v7 = a1;
            v8 = arm64g_calculate_condition(179, v5, v6, 0);
            if (!(v8 & 1))
                goto LABEL_9db5fe;
LABEL_9db5fd:
            a1 = a2;
        }
        else
        {
            v7 = a2;
            v9 = arm64g_calculate_condition(179, v5, v6, 0);
            if (v9 & 1)
                goto LABEL_9db5fd;
LABEL_9db5fe:
        }
        v10 = a1->field_8;
        v11 = v7->field_8;
        v4 = sub_9e4cdc();
        if (!v4)
        {
            a0->field_10 = v2;
            return v4;
        }
        *(unsigned int *)&a0->field_8 = v10;
        if (v10)
        {
            v12 = sub_9dbad4(a0->field_0, a1->field_0, v7->field_0, v11);
            iter = a0->field_0 + v11 * 8;
            if ((unsigned int)(v10 - v11))
            {
                node = a1->field_0 + v11 * 8;
                v15 = v11 - v10;
                do
                {
                    v16 = *node;
                    node += 1;
                    *iter = v16 + v12;
                    iter += 1;
                    v17 = arm64g_calculate_condition(2, v16, v12, 0);
                    if (v17 & 1)
                        v12 &= 1;
                    else
                        v12 = 0;
                } while ((v19 = arm64g_calculate_condition(49, v15, 1, 0), v15 += 1, v19 & 1));
            }
            *iter = v12;
            *(unsigned int *)&a0->field_8 = (int)a0->field_8 + (unsigned int)v12;
            goto LABEL_9db690;
        }
    }
}
