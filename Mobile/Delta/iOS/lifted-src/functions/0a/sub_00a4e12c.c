/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4e12c..0xa4e548 (1052 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4e12c_2 {
    struct st_a4e12c_2 *field_0;
    char padding_8[16];
    struct st_a4e12c_2 *field_18;
    char padding_20[64];
    unsigned int field_60;
    char padding_64[4];
    struct st_a4e12c_2 *field_68;
    unsigned long long field_70;
    long long field_78;
    unsigned int field_80;
} st_a4e12c_2;

typedef struct st_a4e12c_0 {
    char padding_0[16];
    struct st_a4e12c_1 *field_10;
    unsigned long long field_18;
} st_a4e12c_0;

typedef struct st_a4e12c_1 {
    unsigned int field_0;
} st_a4e12c_1;

extern long long g_a4e640;
extern char g_def2d0;

st_a4e12c_2 * sub_a4e12c(unsigned long long a0, st_a4e12c_0 *a1, long long a2)
{
    unsigned int *v2;  // x25
    st_a4e12c_2 *v3;  // x19
    unsigned long long v4;  // 4118
    st_a4e12c_2 *v5;  // x0
    unsigned long i;  // x13
    unsigned int v7;  // w8
    unsigned long long v8;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a6bffc(296, "crypto/evp/evp_enc.c", 1847);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1896, "evp_cipher_from_algorithm");
        sub_a36abc(6, 0x80006, 0);
        return v3;
    }
    /* unsupported instruction */;
    v3->field_80 = 1;
    *(unsigned int *)&v3->field_0 = 0;
    if (sub_a4f138(a2, a0, &g_a4e640, v3) && !(v4 = arm64g_calculate_condition(1, (int)v3->field_0, 1, 0), v4 & 1))
    {
        v3->field_60 = a0;
        v5 = sub_a6895c(a1);
        v3->field_68 = v5;
        if (v5)
        {
            v3->field_70 = a1->field_18;
            for (i = v2 + 2; 20 < (unsigned int)*(int *)(i - 8); i += 16);
            goto *((void *)(sub_a4e1f0 + (&g_def2d0)[*(int *)(i - 8)] * 4));
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1904, "evp_cipher_from_algorithm");
        sub_a36abc(6, 0xc0103, 0);
    }
    if ((int)v3->field_18)
        return 0;
    do
    {
        /* unsupported instruction */;
        v7 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v8 = arm64g_calculate_condition(19, v7, 1, 0);
    if (!(v8 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < (int)v7)
    {
        return 0;
    }
    sub_a6c2e4(v3->field_68, "crypto/evp/evp_enc.c", 2113);
    sub_a78ccc(v3->field_78);
    sub_a6c2e4(v3, "crypto/evp/evp_enc.c", 2116);
    return 0;
}
