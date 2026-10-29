/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29cc4..0xb29e44 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b29cc4(unsigned long a0, unsigned int a1, unsigned int *a2, unsigned int a3)
{
    unsigned int v2;  // x22
    unsigned int v3;  // x24
    unsigned int v4;  // x0
    unsigned int v5;  // x0
    unsigned int v6;  // w0
    unsigned int v7;  // w0
    unsigned long long v8;  // 4118
    unsigned int v9;  // x0
    unsigned int v10;  // w0
    unsigned int v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)(a0 + 8) && *(long long *)(a0 + 16))
    {
        v2 = a3;
        if (sub_9ffdd0())
        {
            v3 = sub_a1ad1c() + 7 >> 3;
            if (!a1)
            {
                *(unsigned long long *)a2 = v3;
                return 1;
            }
        }
        else
        {
            v3 = 0;
            if (!a1)
            {
                *(unsigned long long *)a2 = 0;
                return 1;
            }
        }
        v4 = sub_9ffdd0(*(long long *)(a0 + 8));
        if (!v4)
            return v4;
        v5 = sub_9ffdd0();
        if (!v5)
            return v5;
        v6 = sub_9e5b90();
        if (v3 >= v2)
            v3 = v2;
        v7 = sub_a198e8();
        v8 = arm64g_calculate_condition(1, *(int *)(a0 + 24), 1, 0);
        if (!(v8 & 1) && *(int *)(a0 + 24) != ((v7 * 0x100000 | v7 >> 12) & 1) && !v6)
        {
            v9 = sub_a18ce8(*(long long *)(a0 + 8));
            if (!v9)
            {
                return v9;
            }
            else if (*(int *)(a0 + 24) == 1)
            {
                sub_a197a8();
            }
            else
            {
                sub_a198f0();
            }
        }
        else
        {
            v9 = *(long long *)(a0 + 8);
        }
        v10 = sub_a19e9c(a1, v3, sub_975ff4(*(long long *)(a0 + 16)), v9, 0);
        if ((int)v10 >= 1)
        {
            *(unsigned long long *)a2 = v10;
            v11 = 1;
        }
        else
        {
            v11 = 0;
        }
        if (v9 != *(long long *)(a0 + 8))
        {
            sub_a18c08(v9);
            return v11;
        }
        return v11;
    }
    sub_a368c8(*(long long *)(a0 + 8));
    sub_a369bc("providers/implementations/exchange/ecdh_exch.c", 477, "ecdh_plain_derive");
    sub_a36abc(57, 128, 0);
    return 0;
}
