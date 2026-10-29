/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb178d4..0xb17a4c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b178d4_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_b178d4_0;

extern unsigned int g_a774bc;
extern long long g_b22f00;
extern long long g_b22f04;

unsigned int sub_b178d4(st_b178d4_0 *a0, unsigned long a1, unsigned int a2, unsigned long a3, unsigned long long a4, unsigned int a5, long long a6)
{
    st_b178d4_0 *v5;  // x21
    unsigned int v6;  // x19
    unsigned long v7;  // x5
    long long v8;  // x0
    long long v9;  // x2
    unsigned int v10;  // x20
    unsigned int v0;  // [bp-0x50]
    unsigned int v1;  // [bp-0x48], Other Possible Types: unsigned long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3)
    {
LABEL_b178f0:
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1499, "sm2_to_type_specific_no_pub_pem_encode");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    if (!(a4 & 1))
    {
        if (!((unsigned int)a4 & 132))
            goto LABEL_b178f0;
        if (!a2)
            goto LABEL_b17a0c;
        v5 = a0;
        v6 = sub_afd760(a0->field_0);
        if (!v6)
            goto LABEL_b17a38;
        v7 = v5->field_10;
        v0 = 0;
        v1 = 0;
        v8 = &g_b22f04;
        v9 = "SM2 PARAMETERS";
        goto LABEL_b179ec;
    }
    else
    {
        if (!a2)
        {
LABEL_b17a0c:
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
            sub_a36abc(57, 0xc0102, 0);
            return 0;
        }
        v5 = a0;
        v6 = sub_afd760(a0->field_0);
        if (v6 && (!a5 || sub_a76e48(v5 + 1, a5, a6)))
        {
            v1 = (unsigned int)(v5 + 1);
            v7 = v5->field_10;
            v0 = (unsigned int)&g_a774bc;
            v1 = v5 + 1;
            v8 = &g_b22f00;
            v9 = "SM2 PRIVATE KEY";
LABEL_b179ec:
            v10 = (int)sub_a9c9b0(v8, v5, v9, v6, a2, v7, 0, 0, v0, v1) > 0;
        }
        else
        {
LABEL_b17a38:
            v10 = 0;
        }
        sub_9d3c28(v6);
        return v10;
    }
}
