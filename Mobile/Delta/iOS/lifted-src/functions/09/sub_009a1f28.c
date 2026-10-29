/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1f28..0x9a20a4 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1f28_1 {
    struct st_9a1f28_0 *field_0;
    unsigned long long field_8;
} st_9a1f28_1;

typedef struct st_9a1f28_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_9a1f28_2;

typedef struct st_9a1f28_0 {
    char field_0;
    char field_1;
    unsigned short field_2;
} st_9a1f28_0;


unsigned long long sub_9a1f28(unsigned long idx, st_9a1f28_1 *a1)
{
    unsigned long long v2;  // x8
    st_9a1f28_0 *v3;  // x11
    st_9a1f28_2 *v12;  // x0
    long long v13;  // x20
    long long v14;  // x21
    unsigned long v15;  // x9
    st_9a1f28_0 *v16;  // x8
    unsigned long v17;  // x10
    unsigned long long v18;  // 4114
    unsigned int v4;  // w9
    unsigned long v5;  // x10
    st_9a1f28_0 *v6;  // x24
    unsigned long long v7;  // x25
    long long v8;  // x0
    unsigned long long v9;  // w22
    unsigned long v10;  // x8
    unsigned long long v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_954120())
    {
LABEL_9a2070:
        return 1;
    }
    v2 = a1->field_8 - 2;
    if (a1->field_8 >= 2)
    {
        v3 = a1->field_0;
        v4 = v3->field_0;
        v5 = v3->field_1;
        v6 = &v3->field_2;
        a1->field_0 = v6;
        a1->field_8 = v2;
        if (v5 & 1 || (v7 = (unsigned int)v5 | v4 * 0x100, v7 > v2))
            goto LABEL_9a1f80;
        a1->field_0 = &(&v6->field_0)[v7];
        a1->field_8 = v2 - v7;
        v8 = sub_954120(idx);
        *(unsigned long long *)(idx + 2968) = 0;
        v9 = (unsigned int)sub_ad69e4(v8);
        while (1)
        {
            if (v7)
            {
                if (v7 != 1)
                {
                    v10 = *(short *)&v6->field_0;
                    v6 = &v6->field_2;
                    v7 -= 2;
                    if (v9 >= 1)
                    {
                        v11 = 0;
                        do
                        {
                            v12 = sub_ad69f8(v8, v11);
                            if (v12->field_8 == ((unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00))
                            {
                                *(st_9a1f28_2 **)(idx + 2968) = v12;
                                v9 = (unsigned int)v11;
                                break;
                            }
                        } while ((v11 = (unsigned int)v11 + 1, v9 != (unsigned int)v11));
                    }
                }
                else
                {
                    v13 = 353;
                    v14 = 517;
                    break;
                }
            }
            else
            {
                if (a1->field_8)
                {
                    v15 = a1->field_0->field_0;
                    v16 = &a1->field_0->field_1;
                    v17 = a1->field_8 - 1;
                    a1->field_0 = v16;
                    a1->field_8 = v17;
                    if (v17 >= v15 && (a1->field_0 = &(&v16->field_0)[v15], a1->field_8 = v17 - v15, v18 = arm64g_calculate_condition(20, v17, v15, 0), !(v18 & 1)))
                        goto LABEL_9a2070;
                    v13 = 352;
                    v14 = 547;
                    break;
                }
                else
                {
                    v13 = 353;
                    v14 = 541;
                    break;
                }
            }
        }
    }
    else
    {
LABEL_9a1f80:
        v13 = 353;
        v14 = 505;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", v14, "tls_parse_ctos_use_srtp");
    sub_9a58a4(idx, 50, v13, 0);
    return 0;
}
