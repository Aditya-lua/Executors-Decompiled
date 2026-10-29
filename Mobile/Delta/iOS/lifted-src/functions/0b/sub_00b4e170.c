/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4e170..0xb4e3ac (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4e170_1 {
    char padding_0[259];
    unsigned long long field_103;
} st_b4e170_1;

typedef struct st_b4e170_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[268];
    char field_11c;
    char field_11d;
    char padding_11e[258];
    unsigned long long field_220;
} st_b4e170_0;

extern char g_10002b0;

int sub_b4e170(st_b4e170_0 *a0, unsigned long long a1, long long *a2, unsigned long a3, char *a4, long long a5)
{
    long long v9;  // x22
    char *v10;  // x21
    unsigned int v11;  // w0
    long long v12;  // x1
    unsigned long v13;  // x8
    st_b4e170_1 *v0;  // [bp-0xc0]
    unsigned long v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0xb0]
    unsigned long long v3;  // [bp-0xa8]
    char v4;  // [bp-0xa0]
    char v5;  // [bp-0x98]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a5;
    v10 = a4;
    v6 = *(long long *)&g_10002b0;
    v11 = sub_a2f9e0();
    if (!v11)
    {
        if (*(long long *)&g_10002b0 == v6)
            return v11;
        ___stack_chk_fail();
    }
    else if (a1)
    {
        if (63 >= a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/eddsa_sig.c", 401, "ed25519_sign");
            v12 = 106;
        }
        else if (*(long long *)(a0->field_8 + 80))
        {
            v13 = a0->field_11c;
            if (!(v13 >> 3 & 1))
            {
                if (!(v13 >> 1 & 1))
                    goto LABEL_b4e2ac;
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 446, "ed25519_sign");
                v12 = 243;
            }
            else if (v13 >> 1 & 1)
            {
                if (v9 == 64)
                    goto LABEL_b4e2ac;
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 440, "ed25519_sign");
                v12 = 166;
            }
            else if (sub_a40bcc(a0->field_0, "SHA512", 0, v10, v9, &v5, &v4) && v4 == 64)
            {
                v10 = &v5;
                v9 = 64;
LABEL_b4e2ac:
                v2 = a0->field_0;
                v3 = 0;
                v0 = &a0->field_11d;
                v1 = a0->field_220;
                if (sub_a0a75c(a1, v10, v9, a0->field_8 + 0x11))
                {
                    *a2 = 64;
                    if (*(long long *)&g_10002b0 == v6)
                        return 1;
                    ___stack_chk_fail();
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/eddsa_sig.c", 455, "ed25519_sign");
                    v12 = 175;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/eddsa_sig.c", 434, "ed25519_sign");
                v12 = 241;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/eddsa_sig.c", 405, "ed25519_sign");
            v12 = 0xdd;
        }
        sub_a36abc(57, v12, 0);
        if (*(long long *)&g_10002b0 == v6)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        *a2 = 64;
        if (*(long long *)&g_10002b0 == v6)
            return 1;
        ___stack_chk_fail();
    }
}
