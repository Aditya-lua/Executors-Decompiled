/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed518..0xaed650 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

int sub_aed518(unsigned long a0, long long *a1, long long a2, unsigned long long a3)
{
    unsigned long long v8;  // x8
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4105
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // x22
    long long *v18;  // x0
    unsigned long v19;  // x0
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4105
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    char v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v8 = v4;
    if (sub_9c1674(&v4, *a1))
    {
        v9 = arm64g_calculate_condition(v15 | 16, v16, v11, v12);
        v10 = arm64g_calculate_condition(20, (v9 & 1 ? v8 : 0x40000000), (v9 & 1 ? 0x7fffffffffffffff : 0), 0);
        if (v10 & 1)
            goto LABEL_aed580;
LABEL_aed56c:
        v0 = a3;
        v1 = &g_c7c2eb;
    }
    else
    {
        v13 = arm64g_calculate_condition(v15 | 16, v16, v11, v12);
        v14 = arm64g_calculate_condition(16, (v13 & 1 ? v8 : 0x40000000), (v13 & 1 ? 0x7fffffffffffffff : 0), 0);
        if (!(v14 & 1))
            goto LABEL_aed56c;
LABEL_aed580:
        v2 = v8 + 1;
        v3 = v8;
        v0 = a3;
        v1 = &g_c7c2eb;
    }
    sub_9d524c(a2);
    if ((int)sub_ad69e4(a1[1]) < 1)
        return 1;
    v17 = 0;
    do
    {
        v18 = sub_ad69f8(a1[1], v17);
        v19 = sub_aef3cc(0, *v18);
        if (!v19)
            return v19;
        v1 = &g_c7c2eb;
        v2 = v19;
        v0 = a3;
        sub_9d524c(a2, "\n%*sZone: %s, User: ");
        sub_a6c2e4(v19, "crypto/x509/v3_sxnet.c", 84);
        sub_9c3708(a2, v18[1]);
        v17 = (unsigned int)v17 + 1;
    } while ((int)v17 < (int)sub_ad69e4(a1[1]));
    return 1;
}
