/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67cc4..0xa67ea4 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a67cc4_0 {
    long long field_0;
    char padding_8[152];
    long long field_a0;
    long long field_a8;
    long long field_b0;
    long long field_b8;
    long long field_c0;
    long long field_c8;
    long long field_d0;
    long long field_d8;
    char field_e0;
    char padding_e1[7];
    long long field_e8;
    long long field_f0;
    long long field_f8;
    long long field_100;
    long long field_108;
    long long field_110;
    long long field_118;
    long long field_120;
    long long field_128;
    long long field_130;
    unsigned long long field_138;
} st_a67cc4_0;


unsigned long long sub_a67cc4(st_a67cc4_0 *ptr)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    unsigned long long v21;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6b7dc(&ptr->field_e0, 0);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a7c11c();
    ptr->field_0 = v3;
    if (v3 && sub_a6a078(ptr))
    {
        v4 = sub_aa5208(ptr);
        ptr->field_a8 = v4;
        if (v4)
        {
            v5 = sub_a77b74(ptr);
            ptr->field_e8 = v5;
            if (v5)
            {
                v6 = sub_aa8854(ptr);
                ptr->field_d0 = v6;
                if (v6)
                {
                    v7 = sub_aa5208(ptr);
                    ptr->field_100 = v7;
                    if (v7)
                    {
                        v8 = sub_a2de80(ptr);
                        ptr->field_108 = v8;
                        if (v8)
                        {
                            v9 = sub_aa5208(ptr);
                            ptr->field_110 = v9;
                            if (v9)
                            {
                                v10 = sub_aa5208(ptr);
                                ptr->field_118 = v10;
                                if (v10)
                                {
                                    v11 = sub_a78854(ptr);
                                    ptr->field_b0 = v11;
                                    if (v11)
                                    {
                                        v12 = sub_aa79d8(ptr);
                                        ptr->field_a0 = v12;
                                        if (v12)
                                        {
                                            v13 = sub_a68c50(ptr);
                                            ptr->field_b8 = v13;
                                            if (v13)
                                            {
                                                v14 = sub_aa4f98(ptr);
                                                ptr->field_c0 = v14;
                                                if (v14)
                                                {
                                                    v15 = sub_aa5164(ptr);
                                                    ptr->field_c8 = v15;
                                                    if (v15)
                                                    {
                                                        v16 = sub_9d6704(ptr);
                                                        ptr->field_f0 = v16;
                                                        if (v16)
                                                        {
                                                            v17 = sub_b45d34(ptr);
                                                            ptr->field_d8 = v17;
                                                            if (v17)
                                                            {
                                                                v18 = sub_a7b174(ptr);
                                                                ptr->field_120 = v18;
                                                                if (v18)
                                                                {
                                                                    v19 = sub_a6ac7c(ptr);
                                                                    ptr->field_128 = v19;
                                                                    if (v19)
                                                                    {
                                                                        v20 = sub_ad991c(ptr);
                                                                        ptr->field_130 = v20;
                                                                        if (v20)
                                                                        {
                                                                            v21 = sub_a7764c(ptr);
                                                                            ptr->field_f8 = v21;
                                                                            if (v21 && sub_aa70f4(ptr))
                                                                            {
                                                                                ptr->field_138 = sub_a67978();
                                                                                return 1;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sub_a68678(ptr);
        sub_a6a0ac(ptr);
    }
    else
    {
        sub_a68678(ptr);
    }
    sub_a7c1d0(ptr->field_0);
    sub_a7c240(&ptr->field_e0);
    memset(ptr, 0, 328);
    return 0;
}
