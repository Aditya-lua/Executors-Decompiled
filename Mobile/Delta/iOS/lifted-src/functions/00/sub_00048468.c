/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48468..0x48518 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_48468_0 {
    uint128_t field_0;
    unsigned short field_10;
    char padding_12[6];
    uint128_t field_18;
    unsigned long long field_28;
} st_48468_0;


long long sub_48468(unsigned long a0, st_48468_0 *node, st_48468_0 *a2, st_48468_0 *iter)
{
    uint128_t v8;  // q0
    unsigned long v0;  // [bp-0x50]
    st_48468_0 **v1;  // [bp-0x48]
    st_48468_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    st_48468_0 *v4;  // [bp-0x30]
    st_48468_0 *v5;  // [bp-0x28]
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
            v8 = node->field_0;
            iter->field_10 = node->field_10;
            iter->field_0 = v8;
            memset((iter->padding_12)[1], 0, 24);
            *(int128_t *)(iter->padding_12)[1] = *(int128_t *)(node->padding_12)[1];
            *(long long *)((char *)&iter->field_18 + 8) = *(long long *)((char *)&node->field_18 + 8);
            memset((node->padding_12)[1], 0, 24);
            node = &node->field_28;
            iter = &iter->field_28;
        } while (node != a2);
        v5 = iter;
    }
    v3 = 1;
    sub_46e40();
    return sub_40254(&v0);
}
