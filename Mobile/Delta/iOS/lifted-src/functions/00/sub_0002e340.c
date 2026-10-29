/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e340..0x2e3d4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e340_0 {
    char field_0;
} st_2e340_0;


void* sub_2e340(void* a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x10
    unsigned long long v3;  // x9
    unsigned long long v12;  // 4105
    void* v4;  // x12
    void* v5;  // x8
    unsigned long long v6;  // x11
    void* v7;  // x12
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    void* v10;  // x8
    unsigned long long v11;  // 4105
    st_2e340_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2e340_0 *v1;  // [bp-0x8]

    v2 = 0;
    v1 = &v0;
    v0 = &v1;
    v3 = (a2 - 2) / 2;
    while (1)
    {
        while (1)
        {
            v4 = a0 + v2 * 8;
            v5 = v4 + 8;
            v6 = 1 | (v2 * 2 | v2 >> 63) & 0xfffffffffffffffe;
            v2 = v2 * 2 + 2;
            if ((long long)v2 < (long long)a2)
                break;
            v2 = v6;
            *(long long *)a0 = *(long long *)v5;
            a0 = v5;
            if ((long long)v2 > (long long)v3)
                return v5;
        }
        v7 = v4 + 16;
        v8 = *(int *)((char *)v7 - 8);
        v9 = (int)v4[16];
        if ((unsigned int)*(int *)((char *)v7 - 8) < (unsigned int)(int)v4[16])
        {
            v10 = v7;
            v11 = arm64g_calculate_condition(0x33, v8, v9, 0);
            if (!(v11 & 1))
                goto LABEL_2e37a;
            goto LABEL_2e379;
        }
        else
        {
            v10 = v5;
            v12 = arm64g_calculate_condition(0x33, v8, v9, 0);
            if (v12 & 1)
            {
LABEL_2e379:
                goto LABEL_2e37c;
            }
            else
            {
LABEL_2e37a:
                v2 = v6;
LABEL_2e37c:
                *(long long *)a0 = *(long long *)v10;
                a0 = v10;
                if ((long long)v3 < (long long)v2)
                    return v10;
            }
        }
    }
}
