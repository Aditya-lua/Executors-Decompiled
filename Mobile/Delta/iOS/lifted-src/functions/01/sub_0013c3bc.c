/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c3bc..0x13c448 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13c3bc_0 {
    char padding_0[84];
    unsigned int field_54;
} st_13c3bc_0;


unsigned long long sub_13c3bc(unsigned long long a0, void* a1, unsigned long a2, void* a3, unsigned long a4, void* a5, unsigned long a6, void* a7, unsigned long a8, void* a9)
{
    void* v3;  // x2
    unsigned long long v4;  // x30
    unsigned long long v13;  // 4105
    unsigned long long v14;  // 4105
    unsigned long long v15;  // 4105
    st_13c3bc_0 **iter;  // x8
    void* v6;  // x10
    void* v7;  // x12
    void* v8;  // x12
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    st_13c3bc_0 *v11;  // x11
    unsigned long long v12;  // 4105
    char v0;  // [bp-0x31]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]

    v3 = a1;
    if (a1 == a3)
        return a0;
    v1 = &a8;
    v2 = v4;
    iter = a9 - 8;
    do
    {
        if (a5 == a7)
        {
            a0 = sub_13eca4(&v0);
            break;
        }
        v6 = a5;
        v7 = v3;
        v8 = v7 - 8;
        v9 = *(int *)(*(long long *)((char *)v7 - 8) + 84);
        v10 = *(int *)(*(long long *)((char *)v6 - 8) + 84);
        if (*(int *)(*(long long *)((char *)v7 - 8) + 84) < *(int *)(*(long long *)((char *)v6 - 8) + 84))
        {
            v11 = *(long long *)((char *)v6 - 8);
            v12 = arm64g_calculate_condition(179, v9, v10, 0);
            if (!(v12 & 1))
                goto LABEL_13c412;
            goto LABEL_13c411;
        }
        else
        {
            v11 = *(long long *)((char *)v7 - 8);
            v13 = arm64g_calculate_condition(179, v9, v10, 0);
            if (v13 & 1)
            {
LABEL_13c411:
                a5 = v6 - 8;
                v14 = arm64g_calculate_condition(179, v9, v10, 0);
                if (!(v14 & 1))
                    goto LABEL_13c416;
                goto LABEL_13c415;
            }
            else
            {
LABEL_13c412:
                v15 = arm64g_calculate_condition(179, v9, v10, 0);
                if (v15 & 1)
                {
LABEL_13c415:
                    continue;
                }
                else
                {
LABEL_13c416:
                    v3 = v8;
                }
            }
        }
    } while ((*iter = v11, iter = (char *)iter - 8, v3 != a3));
    return a0;
}
