/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9deb68..0x9defb0 (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9deb68_0 {
    unsigned long long field_0;
} st_9deb68_0;


unsigned int sub_9deb68(long long a0, unsigned int a1, long long a2, st_9deb68_0 **a3, long long a4, unsigned long long a5)
{
    unsigned long long v5;  // x20
    unsigned int v6;  // x24
    long long v15;  // x1
    unsigned int v16;  // x26
    long long v17;  // x28
    long long v18;  // x27
    long long v19;  // x28
    long long v20;  // x28
    unsigned int v21;  // x21
    long long v22;  // x1
    unsigned int v7;  // w0
    unsigned int v8;  // w21
    long long v9;  // x27
    unsigned int v10;  // x0
    unsigned int v11;  // x26
    unsigned int v12;  // w21
    unsigned int v13;  // x26
    long long v14;  // x0
    unsigned int v0;  // [bp-0x7c]
    long long v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a5;
    v6 = a1;
    if (sub_9e48c8(a2, 4) || sub_9e48c8(a3, 4))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_exp.c", 1187, "BN_mod_exp_mont_word");
        v22 = 786689;
    }
    else
    {
        if (sub_9e5c70(a3))
        {
            if ((int)a3[1] == 1)
                v6 -= *(long long *)*a3 * v6 / *(long long *)*a3;
            v7 = sub_9e46a8(a2);
            if (v7)
            {
                if (v6)
                {
                    v8 = v7;
                    sub_9de064(a4);
                    v9 = sub_9de208(a4);
                    v10 = sub_9de208(a4);
                    if (v10)
                    {
                        v1 = v10;
                        v11 = v5;
                        if (v11 || !(v11 = sub_9e6c04(), !v11 || !sub_9e6cc0(v11, a3, a4)))
                        {
                            if ((int)v8 >= 2)
                            {
                                v2 = v8 - 1;
                                v12 = 1;
                                v13 = v6;
                            }
                            else
                            {
                                v13 = v6;
                                if (v13 != 1)
                                    goto LABEL_9def00;
                                goto LABEL_9deea4;
                            }
                            while (1)
                            {
                                if (v13 * v13 <= 0xffffffffffffffff)
                                {
                                    v13 *= v13;
                                    if (v12)
                                    {
                                        v0 = 0;
                                        goto LABEL_9dedb8;
                                    }
                                    else
                                    {
                                        v19 = v1;
                                        v18 = v9;
                                        goto LABEL_9ded8c;
                                    }
                                    goto LABEL_9ded8c;
                                }
                                v14 = v9;
                                v15 = v13;
                                if (v12)
                                {
                                    if (sub_9e4d58(v14, v15))
                                    {
                                        v16 = v11;
                                        if (sub_9e5ca4(v9, v9, v16, a4))
                                        {
                                            v17 = v1;
                                            v18 = v9;
                                            goto LABEL_9ded80;
                                        }
                                        goto LABEL_9def84;
                                    }
                                    goto LABEL_9defa0;
                                }
                                if (!sub_9ebbfc(v14, v15) || !sub_9de520(0, v1, v9, a3, a4))
                                    goto LABEL_9defa0;
                                v17 = v9;
                                v18 = v1;
LABEL_9ded80:
                                v13 = 1;
LABEL_9ded8c:
                                v12 = 0;
                                if (!sub_9e66ec(v18, v18, v18, v11, a4))
                                {
                                    v21 = 0;
LABEL_9dee58:
                                    if (v5)
                                    {
                                        sub_9de17c(a4);
                                        return 0;
                                    }
                                    break;
                                }
                                v0 = 1;
                                v1 = v19;
                                v9 = v18;
LABEL_9dedb8:
                                v20 = v9;
                                v2 -= 1;
                                if (!sub_9e5748(a2, v2))
                                {
LABEL_9decec:
                                    v9 = v20;
                                    goto LABEL_9decf0;
                                }
                                if (v6 * v13 <= 0xffffffffffffffff)
                                {
                                    v13 *= v6;
                                    goto LABEL_9decec;
                                }
                                if (v0 & 1)
                                {
                                    if (sub_9ebbfc(v20, v13))
                                    {
                                        v9 = v1;
                                        v12 = 0;
                                        v1 = v20;
                                        v13 = v6;
                                        if (!sub_9de520(0, v9, v20, a3, a4))
                                            goto LABEL_9dee58;
                                        goto LABEL_9decf0;
                                    }
                                    goto LABEL_9defa0;
                                }
                                else
                                {
                                    if (!sub_9e4d58(v20, v13))
                                        goto LABEL_9defa0;
                                    v12 = 0;
                                    v9 = v20;
                                    v13 = v6;
                                    if (!sub_9e5ca4(v9, v9, v11, a4))
                                        goto LABEL_9dee58;
LABEL_9decf0:
                                    if ((int)v2 <= 0)
                                    {
                                        if (v13 == 1)
                                        {
                                            v1 = v9;
                                            if (!v12)
                                                goto LABEL_9def28;
LABEL_9deea4:
                                            v16 = v11;
                                            if (sub_9e4d58(a0, 1))
                                                goto LABEL_9def40;
                                            goto LABEL_9def84;
                                        }
                                        if (v12)
                                        {
LABEL_9def00:
                                            v16 = v11;
                                            if (sub_9e4d58(v9, v13) && !(v1 = v9, v16 = v11, !sub_9e5ca4(v1, v1, v16, a4)))
                                                goto LABEL_9def28;
                                            goto LABEL_9def84;
                                        }
                                        else
                                        {
                                            if (sub_9ebbfc(v9, v13))
                                            {
                                                v16 = v11;
                                                if (sub_9de520(0, v1, v9, a3, a4))
                                                {
LABEL_9def28:
                                                    v16 = v11;
                                                    if (sub_9e6ae4(a0, v1, v16, a4))
                                                    {
LABEL_9def40:
                                                        v21 = 1;
                                                        if (v5)
                                                        {
                                                            sub_9de17c(a4);
                                                            return 1;
                                                        }
                                                    }
                                                }
LABEL_9def84:
                                                v21 = 0;
                                                v11 = v16;
                                                break;
                                                if (v5)
                                                {
                                                    sub_9de17c(a4);
                                                    return 0;
                                                }
                                            }
                                        }
LABEL_9defa0:
                                        v21 = 0;
                                        if (v5)
                                        {
                                            sub_9de17c(a4);
                                            return 0;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        else
                        {
                            v21 = 0;
                        }
                        sub_9e6c64(v11);
                        sub_9de17c(a4);
                        return v21;
                    }
                    else if (!v5)
                    {
                        sub_9e6c64(0);
                        sub_9de17c(a4);
                        return 0;
                    }
                    else
                    {
                        sub_9de17c(a4);
                        return 0;
                    }
                }
            }
            else
            {
                if (!sub_9e5b58(a3, 1))
                    return sub_9e4d58();
            }
            sub_9e5b4c(a0);
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_exp.c", 1195, "BN_mod_exp_mont_word");
        v22 = 0x66;
    }
    sub_a36abc(3, v22, 0);
    return 0;
}
