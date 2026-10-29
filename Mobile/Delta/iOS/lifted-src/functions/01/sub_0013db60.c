/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13db60..0x13dbfc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13db60_1 {
    char padding_0[84];
    unsigned int field_54;
} st_13db60_1;

typedef struct st_13db60_0 {
    char field_0;
} st_13db60_0;


void* sub_13db60(void* a0, void* a1)
{
    void* v2;  // x10
    unsigned long long v3;  // x8
    void* v4;  // x9
    st_13db60_1 *v5;  // x12
    void* v6;  // x9
    st_13db60_1 *v7;  // x10
    unsigned int v8;  // w11
    unsigned long long v9;  // x13
    void* v10;  // x14
    st_13db60_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_13db60_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return a0;
    v2 = a0 + 8;
    if (v2 == a1)
        return a0;
    v3 = 0;
    v4 = a0;
    do
    {
        v5 = *(long long *)v4;
        v6 = v2;
        v7 = *(long long *)v2;
        v8 = v7->field_54;
        if (*(int *)(*(long long *)v4 + 84) > (int)v8)
        {
            v9 = v3;
            do
            {
                v10 = a0 + v9;
                *(st_13db60_1 **)&v10[8] = v5;
                if (!v9)
                    *(st_13db60_1 **)a0 = v7;
            } while ((v5 = *(long long *)((char *)v10 - 8), v9 -= 8, (int)v8 < (int)v5->field_54));
            *(st_13db60_1 **)((char *)a0 + v9 + 8) = v7;
        }
    } while ((v2 = v6 + 8, v3 += 8, v4 = v6, v2 != a1));
    return a0;
}
