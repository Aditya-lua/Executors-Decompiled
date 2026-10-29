/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1f978..0xb1fb54 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b1f978_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_b1f978_0;

extern unsigned long long g_a774bc;
extern long long g_b22bf0;
extern long long g_b22bf4;

unsigned long long sub_b1f978(st_b1f978_0 *a0, long long a1, unsigned long long a2, unsigned long a3, unsigned long long a4, unsigned long long a5, long long a6)
{
    long long v4;  // x2
    long long v5;  // x1
    st_b1f978_0 *v6;  // x22
    unsigned long long v7;  // x19
    unsigned long long v12;  // x20
    unsigned long long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3)
    {
LABEL_b1f994:
        sub_a368c8();
        v4 = "rsa_to_RSA_pem_encode";
        v5 = 1694;
    }
    else if (!(a4 & 1))
    {
        if (!(a4 >> 1 & 1))
            goto LABEL_b1f994;
        if (!a2)
            goto LABEL_b1faa0;
        v6 = a0;
        if (sub_ab1cb0(a2, 0xf000))
            goto LABEL_b1fa84;
        v7 = sub_afd760(v6->field_0, a1);
        if (!v7)
        {
            sub_9d3c28(v7);
            return 0;
        }
        else if (!a5 || sub_a76e48(v6 + 1, a5, a6))
        {
            v0 = 0;
            v1 = 0;
            v7 = v7;
            v12 = (int)sub_a9c9b0(&g_b22bf4, v6, "RSA PUBLIC KEY", v7, a2, v6->field_10, 0, 0, v0, v1) > 0;
            sub_9d3c28(v7);
            return v12;
        }
        goto LABEL_b1fb40;
    }
    else
    {
        if (!a2)
        {
LABEL_b1faa0:
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
            sub_a36abc(57, 0xc0102, 0);
            return 0;
        }
        v6 = a0;
        if (sub_ab1cb0(a2, 0xf000))
        {
LABEL_b1fa84:
            sub_a368c8();
            v4 = "key2any_encode";
            v5 = 1226;
        }
        else
        {
            v7 = sub_afd760(v6->field_0, a1);
            if (v7 && (!a5 || sub_a76e48(v6 + 1, a5, a6)))
            {
                v0 = &g_a774bc;
                v1 = v6 + 1;
                v1 = v6 + 1;
                v12 = (int)sub_a9c9b0(&g_b22bf0, v6, "RSA PRIVATE KEY", v7, a2, v6->field_10, 0, 0, v0, v1) > 0;
                sub_9d3c28(v7);
                return v12;
            }
LABEL_b1fb40:
            sub_9d3c28(v7);
            return 0;
        }
    }
    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", v5, v4);
    sub_a36abc(57, 0x80106, 0);
    return 0;
}
