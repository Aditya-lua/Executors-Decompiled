/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01a34..0xb01b5c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01a34_2 {
    char padding_0[8];
    struct st_b01a34_3 *field_8;
    char padding_10[32];
    long long field_30;
    char field_38;
    char padding_39[111];
    unsigned long long field_a8;
    unsigned int field_b0;
    char padding_b4[260];
    char field_1b8;
} st_b01a34_2;

typedef struct st_b01a34_1 {
    unsigned long long field_0;
} st_b01a34_1;

typedef struct st_b01a34_3 {
    struct st_b01a34_1 *field_0;
} st_b01a34_3;

typedef struct st_b01a34_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_b01a34_0;


st_b01a34_0 * sub_b01a34(st_b01a34_2 *a0, st_b01a34_0 *a1, long long n, st_b01a34_0 *a3, unsigned long a4, unsigned long a5, char a6)
{
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    a0->field_1b8 = a0->field_1b8 & 0xfffffffe | a6 & 1;
    if (a1)
    {
        if (a0->field_30 == n)
        {
            _memcpy(&a0->field_38, a1, n);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", 104, "ossl_aes_gcm_siv_init");
            sub_a36abc(57, 105, 0);
            return 0;
        }
    }
    if (!a3)
    {
        (*(long long *)a0->field_8)();
    }
    else if (a4 == 12)
    {
        v3 = a3->field_0;
        a0->field_b0 = a3->field_8;
        a0->field_a8 = v3;
        (*(long long *)a0->field_8)();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", 111, "ossl_aes_gcm_siv_init");
        sub_a36abc(57, 109, 0);
        return 0;
    }
}
