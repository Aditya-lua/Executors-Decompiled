/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4d408..0xa4d5dc (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4d408_0 {
    char padding_0[272];
    struct st_a4d408_1 *field_110;
} st_a4d408_0;

typedef struct st_a4d408_2 {
    struct st_a4d408_0 *field_0;
    char padding_8[96];
    char field_68;
} st_a4d408_2;

typedef struct st_a4d408_1 {
    char field_0;
} st_a4d408_1;

extern char g_10002b0;

char sub_a4d408(st_a4d408_2 *a0, char a1)
{
    st_a4d408_0 *v8;  // x21
    char v10;  // w0
    char v0;  // [bp-0x90]
    char v1;  // [bp-0x80]
    char v2;  // [bp-0x70]
    char v3;  // [bp-0x60]
    char v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (*(long long *)&a0->field_0->padding_0[120])
    {
        v3 = 0;
        v4 = 0;
        v1 = 0;
        v2 = 0;
        v0 = 0;
        if (sub_a50904(a0) != a1)
        {
            v8 = a0->field_0;
            if (!v8 || !v8->field_110)
                return sub_a4d4dc();
            sub_a79f54(sub_9ffdd8(v8));
            v8->field_110();
            return sub_a4d4dc();
        }
LABEL_a4d52c:
        v10 = 1;
        goto LABEL_a4d5a0;
    }
    else
    {
        if ((char)a0->field_0->padding_0[16] >= 0)
        {
            if (sub_a50904(a0) == a1)
                goto LABEL_a4d52c;
            if (a1 < 1 || !(a0->field_0->padding_0[16] >> 3 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1410, "EVP_CIPHER_CTX_set_key_length");
                sub_a36abc(6, 130, 0);
                v10 = 0;
            }
            else
            {
                *(unsigned int *)&a0->field_68 = a1;
                v10 = 1;
            }
LABEL_a4d5a0:
            if (*(long long *)&g_10002b0 == v5)
                return v10;
        }
        ___stack_chk_fail();
    }
}
