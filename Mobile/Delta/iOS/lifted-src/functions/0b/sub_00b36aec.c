/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36aec..0xb36d98 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36aec_0 {
    char padding_0[16];
    char field_10;
} st_b36aec_0;

typedef struct st_b36aec_1 {
    unsigned short field_0;
    char padding_2[22];
    long long field_18;
    long long field_20;
    char padding_28[8];
    long long field_30;
} st_b36aec_1;

typedef struct st_b36aec_2 {
    char padding_0[8];
    struct st_b36aec_0 *field_8;
    long long field_10;
    long long field_18;
    char padding_20[24];
    long long field_38;
    struct st_b36aec_1 *field_40;
} st_b36aec_2;

typedef struct st_b36aec_3 {
    char padding_0[88];
    long long field_58;
} st_b36aec_3;

extern long long g_dfe4c7;
extern char g_10002b0;

char sub_b36aec(st_b36aec_2 *a0, long long a1, st_b36aec_3 *a2, long long a3, st_b36aec_3 *a4, long long a5, long long a6, long long a7)
{
    st_b36aec_1 *v8;  // x26
    long long n;  // x21
    char v18;  // w0
    st_b36aec_0 *v10;  // x8
    char v11;  // x24
    unsigned long long v12;  // x1
    char v13;  // x20
    char v14;  // x19
    long long v15;  // x28
    long long v16;  // x21
    unsigned long v17;  // x8
    unsigned long long v0;  // [bp-0x1d8]
    unsigned short v1;  // [bp-0x1ca]
    char v2;  // [bp-0x1c8]
    char v3;  // [bp-0x120]
    char v4;  // [bp-0xb0]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = a0->field_40;
    n = v8->field_30;
    v2 = 0;
    if (!sub_a2a984(a3, a2, a2->field_58, &v3, &v2, 112))
        goto LABEL_b36c10;
    if (!a0->field_8)
    {
        v11 = 0;
        v12 = n;
        goto LABEL_b36c04;
    }
    v2 = 0;
    if (sub_a2a984(a5, a4, a4->field_58, &(&v3)[n], &v2, 112 - n))
    {
        v10 = a0->field_8;
        if (!v10 || !(v10->field_10 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ecx_kem.c", 152, "ecx_pubkey");
            sub_a36abc(57, 220, 0);
            goto LABEL_b36bd8;
        }
        v11 = (char)(v10 + 1);
        v12 = n * 2;
LABEL_b36c04:
        v15 = v12 + n;
        if ((unsigned long long)v15 > 168)
        {
LABEL_b36c10:
            v13 = 0;
            goto LABEL_b36c14;
        }
        else
        {
            v0 = v12;
            ___memcpy_chk(&v2, a6, n, 168);
            _memcpy(&(&v2)[n], a7, n);
            if (a0->field_8)
                _memcpy(&(&v2)[2 * n], v11, n);
            v13 = sub_a64d0c(a0->field_38, v8->field_18, a0->field_10, a0->field_18);
            if (v13)
            {
                v16 = v8->field_20;
                if (65 <= (unsigned long long)v16)
                    goto LABEL_b36c14;
                v17 = v8->field_0;
                v1 = (unsigned short)((v17 & 0xff00) >> 8) | (unsigned short)v17 * 0x100 & 0xff00;
                if (sub_a64954(v13, &v4, v16, 0, 0, &g_dfe4c7, &v1, 2, "eae_prk", &v3, v0))
                {
                    v18 = sub_a64b24(v13, a1, v16, &v4, v16, &g_dfe4c7, &v1, 2, "shared_secret", &v2, v15);
                    sub_a66ec0(&v4, v16);
                    if (!v18)
                        goto LABEL_b36c14;
                    v14 = 1;
                }
                else
                {
                    sub_a66ec0(&v4, v16);
LABEL_b36c14:
                    v14 = 0;
                }
            }
            else
            {
                v14 = 0;
            }
        }
    }
    else
    {
LABEL_b36bd8:
        v13 = 0;
        v14 = 0;
    }
    sub_a66ec0(&v3);
    sub_a53588(v13);
    if (*(long long *)&g_10002b0 == v5)
        return v14;
    ___stack_chk_fail();
}
