/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e278..0x2e340 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e278_0 {
    unsigned int field_0;
    char padding_4[4];
    uint128_t field_8;
    unsigned long long field_18;
    uint128_t field_20;
    unsigned long long field_30;
} st_2e278_0;


long long sub_2e278(unsigned long a0, st_2e278_0 *i, st_2e278_0 *a2, st_2e278_0 *iter)
{
    unsigned long v0;  // [bp-0x50]
    st_2e278_0 **v1;  // [bp-0x48]
    st_2e278_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    st_2e278_0 *v4;  // [bp-0x30]
    st_2e278_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = iter;
    v4 = iter;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (i != a2)
    {
        do
        {
            iter->field_0 = i->field_0;
            memset((iter->padding_4)[1], 0, 24);
            *(int128_t *)(iter->padding_4)[1] = *(int128_t *)(i->padding_4)[1];
            *(long long *)((char *)&iter->field_8 + 8) = *(long long *)((char *)&i->field_8 + 8);
            memset((i->padding_4)[1], 0, 24);
            memset(&iter->field_18, 0, 24);
            *(int128_t *)&iter->field_18 = *(int128_t *)&i->field_18;
            *(long long *)&iter->field_20 = i->field_20;
            memset(&i->field_18, 0, 24);
            i = (char *)&i->field_20 + 8;
            iter = (char *)&iter->field_20 + 8;
        } while (i != a2);
        v5 = iter;
    }
    v3 = 1;
    sub_2bf0c();
    return sub_2f4f8(&v0);
}
