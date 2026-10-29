/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafa0dc..0xafa270 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afa0dc_2 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_afa0dc_2;

typedef struct st_afa0dc_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_afa0dc_0;

typedef struct st_afa0dc_1 {
    char padding_0[48];
    unsigned int field_30;
} st_afa0dc_1;


unsigned long long sub_afa0dc(long long *a0, unsigned long long a1, st_afa0dc_0 *a2, unsigned long long a3)
{
    long long v4;  // x0
    unsigned long long v5;  // x19
    unsigned long long v14;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x22
    unsigned int v9;  // w0
    st_afa0dc_1 *v10;  // x24
    unsigned long long v11;  // x25
    unsigned long long v12;  // x26
    st_afa0dc_2 *v13;  // x0
    uint128_t v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x90]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0[6];
    if (!v4)
        return v4;
    v5 = a3;
    if (!sub_ab8cf8(v4))
    {
        v6 = sub_a7c198(a0[28]);
        if (!(unsigned int)v6)
            return v6;
        sub_ad6ae4(a0[6]);
        sub_a7c1b4(a0[28]);
    }
    v0 = a2->field_0;
    v1 = a2->field_10;
    v7 = sub_ad66d4(a0[6], &v0);
    if (v7 >> 31 & 1)
        return 0;
    v8 = v7;
    v9 = sub_ad69e4(a0[6]);
    if ((int)v9 > (int)v8)
    {
        while (1)
        {
            v10 = sub_ad69f8(a0[6], v8);
            if (sub_9c0ffc(v10, a2))
                break;
            if (*(long long *)&v10->padding_0[40])
            {
                v11 = v5;
                if (!v11)
                    v11 = sub_9ffdd0(a0);
                if ((int)sub_ad69e4() >= 1)
                {
                    v12 = 0;
                    do
                    {
                        v13 = sub_ad69f8(*(long long *)&v10->padding_0[40], v12);
                        if (v13->field_0 == 4 && !sub_af1860(v11, v13->field_8))
                            goto LABEL_afa230;
                    } while ((v12 = (unsigned int)v12 + 1, (int)sub_ad69e4(*(long long *)&v10->padding_0[40]) > (int)v12));
                }
            }
            else if (!v5 || !sub_af1860(v5, sub_9ffdd0(a0)))
            {
LABEL_afa230:
                if (a1)
                    *(st_afa0dc_1 **)a1 = v10;
                if (v10->field_30 != 8)
                    v14 = 1;
                else
                    v14 = 2;
                return v14;
            }
            v8 = (unsigned int)v8 + 1;
            if ((unsigned int)v8 == v9)
                return 0;
        }
    }
    return 0;
}
