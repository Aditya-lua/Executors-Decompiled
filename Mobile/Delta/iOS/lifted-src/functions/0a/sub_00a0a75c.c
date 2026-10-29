/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0a75c..0xa0aa1c (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a0a75c(long long a0, long long a1, long long a2, long long a3, long long a4, unsigned long long a5, unsigned long long a6, unsigned int a7, unsigned long a8, unsigned long a9, long long a10, long long a11)
{
    unsigned long v10;  // x19
    long long v11;  // x20
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long v16;  // x21
    char v0;  // [bp-0x1d4]
    char v1;  // [bp-0x1d0]
    char v2[160];  // [bp-0x190]
    char v3;  // [bp-0xf0]
    char v4;  // [bp-0xef]
    char v5;  // [bp-0xb0]
    char v6;  // [bp-0x91]
    char v7;  // [bp-0x90]
    unsigned long v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]

    v9 = &a8;
    v8 = *(long long *)&g_10002b0;
    v10 = sub_a40ca8(a10, "SHA512", a11);
    v11 = sub_a3f728(v10, "SHA512", a11);
    if (!a8)
        a9 = 0;
    if ((!a7 || a9) && ((unsigned int)a5 || !a9))
    {
        if (v10)
        {
            v12 = arm64g_calculate_condition(20, a8, 0, 0);
            v13 = arm64g_calculate_condition(4, (v12 & 1 ? v11 : 0x40000000), 0, 0);
        }
        else
        {
            v14 = arm64g_calculate_condition(20, a8, 0, 0);
            v15 = arm64g_calculate_condition(0, (v14 & 1 ? v11 : 0x40000000), 0, 0);
            if (!(v15 & 1) && sub_a3fe04(v11, v10, 0) && sub_a3fe10(v11, a4, 32) && sub_a3ff7c(v11, &v5, &v0) && !(v5 &= 248, v6 = 64 | (64 | v6 & 63) & 63, strcpy(v2, "SigEd25519 no Ed25519 collisions"), !sub_a3fe04(v11, v10, 0) || (unsigned int)a5 && (0xff < a9 || (v3 = (unsigned int)a6 != 0, v4 = a9, !sub_a3fe10(v11, v2, 32) || !sub_a3fe10(v11, &v3, 2) || !sub_a3fe10(v11, a8, a9)))))
            {
                if (sub_a3fe10(v11, &v7, 32) && sub_a3fe10(v11, a1, a2) && sub_a3ff7c(v11, &v3, &v0))
                {
                    sub_a0ab18(&v3);
                    sub_a0b134(v2, &v3);
                    sub_a0b498(a0, v2);
                    if (sub_a0aa1c(v11, v10, a5, a6, a8, a9) && sub_a3fe10(v11, a0, 32) && sub_a3fe10(v11, a3, 32) && sub_a3fe10(v11, a1, a2) && sub_a3ff7c(v11, &v1, &v0))
                    {
                        sub_a0ab18(&v1);
                        sub_a0b540(a0 + 32, &v1, &v5, &v3);
                        v16 = 1;
                        goto LABEL_a0a9b4;
                    }
                }
            }
        }
    }
    v16 = 0;
LABEL_a0a9b4:
    sub_a66ec0(&v3, 64);
    sub_a66ec0(&v5, 64);
    sub_a3f52c(v10);
    sub_a3f73c(v11);
    if (*(long long *)&g_10002b0 == v8)
        return v16;
    ___stack_chk_fail();
}
