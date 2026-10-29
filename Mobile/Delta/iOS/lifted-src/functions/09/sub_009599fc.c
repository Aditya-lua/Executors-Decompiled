/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9599fc..0x959d80 (900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9599fc_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9599fc_0;

typedef struct st_9599fc_1 {
    struct st_9599fc_0 *field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_9599fc_1;

typedef struct st_9599fc_3 {
    char padding_0[8];
    struct st_9599fc_2 *field_8;
    char padding_10[2160];
    struct st_9599fc_1 *field_880;
    char padding_888[32];
    unsigned int field_8a8;
    char padding_8ac[1092];
    long long field_cf0;
} st_9599fc_3;

typedef struct st_9599fc_2 {
    struct st_9599fc_1 *field_0;
    char padding_8[32];
    unsigned long long field_28;
    char padding_30[296];
    char field_158;
    char padding_159[791];
    unsigned long long field_470;
} st_9599fc_2;

typedef struct st_9599fc_4 {
    struct st_9599fc_1 *field_0;
    char padding_8[32];
    unsigned int field_28;
    char padding_2c[300];
    char field_158;
    char padding_159[791];
    long long field_470;
} st_9599fc_4;


unsigned int sub_9599fc(st_9599fc_3 *a0, st_9599fc_4 *a1, unsigned long long a2)
{
    st_9599fc_4 *v3;  // x8
    st_9599fc_1 *v4;  // x27
    unsigned int v13;  // x20
    unsigned int v14;  // w0
    unsigned int v15;  // w27
    long long v16;  // x24
    unsigned long v18;  // x1
    unsigned int v20;  // x23
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    void* v5;  // x26
    unsigned int v23;  // x2
    long long v24;  // x1
    long long v25;  // x1
    st_9599fc_4 *v6;  // x28
    unsigned int v7;  // x19
    unsigned int v8;  // x24
    unsigned int v9;  // x20
    unsigned int v10;  // x21
    unsigned int v11;  // x24
    unsigned int v12;  // w25
    unsigned long long v0;  // [bp-0x70]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = &a0->field_880;
    if (!a0)
        v3 = &a1->field_158;
    v4 = v3->field_0;
    v5 = v4->field_0;
    v6 = a1;
    if (a0)
        v6 = a0->field_8;
    if (!*(long long *)v5)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 1078, "ssl_build_cert_chain");
        sub_a36abc(20, 179, 0);
        v7 = 0;
        v10 = 0;
        v11 = 0;
        if (!((unsigned int)a2 & 4))
        {
            sub_af5130(0);
            return 0;
        }
    }
    else if (!(a2 >> 2 & 1))
    {
        v7 = *(long long *)&v4[3].padding_8[8];
        if (v7)
        {
            if (a2 & 1)
                goto LABEL_959b34;
LABEL_959a64:
            v8 = 0;
        }
        else
        {
            v7 = *(long long *)&v6->field_28;
            if (!(a2 & 1))
                goto LABEL_959a64;
LABEL_959b34:
            v8 = (long long)v5[16];
        }
LABEL_959b38:
        v12 = (unsigned int)a2 & 4;
        v13 = sub_af50b4(v6->field_0, v6->field_470);
        if (!v13)
        {
            sub_a368c8();
            v25 = 1106;
            goto LABEL_959bd0;
        }
        if (!sub_af5208(v13, v7, *(long long *)v5, v8))
        {
            sub_a368c8();
            v25 = 1110;
LABEL_959bd0:
            sub_a369bc("ssl/ssl_cert.c", v25, "ssl_build_cert_chain");
            v24 = 524299;
            v23 = 0;
            goto LABEL_959be4;
        }
        sub_af5e78(v13, v4->field_1c & 0x30000);
        v14 = sub_af4814(v13);
        if (a2 >> 3 & 1 && 0 >= (int)v14)
        {
            if (a2 >> 4 & 1)
                sub_a35af4();
            v15 = 2;
            goto LABEL_959c38;
        }
        else if ((int)v14 > 0)
        {
            v15 = 0;
LABEL_959c38:
            v16 = sub_af50a4(v13);
            sub_afc404(sub_ad68b8(v16));
            if (a2 >> 1 & 1 && (int)sub_ad69e4(v16) >= 1)
            {
                v18 = sub_ad69e4(v16) - 1;
                if (sub_aeb448(sub_ad69f8(v16, v18), v18) >> 13 & 1)
                    sub_afc404(sub_ad692c(v16));
            }
            if ((int)sub_ad69e4(v16) >= 1)
            {
                v20 = 0;
                do
                {
                    v21 = sub_96ca2c(a0, a1, sub_ad69f8(v16, v20), 0);
                    if ((unsigned int)v21 != 1)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/ssl_cert.c", 1154, "ssl_build_cert_chain");
                        sub_a36abc(20, v21, 0);
                        sub_aded90(v16);
                        goto LABEL_959be8;
                    }
                } while ((v20 += 1, (int)v20 < (int)sub_ad69e4(v16)));
                v15 = 1;
            }
            sub_aded90((long long)v5[16]);
            *(long long *)&v5[16] = v16;
            if (1 < v15)
                v10 = v15;
            else
                v10 = 1;
            v11 = v13;
            if (!v12)
            {
                sub_af5130(v13);
                return v10;
            }
        }
        else
        {
            v22 = sub_af509c(v13);
            sub_a368c8(v22);
            sub_a369bc("ssl/ssl_cert.c", 1128, "ssl_build_cert_chain");
            v0 = sub_af4024((int)v22);
            v23 = (unsigned int)"Verify error:%s";
            v24 = 134;
LABEL_959be4:
            sub_a36abc(20, v24, v23);
LABEL_959be8:
            v10 = 0;
            v11 = v13;
            if (!v12)
            {
                sub_af5130(v13);
                return 0;
            }
        }
    }
    else
    {
        v7 = sub_af27d8();
        if (v7)
        {
            if ((int)sub_ad69e4((long long)v5[16]) >= 1)
            {
                v9 = 0;
                do
                {
                    if (!sub_af2f6c(v7, sub_ad69f8((long long)v5[16], v9)))
                        goto LABEL_959b20;
                } while ((v9 += 1, (int)v9 < (int)sub_ad69e4((long long)v5[16])));
            }
            v8 = 0;
            if (sub_af2f6c(v7, *(long long *)v5))
                goto LABEL_959b38;
            v10 = 0;
            v11 = 0;
        }
        else
        {
LABEL_959b20:
            v10 = 0;
            v11 = 0;
        }
    }
    sub_af295c(v7);
    sub_af5130(v11);
    return v10;
}
