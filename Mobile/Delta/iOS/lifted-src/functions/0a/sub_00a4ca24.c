/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ca24..0xa4cc84 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4ca24_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[10];
    char field_12;
    char padding_13[21];
    struct st_a4ca24_1 *field_28;
    char padding_30[120];
    struct st_a4ca24_2 *field_a8;
} st_a4ca24_0;

typedef struct st_a4ca24_1 {
    unsigned long long field_0;
} st_a4ca24_1;

typedef struct st_a4ca24_2 {
    char field_0;
} st_a4ca24_2;

typedef struct st_a4ca24_3 {
    struct st_a4ca24_0 *field_0;
    char padding_8[12];
    unsigned int field_14;
    char padding_18[89];
    char field_71;
} st_a4ca24_3;


char sub_a4ca24(st_a4ca24_3 *a0, unsigned long a1, unsigned long a2)
{
    st_a4ca24_0 *v2;  // x20
    long long v4;  // x1
    unsigned long v5;  // x19
    unsigned long v6;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2)
    {
        *(unsigned int *)a2 = 0;
        if (*(int *)&a0->padding_8[8])
        {
            v2 = a0->field_0;
            if (!v2)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1063, "EVP_EncryptFinal_ex");
                v4 = 131;
            }
            else if (*(long long *)&v2->padding_30[72])
            {
                if ((int)sub_a50638() >= 1 && a0->field_0->field_a8)
                    a0->field_0->field_a8();
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1072, "EVP_EncryptFinal_ex");
                v4 = 188;
            }
            else if (!(v2->field_12 >> 4 & 1))
            {
                v5 = v2->field_4;
                if (33 <= (unsigned int)v5)
                    sub_a69928("assertion failed: b <= sizeof(ctx->buf)", "crypto/evp/evp_enc.c", 1102);
                if ((unsigned int)v5 == 1)
                    return 1;
                v6 = a0->field_14;
                if (!(a0->field_71 & 1))
                {
                    if ((unsigned int)v5 > (unsigned int)v6)
                        _memset(&a0->padding_18[32 + v6], v5 - v6, v5 + ~(unsigned int)v6 + 1);
                    v2->field_28();
                }
                else
                {
                    if (!(unsigned int)v6)
                        return 1;
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 1110, "EVP_EncryptFinal_ex");
                    v4 = 138;
                }
            }
            else
            {
                v2->field_28();
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 1058, "EVP_EncryptFinal_ex");
            v4 = 148;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1052, "EVP_EncryptFinal_ex");
        v4 = 786690;
    }
    sub_a36abc(6, v4, 0);
    return 0;
}
