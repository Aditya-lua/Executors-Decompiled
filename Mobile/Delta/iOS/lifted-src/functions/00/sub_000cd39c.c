/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd39c..0xcd61c (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd39c_1 {
    char padding_0[8];
    struct st_cd39c_2 *field_8;
} st_cd39c_1;

typedef struct st_cd39c_2 {
    unsigned long long field_0;
} st_cd39c_2;

typedef struct st_cd39c_0 {
    char field_0;
} st_cd39c_0;

extern unsigned long long g_e6d900;

long long sub_cd39c(st_cd39c_1 *a0, long long a1)
{
    unsigned long long v7;  // x0
    unsigned long ptr;  // x0
    unsigned long long v13;  // 4105
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4105
    unsigned long long v9;  // 4106
    long long v10;  // x21
    unsigned int v11;  // w0
    unsigned long long v12;  // 4112
    unsigned long v0;  // [bp-0x88]
    st_cd39c_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_cd39c_0 *v2;  // [bp-0x78]
    long long v3;  // [bp-0x70]
    char v4;  // [bp-0x68], Other Possible Types: unsigned long
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    if (sub_cd068())
        return -0x1;
    v7 = sub_cd0c8(a0, a1);
    if (v7 >= 0xffff)
        v7 = 0xffff;
    ptr = _malloc();
    if (ptr)
    {
        v0 = ptr + 1;
        if (v7 > 4)
        {
            if (0x404 < v7)
                v7 = 0x404;
            if (!sub_cd068())
                a0->field_8();
            goto *((void *)(g_e6d900));
        }
        else
        {
            _free(ptr);
            v9 = arm64g_calculate_condition(2, 0xffffffffffffffff, 1, 0);
            if (!(v9 & 1) && !sub_cd068(a0, a1, -0x1, 0) && !sub_ce304(a0, a1, &v4))
            {
                if (sub_ce304(a0, a1, &v4))
                {
                    return -0x1;
                }
                else if (v4)
                {
                    return -0x1;
                }
                else if (!sub_ce39c(a0, a1, &v3))
                {
                    if (sub_ce304(a0, a1, &v4))
                    {
                        return -0x1;
                    }
                    else if (v4 != 1)
                    {
                        return -0x1;
                    }
                    else
                    {
                        v10 = v3;
                        if (!sub_cd068(a0, a1, v10, 0))
                        {
                            v11 = sub_ce304(a0, a1, &v4);
                            if (v4 == 101075792)
                            {
                                v12 = arm64g_calculate_condition(v14, v15, v16, v17);
                                v13 = arm64g_calculate_condition(3, (v12 & 1 ? v11 : 0), 0, 0);
                                if (!(v13 & 1))
                                    goto LABEL_cd612;
LABEL_cd611:
                            }
                            else
                            {
                                v18 = arm64g_calculate_condition(v14, v15, v16, v17);
                                v19 = arm64g_calculate_condition(0, (v18 & 1 ? v11 : 0), 0, 0);
                                if (v19 & 1)
                                    goto LABEL_cd611;
LABEL_cd612:
                                v10 = -0x1;
                            }
                            return v10;
                        }
                    }
                }
            }
        }
    }
    return -0x1;
}
