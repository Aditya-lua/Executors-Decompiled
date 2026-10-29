/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae65f0..0xae66c0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae65f0_0 {
    int field_0;
    char padding_4[4];
    long long field_8;
    long long field_10;
} st_ae65f0_0;


unsigned long long sub_ae65f0(st_ae65f0_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x20
    unsigned long long v13;  // x0
    unsigned long long v14;  // x21
    long long v15;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a0->field_0 != 1)
        return 1;
    v12 = a0->field_8;
    sub_afa390(a0->field_10);
    v13 = sub_afa39c(a1);
    a0->field_10 = v13;
    if (!v13)
        return v13;
    if ((int)sub_ad69e4(v12) >= 1)
    {
        v14 = 0;
        do
        {
            v15 = sub_ad69f8(v12, v14);
            if (!sub_af8ed8(a0->field_10, v15, 0xffffffff, !(unsigned int)v14))
            {
                sub_afa390(a0->field_10);
                a0->field_10 = 0;
                return 0;
            }
        } while ((v14 = (unsigned int)v14 + 1, (int)v14 < (int)sub_ad69e4(v12)));
    }
    if (sub_afa378(a0->field_10, 0) >> 31 & 1)
    {
        sub_afa390(a0->field_10);
        a0->field_10 = 0;
        return 0;
    }
    return 1;
}
