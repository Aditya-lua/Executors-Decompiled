/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03f6c..0xb040c0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03f6c_0 {
    char padding_0[16];
    struct st_b03f6c_1 *field_10;
    struct st_b03f6c_1 *field_18;
} st_b03f6c_0;

typedef struct st_b03f6c_1 {
    unsigned long long field_0;
} st_b03f6c_1;

typedef struct st_b03f6c_2 {
    char padding_0[4];
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
    char padding_10[64];
    unsigned int field_50;
    char padding_54[20];
    struct st_b03f6c_0 *field_68;
} st_b03f6c_2;


char sub_b03f6c(st_b03f6c_2 *a0, char a1)
{
    char v4;  // x0
    long long v5;  // x1
    unsigned long v0;  // [bp-0x30]
    char v1;  // [bp-0x24]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a1)
    {
        return 1;
    }
    else if (*(long long *)a1)
    {
        v4 = sub_a6fbc4(a1, "tag");
        if (v4)
        {
            if (a0->field_4 & 1)
            {
                return 1;
            }
            else if (*(int *)(v4 + 8) == 5)
            {
                a0->field_68->field_18();
            }
            else
            {
                sub_a368c8();
                v5 = 206;
            }
        }
        else
        {
            if (sub_a6fbc4(a1, "speed"))
            {
                if (sub_a6ffcc())
                    a0->field_68->field_10();
                sub_a368c8();
                v5 = 213;
            }
            else
            {
                if (sub_a6fbc4(a1, "keylen"))
                {
                    if (sub_a70ef8())
                    {
                        if (v0 == a0->field_8)
                        {
                            a0->field_50 = 0xffffffff;
                            return 1;
                        }
                        return 0;
                    }
                    sub_a368c8();
                    v5 = 223;
                }
                else
                {
                    a0->field_50 = 0xffffffff;
                    return 1;
                }
            }
        }
        sub_a369bc("providers/implementations/ciphers/cipher_aes_siv.c", v5, "aes_siv_set_ctx_params");
        sub_a36abc(57, 103, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
