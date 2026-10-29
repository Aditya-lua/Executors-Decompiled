/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa51618..0xa517bc (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a51618(unsigned long a0, long long a1, long long a2)
{
    unsigned long v9;  // x0
    unsigned int v10;  // w8
    unsigned long v11;  // x23
    unsigned long v0;  // [bp-0xa8]
    unsigned long v1;  // [bp-0xa0]
    unsigned long v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    unsigned long v4;  // [bp-0x88]
    char v5;  // [bp-0x7a]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v4 = 0;
    v2 = 0;
    v0 = 0;
    v9 = a0;
    if (v9)
    {
        if (sub_9ca8cc(&v0, 0, 0, 0, a0) && sub_a99b48(&v5, 50, v0, 0))
        {
            v10 = sub_9ca808(a0, &v2);
            v9 = 0;
            if ((int)v10 >= 1 && v2)
            {
                v3 = v2;
                v1 = v10;
                v11 = sub_a2e274(&v4, "DER", "PrivateKeyInfo", &v5, 135, a1, a2);
                if (v11)
                {
                    if (!sub_a2c0c0(v11))
                    {
                        sub_a2d974(v11);
                        v11 = sub_a2e274(&v4, "DER", "PrivateKeyInfo", 0, 135, a1, a2);
                        if (v11)
                            goto LABEL_a51734;
                    }
                    else
                    {
LABEL_a51734:
                        if (sub_a2c518(v11, &v3, &v1))
                            goto LABEL_a5175c;
                    }
                }
                v4 = sub_a51458(a0, a1, a2);
LABEL_a5175c:
                sub_a6c4e8(v2, v1, "crypto/evp/evp_pkey.c", 112);
                sub_a2d974(v11);
                v9 = v4;
            }
        }
        else
        {
            v9 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
