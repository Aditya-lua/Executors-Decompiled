/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5100c..0xa51314 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5100c_0 {
    char padding_0[8];
    unsigned int field_8;
    unsigned int field_c;
    struct st_a5100c_1 *field_10;
    struct st_a5100c_0 *field_18;
} st_a5100c_0;

typedef struct st_a5100c_1 {
    unsigned long long field_0;
} st_a5100c_1;

extern long long g_a51430;
extern long long g_e9de50;
extern st_a5100c_0 *g_f12a38;
extern char g_10002b0;

st_a5100c_0 * sub_a5100c(st_a5100c_0 *a0, st_a5100c_0 *a1, unsigned int a2, unsigned long long a3, unsigned long long a4, unsigned int a5, long long a6, long long a7)
{
    st_a5100c_0 *v10;  // w0
    long long v11;  // x0
    long long v20;  // x1
    unsigned long long v21;  // 4116
    st_a5100c_0 *v22;  // x0
    long long v24;  // x1
    long long v25;  // x2
    long long v26;  // x0
    st_a5100c_0 *v12;  // x0
    unsigned long v13;  // x28
    unsigned long v14;  // x26
    st_a5100c_0 *v15;  // x21
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4120
    long long v19;  // x0
    long long v0;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xd0]
    unsigned int v3;  // [bp-0xc4]
    st_a5100c_0 *v4;  // [bp-0xc0]
    st_a5100c_0 *v5;  // [bp-0xb8]
    st_a5100c_0 *v6;  // [bp-0xb4]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v10 = (st_a5100c_0 *)(unsigned int)sub_a99eac();
    if (v10)
    {
        v5 = (st_a5100c_0 *)0;
        v6 = v10;
        if (g_f12a38)
        {
            sub_ad6ae4(g_f12a38);
            v11 = sub_ad66d4(g_f12a38, &v5);
            v12 = sub_ad69f8(g_f12a38, v11);
            if (v12)
                goto LABEL_a510b8;
        }
        v12 = sub_a99ef4(&v5, &g_e9de50, 0x22, 32, &g_a51430);
        if (!v12)
            goto LABEL_a510e0;
LABEL_a510b8:
        v3 = a5;
        v13 = v12->field_8;
        v14 = v12->field_c;
        v15 = v12->field_18;
        if (a1)
        {
            v16 = arm64g_calculate_condition(0x11, a2, 1, 0);
            if (!(v16 & 1))
                _strlen(a1);
        }
        v1 = a3;
        v2 = a4;
        v17 = arm64g_calculate_condition(1, v13 & 0xffffffff, 1, 0);
        if (!(v17 & 1))
        {
            sub_a36c8c();
            v4 = sub_a4e104(a6, sub_a9976c(v13), a7);
            if (v4 || sub_a58c5c(sub_a9976c(v13)))
            {
                sub_a36cd4();
            }
            else
            {
                sub_a368c8(sub_a36e70());
                sub_a369bc("crypto/evp/evp_pbe.c", 134, "EVP_PBE_CipherInit_ex");
                v19 = sub_a9976c(v13);
                v20 = 160;
LABEL_a51140:
                sub_a36abc(6, v20, v19);
                v4 = 0;
                v22 = 0;
                goto LABEL_a51258;
            }
        }
        else
        {
            v4 = 0;
        }
        v21 = arm64g_calculate_condition(1, v14 & 0xffffffff, 1, 0);
        if (v21 & 1)
        {
            if (v15)
            {
                v0 = a7;
                v15();
            }
            v12->field_10();
        }
        sub_a36c8c();
        if (!sub_a40ca8(a6, sub_a9976c(v14), a7))
        {
            v22 = sub_a58d60(sub_a9976c(v14));
            if (!v22)
            {
                sub_a368c8(sub_a36e70());
                sub_a369bc("crypto/evp/evp_pbe.c", 150, "EVP_PBE_CipherInit_ex");
                sub_a36abc(6, 161, 0);
LABEL_a51258:
                sub_a4bbe4(v4);
                sub_a3f52c(0);
                if (*(long long *)&g_10002b0 == v7)
                    return v22;
                ___stack_chk_fail();
            }
        }
        sub_a36cd4();
        if (!v15)
            v12->field_10();
        v0 = a7;
        v15();
    }
    else
    {
LABEL_a510e0:
        if (a0)
        {
            v24 = 80;
            v25 = a0;
            v26 = sub_9c3058(&v5, 80, v25);
        }
        else
        {
            v24 = "NULL";
            v25 = 80;
            v26 = sub_a6db20(&v5, "NULL", 80);
        }
        sub_a368c8(v26, v24, v25);
        sub_a369bc("crypto/evp/evp_pbe.c", 116, "EVP_PBE_CipherInit_ex");
        v0 = &v5;
        v19 = "TYPE=%s";
        v20 = 121;
        goto LABEL_a51140;
    }
}
