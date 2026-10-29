/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe8c4..0xafead4 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afe8c4_0 {
    long long field_0;
    long long field_8;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
    unsigned long long field_20;
    long long field_28;
    unsigned int field_30;
} st_afe8c4_0;


unsigned long long sub_afe8c4(st_afe8c4_0 *a0, unsigned long long a1, unsigned long long *a2, unsigned long long a3, long long a4, long long a5)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    long long v6;  // x1
    unsigned long long v7;  // x25
    unsigned long long v8;  // x0
    unsigned long long v9;  // x24
    unsigned long long v10;  // x0
    unsigned long long v12;  // x20
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_aafbcc(a0->field_8);
    v4 = sub_a2f9e0(v3);
    if (!(unsigned int)v4)
        return v4;
    v5 = (int)v3;
    if ((unsigned int)v5)
    {
        if (!a1)
        {
            *a2 = v5;
            return 1;
        }
        if (v5 > a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 183, "rsa_encrypt");
            v6 = 106;
        }
        else if (a0->field_10 == 4)
        {
            v7 = sub_aafbcc(a0->field_8);
            v8 = sub_a6bf4c((int)v7, "providers/implementations/asymciphers/rsa_enc.c", 191);
            if (!v8)
                return v8;
            v9 = v8;
            if (a0->field_18 || (v10 = sub_a40ca8(a0->field_0, "SHA-1", 0), a0->field_18 = v10, v10))
            {
                v0 = a0->field_20;
                if (!sub_ab2acc(a0->field_0, v9, v7, a4, a5, a0->field_28, a0->field_30))
                {
                    sub_a6c2e4(v9, "providers/implementations/asymciphers/rsa_enc.c", 209);
                    return 0;
                }
                v12 = sub_aafbf4(v7, v9, a1, a0->field_8, 3);
                sub_a6c2e4(v9, "providers/implementations/asymciphers/rsa_enc.c", 214);
                goto LABEL_afea4c;
            }
            else
            {
                sub_a368c8(sub_a6c2e4(v9, "providers/implementations/asymciphers/rsa_enc.c", 196), "providers/implementations/asymciphers/rsa_enc.c", 196);
                sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 197, "rsa_encrypt");
                v6 = 786691;
            }
        }
        else
        {
            v12 = sub_aafbf4(a5, a4, a1, a0->field_8);
LABEL_afea4c:
            if (v12 >> 31 & 1)
                return v12;
            *a2 = v12 & 0xffffffff;
            return 1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 173, "rsa_encrypt");
        v6 = 158;
    }
    sub_a36abc(57, v6, 0);
    return 0;
}
