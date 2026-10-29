/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc0ac..0xafc3d4 (808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc0ac_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
} st_afc0ac_2;

typedef struct st_afc0ac_0 {
    struct st_afc0ac_1 *field_0;
    char field_8;
    char padding_9[7];
    long long field_10;
    long long field_18;
    long long field_20;
    char field_28;
} st_afc0ac_0;

typedef struct st_afc0ac_1 {
    long long field_0;
} st_afc0ac_1;

extern long long g_ebab80;
extern char g_10002b0;

char sub_afc0ac(st_afc0ac_0 **a0, char *a1, long long a2, unsigned long a3, long long a4, unsigned long long a5, long long a6, long long a7, char a8, unsigned long a9)
{
    char v6;  // x20
    st_afc0ac_0 *v7;  // x27
    char v16;  // w0
    unsigned long long v17;  // 4112
    char v18;  // x20
    char v19;  // x19
    char v20;  // x21
    st_afc0ac_0 *v22;  // x20
    char v8;  // x0
    char v9;  // x0
    char v10;  // x0
    long long v11;  // x24
    st_afc0ac_0 *v12;  // x23
    st_afc0ac_0 *v13;  // x22
    st_afc0ac_2 *v14;  // x22
    long long v15;  // x0
    long long v0;  // [bp-0xd0]
    char v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    char v3;  // [bp-0x9a]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]

    v5 = &a8;
    v4 = *(long long *)&g_10002b0;
    v6 = *(long long *)a1;
    v7 = *a0;
    if (!v7)
    {
        v8 = sub_afbf84(a0);
        if (!v8)
        {
            if (*(long long *)&g_10002b0 == v4)
                return v8;
            ___stack_chk_fail();
        }
        v7 = *a0;
        if (!v7->field_0)
        {
LABEL_afc12c:
            v9 = sub_9cf6bc();
            v7->field_0 = v9;
            if (!v9)
                goto LABEL_afc230;
        }
    }
    else if (!(v7->field_0))
    {
        goto LABEL_afc12c;
    }
    if (*(long long *)&v7->field_8 || !(v10 = sub_9cf14c(), *(unsigned long long *)&v7->field_8 = v10, !v10))
    {
        *(unsigned int *)&v0 = 0;
        v8 = sub_9cae38(a0, a1, a2, &g_ebab80, a4, a5, a6, a7, v0, 0, 0);
        if (v8 > 0)
        {
            v11 = *(long long *)a1 - v6;
            if (*(long long *)a1 != v6)
            {
                v12 = *a0;
                v13 = v12;
                v14 = &v13->field_10;
                v15 = sub_a5a4c8(v13->field_10);
                v14->field_0 = 0;
                sub_a36c8c(v15);
                v16 = sub_afb0d0(v14, v12);
                if (v16)
                {
                    v17 = arm64g_calculate_condition(0x11, v16, 1, 0);
                    if (v17 & 1)
                        goto LABEL_afc2a8;
                    sub_a36e70();
                    v18 = 0;
                    v19 = 0;
                    v20 = 0xffffffff;
                }
                else
                {
                    if (v12->field_28 & 1)
                    {
LABEL_afc2a8:
                        v18 = 0;
                        v19 = 0;
                        goto LABEL_afc2b0;
                    }
                    v1 = v11;
                    if ((unsigned int)a5)
                    {
                        v8 = sub_a6dac4(v6, v11, "crypto/x509/x_pubkey.c", 196);
                        if (v8)
                        {
                            v6 = v8;
                            *(char *)v8 = 48;
                            v19 = v8;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v4)
                                return v8;
                            ___stack_chk_fail();
                        }
                    }
                    else
                    {
                        v19 = 0;
                    }
                    v2 = v6;
                    if ((int)sub_a99b48(&v3, 50, *(long long *)v12->field_0, 0) > 0)
                    {
                        v18 = sub_a2e274(v14, "DER", "SubjectPublicKeyInfo", &v3, 134, v12->field_18, v12->field_20);
                        if (!v18 || !sub_a2c518(v18, &v2, &v1) || !v1)
                        {
LABEL_afc2b0:
                            sub_a36cd4();
                            v20 = 1;
                        }
                        else
                        {
                            sub_a368c8(sub_a36e70());
                            sub_a369bc("crypto/x509/x_pubkey.c", 227, "x509_pubkey_ex_d2i_ex");
                            sub_a36abc(13, 110, 0);
                            goto LABEL_afc3bc;
                        }
                    }
                    else
                    {
                        sub_a36e70();
                        v18 = 0;
LABEL_afc3bc:
                        v20 = 0;
                    }
                }
                sub_a2d974(v18);
                sub_a6c2e4(v19, "crypto/x509/x_pubkey.c", 237);
                v8 = v20;
            }
            else
            {
                sub_c6a7d4();
                v8 = 0;
            }
        }
        else
        {
            v22 = *a0;
            if (v22)
            {
                sub_9cf6c8(v22->field_0);
                sub_9cf0f4(*(long long *)&v22->field_8);
                sub_a5a4c8(v22->field_10);
                sub_a6c2e4(v22->field_20, "crypto/x509/x_pubkey.c", 93);
                sub_a6c2e4(v22, "crypto/x509/x_pubkey.c", 94);
                *a0 = 0;
            }
        }
    }
    else
    {
LABEL_afc230:
        sub_a368c8();
        sub_a369bc("crypto/x509/x_pubkey.c", 144, "x509_pubkey_ex_d2i_ex");
        sub_a36abc(13, 0x8000b, 0);
        v8 = 0;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v8;
    ___stack_chk_fail();
}
