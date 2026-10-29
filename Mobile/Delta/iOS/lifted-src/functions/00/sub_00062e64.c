/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62e64..0x62ed0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62e64_0 {
    struct st_62e64_0 *field_0;
    struct st_62e64_0 *field_8;
} st_62e64_0;


st_62e64_0 * sub_62e64(long long a0, long long a1, st_62e64_0 *a2, st_62e64_0 *a3)
{
    st_62e64_0 *v2;  // w0
    unsigned long v3;  // cc_dep1
    st_62e64_0 *v4;  // x8
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return a3;
    do
    {
        v2 = (st_62e64_0 *)(unsigned int)sub_6926c(a0, a2 + 2, a1);
        v3 = v2;
        if (v2)
        {
            v4 = a2->field_8;
            v5 = arm64g_calculate_condition(19, v3, 0, 0);
            if (!(v5 & 1))
                goto LABEL_62eae;
            goto LABEL_62ead;
        }
        else
        {
            v4 = a2->field_0;
            v6 = arm64g_calculate_condition(19, v3, 0, 0);
            if (v6 & 1)
            {
LABEL_62ead:
                continue;
            }
            else
            {
LABEL_62eae:
                a3 = a2;
            }
        }
    } while ((a2 = v4, a2));
    return a3;
}
