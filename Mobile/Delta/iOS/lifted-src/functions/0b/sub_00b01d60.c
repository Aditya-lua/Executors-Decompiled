/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01d60..0xb01ef4 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01d60_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[88];
    char field_88;
    char padding_89[15];
    char field_98;
    char padding_99[287];
    char field_1b8;
} st_b01d60_0;


unsigned long long sub_b01d60(st_b01d60_0 *a0, char a1, long long a2, char n)
{
    unsigned long long v2;  // x19
    char v3;  // x0
    unsigned long long v4;  // x9
    unsigned long v5;  // x8
    st_b01d60_0 *v6;  // x19
    char v7;  // w0
    unsigned int v8;  // w8
    char v9;  // x0
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        v5 = a0->field_1b8;
        if (!(v5 & 1))
        {
            if (!(v5 >> 2 & 1) && !sub_b022c0())
                return 0;
            v6 = a0;
            v7 = sub_a66f20(&a0->field_88, &v6->field_98, 16);
            v8 = v6->field_1b8;
            if (!v7)
                v9 = (v8 * 0x80000000 | v8 >> 1) & 0x80000001 & 1;
            else
                v9 = 0;
            return v9;
        }
        else
        {
            if (!(v5 >> 2 & 1))
            {
                v10 = sub_b01f80();
                if (!(unsigned int)v10)
                    return v10;
                v5 = a0->field_1b8;
            }
            return __ROL__((unsigned int)v5, 30) & 0xc0000001 & 1;
        }
    }
    else if (!a1)
    {
        if (n)
        {
            v2 = n + a0->field_28 + 15 & 0xfffffffffffffff0;
            if (v2 > 0x1000000000)
                return 0;
            v3 = sub_a6c1b4(a0->field_10, v2, "providers/implementations/ciphers/cipher_aes_gcm_siv_hw.c", 129);
            if (!v3)
                return v3;
            a0->field_10 = v3;
            _memcpy(v3 + a0->field_28, a2, n);
            v4 = a0->field_28 + n;
            a0->field_28 = v4;
            if (v2 > v4)
                _bzero(a0->field_10 + v4);
        }
        else
        {
            sub_a6c2e4(a0->field_10, "providers/implementations/ciphers/cipher_aes_gcm_siv_hw.c", 0x77);
            a0->field_10 = 0;
            a0->field_28 = 0;
        }
        return 1;
    }
    else if (!(a0->field_1b8 & 1))
    {
        return sub_b022c0();
    }
    else
    {
        return sub_b01f80();
    }
}
