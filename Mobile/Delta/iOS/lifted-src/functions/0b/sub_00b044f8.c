/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb044f8..0xb046c8 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b044f8_0 {
    char padding_0[108];
    char field_6c;
    char padding_6d[331];
    struct st_b044f8_1 *field_1b8;
} st_b044f8_0;

typedef struct st_b044f8_1 {
    unsigned long long field_0;
} st_b044f8_1;


unsigned long long sub_b044f8(st_b044f8_0 *a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // w0
    unsigned long v4;  // x8
    unsigned int v5;  // w8
    long long v6;  // x1
    int v7;  // w0
    unsigned long long v9;  // 4116
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a5;
    v3 = (unsigned int)sub_a2f9e0();
    if (!v3)
    {
        return v3;
    }
    else if (v2)
    {
        if (v2 > a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_wrp.c", 250, "aes_wrap_cipher");
            sub_a36abc(57, 106, 0);
            return 0;
        }
        if (!a4)
            return 0;
        v4 = a0->field_6c;
        if (!(v4 >> 1 & 1))
        {
            if (v2 >= 16 && !(v2 & 7))
            {
                if (a1)
                    goto LABEL_b04620;
                v5 = 0xfffffff8;
                goto LABEL_b046bc;
            }
            else
            {
                sub_a368c8();
                v6 = 184;
                goto LABEL_b045e4;
            }
            goto LABEL_b045e4;
        }
        else
        {
            if (v2 & 7 && !(v4 & 1))
            {
                sub_a368c8();
                v6 = 190;
LABEL_b045e4:
                sub_a369bc("providers/implementations/ciphers/cipher_aes_wrp.c", v6, "aes_wrap_cipher_internal");
                sub_a36abc(57, 230, 0);
                v7 = -0x1;
            }
            else
            {
                if (a1)
                {
LABEL_b04620:
                    a0->field_1b8();
                }
                if (v4 & 1)
                    v2 = (unsigned int)v2 + 7 & 0xfffffff8;
                v5 = 8;
LABEL_b046bc:
                v7 = v5 + (unsigned int)v2;
                v9 = arm64g_calculate_condition(0x11, v5, v2 & 0xffffffff, 0);
                if (!(v9 & 1))
                    return v5 + (unsigned int)v2;
            }
            *(long long *)a2 = v7;
            return 1;
        }
    }
    else
    {
        *(unsigned long long *)a2 = 0;
        return 1;
    }
}
