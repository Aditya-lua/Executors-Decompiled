/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0404..0xaa0640 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa0404_1 {
    struct st_aa0404_0 *field_0;
    struct st_aa0404_1 *field_8;
} st_aa0404_1;

typedef struct st_aa0404_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_aa0404_0;

extern char g_10002b0;

st_aa0404_1 * sub_aa0404(long long a0, long long a1, long long a2, long long a3, st_aa0404_1 *a4, long long a5, unsigned int a6, long long a7)
{
    st_aa0404_1 *v5;  // x0
    st_aa0404_1 *v6;  // x19
    long long v7;  // x0
    unsigned long v8;  // x22
    long long v9;  // x0
    long long v10;  // x0
    st_aa0404_1 *v11;  // x20
    long long v12;  // x1
    st_aa0404_1 *v13;  // x19
    st_aa0404_0 *v0;  // [bp-0xb8]
    char v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    long long v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (a4)
    {
        v5 = sub_9c5520(sub_9c9c18(), a3);
        if (v5)
        {
            v6 = v5;
            if (v5->field_8)
                v7 = sub_9c1a94(v5->field_8);
            else
                v7 = 1;
            v8 = v6->field_0->field_0;
            v9 = sub_9e4290(a4);
            if (!sub_aa0e40(a1, a2, v6->field_0->field_8, v8, 1, v7, v9, &v1, a5, a7, v4))
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs12/p12_crpt.c", 55, "PKCS12_PBE_keyivgen_ex");
                v12 = 107;
                goto LABEL_aa05a4;
            }
            else if ((int)sub_a50728(a4) >= 1)
            {
                v10 = sub_a50728(a4);
                v11 = &v0;
                if (sub_aa0e40(a1, a2, v6->field_0->field_8, v8, 2, v7, v10, &v0, a5, a7, v4))
                    goto LABEL_aa05c0;
                sub_a368c8();
                sub_a369bc("crypto/pkcs12/p12_crpt.c", 64, "PKCS12_PBE_keyivgen_ex");
                v12 = 106;
LABEL_aa05a4:
                sub_a36abc(35, v12, 0);
                sub_9c9c24(v6);
                v13 = 0;
            }
            else
            {
                v11 = 0;
LABEL_aa05c0:
                sub_9c9c24(v6);
                v13 = sub_a4c694(a0, a4, 0, &v1, v11, a6);
                sub_a66ec0(&v1, 64);
                sub_a66ec0(&v0, 16);
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs12/p12_crpt.c", 41, "PKCS12_PBE_keyivgen_ex");
            sub_a36abc(35, 101, 0);
            v13 = 0;
        }
    }
    else
    {
        v13 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v13;
    ___stack_chk_fail();
}
