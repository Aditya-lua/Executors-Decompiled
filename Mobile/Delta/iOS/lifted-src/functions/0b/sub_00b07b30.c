/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb07b30..0xb07c28 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b07b30_0 {
    struct st_b07b30_0 *field_0;
} st_b07b30_0;


st_b07b30_0 ** sub_b07b30(unsigned long a0, st_b07b30_0 **a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    long long v9;  // x19
    long long v10;  // x20
    unsigned long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (*a1)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        if (!sub_a6fbc4(a1, "keylen"))
        {
LABEL_b07b80:
            if (!sub_a6fbc4(a1, "ivlen"))
                return 1;
            if (sub_a70ef8())
            {
                if (v0 == 16)
                    return 1;
                v9 = 109;
                v10 = 150;
            }
            else
            {
                v9 = 103;
                v10 = 146;
            }
        }
        else if (sub_a70ef8())
        {
            if (v0 == 32)
                goto LABEL_b07b80;
            v9 = 105;
            v10 = 139;
        }
        else
        {
            v9 = 103;
            v10 = 135;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_chacha20.c", v10, "chacha20_set_ctx_params");
        sub_a36abc(57, v9, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
