/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f6a4c..0x1f6aac (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f6a4c_0 {
    char field_0;
} st_1f6a4c_0;


unsigned long long sub_1f6a4c(unsigned int *a0, unsigned long long a1, void* a2)
{
    unsigned long long v2;  // x1
    void* iter;  // x2
    unsigned long long v4;  // x1
    unsigned int *v5;  // x0
    unsigned int v6;  // w10
    unsigned long long v7;  // 4110
    st_1f6a4c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f6a4c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        v2 = a1;
        iter = a2;
        do
        {
            v4 = v2;
            v5 = a0 + 1;
            v6 = *(char *)iter;
            if (*a0 != v6)
            {
                v7 = arm64g_calculate_condition(0x33, *a0, v6, 0);
                if (!(v7 & 1))
                    return 0;
                return 0xffffffff;
            }
        } while ((iter += 1, v2 = v4 - 1, a0 = v5, v4 != 1));
        a2 += a1;
    }
    if (*(char *)a2)
        return 0xffffffff;
    return 0;
}
