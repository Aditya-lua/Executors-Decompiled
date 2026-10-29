/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54258..0xa5431c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54258_1 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a54258_0 *field_28;
    struct st_a54258_1 *field_30;
} st_a54258_1;

typedef struct st_a54258_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_a54258_0;


st_a54258_1 * sub_a54258(st_a54258_1 *a0, st_a54258_1 *a1, st_a54258_1 *a2, st_a54258_1 *a3, st_a54258_1 *a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (!a3)
    {
        return 0;
    }
    else if (a4)
    {
        if (!a1 && !a2)
            return 0;
        if (a0->field_0 != 0x2000)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/kem.c", 273, "EVP_PKEY_decapsulate");
            sub_a36abc(6, 151, 0);
            return 0xffffffff;
        }
        else if (a0->field_30)
        {
            goto *((void *)(a0->field_28->field_48));
        }
        else
        {
            sub_a368c8(0);
            sub_a369bc("crypto/evp/kem.c", 278, "EVP_PKEY_decapsulate");
            sub_a36abc(6, 150, 0);
            return 0xfffffffe;
        }
    }
    else
    {
        return 0;
    }
}
