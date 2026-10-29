/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb40828..0xb409b8 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b40828(unsigned int a0, unsigned long long a1, long long a2)
{
    unsigned int v6;  // w0
    long long v7;  // x1
    long long v8;  // x1
    unsigned int v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x60]
    unsigned int v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_a2f9e0();
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v6)
    {
        v2 = 0;
        v3 = 0;
        v0 = 0;
        v1 = 0;
        if (*(int *)(a0 + 48) || sub_a6fbc4(a2, "pub") && sub_a71cdc() != 1)
            return 0;
        if (!(a1 & 1) || !sub_a6fbc4(a2, "priv"))
        {
            v0 = 0;
            goto LABEL_b408ec;
        }
        else if (sub_a71cdc() == 1)
        {
LABEL_b408ec:
            if (!v1 && !v0)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 442, "mlx_kem_key_fromdata");
                v7 = 128;
            }
            else
            {
                if (v1 && v1 != *(long long *)(*(long long *)(a0 + 24) + 16) + *(long long *)(*(long long *)(a0 + 16) + 24))
                {
                    sub_a368c8();
                    v8 = 452;
                }
                else if (v0 && v0 != *(long long *)(*(long long *)(a0 + 24) + 24) + *(long long *)(*(long long *)(a0 + 16) + 8))
                {
                    sub_a368c8();
                    v8 = 456;
                }
                else
                {
                    return sub_b41168(a0, v3);
                }
                sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", v8, "mlx_kem_key_fromdata");
                v7 = 105;
            }
            sub_a36abc(57, v7, 0);
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
