/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae5974..0xae5c44 (720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae5974_2 {
    long long field_0;
    struct st_ae5974_3 *field_8;
} st_ae5974_2;

typedef struct st_ae5974_3 {
    struct st_ae5974_1 *field_0;
    struct st_ae5974_1 *field_8;
} st_ae5974_3;

typedef struct st_ae5974_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ae5974_0;

typedef struct st_ae5974_1 {
    struct st_ae5974_0 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
} st_ae5974_1;

extern unsigned long long g_c7c2eb;

unsigned long long sub_ae5974(long long a0, long long a1, unsigned long long a2)
{
    long long v7;  // x21
    unsigned long long v8;  // x0
    st_ae5974_1 *v17;  // x19
    unsigned long long v18;  // x8
    st_ae5974_1 *v19;  // x0
    st_ae5974_1 *v20;  // x0
    st_ae5974_1 *v21;  // x23
    st_ae5974_1 *v22;  // x26
    st_ae5974_1 *v23;  // x23
    st_ae5974_1 *v24;  // x0
    st_ae5974_1 *v25;  // x23
    st_ae5974_1 *v26;  // x8
    st_ae5974_1 *v9;  // x22
    unsigned long long v27;  // x0
    unsigned long long v10;  // x8
    unsigned long v11;  // x24
    st_ae5974_2 *v12;  // x26
    unsigned int v13;  // w0
    long long v14;  // x1
    long long v15;  // x0
    st_ae5974_1 **v16;  // x25
    unsigned long long v0;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80], Other Possible Types: unsigned long
    st_ae5974_1 *v3;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned long long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a0;
    v8 = sub_ad69e4(a1);
    if ((int)v8 < 1)
        return v8;
    v9 = 0;
    v10 = a2;
    v11 = (unsigned int)v10 + 2;
    v4 = v10;
    do
    {
        if ((unsigned int)v9)
            sub_9d4888(v7, "\n");
        v12 = sub_ad69f8(a1, v9);
        v13 = sub_a99eac(v12->field_0);
        if (v13 == 165)
        {
            v0 = a2;
            v1 = &g_c7c2eb;
            sub_9d524c(v7, "%*sUser Notice:\n");
            v16 = v12->field_8;
            v17 = *v16;
            if (v17)
            {
                v2 = v17->field_0->field_0;
                v3 = v17->field_0->field_8;
                v0 = v11;
                v1 = &g_c7c2eb;
                sub_9d524c(v7, "%*sOrganization: %.*s\n");
                v18 = "s";
                if (1 >= (int)sub_ad69e4(*(long long *)&v17->field_1))
                    v18 = &g_c7c2eb;
                v1 = &g_c7c2eb;
                v2 = v18;
                v0 = v11;
                sub_9d524c();
                if ((int)sub_ad69e4(*(long long *)&v17->field_1) >= 1)
                {
                    v19 = sub_ad69f8(*(long long *)&v17->field_1, 0);
                    if (v19)
                    {
                        v20 = sub_aef3cc(0, v19);
                        if (!v20)
                            continue;
                        v21 = v20;
                        sub_9d4888(v7, v21);
                        sub_a6c2e4(v21, "crypto/x509/v3_cpols.c", 488);
                    }
                    else
                    {
                        sub_9d4888(v7, "(null)");
                    }
                    if ((int)sub_ad69e4(*(long long *)&v17->field_1) >= 2)
                    {
                        v22 = 1;
                        do
                        {
                            v23 = sub_ad69f8(*(long long *)&v17->field_1, v22);
                            sub_9d4888(v7, ", ");
                            if (!v23)
                            {
                                sub_9d4888(v7, "(null)");
                            }
                            else
                            {
                                v24 = sub_aef3cc(0, v23);
                                if (!v24)
                                    goto LABEL_0xae59f4;
                                v25 = v24;
                                sub_9d4888(v7, v25);
                                sub_a6c2e4(v25, "crypto/x509/v3_cpols.c", 488);
                            }
                        } while ((v22 = (unsigned int)v22 + 1, (int)sub_ad69e4(*(long long *)&v17->field_1) > (int)(unsigned int)v22));
                    }
                }
                if (v16[1])
                    sub_9d4888(v7, "\n");
            }
            v26 = v16[1];
            if (!v26)
                continue;
            v2 = (int)v26->field_0;
            v3 = *(long long *)&v26->field_1;
            v0 = v11;
            v1 = &g_c7c2eb;
            v14 = "%*sExplicit Text: %.*s";
            v15 = v7;
        }
        else if (v13 != 164)
        {
            v0 = v11;
            v1 = &g_c7c2eb;
            sub_9d524c(v7, "%*sUnknown Qualifier: ");
            sub_9c3060(v7, v12->field_0);
        }
        else
        {
            v2 = (int)v12->field_8->field_0;
            v3 = v12->field_8->field_8;
            v0 = v4;
            v1 = &g_c7c2eb;
            v14 = "%*sCPS: %.*s";
            v15 = v7;
        }
        sub_9d524c(v15, v14);
    } while ((v9 = (unsigned int)v9 + 1, v27 = sub_ad69e4(a1), (int)v27 > (int)(unsigned int)v9));
    return v27;
}
