/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae840c..0xae8678 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae840c_0 {
    unsigned long long field_0;
    struct st_ae840c_0 *field_8;
} st_ae840c_0;

typedef struct st_ae840c_2 {
    char padding_0[8];
    struct st_ae840c_1 *field_8;
    unsigned long long field_10;
} st_ae840c_2;

typedef struct st_ae840c_1 {
    char padding_0[8];
    struct st_ae840c_0 *field_8;
    struct st_ae840c_0 *field_9;
} st_ae840c_1;

extern long long g_eb7e50;
extern long long g_eb7f00;

st_ae840c_0 * sub_ae840c(long long a0, long long a1, long long a2)
{
    st_ae840c_0 *v5;  // x19
    st_ae840c_0 *v6;  // x23
    st_ae840c_2 *v7;  // x0
    st_ae840c_1 *v8;  // x28
    long long v9;  // x8
    st_ae840c_0 *v10;  // x25
    st_ae840c_0 *v11;  // x27
    st_ae840c_0 *v12;  // x0
    long long v13;  // x1
    long long v14;  // x1
    char v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_9cde20(&g_eb7f00);
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_ncons.c", 159, "v2i_NAME_CONSTRAINTS");
        v13 = 524301;
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v6 = 0;
        while (1)
        {
            v7 = sub_ad69f8(a2, v6);
            v8 = v7->field_8;
            if (!_strncmp(v8, "permitted", 9) && *((char *)&v8->field_8 + 1))
            {
                v9 = 10;
                v10 = v5;
            }
            else if (!_strncmp(v8, "excluded", 8) && (char)v8->field_8)
            {
                v9 = 9;
                v10 = &v5->field_8;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_ncons.c", 171, "v2i_NAME_CONSTRAINTS");
                v13 = 143;
                break;
            }
            v1 = &v8->padding_0[v9];
            v2 = v7->field_10;
            v11 = sub_9cde20(&g_eb7e50);
            if (!v11)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_ncons.c", 177, "v2i_NAME_CONSTRAINTS");
                v14 = 524301;
                goto LABEL_ae8628;
            }
            if (!sub_aec7c8(v11->field_0, a0, a1, &v0, 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_ncons.c", 181, "v2i_NAME_CONSTRAINTS");
                v14 = 524322;
LABEL_ae8624:
LABEL_ae8628:
                sub_a36abc(0x22, v14, 0);
                sub_9cd960(v5, &g_eb7f00);
                sub_9cd960(v11, &g_eb7e50);
                return 0;
            }
            v12 = v10->field_0;
            if (v12 || (v12 = sub_ad61b4(NULL), v10->field_0 = v12, v12))
            {
                if (!sub_ad68a0(v12, v11))
                    goto LABEL_ae85a4;
                v6 = (unsigned int)v6 + 1;
                if ((int)(unsigned int)v6 >= (int)sub_ad69e4(a2))
                    return v5;
            }
            else
            {
LABEL_ae85a4:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_ncons.c", 0xbb, "v2i_NAME_CONSTRAINTS");
                v14 = 524303;
                goto LABEL_ae8624;
            }
        }
    }
    else
    {
        return v5;
    }
    sub_a36abc(0x22, v13, 0);
    sub_9cd960(v5, &g_eb7f00);
    sub_9cd960(0, &g_eb7e50);
    return 0;
}
