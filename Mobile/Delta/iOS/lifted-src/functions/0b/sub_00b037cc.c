/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb037cc..0xb0391c (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b037cc_0 {
    unsigned long long field_0;
} st_b037cc_0;

typedef struct st_b037cc_2 {
    struct st_b037cc_0 *field_0;
} st_b037cc_2;

typedef struct st_b037cc_1 {
    char padding_0[72];
    unsigned long long field_48;
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[59];
    struct st_b037cc_2 *field_a8;
    char padding_b0[688];
    unsigned int field_360;
    char padding_364[12];
    uint128_t field_370;
} st_b037cc_1;


int sub_b037cc(st_b037cc_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, long long a4, unsigned long a5, unsigned int a6)
{
    unsigned long long v2;  // 4109
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    a0->field_370 = 0;
    a0->field_6c = a0->field_6c & 0xfffffffd | (char)(__ROL__(a6, 1)) & 2 & 3;
    if (a3)
    {
        if (a0->field_50 != a4)
        {
            v2 = arm64g_calculate_condition(130, a4 - 16, 16, 0);
            if (!(v2 & 1))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 0x77, "aes_ocb_init");
                sub_a36abc(57, 109, 0);
                return 0;
            }
            a0->field_50 = a4;
        }
        if (!sub_b5c520(a0, a3, a4))
            return 0;
        a0->field_360 = 1;
    }
    if (a1)
    {
        if (a0->field_48 == a2)
            (*(long long *)a0->field_a8)();
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 130, "aes_ocb_init");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
