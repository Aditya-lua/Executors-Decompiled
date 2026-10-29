/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadf38c..0xadf824 (1176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adf38c_1 {
    struct st_adf38c_0 *field_0;
    struct st_adf38c_2 *field_8;
} st_adf38c_1;

typedef struct st_adf38c_0 {
    struct st_adf38c_0 *field_0;
    char field_8;
    char padding_9[15];
    struct st_adf38c_0 *field_18;
    struct st_adf38c_0 *field_20;
    char padding_28[8];
    char field_30;
    char padding_31[111];
    struct st_adf38c_0 *field_a0;
} st_adf38c_0;

typedef struct st_adf38c_2 {
    struct st_adf38c_0 *field_0;
    struct st_adf38c_0 *field_8;
    struct st_adf38c_0 *field_10;
} st_adf38c_2;

extern unsigned long long g_c7c2eb;
extern long long g_eb4f98;

st_adf38c_0 * sub_adf38c(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    long long v9;  // x20
    long long v10;  // x21
    st_adf38c_0 *v19;  // w8
    long long v20;  // x1
    long long v21;  // x0
    st_adf38c_0 **v22;  // x27
    st_adf38c_0 *v23;  // x22
    st_adf38c_0 *v24;  // x27
    st_adf38c_0 *v25;  // x0
    st_adf38c_0 *v11;  // x22
    unsigned int v12;  // w8
    unsigned long v13;  // x19
    unsigned long v14;  // x23
    long long v15;  // x1
    long long v16;  // x21
    st_adf38c_0 *v17;  // x26
    st_adf38c_1 *v18;  // x27
    unsigned long long v0;  // [bp-0xa0], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x98]
    long long v2;  // [bp-0x90]
    unsigned int v3;  // [bp-0x7c]
    unsigned long v4;  // [bp-0x78]
    unsigned int v5;  // [bp-0x6c]
    st_adf38c_0 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a2;
    v10 = a1;
    if ((int)sub_ad69e4(a1) < 1)
        return 1;
    v11 = 0;
    v12 = a3;
    v13 = v12 + 4;
    v4 = v12 + 6;
    v14 = v12 + 8;
    v2 = v10;
    do
    {
        v0 = a3;
        v1 = &g_c7c2eb;
        sub_9d524c(v9, "%*sTargets:\n");
        v3 = (unsigned int)v11;
        v15 = v11;
        v16 = sub_ad69f8(v10, v15);
        if ((int)sub_ad69e4(v16, v15) >= 1)
        {
            v17 = 0;
            do
            {
                v0 = v12 + 2;
                v1 = &g_c7c2eb;
                sub_9d524c(v9, "%*sTarget:\n");
                v18 = sub_ad69f8(v16, v17);
                v19 = (st_adf38c_0 *)(int)v18->field_0;
                if (v19 != 2)
                {
                    if (v19 == 1)
                    {
                        v0 = v13;
                        v1 = &g_c7c2eb;
                        v20 = "%*sTarget Group: ";
                        v21 = v9;
                    }
                    else
                    {
                        if (v19)
                            continue;
                        v0 = v13;
                        v1 = &g_c7c2eb;
                        v20 = "%*sTarget Name: ";
                        v21 = v9;
                    }
                    sub_9d524c(v21, v20);
                    sub_aec458(v9, v18->field_8);
                    goto LABEL_adf480;
                }
                v0 = v13;
                v1 = &g_c7c2eb;
                sub_9d524c(v9, "%*sTarget Cert:\n");
                v22 = v18->field_8;
                v0 = v4;
                v1 = &g_c7c2eb;
                sub_9d524c(v9, "%*s");
                if (*v22)
                {
                    sub_9d4888(v9, "Target Certificate:\n");
                    v23 = *v22;
                    if (v23->field_0)
                    {
                        v0 = v14;
                        v1 = &g_c7c2eb;
                        sub_9d524c(v9, "%*sIssuer Names:\n");
                        sub_af091c(v9, v23->field_0, v14);
                        sub_9d4888(v9, "\n");
                    }
                    else
                    {
                        v0 = v14;
                        v1 = &g_c7c2eb;
                        sub_9d524c(v9, "%*sIssuer Names: <none>\n");
                    }
                    v0 = v14;
                    v1 = &g_c7c2eb;
                    sub_9d524c(v9, "%*sIssuer Serial: ");
                    if ((int)sub_9c994c(v9, &v23->field_8) < 1)
                        goto LABEL_adf5fc;
                    sub_9d4888(v9, "\n");
                    if (v23->field_20)
                    {
                        v0 = v14;
                        v1 = &g_c7c2eb;
                        sub_9d524c(v9, "%*sIssuer UID: ");
                        if ((int)sub_9c9acc(v9, v23->field_20, 3) >= 1)
                            sub_9d4888(v9, "\n");
                        goto LABEL_adf5fc;
                    }
                    else
                    {
                        v0 = v14;
                        v1 = &g_c7c2eb;
                        sub_9d524c(v9, "%*sIssuer UID: <none>\n");
                        if (!v22[1])
                            goto LABEL_adf634;
LABEL_adf604:
                        v0 = v4;
                        v1 = &g_c7c2eb;
                        sub_9d524c(v9, "%*sTarget Name: ");
                        sub_aec458(v9, v22[1]);
                        sub_9d4888(v9, "\n");
LABEL_adf634:
                        if (v22[2])
                        {
                            v0 = v4;
                            v1 = &g_c7c2eb;
                            sub_9d524c(v9, "%*sCertificate Digest Info:\n");
                            v24 = v22[2];
                            v6 = 0;
                            if (!v24)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/x509/v3_ac_tgt.c", 112, "i2r_OBJECT_DIGEST_INFO");
                                sub_a36abc(13, 0xc0102, 0);
                            }
                            else if (sub_9c1cc8(&v6, v24))
                            {
                                if (2 >= v6)
                                {
                                    v0 = v14;
                                    v1 = &g_c7c2eb;
                                    sub_9d524c(v9, *(long long *)((char *)&g_eb4f98 + 0x8 * v6));
                                }
                                if (v24->field_18)
                                {
                                    v0 = v14;
                                    v1 = &g_c7c2eb;
                                    sub_9d524c(v9, "%*sDigest Type Identifier: ");
                                    sub_9c3060(v9, v24->field_18);
                                    sub_9d4888(v9, "\n");
                                }
                                v0 = v14;
                                v1 = &g_c7c2eb;
                                if ((int)sub_9d524c(v9, "%*sSignature Algorithm: ") >= 1 && (int)sub_9c3060(v9, v24->field_20) >= 1)
                                {
                                    sub_9d4888(v9, "\n");
                                    v0 = v14;
                                    v1 = &g_c7c2eb;
                                    if ((int)sub_9d524c(v9, "\n%*sSignature Value: ") >= 1)
                                    {
                                        if (sub_a99eac(v24->field_20) && sub_a9ae64())
                                        {
                                            v25 = sub_9c5df4(0, v5);
                                            if (v25 && v25->field_a0)
                                                v25->field_a0();
                                        }
                                        if (sub_9d3fec(v9, "\n", 1) == 1)
                                            sub_adef10(v9, &v24->field_30, (unsigned int)a3 + 12);
                                    }
                                }
                            }
                        }
LABEL_adf480:
                        sub_9d4888(v9, "\n");
                    }
                }
                else
                {
LABEL_adf5fc:
                    if (!v22[1])
                        goto LABEL_adf634;
                    goto LABEL_adf604;
                }
            } while ((v17 = (unsigned int)v17 + 1, (int)sub_ad69e4(v16) > (int)(unsigned int)v17));
        }
    } while ((v11 = v3 + 1, v10 = v2, (int)sub_ad69e4(v10) > (int)(unsigned int)v11));
    return 1;
}
