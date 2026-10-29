/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb20d98..0xb20f7c (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b20d98_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_b20d98_0;

extern unsigned long long g_a774bc;
extern long long g_b22bf0;
extern long long g_b22bf4;

unsigned long long sub_b20d98(st_b20d98_0 *a0, long long a1, unsigned long long a2, unsigned long a3, unsigned long long a4, unsigned long long a5, long long a6)
{
    st_b20d98_0 *v6;  // x22
    unsigned long long v7;  // x19
    unsigned long v8;  // x5
    long long v9;  // x0
    long long v10;  // x2
    unsigned long long v11;  // x20
    unsigned long long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3)
    {
LABEL_b20db4:
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1718, "rsapss_to_PKCS1_pem_encode");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    if (!(a4 & 1))
    {
        if (!(a4 >> 1 & 1))
            goto LABEL_b20db4;
        if (!a2)
            goto LABEL_b20f20;
        v6 = a0;
        if (sub_ab1cb0(a2, 0xf000) != 0x1000)
            goto LABEL_b20f4c;
        v7 = sub_afd760(v6->field_0, a1);
        if (!v7 || a5 && !sub_a76e48(v6 + 1, a5, a6))
            goto LABEL_b20f68;
        v8 = v6->field_10;
        v0 = 0;
        v1 = 0;
        v9 = &g_b22bf4;
        v10 = "RSA-PSS PUBLIC KEY";
        goto LABEL_b20f00;
    }
    else
    {
        if (!a2)
        {
LABEL_b20f20:
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
            sub_a36abc(57, 0xc0102, 0);
            return 0;
        }
        v6 = a0;
        if (sub_ab1cb0(a2, 0xf000) != 0x1000)
        {
LABEL_b20f4c:
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1226, "key2any_encode");
            sub_a36abc(57, 0x80106, 0);
            return 0;
        }
        v7 = sub_afd760(v6->field_0, a1);
        if (v7 && (!a5 || sub_a76e48(v6 + 1, a5, a6)))
        {
            v1 = v6 + 1;
            v8 = v6->field_10;
            v0 = &g_a774bc;
            v1 = v6 + 1;
            v9 = &g_b22bf0;
            v10 = "RSA-PSS PRIVATE KEY";
LABEL_b20f00:
            v11 = (int)sub_a9c9b0(v9, v6, v10, v7, a2, v8, 0, 0, v0, v1) > 0;
        }
        else
        {
LABEL_b20f68:
            v11 = 0;
        }
        sub_9d3c28(v7);
        return v11;
    }
}
