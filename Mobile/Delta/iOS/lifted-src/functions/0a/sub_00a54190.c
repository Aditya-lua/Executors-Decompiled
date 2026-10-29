/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54190..0xa54248 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54190_1 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a54190_0 *field_28;
    struct st_a54190_1 *field_30;
} st_a54190_1;

typedef struct st_a54190_0 {
    char padding_0[56];
    unsigned long long field_38;
} st_a54190_0;


unsigned int sub_a54190(st_a54190_1 *a0, st_a54190_1 *a1, unsigned long a2, st_a54190_1 *a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_0 != 0x1000)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/kem.c", 234, "EVP_PKEY_encapsulate");
            sub_a36abc(6, 151, 0);
            return 0xffffffff;
        }
        else if (!a0->field_30)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/kem.c", 239, "EVP_PKEY_encapsulate");
            sub_a36abc(6, 150, 0);
            return 0xfffffffe;
        }
        else if (a1 && !a3)
        {
            a0 = 0;
        }
        else
        {
            goto *((void *)(a0->field_28->field_38));
        }
    }
    return (unsigned int)a0;
}
