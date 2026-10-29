/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb409cc..0xb40be8 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b409cc(unsigned long long idx, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v6;  // w0
    unsigned long long v7;  // w8
    unsigned long v8;  // x9
    unsigned long v9;  // x10
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x21
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_a2f9e0();
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!idx)
    {
        return 0;
    }
    else if (v6)
    {
        v7 = *(int *)(idx + 48);
        if (!*(int *)(idx + 48))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 262, "mlx_kem_export");
            sub_a36abc(57, 128, 0);
            return 0;
        }
        v8 = *(long long *)(idx + 16);
        v9 = *(long long *)(idx + 24);
        v0 = 0;
        v1 = 0;
        v2 = 0;
        v3 = 0;
        if (a1 >> 1 & 1)
        {
            v10 = sub_a6bf4c(*(long long *)(v9 + 16) + *(long long *)(v8 + 24), "providers/implementations/keymgmt/mlx_kmgmt.c", 270);
            (&v0)[1] = v10;
            if (!v10)
                goto LABEL_b40b84;
            v7 = *(int *)(idx + 48);
        }
        if (!(a1 & 1) || v7 < 2 || (v11 = sub_a6ce80(*(long long *)(v9 + 24) + *(long long *)(v8 + 8), "providers/implementations/keymgmt/mlx_kmgmt.c", 282), v1 = v11, v11))
        {
            v12 = sub_a6ee78();
            if (v12 && sub_b40e88(&v0, a1, idx) && (!*&(&v0)[1] || *(unsigned int *)((void*)&v1 + 8) != 2 || sub_a6f968(v12, 0, "pub")) && (!v1 || *(unsigned int *)((void*)&v1 + 12) != 2 || sub_a6f968(v12, 0, "priv")) && sub_a6f570(v12))
                a2();
        }
        else
        {
LABEL_b40b84:
            v12 = 0;
        }
        sub_a6eed4(v12);
        sub_a6d4c0(v1, *(long long *)(v9 + 24) + *(long long *)(v8 + 8), "providers/implementations/keymgmt/mlx_kmgmt.c", 320);
        sub_a6c4e8(*&(&v0)[1], *(long long *)(v9 + 16) + *(long long *)(v8 + 24), "providers/implementations/keymgmt/mlx_kmgmt.c", 321);
        return 0;
    }
    else
    {
        return 0;
    }
}
