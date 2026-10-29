/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db29c..0x9db3d8 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9db29c_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_9db29c_1;

typedef struct st_9db29c_0 {
    long long field_0;
    int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_9db29c_0;


unsigned long long sub_9db29c(st_9db29c_1 *a0, st_9db29c_0 *a1, st_9db29c_0 *a2)
{
    unsigned int v2;  // w23
    unsigned long v3;  // cc_dep1
    unsigned long long *iter;  // x8
    unsigned long long *node;  // x9
    unsigned int v14;  // w10
    unsigned long v15;  // x11
    unsigned long long v16;  // 4122
    unsigned long long v18;  // 4113
    unsigned long long v19;  // x0
    unsigned long v4;  // cc_dep2
    st_9db29c_0 *v5;  // x22
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105
    unsigned long long v8;  // w24
    unsigned long v9;  // x20
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    if (v2 == (int)a2->field_10)
    {
        v3 = a1->field_8;
        v4 = a2->field_8;
        if (a1->field_8 < a2->field_8)
        {
            v5 = a1;
            v6 = arm64g_calculate_condition(179, v3, v4, 0);
            if (!(v6 & 1))
                goto LABEL_9db2da;
LABEL_9db2d9:
            a1 = a2;
        }
        else
        {
            v5 = a2;
            v7 = arm64g_calculate_condition(179, v3, v4, 0);
            if (v7 & 1)
                goto LABEL_9db2d9;
LABEL_9db2da:
        }
        v8 = a1->field_8;
        v9 = v5->field_8;
        v10 = sub_9e4cdc();
        if (!v10)
        {
            a0->field_10 = v2;
            return v10;
        }
        *(unsigned int *)&a0->field_8 = v8;
        if (v8)
        {
            v11 = sub_9dbad4(a0->field_0, a1->field_0, v5->field_0, v9);
            iter = a0->field_0 + v9 * 8;
            if ((unsigned int)(v8 - v9))
            {
                node = a1->field_0 + v9 * 8;
                v14 = v9 - v8;
                do
                {
                    v15 = *node;
                    node += 1;
                    *iter = v15 + v11;
                    iter += 1;
                    v16 = arm64g_calculate_condition(2, v15, v11, 0);
                    if (v16 & 1)
                        v11 &= 1;
                    else
                        v11 = 0;
                } while ((v18 = arm64g_calculate_condition(49, v14, 1, 0), v14 += 1, v18 & 1));
            }
            *iter = v11;
            *(unsigned int *)&a0->field_8 = (int)a0->field_8 + (unsigned int)v11;
            goto LABEL_9db3a0;
        }
    }
    else
    {
        v19 = sub_9e53a8(a1, a2);
        if ((int)v19 >= 1)
        {
            v2 = a1->field_10;
            v10 = sub_9db498(a0, a1, a2);
        }
        else if (!(v19 >> 31 & 1))
        {
            sub_9e5b4c(a0);
            v2 = 0;
LABEL_9db3a0:
            v10 = 1;
        }
        else
        {
            v2 = a2->field_10;
            v10 = sub_9db498(a0, a2, a1);
        }
        a0->field_10 = v2;
        return v10;
    }
}
