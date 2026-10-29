/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7ac8..0xae7cf4 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae7ac8_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
} st_ae7ac8_0;

typedef struct st_ae7ac8_1 {
    struct st_ae7ac8_1 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
} st_ae7ac8_1;

extern long long g_ae7d00;
extern long long g_eb7950;

st_ae7ac8_1 * sub_ae7ac8(long long a0, long long a1, long long a2)
{
    unsigned long long v6;  // x23
    st_ae7ac8_1 *v7;  // x19
    long long v16;  // x1
    st_ae7ac8_1 *v8;  // x24
    st_ae7ac8_0 *v9;  // x28
    st_ae7ac8_1 *v10;  // x0
    st_ae7ac8_1 *v11;  // x27
    st_ae7ac8_1 *ptr;  // x0
    st_ae7ac8_1 *v13;  // x0
    st_ae7ac8_1 *v14;  // x28
    st_ae7ac8_1 *v15;  // x0
    st_ae7ac8_1 *v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    st_ae7ac8_1 *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_ad69e4(a2);
    v7 = sub_ad61e0(0, v6);
    if (!v7)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_info.c", 114, "v2i_AUTHORITY_INFO_ACCESS");
        sub_a36abc(0x22, 0x8000f, 0);
        return v7;
    }
    else if ((int)v6 >= 1)
    {
        v8 = 0;
        while (1)
        {
            v9 = sub_ad69f8(a2, v8);
            v10 = sub_9cde20(&g_eb7950);
            if (v10)
            {
                v11 = v10;
                sub_ad68a0(v7, v11);
                ptr = _strchr(v9->field_8, 59);
                if (ptr)
                {
                    v2 = (char *)&ptr->field_0 + 1;
                    v3 = v9->field_10;
                    if (!sub_aec7c8(*(long long *)&v11->field_1, a0, a1, &v1, 0) || !(v13 = sub_a6da14(v9->field_8, (char *)ptr - v9->field_8, "crypto/x509/v3_info.c", 133), v13))
                        break;
                    v14 = v13;
                    v15 = sub_a997a4();
                    v11->field_0 = v15;
                    if (v15)
                    {
                        sub_a6c2e4(v14, "crypto/x509/v3_info.c", 142);
                        v8 = (unsigned int)v8 + 1;
                        if ((unsigned int)v6 == (unsigned int)v8)
                            return v7;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_info.c", 137, "v2i_AUTHORITY_INFO_ACCESS");
                        v0 = v14;
                        sub_a36abc(0x22, 0x77, "value=%s");
                        sub_a6c2e4(v14, "crypto/x509/v3_info.c", 139);
                        break;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_info.c", 126, "v2i_AUTHORITY_INFO_ACCESS");
                    v16 = 143;
LABEL_ae7c68:
                    sub_a36abc(0x22, v16, 0);
                    break;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_info.c", 120, "v2i_AUTHORITY_INFO_ACCESS");
                v16 = 524301;
                goto LABEL_ae7c68;
            }
        }
        sub_ad6958(v7, &g_ae7d00);
        return 0;
    }
    else
    {
        return v7;
    }
}
