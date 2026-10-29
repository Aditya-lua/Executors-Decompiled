/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1a9c..0xaf1bbc (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af1a9c_0 {
    char padding_0[112];
    long long field_70;
    long long field_78;
    unsigned int field_80;
    char padding_84[102];
    char field_ea;
    char padding_eb[77];
    unsigned long long field_138;
    unsigned long long field_140;
    unsigned int field_148;
} st_af1a9c_0;


unsigned long long sub_af1a9c(st_af1a9c_0 *a0, st_af1a9c_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long v10;  // x8
    unsigned long v11;  // x9
    unsigned long long v12;  // w8
    unsigned long long v13;  // 4102
    unsigned long long v14;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0 == a1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_aea738();
    sub_aea738(a1, 0xffffffff, 0);
    if (!(a0->field_ea >> 4 & 1) && !(a1->field_ea >> 4 & 1))
    {
        v8 = __builtin_bswap64(a0->field_138);
        v9 = __builtin_bswap64(a1->field_138);
        if (v8 == v9)
        {
            v8 = __builtin_bswap64(a0->field_140);
            v9 = __builtin_bswap64(a1->field_140);
            if (v8 != v9 || (v10 = a0->field_148, v11 = a1->field_148, v8 = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32, v9 = (((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32, v8 != v9))
                goto LABEL_af1b3c;
            v12 = 0;
        }
        else
        {
LABEL_af1b3c:
            if (v8 < v9)
                v12 = 0xffffffff;
            else
                v12 = 0;
        }
        if (v12)
            return (long long)(v12) >> 31 | 1;
    }
    if (a0->field_80 || a1->field_80)
        return 0;
    if (a1->field_78 > a0->field_78)
        return 0xffffffff;
    v13 = arm64g_calculate_condition(212, a0->field_78, a1->field_78, 0);
    if (!(v13 & 1))
        return 1;
    v14 = _memcmp(a0->field_70, a1->field_70);
    if (!(v14 >> 31 & 1))
        return (unsigned int)v14 != 0;
    return 0xffffffff;
    return 0;
}
