/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96c3f0..0x96c56c (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96c3f0_1 {
    char padding_0[1616];
    unsigned long long field_650;
    char padding_658[8];
    struct st_96c3f0_0 *field_660;
} st_96c3f0_1;

typedef struct st_96c3f0_3 {
    int field_0;
    char padding_4[212];
    struct st_96c3f0_2 *field_d8;
} st_96c3f0_3;

typedef struct st_96c3f0_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[2];
    unsigned int field_14;
    char padding_18[4];
    unsigned int field_1c;
    char padding_20[4];
    unsigned int field_24;
    char padding_28[4];
    unsigned int field_2c;
} st_96c3f0_0;

typedef struct st_96c3f0_2 {
    char padding_0[80];
    char field_50;
} st_96c3f0_2;

typedef struct st_96c3f0_4 {
    unsigned long long field_0;
    struct st_96c3f0_1 *field_8;
    char padding_10[8];
    struct st_96c3f0_3 *field_18;
    char padding_20[968];
    unsigned long long field_3e8;
} st_96c3f0_4;


unsigned long long sub_96c3f0(st_96c3f0_4 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v11;  // 4112
    unsigned long long v12;  // x24
    unsigned long long v21;  // x8
    unsigned long long idx;  // x23
    st_96c3f0_0 *v23;  // x24
    unsigned long v24;  // x8
    unsigned long v25;  // x8
    unsigned long long v13;  // x23
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long long v19;  // x20
    unsigned long long v20;  // x21
    char v0;  // [bp-0x48], Other Possible Types: unsigned int
    char v1;  // [bp-0x44], Other Possible Types: unsigned int
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v11 = arm64g_calculate_condition(1, a2, 1, 0);
    if (v11 & 1)
        return 1;
    v2 = v12;
    v3 = v13;
    v4 = v14;
    v5 = v15;
    v6 = v16;
    v7 = v17;
    v8 = &v10;
    v9 = v18;
    if (sub_af4154(a1, 0))
        return 1;
    v19 = sub_afc604(a1);
    if (a2)
        return (unsigned int)v19 == a2;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && a0->field_3e8)
    {
        v20 = 0;
        v21 = 1016;
    }
    else
    {
        v20 = 1;
        v21 = 5520;
    }
    if (!*(long long *)((char *)a0 + v21))
        return 0;
    idx = 0;
    do
    {
        if (v20 & 1)
        {
            v23 = *(long long *)(*(long long *)&a0[5].padding_20[440] + idx * 8);
            if (!*(long long *)(*(long long *)&a0[5].padding_20[440] + idx * 8))
                continue;
        }
        else
        {
            v24 = a0->field_8->field_650;
            if (!a0->field_8->field_650)
                continue;
            v23 = a0->field_8->field_660;
            while (1)
            {
                v25 = v24;
                if (v23->field_10 == *(short *)(a0->field_3e8 + idx * 2))
                    break;
                v23 = v23[1].padding_18;
                v24 = v25 - 1;
            }
            if (!v23->field_2c)
                continue;
        }
        if ((unsigned int)v19 == v23->field_24)
        {
            return 1;
        }
        else if (v23->field_1c == 912 && sub_a9ae64(v19, &v1, &v0) && v0 == 6 && v1 == v23->field_14)
        {
            return 1;
        }
    } while ((idx += 1, idx != *(long long *)((char *)a0 + v21)));
    return 0;
}
