/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c650..0x1c710 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c650_0 {
    uint128_t field_0;
    unsigned int field_10;
} st_1c650_0;


long long sub_1c650(unsigned long a0, st_1c650_0 *a1, st_1c650_0 *a2, st_1c650_0 *a3)
{
    st_1c650_0 *v8;  // x20
    st_1c650_0 *iter;  // x22
    uint128_t v10;  // q0
    unsigned long v0;  // [bp-0x60]
    st_1c650_0 **v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    st_1c650_0 *v4;  // [bp-0x40]
    st_1c650_0 *v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (a1 != a2)
    {
        iter = v8;
        do
        {
            v10 = iter->field_0;
            a3->field_10 = iter->field_10;
            a3->field_0 = v10;
            sub_5c38((char *)&a3[1].field_0 + 4, (char *)&iter[1].field_0 + 4);
            a3 = (char *)&v5[2].field_0 + 8;
            v5 = a3;
            iter = (char *)&iter[2].field_0 + 8;
        } while (iter != a2);
    }
    v3 = 1;
    sub_18ccc(a0, v8, a2);
    return sub_18d08(&v0);
}
