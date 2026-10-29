/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f9f8..0xa4fb38 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f9f8_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[48];
    struct st_a4f9f8_1 *field_48;
} st_a4f9f8_0;

typedef struct st_a4f9f8_1 {
    unsigned long long field_0;
} st_a4f9f8_1;


unsigned long long sub_a4f9f8(st_a4f9f8_0 **a0, unsigned long long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned int v19;  // w0
    unsigned long long v20;  // 4116
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_a4f9f8_0 *v14;  // x8
    long long v15;  // w8
    unsigned long long v16;  // w19
    long long v17;  // x20
    long long v18;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    if (!a0 || (v14 = *a0, !v14))
    {
LABEL_a4fac8:
        v16 = 0xffffffff;
        goto LABEL_a4facc;
    }
    if (v14->field_48)
        v14->field_48();
    if (!(v14->field_10 >> 24 & 1))
    {
        v15 = (unsigned int)v14->field_10 & 0xfffff & 0xffff0007;
        v16 = 0xfffffffe;
        v17 = 107;
        v18 = 213;
        if (v15 > 0x10000)
        {
            if (v15 != 65537)
            {
                if (v15 == 65538)
                    goto LABEL_a4fac0;
                if (v15 != 65539)
                    goto LABEL_a4fab8;
            }
        }
        else
        {
            if (v15 != 6)
            {
                if (v15 != 7)
                {
LABEL_a4fab8:
                    if (sub_a4fb38() >> 31 & 1)
                        goto LABEL_a4fac8;
LABEL_a4fac0:
                    v16 = 1;
                    goto LABEL_a4fb00;
                }
            }
            else
            {
                v16 = (unsigned int)sub_a50060();
LABEL_a4fb2c:
                if (0 < v16)
                    goto LABEL_a4fb00;
LABEL_a4facc:
                v17 = 122;
                v18 = 215;
            }
        }
    }
    else if (*(long long *)&v14[1].padding_18[16])
    {
        v0 = 0;
        v1 = a1;
        v19 = sub_a50104();
        v16 = v19;
        v20 = arm64g_calculate_condition(0x11, v19, 2, 0);
        if (!(v20 & 1))
            goto LABEL_a4fa30;
        goto LABEL_a4fb2c;
    }
    else
    {
        v16 = 0xfffffffe;
LABEL_a4fa30:
        v17 = 107;
        v18 = 213;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/evp_lib.c", v18, "evp_cipher_asn1_to_param_ex");
    sub_a36abc(6, v17, 0);
LABEL_a4fb00:
    if (0 > v16)
        return 0xffffffff;
    return v16;
}
