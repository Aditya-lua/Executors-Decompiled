/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81f38..0x82120 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81f38_0 {
    char field_0;
} st_81f38_0;

typedef struct st_81f38_1 {
    unsigned long long field_0;
    unsigned int field_8;
} st_81f38_1;


double sub_81f38(void* a0, unsigned long long *a1, st_81f38_1 *a2, long long a3, long long a4, long long a5, char *a6, long long a7)
{
    long long v11;  // x0
    unsigned long long v12;  // 4106
    void* v13;  // x26
    unsigned long long v14;  // 4106
    uint128_t v15;  // q0
    unsigned long long v16;  // x0
    unsigned long long v17;  // 4106
    void* v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x80]
    unsigned int v3;  // [bp-0x78]
    st_81f38_0 **v4;  // [bp-0x70], Other Possible Types: char
    st_81f38_0 *v5;  // [bp-0x68]
    unsigned long v6;  // [bp-0x60]
    unsigned int v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0], Other Possible Types: unsigned int
    long long v10;  // [bp+0x4]

    v8 = &v9;
    v5 = &v4;
    v4 = &v5;
    v6 = a2->field_0;
    v7 = a2->field_8;
    if (v10)
        sub_81d6c(a2, a3, a1, a1[1] - *a1 >> 3);
    if (3 <= (unsigned long long)a5)
    {
        v3 = (int)a0[8];
        v1 = (long long)a0[3544];
        v2 = (long long)a0[3552];
        v0 = a0 + 240;
        v11 = sub_7de58(a4 + 3);
        v12 = arm64g_calculate_condition(130, v11, 120, 0);
        if (!(v12 & 1))
        {
            if (24 >= (unsigned long long)v11 && !(int)a0[968] && sub_7dd6c(a6, a7))
                v11 = 1;
            v13 = a0 + 3224;
            if ((int)a0[936])
            {
                v14 = arm64g_calculate_condition(130, sub_7e24c(a0 + 936, a1, &v6), 120, 0);
                if (!(v14 & 1))
                {
                    v15 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)v13, *(int128_t *)v13, 8);
                    *(uint128_t *)v13 = v15;
                }
            }
            else if (v11 != 1)
            {
                if (!v11)
                {
                    v16 = sub_7cda0(a4, a5, a6, a7);
LABEL_820a8:
                    v17 = arm64g_calculate_condition(130, v16, 120, 0);
                    if (v17 & 1)
                        return (unsigned long long)v15;
                    a2->field_0 = v6;
                    a2->field_8 = v7;
                }
                else
                {
                    v15 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)v13, *(int128_t *)v13, 8);
                    *(uint128_t *)v13 = v15;
                    sub_82324(a4, v11, a7, v9);
                }
                if (*(int *)(*(long long *)v13 + 5604) == 2)
                    *(unsigned int *)(*(long long *)v13 + 5604) = 1;
            }
            else
            {
                v16 = sub_7ec18(a4, a5, *a6, a7);
                goto LABEL_820a8;
            }
        }
    }
    return (unsigned long long)v15;
}
