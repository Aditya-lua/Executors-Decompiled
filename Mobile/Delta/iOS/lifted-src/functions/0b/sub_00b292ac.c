/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb292ac..0xb293c4 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b292ac(unsigned long long *a0, unsigned long a1, unsigned long long *a2, unsigned long a3, unsigned int a4)
{
    unsigned long v3;  // x8
    unsigned int v5;  // w0
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a0[1] && a0[2])
    {
        v3 = sub_9ffc34(a0[1]);
        if (a1)
        {
            if (v3 > a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/exchange/dh_exch.c", 198, "dh_plain_derive");
                sub_a36abc(57, 106, 0);
                return 0;
            }
            sub_9ffd58(a0[2], &v0, 0);
            if (a4)
            {
                v5 = sub_9ff258(a1, v0, a0[1]);
                if ((int)v5 < 1)
                    return 0;
            }
            else
            {
                v5 = sub_9ff19c(a1, v0, a0[1]);
                if (1 > (int)v5)
                    return 0;
            }
            v3 = v5;
        }
        *a2 = v3;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/exchange/dh_exch.c", 188, "dh_plain_derive");
    sub_a36abc(57, 128, 0);
    return 0;
}
