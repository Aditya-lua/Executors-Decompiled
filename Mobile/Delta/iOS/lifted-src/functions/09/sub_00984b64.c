/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984b64..0x984d38 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_984b64_0 {
    char padding_0[40];
    long long field_28;
    struct st_984b64_0 *field_30;
    char padding_38[8];
    long long field_40;
    long long field_48;
    unsigned long long field_50;
    struct st_984b64_0 *field_58;
    unsigned int field_60;
    char padding_64[4];
    struct st_984b64_0 *field_68;
    struct st_984b64_0 *field_69;
    char field_6a;
    char padding_6b[31];
    char field_8a;
    char padding_8b[533];
    struct st_984b64_0 *field_2a0;
} st_984b64_0;

extern char g_10002b0;

st_984b64_0 * sub_984b64(st_984b64_0 *a0, unsigned int a1)
{
    st_984b64_0 *v8;  // x19
    unsigned long long n;  // x20
    st_984b64_0 *v10;  // x0
    st_984b64_0 *v11;  // x8
    long long v12;  // x1
    long long v0;  // [bp-0xa0]
    unsigned long n1;  // [bp-0x98]
    st_984b64_0 *v2;  // [bp-0x90]
    char v3;  // [bp-0x88]
    char v4;  // [bp-0x48]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (4 > a1 && !(n1 = 16, v2 = 0, !a0 || a1 != 3))
    {
        v8 = &a0->padding_0[a1 * 208];
        if ((char)v8->field_68 == 1)
        {
            if (*((char *)&v8->field_68 + 1))
            {
                n = sub_985d10(v8->field_60) & 0xffffffff;
                *(unsigned int *)&v0 = 1;
                v10 = sub_96eae0(v8->field_40, v8->field_48, v8->field_28, &v8->padding_6b[0x11], "quic kuquic ivquic key", 7, 0, 0, &v3, n, v0);
                if (!(unsigned int)v10 || !(v10 = sub_984d38(v8, &v8->padding_6b[0x11], n, &v2, &v4, &n1), (unsigned int)v10))
                    goto LABEL_984cec;
                v11 = a0;
                if (*(long long *)&a0->padding_8b[519])
                {
                    sub_a4bca0(*(long long *)&a0->padding_8b[519]);
                    v11 = a0;
                    *(unsigned long long *)&a0->padding_8b[519] = 0;
                }
                sub_a66ec0(&v11[1].padding_0[0x22], 16);
                v8->field_30 = v2;
                _memcpy((char *)&v8->field_68 + 2, &v4, n1);
                sub_a66ec0(&v4, 16);
                v8->field_50 = v8->field_50 + 1;
                v8->field_58 = 0;
                _memcpy(&v8->padding_6b[0x11], &v3, n);
            }
            else
            {
                v8->field_50 = v8->field_50 + 1;
                *(char *)&v8->field_68 = 2;
            }
            v10 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/quic/quic_record_shared.c", 377, "ossl_qrl_enc_level_set_key_update");
            v12 = 786691;
LABEL_984ce0:
            sub_a36abc(20, v12, 0);
            v10 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_record_shared.c", 372, "ossl_qrl_enc_level_set_key_update");
        v12 = 524550;
        goto LABEL_984ce0;
    }
LABEL_984cec:
    if (*(long long *)&g_10002b0 == v5)
        return v10;
    ___stack_chk_fail();
}
