/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db3d8..0x9db498 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9db3d8_0 {
    long long field_0;
    unsigned int field_8;
} st_9db3d8_0;


int sub_9db3d8(st_9db3d8_0 *a0, st_9db3d8_0 *a1, st_9db3d8_0 *a2)
{
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    unsigned long long *node;  // x9
    unsigned int v13;  // w10
    unsigned long v14;  // x11
    unsigned long long v15;  // 4122
    unsigned int v16;  // w10
    unsigned long long v17;  // 4113
    st_9db3d8_0 *v4;  // x22
    unsigned long long v5;  // 4105
    unsigned long long v6;  // 4105
    unsigned int v7;  // w23
    unsigned long v8;  // x20
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long *iter;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    v3 = a2->field_8;
    if ((int)a1->field_8 < (int)a2->field_8)
    {
        v4 = a1;
        v5 = arm64g_calculate_condition(179, v2, v3, 0);
        if (!(v5 & 1))
            goto LABEL_9db402;
LABEL_9db401:
        a1 = a2;
    }
    else
    {
        v4 = a2;
        v6 = arm64g_calculate_condition(179, v2, v3, 0);
        if (v6 & 1)
            goto LABEL_9db401;
LABEL_9db402:
    }
    v7 = a1->field_8;
    v8 = v4->field_8;
    v9 = sub_9e4cdc();
    if (v9)
    {
        a0->field_8 = v7;
        if (v7)
        {
            v10 = sub_9dbad4(a0->field_0, a1->field_0, v4->field_0, v8);
            iter = a0->field_0 + v8 * 8;
            if ((unsigned int)(v7 - v8))
            {
                node = a1->field_0 + v8 * 8;
                v13 = v8 - v7;
                do
                {
                    v14 = *node;
                    node += 1;
                    *iter = v14 + v10;
                    iter += 1;
                    v15 = arm64g_calculate_condition(2, v14, v10, 0);
                    if (v15 & 1)
                        v10 &= 1;
                    else
                        v10 = 0;
                } while ((v16 = v13 + 1, v17 = arm64g_calculate_condition(49, v13, 1, 0), v13 += 1, v17 & 1));
            }
            *iter = v10;
            a0->field_8 = a0->field_8 + (unsigned int)v10;
        }
        *(unsigned int *)((char *)&a0[1].field_0 + 4) = 0;
        v9 = 1;
    }
    return v9;
}
