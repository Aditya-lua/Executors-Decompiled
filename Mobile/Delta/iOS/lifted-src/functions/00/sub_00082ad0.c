/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82ad0..0x82bc0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82ad0_1 {
    unsigned int field_0;
    char padding_4[2];
    unsigned short field_6;
} st_82ad0_1;

typedef struct st_82ad0_2 {
    struct st_82ad0_1 *field_0;
    unsigned long long field_8;
    char padding_10[16];
    struct st_82ad0_0 *field_20;
    struct st_82ad0_0 *field_28;
    struct st_82ad0_0 *field_30;
    char padding_38[16];
    unsigned long long field_48;
    unsigned int field_4c;
} st_82ad0_2;

typedef struct st_82ad0_0 {
    char field_0;
} st_82ad0_0;


unsigned long long sub_82ad0(st_82ad0_2 *a0)
{
    char *v5;  // x22
    unsigned long long v6;  // x9
    unsigned long long v15;  // w8
    unsigned long long i;  // x23
    char *iter;  // x24
    unsigned short *v9;  // x25
    char *node;  // x27
    char *iter1;  // x28
    unsigned long long v12;  // x23
    char v13;  // x21
    unsigned long v14;  // x20
    char *v0;  // [bp-0x78]
    st_82ad0_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_82ad0_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    v5 = a0->field_20;
    v0 = a0->field_28;
    v6 = a0->field_8 - (char *)a0->field_0;
    if (v6 & 0x7fffffff8)
    {
        i = (v6 * 0x2000000000000000 | v6 >> 3) & 0xe0000000ffffffff & 0xffffffff;
        iter = a0->field_30;
        v9 = &a0->field_0->field_6;
        node = v0;
        iter1 = v5;
        do
        {
            v12 = i;
            if (!(*(int *)((char *)v9 - 6) * 0x100000000))
                v13 = 32;
            else
                v13 = Clz(*(int *)((char *)v9 - 6) * 0x100000000);
            v14 = *v9;
            v9 += 4;
            *iter1 = sub_81850();
            iter1 += 1;
            *iter = 31 - v13;
            iter += 1;
            *node = sub_7f858(v14);
            node += 1;
            i = v12 - 1;
        } while (i);
    }
    v15 = (int)a0->field_48;
    if (v15 == 1)
    {
        v5[*(int *)((char *)&a0->field_48 + 4)] = 35;
        v15 = (int)a0->field_48;
    }
    if (v15 == 2)
        v0[*(int *)((char *)&a0->field_48 + 4)] = 52;
    return 0;
}
