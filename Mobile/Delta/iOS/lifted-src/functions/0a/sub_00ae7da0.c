/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7da0..0xae7ff8 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae7da0_0 {
    struct st_ae7da0_0 *field_0;
    struct st_ae7da0_0 *field_8;
    struct st_ae7da0_0 *field_10;
    struct st_ae7da0_0 *field_18;
} st_ae7da0_0;

extern long long g_eb7bd8;

st_ae7da0_0 * sub_ae7da0(unsigned long a0, unsigned long a1, long long a2)
{
    st_ae7da0_0 *v2;  // x19
    st_ae7da0_0 *v3;  // x22
    st_ae7da0_0 *v12;  // x27
    long long len;  // x0
    st_ae7da0_0 *v14;  // x27
    long long len1;  // x0
    long long v16;  // x21
    long long v4;  // x20
    st_ae7da0_0 *v5;  // x0
    st_ae7da0_0 *v6;  // x27
    st_ae7da0_0 *v7;  // x28
    st_ae7da0_0 *v8;  // x27
    long long len2;  // x0
    st_ae7da0_0 *v10;  // x27
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9cde20(&g_eb7bd8);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_ist.c", 41, "v2i_issuer_sign_tool");
        sub_a36abc(0x22, 0x8000d, 0);
        return v2;
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v3 = 0;
        v4 = 524301;
        while (1)
        {
            v5 = sub_ad69f8(a2, v3);
            if (v5)
            {
                v6 = v5;
                v7 = v5->field_8;
                if (_strcmp(v7, "signTool"))
                {
                    if (_strcmp(v7, "cATool"))
                    {
                        if (_strcmp(v7, "signToolCert"))
                        {
                            if (_strcmp(v7, "cAToolCert"))
                            {
                                v4 = 524550;
                                v16 = 79;
                                break;
                            }
                            else if (!v2->field_18 || (v8 = v6->field_10, !v8 || (len2 = _strlen(v8), !sub_9c7770(v2->field_18, v8, _strlen(v8)))))
                            {
                                v16 = 75;
                                break;
                            }
                        }
                        else
                        {
                            if (!v2->field_10 || (v10 = v6->field_10, !v10 || (v11 = _strlen(v10), !sub_9c7770(v2->field_10, v10, _strlen(v10)))))
                            {
                                v16 = 0x44;
                                break;
                            }
                        }
                    }
                    else
                    {
                        if (!v2->field_8 || (v12 = v6->field_10, !v12 || (len = _strlen(v12), !sub_9c7770(v2->field_8, v12, _strlen(v12)))))
                        {
                            v16 = 61;
                            break;
                        }
                    }
                }
                else
                {
                    if (!v2->field_0 || (v14 = v6->field_10, !v14 || (len1 = _strlen(v14), !sub_9c7770(v2->field_0, v14, _strlen(v14)))))
                    {
                        v16 = 54;
                        break;
                    }
                }
            }
            v3 = (unsigned int)v3 + 1;
            if ((int)sub_ad69e4(a2) <= (int)(unsigned int)v3)
                return v2;
        }
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_ist.c", v16, "v2i_issuer_sign_tool");
        sub_a36abc(0x22, v4, 0);
        sub_9cd960(v2, &g_eb7bd8);
        return 0;
    }
    else
    {
        return v2;
    }
}
