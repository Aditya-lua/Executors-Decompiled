/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0be90..0xb0c1dc (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0be90_0 {
    char padding_0[8];
    struct st_b0be90_1 *field_8;
} st_b0be90_0;

typedef struct st_b0be90_2 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[68];
    char field_6c;
    char padding_6d[59];
    struct st_b0be90_0 *field_a8;
    char padding_b0[8];
    long long field_b8;
} st_b0be90_2;

typedef struct st_b0be90_1 {
    unsigned long long field_0;
} st_b0be90_1;

extern char g_10002b0;

char sub_b0be90(st_b0be90_2 *a0, char a1, unsigned long long *a2, unsigned long long a3, long long a4, unsigned long long n)
{
    char v4;  // w0
    char v5;  // w23
    char v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    *a2 = 0;
    v4 = sub_a2f9e0();
    if (v4)
    {
        if (n > a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_tdes_wrap.c", 138, "tdes_wrap_cipher");
            sub_a36abc(57, 106, 0);
LABEL_b0bf20:
            v4 = 0;
        }
        else
        {
            if (n & 0xffffffffc0000007)
                goto LABEL_b0bf20;
            if (a0->field_6c >> 1 & 1)
            {
                v5 = (unsigned int)n + 16;
                if (a1)
                {
                    _memmove(a1 + 8, a4, n);
                    if (sub_abe2cc(a4, n, &v0))
                    {
                        *(unsigned long long *)(a1 + n + 8) = v0;
                        sub_a66ec0(&v0, 20);
                        if ((int)sub_aa8658(a0->field_b8, &a0->field_20, 8, 0) >= 1)
                        {
                            *(unsigned long long *)a1 = a0->field_20;
                            a0->field_a8->field_8();
                        }
                    }
                    v5 = 0;
                }
            }
            else if (24 > n)
            {
                v5 = 0xffffffff;
            }
            else if (a1)
            {
                a0->field_20 = 369832251558649162;
                a0->field_a8->field_8();
            }
            else
            {
                v5 = (unsigned int)n - 16;
            }
            if (v5 < 1)
                goto LABEL_b0bf20;
            *a2 = v5;
            v4 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
