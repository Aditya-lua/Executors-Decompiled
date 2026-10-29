/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e77f0..0x9e7940 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e77f0_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_9e77f0_0;


unsigned long long sub_9e77f0(long long a0, st_9e77f0_0 *a1, unsigned long long a2, st_9e77f0_0 *a3, unsigned long long a4)
{
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    unsigned long long v12;  // 4105
    unsigned long long *v13;  // x23
    unsigned long long v14;  // x0
    unsigned long long v15;  // x24
    unsigned long long *v16;  // x25
    long long v17;  // x26
    unsigned long long v18;  // x0
    unsigned long long *v19;  // x27
    unsigned long long v20;  // x0
    long long *v21;  // x26
    unsigned long v4;  // x19
    unsigned long long v22;  // x0
    unsigned long long *v23;  // x27
    unsigned long long v24;  // w22
    unsigned long long v25;  // x0
    unsigned long long v5;  // 4105
    unsigned long long v6;  // 4105
    st_9e77f0_0 *v7;  // x25
    unsigned long long v8;  // 4108
    unsigned long long v9;  // 4108
    unsigned long long v10;  // w22
    unsigned long long v11;  // 4105
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a4;
    if (a4 <= a2)
    {
        v4 = a2;
        v5 = arm64g_calculate_condition(163, v2, v3, 0);
        if (!(v5 & 1))
            goto LABEL_9e781a;
LABEL_9e7819:
        v7 = a3;
        v8 = arm64g_calculate_condition(163, v2, v3, 0);
        if (!(v8 & 1))
            goto LABEL_9e781e;
LABEL_9e781d:
        v10 = a4;
        v11 = arm64g_calculate_condition(163, v2, v3, 0);
        if (!(v11 & 1))
            goto LABEL_9e7822;
LABEL_9e7821:
    }
    else
    {
        v4 = a4;
        v6 = arm64g_calculate_condition(163, v2, v3, 0);
        if (v6 & 1)
            goto LABEL_9e7819;
LABEL_9e781a:
        v7 = a1;
        v9 = arm64g_calculate_condition(163, v2, v3, 0);
        if (v9 & 1)
            goto LABEL_9e781d;
LABEL_9e781e:
        v10 = a2;
        v12 = arm64g_calculate_condition(163, v2, v3, 0);
        if (v12 & 1)
            goto LABEL_9e7821;
LABEL_9e7822:
        a1 = a3;
    }
    if (v10 <= 0)
        return sub_9db7cc();
    v13 = a0 + (int)v4 * 8;
    v14 = sub_9db7cc(a0, a1, v4, v7->field_0);
    *v13 = v14;
    if (v10 == 1)
        return v14;
    v15 = 0;
    v16 = &v7->field_10;
    while (1)
    {
        v17 = a0 + v15;
        v18 = sub_9db6d0(v17 + 8, a1, v4, *(long long *)((char *)v16 + v15 - 8));
        v19 = (char *)v13 + v15;
        v19[1] = v18;
        if (v10 == 2)
            return v18;
        v20 = sub_9db6d0(v17 + 16, a1, v4, *(long long *)((char *)v16 + v15));
        v19[2] = v20;
        if (v10 < 4)
            return v20;
        v21 = (char *)v16 + v15;
        v22 = sub_9db6d0(a0 + v15 + 24, a1, v4, v21[1]);
        v23 = (char *)v13 + v15;
        v23[3] = v22;
        v24 = v10 - 4;
        if (v10 == 4)
            return v22;
        v15 += 32;
        v25 = sub_9db6d0(v15 + a0, a1, v4, v21[2]);
        v23[4] = v25;
        v10 = v24;
        if (1 >= v10)
            return v25;
    }
}
