/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1885c..0x18934 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1885c_2 {
    struct st_1885c_3 *field_0;
    struct st_1885c_0 *field_8;
} st_1885c_2;

typedef struct st_1885c_0 {
    struct st_1885c_1 *field_0;
    unsigned long long field_8;
    struct st_1885c_0 *field_10;
} st_1885c_0;

typedef struct st_1885c_1 {
    unsigned long long field_0;
} st_1885c_1;

typedef struct st_1885c_3 {
    void* field_0;
} st_1885c_3;

typedef struct st_1885c_4 {
    char field_0;
} st_1885c_4;


long long sub_1885c(unsigned long a0, st_1885c_2 *a1, st_1885c_0 *a2, unsigned long long *a3)
{
    st_1885c_0 *v6;  // w0
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // x0
    unsigned long long v9;  // 4105
    unsigned long long v10;  // 4105
    st_1885c_4 **v0;  // [bp-0x38], Other Possible Types: char
    st_1885c_4 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    uint128_t v3;  // [bp-0x20]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_8)
    {
        if (!a2 || !a2->field_10)
            return *(long long *)(*(long long *)a1->field_0 + 12);
        v3 = *(int128_t *)(*(long long *)a1->field_0 + 12);
        v2 = *(long long *)*(long long *)(*(long long *)a2->field_0 + a2->field_8 * 8);
        v6 = (st_1885c_0 *)(unsigned int)sub_dd38(&v3, &v2);
        v7 = v6;
        if (v6)
        {
            v8 = *(unsigned long long *)&v3;
            v9 = arm64g_calculate_condition(19, v7, 0, 0);
            if (!(v9 & 1))
                return *(unsigned long long *)&v3;
        }
        else
        {
            v10 = arm64g_calculate_condition(19, v7, 0, 0);
            if (!(v10 & 1))
                return v2;
        }
        return v8;
        return *(long long *)(*(long long *)a1->field_0 + 12);
    }
    else
    {
        if (!a2 || !a2->field_10)
            return *a3;
        return *(long long *)*(long long *)(*(long long *)a2->field_0 + a2->field_8 * 8);
        return *a3;
    }
}
