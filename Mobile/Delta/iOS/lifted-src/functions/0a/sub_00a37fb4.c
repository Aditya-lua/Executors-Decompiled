/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa37fb4..0xa38220 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a37fb4_3 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a37fb4_1 *field_28;
    char padding_30[72];
    struct st_a37fb4_0 *field_78;
    char padding_80[8];
    long long field_88;
} st_a37fb4_3;

typedef struct st_a37fb4_0 {
    char padding_0[4];
    char field_4;
} st_a37fb4_0;

typedef struct st_a37fb4_1 {
    char padding_0[72];
    struct st_a37fb4_2 *field_48;
} st_a37fb4_1;

typedef struct st_a37fb4_2 {
    unsigned long long field_0;
} st_a37fb4_2;


unsigned int sub_a37fb4(st_a37fb4_3 *a0, char a1, unsigned long long *a2, unsigned long a3, unsigned long a4)
{
    st_a37fb4_0 *v2;  // x8
    char v3;  // x5
    char v4;  // w0
    unsigned long v5;  // x8
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        v7 = 300;
    }
    else if (a0->field_0 != 0x400)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/asymcipher.c", 305, "EVP_PKEY_decrypt");
        sub_a36abc(6, 151, 0);
        return 0xffffffff;
    }
    else if (*(long long *)&a0->padding_30[0])
    {
        sub_a36c8c();
        a0->field_28->field_48();
    }
    else
    {
        v2 = a0->field_78;
        if (v2)
        {
            v3 = *(long long *)&v2[33].padding_0[3];
            if (*(long long *)&v2[33].padding_0[3])
            {
                if (v2->field_4 >> 1 & 1)
                {
                    v4 = sub_a5bdac(a0->field_88);
                    if (!v4)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/asymcipher.c", 328, "EVP_PKEY_decrypt");
                        sub_a36abc(6, 163, 0);
                        return 0;
                    }
                    v5 = v4;
                    if (!a1)
                    {
                        *a2 = v5;
                        return 1;
                    }
                    if (v5 > *a2)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/asymcipher.c", 328, "EVP_PKEY_decrypt");
                        sub_a36abc(6, 155, 0);
                        return 0;
                    }
                    v3 = *(long long *)&a0->field_78[33].padding_0[3];
                }
                goto *((void *)(v3));
            }
        }
        sub_a368c8();
        v7 = 325;
    }
    sub_a369bc("crypto/evp/asymcipher.c", v7, "EVP_PKEY_decrypt");
    sub_a36abc(6, 150, 0);
    return 0xfffffffe;
}
