/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3f2a4..0xb3f5d8 (820 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3f2a4(unsigned int a0, unsigned long long a1, long long a2)
{
    unsigned int v9;  // w0
    unsigned long long *v10;  // x24
    long long v11;  // x1
    unsigned int v12;  // x8
    unsigned int v13;  // x23
    unsigned int v14;  // x22
    unsigned int v15;  // x21
    unsigned long long v16;  // x25
    long long v17;  // x1
    unsigned int v18;  // x0
    unsigned long v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x80]
    unsigned int v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x70]
    unsigned int v4;  // [bp-0x68]
    unsigned int v5;  // [bp-0x60]
    unsigned int v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = sub_a2f9e0();
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v9)
    {
        v5 = 0;
        v6 = 0;
        v3 = 0;
        v4 = 0;
        v1 = 0;
        v2 = 0;
        if (*(long long *)(a0 + 64))
            return 0;
        v10 = *(long long *)a0;
        if (!(a1 & 1))
        {
LABEL_b3f324:
            if (sub_a6fbc4(a2, "pub"))
            {
                if (sub_a71cdc() == 1)
                {
                    v13 = v3;
                    if (!v13)
                        goto LABEL_b3f424;
                    if (v13 == v10[3])
                    {
                        v14 = v1;
                        v15 = v2;
                        v16 = !v15;
                        if (v15 && _memcmp(v6, v5 + v15 - v13 - 64, v13))
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 448, "ml_kem_key_fromdata");
                            v0 = *v10;
                            sub_a36abc(57, 158, "explicit %s public key does not match private");
                        }
                        else
                        {
                            if (!v14)
                                goto LABEL_b3f560;
LABEL_b3f4c4:
                            if (!(v16 & 1))
                            {
                                if (!((char)(*(char *)(a0 + 104)) >> 2 & 1))
                                    goto LABEL_b3f588;
                                if (sub_b3fc1c(v4))
                                {
                                    v14 = v1;
                                    goto LABEL_b3f4e8;
                                }
                            }
                            else
                            {
LABEL_b3f4e8:
                                if (sub_a83270(v4, v14, a0) && sub_a83784(0, 0, a0))
                                {
                                    if (v2)
                                    {
                                        v18 = sub_b3fcb8(v5, a0);
                                        if (!(a1 & 1))
                                            return v18;
                                    }
                                    else
                                    {
                                        v18 = 1;
                                        if (!(a1 & 1))
                                            return 1;
                                    }
                                    goto LABEL_b3f59c;
                                }
                            }
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v17 = 433;
LABEL_b3f544:
                        sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", v17, "ml_kem_key_fromdata");
                        v11 = 105;
LABEL_b3f550:
                        sub_a36abc(57, v11, 0);
                    }
                }
            }
            else
            {
LABEL_b3f424:
                v14 = v1;
                v15 = v2;
                v16 = !v15;
                if (!v14 & v16 & 1)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 439, "ml_kem_key_fromdata");
                    v11 = 128;
                    goto LABEL_b3f550;
                }
                else
                {
                    if (v14)
                        goto LABEL_b3f4c4;
                    v13 = 0;
LABEL_b3f560:
                    if (v16 & 1)
                    {
                        v18 = sub_a832c8(v6, v13, a0);
                        if (!(a1 & 1))
                            return v18;
                    }
                    else
                    {
LABEL_b3f588:
                        v18 = sub_a8351c(v5, v15, a0);
                        if (!(a1 & 1))
                            return v18;
                    }
LABEL_b3f59c:
                    if ((int)v18 < 1)
                        return v18;
                    if (sub_b3f988(a0, *(int *)(a0 + 104)))
                        return v18;
                    sub_a82b08(a0);
                }
            }
        }
        else if (!sub_a6fbc4(a2, "seed"))
        {
LABEL_b3f468:
            if (!sub_a6fbc4(a2, "priv"))
                goto LABEL_b3f324;
            if (sub_a71cdc() == 1)
            {
                v12 = v2;
                if (v12 && v12 != v10[1])
                {
                    sub_a368c8();
                    v17 = 422;
                    goto LABEL_b3f544;
                }
                goto LABEL_b3f324;
            }
        }
        else if (sub_a71cdc() == 1)
        {
            if (!(v1 & 0xffffffffffffffbf))
                goto LABEL_b3f468;
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 414, "ml_kem_key_fromdata");
            v11 = 154;
            goto LABEL_b3f550;
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
