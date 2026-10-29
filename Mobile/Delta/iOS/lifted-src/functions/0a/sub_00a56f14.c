/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa56f14..0xa570c8 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a56f14_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[136];
    struct st_a56f14_1 *field_98;
} st_a56f14_0;

typedef struct st_a56f14_3 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a56f14_0 *field_28;
    char padding_30[72];
    struct st_a56f14_2 *field_78;
    char padding_80[32];
    char field_a0;
} st_a56f14_3;

typedef struct st_a56f14_2 {
    char padding_0[248];
    struct st_a56f14_1 *field_f8;
} st_a56f14_2;

typedef struct st_a56f14_4 {
    char padding_0[25];
    char field_19;
    char padding_1a[14];
    struct st_a56f14_3 *field_28;
} st_a56f14_4;

typedef struct st_a56f14_1 {
    unsigned long long field_0;
} st_a56f14_1;

extern unsigned long long g_c7c2eb;

unsigned long long sub_a56f14(st_a56f14_4 *a0, unsigned long a1, unsigned long a2)
{
    st_a56f14_3 *v4;  // x19
    st_a56f14_0 *v5;  // x22
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
        sub_a369bc("crypto/evp/m_sigver.c", 411, "EVP_DigestSignUpdate");
        sub_a36abc(6, 189, 0);
        return 0;
    }
    v4 = a0->field_28;
    if (v4)
    {
        if (v4->field_0 == 128 && *(long long *)&v4->padding_30[0])
        {
            v5 = v4->field_28;
            if (v5)
            {
                if (!*(long long *)&v5->padding_10[0])
                    v6 = &g_c7c2eb;
                else
                    v6 = *(long long *)&v5->padding_10[0];
                if (!v5->field_98)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/m_sigver.c", 424, "EVP_DigestSignUpdate");
                    v0 = v5->field_8;
                    v1 = v6;
                    sub_a36abc(6, 237, "%s digest_sign_update:%s");
                    return 0;
                }
                sub_a36c8c();
                v5->field_98();
            }
        }
        v9 = v4->field_a0;
        if (v9 & 1)
            v4->field_78->field_f8();
        v4->field_a0 = (char)v9 & 254;
    }
}
