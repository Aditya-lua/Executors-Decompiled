/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa1c50..0xaa1e88 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa1c50_0 {
    char padding_0[8];
    struct st_aa1c50_1 *field_8;
} st_aa1c50_0;

typedef struct st_aa1c50_1 {
    long long field_0;
    long long field_8;
} st_aa1c50_1;

extern char g_10002b0;

unsigned long long * sub_aa1c50(st_aa1c50_0 *a0, long long a1, long long a2)
{
    long long v8;  // x0
    long long *v9;  // x0
    unsigned long long *v10;  // x22
    long long v11;  // x1
    long long *v12;  // x0
    long long v0;  // [bp-0x98]
    char v1;  // [bp-0x90]
    unsigned long v2;  // [bp-0x88]
    char v3;  // [bp-0x7c], Other Possible Types: unsigned int
    char v4;  // [bp-0x78]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (a0->field_8)
    {
        sub_9d0460(a0->field_8->field_0, &v1, 0);
        sub_9cf830(&v0, 0, 0, v1);
        if (sub_a99eac(v0) == 162)
        {
            v8 = sub_9c9ef4();
            v9 = sub_9c5520(v8, *(long long *)(v1 + 8));
            if (v9)
            {
                v10 = v9;
                sub_9cf830(&v2, 0, 0, v9[1]);
                if (sub_aa15f8(a0, a1, a2, &v4, &v3, sub_a41564(sub_a99eac(v2)), 0, 0))
                {
                    sub_9c9f00(v10);
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/pkcs12/p12_mutl.c", 341, "PKCS12_verify_mac");
                    sub_a36abc(35, 109, 0);
                    sub_9c9f00(v10);
                    if (*(long long *)&g_10002b0 == v5)
                        return 0;
                    ___stack_chk_fail();
                }
LABEL_aa1d78:
                sub_9d0460(a0->field_8->field_0, 0, &v2);
                if (v3 == sub_9c7b68(v2))
                {
                    v12 = !sub_a66f20(&v4, sub_c4c40(v2), v3);
                    if (*(long long *)&g_10002b0 == v5)
                        return v12;
                    ___stack_chk_fail();
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v5)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs12/p12_mutl.c", 334, "PKCS12_verify_mac");
                v11 = 524556;
            }
        }
        else
        {
            if (sub_aa15f8(a0, a1, a2, &v4, &v3, 0, 0, 0))
                goto LABEL_aa1d78;
            sub_a368c8();
            sub_a369bc("crypto/pkcs12/p12_mutl.c", 348, "PKCS12_verify_mac");
            v11 = 109;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_mutl.c", 321, "PKCS12_verify_mac");
        v11 = 108;
    }
    sub_a36abc(35, v11, 0);
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
