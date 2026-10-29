/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9c5d4..0xa9c9b0 (988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long * sub_a9c5d4(unsigned long long *a0, unsigned long long *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long long *a6, unsigned long a7)
{
    unsigned long long *v7;  // x0
    unsigned long long len;  // x0
    unsigned long long v9;  // 4120
    long long v10;  // x0
    long long v11;  // x1
    unsigned long long *v0;  // [bp-0x4c8]
    char v1;  // [bp-0x4c0]
    char v2;  // [bp-0x4b0]
    char v3;  // [bp-0x470]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v0 = 0;
    if (a6)
    {
        v7 = sub_a509dc(a6);
        if (v7 && sub_a50728(a6) && 16 >= (int)sub_a50728(a6))
        {
            len = _strlen(v7);
            v9 = arm64g_calculate_condition(130, len + sub_a50728(a6) * 2 - 989, 1026, 0);
            if (v9 & 1)
                goto LABEL_a9c6a8;
        }
        sub_a368c8();
        sub_a369bc("crypto/pem/pem_lib.c", 344, "PEM_ASN1_write_bio_internal");
        v10 = 9;
        v11 = 113;
    }
    else
    {
LABEL_a9c6a8:
        if (!a0 && !a1)
        {
            sub_a368c8();
            sub_a369bc("crypto/pem/pem_lib.c", 350, "PEM_ASN1_write_bio_internal");
            v10 = 15;
            v11 = 109;
        }
        else if (a0)
        {
            a0();
        }
        else
        {
            a1();
        }
    }
    sub_a36abc(v10, v11, 0);
    sub_a66ec0(&v2, 64);
    sub_a66ec0(&v1, 16);
    sub_a4bca0(0);
    sub_a66ec0(&v3, 0x400);
    sub_a6c4e8(0, 0, "crypto/pem/pem_lib.c", 422);
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
