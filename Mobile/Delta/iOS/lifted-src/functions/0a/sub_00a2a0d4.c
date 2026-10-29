/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a0d4..0xa2a1c0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2a0d4(void* a0)
{
    unsigned int v2;  // w9
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (int)a0[96];
    if (1 < (int)v2)
    {
        if (v2 != 2)
        {
            if (v2 == 3)
            {
                if (!sub_a084f8(*(long long *)a0, a0 + 0x11, (long long)a0[80], (long long)a0[8]))
                {
                    sub_a368c8();
                    v3 = 47;
                }
                else
                {
                    return 1;
                }
            }
            else
            {
                return 1;
            }
        }
        else
        {
            if (sub_a0d9ac(*(long long *)a0, a0 + 0x11, (long long)a0[80], (long long)a0[8]))
                return 1;
            sub_a368c8();
            v3 = 37;
        }
        sub_a369bc("crypto/ec/ecx_backend.c", v3, "ossl_ecx_public_from_private");
        sub_a36abc(16, 166, 0);
        return 0;
    }
    else if (!v2)
    {
        sub_a0fdb8(a0 + 0x11, (long long)a0[80]);
        return 1;
    }
    else if (v2 == 1)
    {
        sub_a07c88(a0 + 0x11, (long long)a0[80]);
        return 1;
    }
    else
    {
        return 1;
    }
}
