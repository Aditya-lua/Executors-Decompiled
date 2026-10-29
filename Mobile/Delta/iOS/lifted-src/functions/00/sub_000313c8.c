/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x313c8..0x31490 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_313c8_0 {
    char padding_0[24];
    unsigned int field_18;
    char field_1c;
} st_313c8_0;


long long sub_313c8(unsigned long a0, st_313c8_0 *a1, st_313c8_0 *a2, st_313c8_0 *a3)
{
    st_313c8_0 *v8;  // x22
    st_313c8_0 *iter;  // x23
    unsigned int v10;  // w8
    unsigned long v0;  // [bp-0x70]
    st_313c8_0 **v1;  // [bp-0x68]
    char *v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    st_313c8_0 *v4;  // [bp-0x50]
    st_313c8_0 *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (a1 != a2)
    {
        v8 = a3;
        iter = a1;
        do
        {
            sub_5c38(v8, iter);
            v10 = iter->field_18;
            v8->field_1c = iter->field_1c;
            v8->field_18 = v10;
            v8 = &v5[1].padding_0[3];
            v5 = v8;
            iter = &iter[1].padding_0[3];
        } while (iter != a2);
    }
    v3 = 1;
    sub_2e624(a0, a1, a2);
    return sub_2f4ac(&v0);
}
