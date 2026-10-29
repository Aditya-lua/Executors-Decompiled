/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a0b4..0xa7a374 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a0b4_1 {
    char padding_0[24];
    long long field_18;
} st_a7a0b4_1;

typedef struct st_a7a0b4_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
    char padding_10[8];
    long long field_18;
} st_a7a0b4_0;


char sub_a7a0b4(long long a0, unsigned long long *a1, unsigned long a2)
{
    char v3;  // x22
    char v4;  // x0
    char v13;  // x23
    st_a7a0b4_1 *v14;  // x22
    unsigned int v15;  // w9
    unsigned long long v16;  // 4107
    long long v5;  // x19
    unsigned long long v6;  // x20
    unsigned long long v7;  // x21
    char v8;  // x21
    unsigned long v9;  // x26
    st_a7a0b4_0 *v10;  // x25
    unsigned int v11;  // w8
    unsigned long long v12;  // 4107
    char v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_a6820c();
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
    }
    if (sub_a68024(a0))
        sub_a6afb8(64, 0);
    if (!v3)
        return 1;
    if (!sub_a79f60(v3) || !sub_a7c17c(*(long long *)(v3 + 32)))
        return 0;
    v4 = sub_ad5f4c(*(long long *)(v3 + 8));
    if (!v4)
    {
        sub_a7c1b4(*(long long *)(v3 + 32));
        return 0;
    }
    v5 = v4;
    v6 = sub_ad69e4();
    if ((int)v6 >= 1)
    {
        v7 = v6;
        do
        {
            v8 = v7;
            v9 = v8 - 1;
            v10 = sub_ad69f8(v5, v9);
            if (sub_a7c17c(v10->field_8))
            {
                if (!(v10->field_0 >> 1 & 1))
                {
                    sub_ad664c(v5, v9);
                    v6 = (unsigned int)v6 - 1;
                    continue;
                }
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v0 = /* unsupported instruction */ + 1;
                if (!sub_a7c268(v10 + 1, 1, &v0, v10->field_18))
                {
                    do
                    {
                        /* unsupported instruction */;
                        v11 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v0 = v11 - 1;
                    v12 = arm64g_calculate_condition(19, v11, 1, 0);
                    if (!(v12 & 1))
                        /* unsupported instruction */;
                    sub_a7c1b4(v10->field_8);
                    goto LABEL_a7a220;
                }
            }
            else
            {
LABEL_a7a220:
                v13 = 0;
                goto LABEL_a7a250;
            }
        } while ((sub_a7c1b4(v10->field_8), v7 = v9, v8 > 1));
        sub_a7c1b4(*(long long *)(v3 + 32));
        if ((int)v6 >= 1)
        {
            sub_ad69f8(v5, 0);
            a1();
        }
        v8 = 0;
        v13 = 1;
    }
    else
    {
        v8 = 0;
        v13 = 1;
LABEL_a7a250:
        sub_a7c1b4(*(long long *)(v3 + 32));
    }
    if (v8 < (int)v6)
    {
        do
        {
            v14 = sub_ad69f8(v5, v8);
            if (!sub_a7c268(v14 + 1, 0xffffffff, &v0, v14->field_18))
            {
                v13 = 0;
            }
            else
            {
                if (0 >= v0)
                {
                    if (!sub_a7c268(v14 + 1, 1, &v0, v14->field_18))
                        v13 = 0;
                    else
                        sub_c692a4(v14, 0, 1);
                }
                do
                {
                    /* unsupported instruction */;
                    v15 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v0 = v15 - 1;
                v16 = arm64g_calculate_condition(19, v15, 1, 0);
                if (!(v16 & 1))
                    /* unsupported instruction */;
            }
        } while ((v8 += 1, v8 != (unsigned int)v6));
    }
    sub_ad6020(v5);
    return v13;
    return 0;
}
