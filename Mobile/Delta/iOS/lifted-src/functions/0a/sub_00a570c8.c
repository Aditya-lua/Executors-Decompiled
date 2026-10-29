/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa570c8..0xa5727c (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a570c8_4 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a570c8_0 *field_28;
    char padding_30[72];
    struct st_a570c8_2 *field_78;
    char padding_80[32];
    char field_a0;
} st_a570c8_4;

typedef struct st_a570c8_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[168];
    struct st_a570c8_1 *field_b8;
} st_a570c8_0;

typedef struct st_a570c8_2 {
    char padding_0[248];
    struct st_a570c8_3 *field_f8;
} st_a570c8_2;

typedef struct st_a570c8_5 {
    char padding_0[25];
    char field_19;
    char padding_1a[14];
    struct st_a570c8_4 *field_28;
} st_a570c8_5;

typedef struct st_a570c8_3 {
    unsigned long long field_0;
} st_a570c8_3;

typedef struct st_a570c8_1 {
    char field_0;
} st_a570c8_1;

extern unsigned long long g_c7c2eb;

char sub_a570c8(st_a570c8_5 *a0, unsigned long a1, unsigned long a2)
{
    st_a570c8_4 *v4;  // x19
    st_a570c8_0 *v5;  // x22
    unsigned long long v6;  // x23
    unsigned long v9;  // x8
    unsigned long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0->field_19 >> 3 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 457, "EVP_DigestVerifyUpdate");
        sub_a36abc(6, 189, 0);
        return 0;
    }
    v4 = a0->field_28;
    if (v4)
    {
        if (v4->field_0 == 0x100 && *(long long *)&v4->padding_30[0])
        {
            v5 = v4->field_28;
            if (v5)
            {
                if (!*(long long *)&v5->padding_10[0])
                    v6 = &g_c7c2eb;
                else
                    v6 = *(long long *)&v5->padding_10[0];
                if (!v5->field_b8)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/m_sigver.c", 470, "EVP_DigestVerifyUpdate");
                    v0 = v5->field_8;
                    v1 = v6;
                    sub_a36abc(6, 237, "%s digest_verify_update:%s");
                    return 0;
                }
                sub_a36c8c();
                v5->field_b8();
            }
        }
        v9 = v4->field_a0;
        if (v9 & 1)
            v4->field_78->field_f8();
        v4->field_a0 = (char)v9 & 254;
    }
}
