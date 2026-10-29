/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c2e0..0xa5c4a4 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a5c2e0(unsigned long a0, long long a1, unsigned int *a2, long long a3, long long a4, long long a5)
{
    unsigned long v6;  // x19
    unsigned long v7;  // x22
    unsigned long v8;  // x0
    unsigned long v9;  // x25
    unsigned long v10;  // x0
    unsigned int v11;  // w0
    unsigned long v0;  // [bp-0xa8]
    unsigned int v1;  // [bp-0x9c]
    char v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = 0;
    *a2 = 0;
    if (sub_a50db0())
    {
        if (sub_a3ff7c(a0, &v2, &v1))
            goto LABEL_a5c3d0;
        v6 = 0;
        v7 = 0;
        goto LABEL_a5c458;
    }
    else
    {
        v8 = sub_a3f728();
        if (v8)
        {
            v9 = v8;
            if (sub_a40520())
                v10 = v9;
            else
                v10 = a0;
            v11 = sub_a3ff7c(v10);
            sub_a3f73c(v9);
            if (v11)
            {
LABEL_a5c3d0:
                v0 = sub_a5bdac(a3);
                v7 = sub_a5d5a8(a4, a3, a5);
                if (v7 && (int)sub_a5f634(v7) >= 1 && (int)sub_a5e2fc(v7, sub_a2d030(a0)) >= 1 && (int)sub_a5fd3c(v7, a1, &v0, &v2, v1) >= 1)
                {
                    *a2 = v0;
                    v6 = 1;
                }
                else
                {
                    v6 = 0;
                }
LABEL_a5c458:
                sub_a5d6b0(v7);
            }
            else
            {
                v6 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/p_sign.c", 36, "EVP_SignFinal_ex");
            sub_a36abc(6, 0x80006, 0);
            v6 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
