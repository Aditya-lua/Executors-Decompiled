/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3f5ec..0xb3f960 (884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3f5ec(unsigned long long a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v2;  // w0
    unsigned long idx;  // x27
    unsigned long long v4;  // x19
    unsigned long long v5;  // x23
    unsigned long long v6;  // x21
    unsigned long long n;  // x22
    unsigned long long v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        idx = *(long long *)a0;
        if (*(long long *)(a0 + 64))
        {
            if (!(a1 >> 1 & 1))
                goto LABEL_b3f744;
            v4 = sub_a6bf4c(*(long long *)(idx + 24), "providers/implementations/keymgmt/ml_kem_kmgmt.c", 260);
            if (v4 && sub_a82fdc(v4, *(long long *)(idx + 24), a0))
            {
                if (a1 & 1)
                    goto LABEL_b3f74c;
                goto LABEL_b3f678;
            }
            v5 = 0;
            v6 = 0;
            n = 0;
            v8 = 0;
        }
        else
        {
            if (!(a1 & 1) || !*(long long *)(a0 + 176) && (*(long long *)(a0 + 80) || !*(long long *)(a0 + 96)))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 0x100, "ml_kem_export");
                sub_a36abc(57, 128, 0);
                return 0;
            }
LABEL_b3f744:
            v4 = 0;
            if (!(a1 & 1))
            {
LABEL_b3f678:
                v5 = 0;
                if (sub_a6ee78())
                {
                    v8 = 0;
                    n = 0;
                    v6 = 0;
                    goto LABEL_b3f690;
                }
                else
                {
                    v6 = 0;
                    n = 0;
                    v8 = 0;
                }
            }
            else
            {
LABEL_b3f74c:
                if (*(long long *)(a0 + 96))
                {
                    v6 = sub_a6ce80(64, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 274);
                    if (v6)
                    {
                        v8 = 64;
                        if (sub_a83238(v6, 64, a0))
                            goto LABEL_b3f7c0;
                    }
                    v8 = 64;
                    v5 = 0;
                    n = 0;
                }
                else
                {
                    v6 = 0;
                    v8 = 0;
LABEL_b3f7c0:
                    if (*(long long *)(a0 + 80))
                    {
                        n = *(long long *)(idx + 8);
                        v5 = sub_a6ce80(n, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 280);
                        if (!v5)
                            goto LABEL_b3f8e8;
                        if (sub_a830a4(v5, n, a0))
                            goto LABEL_b3f888;
                    }
                    else if (*(long long *)(a0 + 176))
                    {
                        n = *(long long *)(idx + 8);
                        v5 = sub_a6ce80(n, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 285);
                        if (v5)
                        {
                            _memcpy(v5, *(long long *)(a0 + 176), n);
                            goto LABEL_b3f888;
                        }
LABEL_b3f8e8:
                    }
                    else
                    {
                        v5 = 0;
                        n = 0;
LABEL_b3f888:
                        if (!sub_a6ee78() || v6 && !sub_a6f968())
                            goto LABEL_b3f8e8;
                        if (!v5)
                        {
LABEL_b3f690:
                            if (v4 && !sub_a6f968())
                                goto LABEL_b3f8e8;
                            if (sub_a6f570())
                                a2();
                        }
                        else if (sub_a6f968())
                        {
                            goto LABEL_b3f690;
                        }
                    }
                }
            }
        }
        sub_a6eed4();
        sub_a6d4c0(v6, v8, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 328);
        sub_a6d4c0(v5, n, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 329);
        sub_a6c4e8(v4, *(long long *)(idx + 24), "providers/implementations/keymgmt/ml_kem_kmgmt.c", 330);
        return 0;
    }
    else
    {
        return 0;
    }
}
