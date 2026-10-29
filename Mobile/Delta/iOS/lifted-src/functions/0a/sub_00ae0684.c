/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae0684..0xae09a0 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae0684_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_ae0684_2;

typedef struct st_ae0684_3 {
    struct st_ae0684_0 *field_0;
    struct st_ae0684_2 *field_8;
} st_ae0684_3;

typedef struct st_ae0684_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ae0684_1 *field_8;
} st_ae0684_0;

typedef struct st_ae0684_1 {
    unsigned short field_0;
} st_ae0684_1;

extern long long g_ae04f0;
extern long long g_eb5038;
extern char g_10002b0;

unsigned long long sub_ae0684(unsigned long a0)
{
    unsigned long long v8;  // x20
    st_ae0684_3 *v9;  // x0
    long long v18;  // x28
    unsigned int v19;  // x8
    char *v20;  // x8
    unsigned long long v21;  // w10
    unsigned long long v22;  // x0
    unsigned long long v23;  // x0
    unsigned long v10;  // x9
    unsigned int v11;  // w9
    unsigned long long v12;  // x22
    unsigned long v13;  // x23
    unsigned long long v14;  // x25
    unsigned long long v15;  // x24
    long long v16;  // x27
    unsigned long long v17;  // x26
    char v0;  // [bp-0xb0]
    char v1;  // [bp-0xa8]
    char v2;  // [bp-0x98]
    char v3;  // [bp-0x88]
    char v4;  // [bp-0x78]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (a0)
    {
        if ((int)sub_ad69e4() >= 1)
        {
            v8 = 0;
            do
            {
                v9 = sub_ad69f8(a0, v8);
                if ((v9->field_0->field_0 & 0xfffffffe) != 2)
                {
                    if (*(long long *)&g_10002b0 == v5)
                        return 0;
                    ___stack_chk_fail();
                }
                if (*(int *)&v9->field_8->padding_0[0] != 1)
                    continue;
                if (v9->field_0->field_8)
                {
                    v10 = *(short *)v9->field_0->field_8;
                    v11 = (unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00;
                    if (v11 == 1)
                        v12 = 4;
                    else
                        v12 = (v11 == 2) * 16;
                }
                else
                {
                    v12 = 0;
                }
                v13 = v9->field_8->field_8;
                sub_ad6ae4(v13);
                if ((int)sub_ad69e4(v13) >= 2)
                {
                    v14 = 0;
                    v15 = v12 & 0xffffffff;
                    do
                    {
                        v16 = sub_ad69f8(v13, v14);
                        v17 = (unsigned int)v14 + 1;
                        v18 = sub_ad69f8(v13, v17);
                        if (!sub_adff4c(v16, &v4, &v3, v12) || !sub_adff4c(v18, &v2, &v1, v12) || 0 < (int)_memcmp(&v4, &v3, v15) || 0 < (int)_memcmp(&v2, &v1, v15) || !(_memcmp(&v3, &v2, v15) >> 31 & 1))
                            goto LABEL_ae0934;
                        v19 = v15;
                        do
                        {
                        } while (v19 >= 1 && (v20 = &(&v2)[v19], v21 = *(v20 - 1), *(v20 - 1) = v21 - 1, v19 -= 1, !v21));
                        if (_memcmp(&v3, &v2, v15))
                        {
                            v14 = v17;
                        }
                        else
                        {
                            v22 = sub_adfcfc(&v0, &v4, &v1, v12);
                            if ((unsigned int)v22)
                            {
                                sub_ad6a28(v13, v14, v0);
                                sub_ad664c(v13, v17);
                                sub_9cd960(v16, &g_eb5038);
                                sub_9cd960(v18, &g_eb5038);
                                v17 = v14;
                            }
                            else
                            {
                                if (*(long long *)&g_10002b0 == v5)
                                    return v22;
                                ___stack_chk_fail();
                            }
                        }
                    } while ((int)(sub_ad69e4(v13) - 1) > (int)v17);
                }
                v23 = sub_ad69f8(v13, sub_ad69e4(v13) - 1);
                if (v23 && *(int *)v23 == 1)
                {
                    v22 = sub_adff4c();
                    if (!(unsigned int)v22)
                    {
                        if (*(long long *)&g_10002b0 == v5)
                            return v22;
                        ___stack_chk_fail();
                    }
                    else if ((int)_memcmp(&v4, &v3, v12 & 0xffffffff) >= 1)
                    {
                        if (*(long long *)&g_10002b0 == v5)
                            return 0;
                        ___stack_chk_fail();
                    }
                }
            } while ((v8 = (unsigned int)v8 + 1, (int)sub_ad69e4(a0) > (int)v8));
        }
        sub_ad5f30(a0, &g_ae04f0);
        sub_ad6ae4(a0);
        v22 = sub_ae019c(a0) != 0;
        if (*(long long *)&g_10002b0 == v5)
            return v22;
        ___stack_chk_fail();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_addr.c", 894, "X509v3_addr_canonize");
        sub_a36abc(0x22, 107, 0);
LABEL_ae0934:
        if (*(long long *)&g_10002b0 == v5)
            return 0;
        ___stack_chk_fail();
    }
}
