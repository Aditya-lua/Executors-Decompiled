/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc67654..0xc67880 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c67654_1 {
    char padding_0[56];
    long long field_38;
    char padding_40[32];
    struct st_c67654_0 *field_60;
    char padding_68[8];
    unsigned long long field_70;
    long long field_78;
    unsigned long long field_80;
} st_c67654_1;

typedef struct st_c67654_2 {
    struct st_c67654_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_c67654_2;

typedef struct st_c67654_3 {
    struct st_c67654_0 *field_0;
    char padding_8[8];
    unsigned int field_10;
} st_c67654_3;

typedef struct st_c67654_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[24];
    unsigned long long field_20;
} st_c67654_0;

extern long long g_a54750;
extern long long g_a54b88;

long long sub_c67654(st_c67654_1 *a0, st_c67654_0 *a1, unsigned long long a2)
{
    unsigned int v5;  // x22
    st_c67654_0 *v6;  // x8
    st_c67654_0 *v15;  // x8
    unsigned int v7;  // w0
    unsigned int v8;  // w23
    st_c67654_2 *v9;  // x0
    st_c67654_0 *v10;  // x8
    long long v11;  // x0
    unsigned int v12;  // w0
    unsigned int v13;  // w23
    st_c67654_3 *v14;  // x0
    st_c67654_0 *v0;  // [bp-0x58]
    unsigned int v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a1)
        return 0;
    v5 = (unsigned int)a0->padding_68;
    if (!v5)
        return v5;
    v6 = a0->field_60;
    if (v6 == a1)
        return v5;
    if (v6->field_4 == a1->field_4 && v6->field_20 == a1->field_20)
        return v5;
    if (sub_a7c17c(a0->field_38))
    {
        if (a0->field_70 == a0->field_80)
        {
            v7 = sub_ad69e4(a0->field_78);
            if ((int)v7 >= 1)
            {
                v8 = 0;
                do
                {
                    v9 = sub_a55234();
                    if (!((unsigned int)a2 & ~v9->field_10))
                    {
                        v10 = v9->field_0;
                        if (v10 == a1 || a1->field_4 == v10->field_4 && a1->field_20 == v10->field_20)
                        {
                            sub_a55220();
                            return v9->field_8;
                        }
                    }
                } while ((v8 += 1, v7 != v8));
            }
        }
        sub_a55220();
        if (*(long long *)&a0->field_60[5].padding_8[16])
        {
            v11 = sub_c4ba8(a1);
            if (sub_a558b4(a0->field_60, v11))
            {
                v0 = a1;
                v1 = 0;
                v2 = a2;
                if (sub_a55c1c(a0->field_60, a0->padding_68, a2, &g_a54750, &v0))
                {
                    if (sub_a7c198(a0->field_38))
                    {
                        v12 = sub_ad69e4(a0->field_78);
                        if ((int)v12 >= 1)
                        {
                            v13 = 0;
                            do
                            {
                                v14 = sub_a55234();
                                if (!((unsigned int)a2 & ~v14->field_10) && (v15 = v14->field_0, v15 == a1 || a1->field_4 == v15->field_4 && a1->field_20 == v15->field_20))
                                {
                                    if (v14->padding_8)
                                    {
                                        sub_a55228(sub_a55220());
                                        return v14->padding_8;
                                    }
                                    break;
                                }
                            } while ((v13 += 1, v12 != v13));
                        }
                        if (a0->field_70 != a0->field_80)
                        {
                            sub_ad6958(a0->field_78, &g_a54b88);
                            a0->field_78 = 0;
                        }
                        if (sub_a54ac0(a0, a1, v1, a2))
                        {
                            a0->field_80 = a0->field_70;
                            sub_a55220();
                            return v1;
                        }
                        sub_a55220();
                    }
                    sub_a55228();
                }
            }
        }
    }
    return 0;
}
