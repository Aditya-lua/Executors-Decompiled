/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3e10..0x1a3ee8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3e10_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
    char field_50[13];
    char field_55;
} st_1a3e10_0;


long long sub_1a3e10(unsigned long a0, st_1a3e10_0 *node, st_1a3e10_0 *a2, st_1a3e10_0 *iter)
{
    uint128_t v8;  // q1
    unsigned long v9;  // x9
    unsigned long v0;  // [bp-0x50]
    st_1a3e10_0 **v1;  // [bp-0x48]
    st_1a3e10_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    st_1a3e10_0 *v4;  // [bp-0x30]
    st_1a3e10_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = iter;
    v4 = iter;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (node != a2)
    {
        do
        {
            v8 = node->field_10;
            iter->field_0 = node->field_0;
            iter->field_10 = v8;
            memset(&iter->field_20, 0, 24);
            iter->field_20 = node->field_20;
            iter->field_30 = node->field_30;
            memset(&node->field_20, 0, 24);
            memset(&(&iter->field_30)[1], 0, 24);
            *(int128_t *)&(&iter->field_30)[1] = *(int128_t *)&(&node->field_30)[1];
            *(long long *)((char *)&iter->field_38 + 8) = *(long long *)((char *)&node->field_38 + 8);
            memset(&(&node->field_30)[1], 0, 24);
            v9 = node->field_48;
            *(long long *)((char *)&iter->field_48 + 5) = *(long long *)((char *)&node->field_48 + 5);
            iter->field_48 = v9;
            node = &node->field_50[8];
            iter = &iter->field_50[8];
        } while (node != a2);
        v5 = iter;
    }
    v3 = 1;
    sub_1ada1c();
    return sub_1ac1bc(&v0);
}
