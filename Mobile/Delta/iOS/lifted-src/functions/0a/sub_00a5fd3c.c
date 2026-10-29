/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5fd3c..0xa5ffd0 (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5fd3c_3 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a5fd3c_1 *field_28;
    char padding_30[72];
    struct st_a5fd3c_0 *field_78;
    char padding_80[8];
    long long field_88;
} st_a5fd3c_3;

typedef struct st_a5fd3c_0 {
    char padding_0[4];
    char field_4;
} st_a5fd3c_0;

typedef struct st_a5fd3c_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[40];
    struct st_a5fd3c_2 *field_38;
} st_a5fd3c_1;

typedef struct st_a5fd3c_2 {
    char field_0;
} st_a5fd3c_2;

extern char g_c7c2eb;

unsigned int sub_a5fd3c(st_a5fd3c_3 *a0, char a1, unsigned long long *a2, unsigned long a3, unsigned long a4)
{
    long long v4;  // x1
    st_a5fd3c_1 *v5;  // x20
    char v6;  // x9
    char v7;  // x2
    long long v8;  // x1
    st_a5fd3c_0 *v9;  // x8
    char v10;  // x5
    char v11;  // w0
    unsigned long v12;  // x8
    unsigned long v0;  // [bp-0x50]
    char v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0)
    {
        if (a0->field_0 == 16 || a0->field_0 == 0x4000)
        {
            if (*(long long *)&a0->padding_30[0])
            {
                v5 = a0->field_28;
                v6 = *(long long *)&v5->padding_10[0];
                if (!*(long long *)&v5->padding_10[0])
                    v6 = (char)&g_c7c2eb;
                if (v5->field_38)
                    v5->field_38();
                sub_a368c8();
                sub_a369bc("crypto/evp/signature.c", 1015, "EVP_PKEY_sign");
                v0 = v5->field_8;
                v1 = v6;
                v7 = (char)"%s sign:%s";
                v8 = 237;
            }
            else
            {
                v9 = a0->field_78;
                if (v9)
                {
                    v10 = *(long long *)&v9[14].padding_0[2];
                    if (*(long long *)&v9[14].padding_0[2])
                    {
                        if (v9->field_4 >> 1 & 1)
                        {
                            v11 = sub_a5bdac(a0->field_88);
                            if (!v11)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/evp/signature.c", 1033, "EVP_PKEY_sign");
                                sub_a36abc(6, 163, 0);
                                return 0;
                            }
                            v12 = v11;
                            if (!a1)
                            {
                                *a2 = v12;
                                return 1;
                            }
                            if (v12 > *a2)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/evp/signature.c", 1033, "EVP_PKEY_sign");
                                sub_a36abc(6, 155, 0);
                                return 0;
                            }
                            v10 = *(long long *)&a0->field_78[14].padding_0[2];
                        }
                        goto *((void *)(v10));
                    }
                }
                sub_a368c8();
                sub_a369bc("crypto/evp/signature.c", 1029, "EVP_PKEY_sign");
                v8 = 150;
                v7 = 0;
            }
            sub_a36abc(6, v8, v7);
            return 0xfffffffe;
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/signature.c", 1005, "EVP_PKEY_sign");
        v4 = 151;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/signature.c", 999, "EVP_PKEY_sign");
        v4 = 786690;
    }
    sub_a36abc(6, v4, 0);
    return 0xffffffff;
}
