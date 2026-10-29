/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3aef4..0xa3b71c (2088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_786568;

unsigned long long sub_a3aef4(unsigned long long a0, unsigned int idx, void* a2)
{
    unsigned long long v9;  // x0
    unsigned int v10;  // x8
    long long v19;  // x2
    long long v20;  // x1
    unsigned int *v21;  // x8
    unsigned long v22;  // x10
    unsigned int v23;  // w10
    void* v24;  // x21
    unsigned int v25;  // w0
    unsigned long long v26;  // 4136
    unsigned long v27;  // x8
    unsigned long long v28;  // x0
    unsigned long v11;  // x25
    unsigned int v29;  // x0
    unsigned int v30;  // w8
    unsigned int v31;  // w9
    unsigned long v12;  // x21
    unsigned long v13;  // x21
    unsigned long v14;  // x21
    long long v15;  // x0
    long long len;  // x0
    void* v17;  // x8
    unsigned long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98], Other Possible Types: unsigned int
    unsigned long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x78], Other Possible Types: unsigned int
    uint128_t v5;  // [bp-0x68]
    unsigned long long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = sub_a3bbe8();
    if ((int)v9 < 1)
        return v9;
    if ((int)a0 > 3)
    {
        v10 = 1;
        if (6 < (int)a0)
        {
            if ((unsigned int)a0 == 7)
                goto LABEL_a3afb8;
            if ((unsigned int)a0 == 8)
            {
LABEL_a3afac:
                v10 = (int)a2[28];
                if ((unsigned int)a0 == 7)
                {
LABEL_a3afb8:
                    if ((int)a2[8] == 1)
                    {
                        if (*(int *)(idx + 48) != 7)
                            return v10;
                        *(void* *)&a2[32] = a2 + 128;
                        return v10;
                    }
                    if ((int)a2[8] != 2)
                        return v10;
                    v30 = *(int *)(idx + 48);
                    if ((int)v30 > 3)
                    {
                        switch (v30)
                        {
                        case 4:
                            break;
                        default:
                            goto LABEL_a3b48c;
                        }
                    }
                    if (v30 == 2)
                    {
                        if ((long long)a2[32])
                        {
                            if (sub_a70f20((long long)a2[48], (long long)a2[32]))
                                return 1;
                            return 0;
                        }
                        else
                        {
                            if (sub_a6ffcc((long long)a2[48], a2 + 28))
                                return 1;
                        }
                        goto LABEL_a3b6d0;
                    }
                    else
                    {
LABEL_a3b48c:
                        sub_a368c8();
                        sub_a369bc("crypto/evp/ctrl_params_translate.c", 648, "default_fixup_args");
                        v2 = *(int *)(idx + 48);
                        v0 = (int)a2[8];
                        v1 = 7;
                        v19 = "[action:%d, state:%d] unknown OSSL_PARAM data type %d";
                        goto LABEL_a3b6c0;
                    }
                }
                else
                {
                    if (((unsigned int)a0 | 8) == 8)
                    {
                        if ((int)a2[8] == 1)
                        {
                            if (!*(int *)(idx + 48) && !*(long long *)(idx + 56))
                            {
                                sub_c671e4();
                                return 0;
                            }
                            switch (v31)
                            {
                            default:
                                sub_a368c8();
                                sub_a369bc("crypto/evp/ctrl_params_translate.c", 694, "default_fixup_args");
                                v1 = a0;
                                v2 = *(int *)(idx + 48);
                                v0 = (int)a2[8];
                                v19 = "[action:%d, state:%d] unsupported OSSL_PARAM data type %d";
                                break;
                            }
                            goto LABEL_a3b6c0;
                        }
                        else
                        {
                            return v10;
                        }
                    }
                    else
                    {
                        return v10;
                    }
                }
                goto LABEL_a3b6c0;
            }
        }
        else if ((unsigned int)a0 == 4)
        {
            v11 = (long long)a2[32];
            v4 = 0;
            if ((int)a2[8] == 2)
            {
                v12 = (long long)a2[16];
                v13 = v12;
                if (idx)
                {
                    v14 = *(long long *)(idx + 40);
                    *(unsigned long *)&a2[16] = v14;
                    v13 = v14;
                    if ((int)a2[24])
                    {
                        *(unsigned int *)&a2[64] = (unsigned int)&g_786568;
                        v13 = a2 + 64;
                        if (3 >= sub_a6db94(v13, v14, 50))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/evp/ctrl_params_translate.c", 572, "default_fixup_args");
                            sub_a36abc(6, 0xc0103, 0);
                            return 0xffffffff;
                        }
                    }
                }
                v15 = sub_a5de34(*(long long *)a2);
                len = _strlen((long long)a2[32]);
                if (sub_a71ea0((long long)a2[48], v15, v13, (long long)a2[32], len, &v4))
                {
                    v17 = (long long)a2[48];
                    *(long long *)&a2[120] = (long long)v17[16];
                    *(long long *)&a2[0x88] = (long long)v17[24];
                    return 1;
                }
                if (!v4)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/ctrl_params_translate.c", 585, "default_fixup_args");
                    v2 = v12;
                    v3 = v11;
                    v0 = (int)a2[8];
                    v1 = 4;
                    sub_a36abc(6, 147, "[action:%d, state:%d] name=%s, value=%s");
                    return 0xfffffffe;
                }
                goto LABEL_a3b6d0;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/ctrl_params_translate.c", 554, "default_fixup_args");
                v0 = (int)a2[8];
                v1 = 4;
                v19 = "[action:%d, state:%d] only setting allowed";
                v20 = 147;
                goto LABEL_a3b6cc;
            }
            goto LABEL_a3b6cc;
        }
        else if ((unsigned int)a0 == 5)
        {
            return 1;
        }
    }
    else
    {
        if (!(unsigned int)a0)
            goto LABEL_a3afac;
        if ((unsigned int)a0 == 1)
        {
            if ((int)a2[8])
            {
                if (*(int *)(idx + 12))
                {
                    v21 = *(long long *)a2;
                    v22 = *v21;
                    if ((unsigned int)v22 & 49648 && !*(long long *)&v21[12] || v22 >> 11 & 1 && !*(long long *)&v21[12] || (unsigned int)v22 & 0x600 && !*(long long *)&v21[12] || (unsigned int)v22 & 0x3000 && !*(long long *)&v21[12] || (unsigned int)v22 & 6 && !*(long long *)&v21[10] || v22 >> 3 & 1 && !*(long long *)&v21[10])
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/ctrl_params_translate.c", 446, "default_fixup_args");
                        sub_a36abc(6, 147, 0);
                        return 0xfffffffe;
                    }
                }
                v23 = *(int *)(idx + 48);
                if (4 >= (int)v23)
                {
                    switch (v23)
                    {
                    case 1:
                        v24 = (long long)a2[48];
                        sub_a6ffac(*(long long *)(idx + 40), a2 + 28);
                        break;
                    case 2:
                        if ((long long)a2[32])
                        {
                            if ((int)a2[8] == 2)
                            {
                                v25 = sub_9e46a8();
                                v26 = arm64g_calculate_condition(177, v25, 7, 0);
                                v27 = (v26 & 1 ? v25 + 14 : v25 + 7);
                                v28 = (long long)(v27 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v27, 61) & 0xe00000001fffffff & 0x1fffffff;
                                *(unsigned long long *)&a2[0x88] = v28;
                                v29 = sub_a6bf4c(v28, "crypto/evp/ctrl_params_translate.c", 473);
                                *(unsigned long long *)&a2[120] = v29;
                                if (!v29)
                                    return 0;
                                if (!(sub_9e536c((long long)a2[32], v29, (int)a2[0x88]) >> 31 & 1))
                                {
                                    v24 = (long long)a2[48];
                                    sub_a71204(*(long long *)(idx + 40), (long long)a2[120], (long long)a2[0x88]);
                                    break;
                                }
                                else
                                {
                                    sub_a6c2e4((long long)a2[120], "crypto/evp/ctrl_params_translate.c", 479);
                                    *(unsigned long long *)&a2[120] = 0;
                                    return 0;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/evp/ctrl_params_translate.c", 491, "default_fixup_args");
                                v0 = (int)a2[8];
                                v1 = 1;
                                v19 = "[action:%d, state:%d] trying to get a BIGNUM via ctrl call";
LABEL_a3b6c0:
                                v20 = 524556;
LABEL_a3b6cc:
                                sub_a36abc(6, v20, v19);
LABEL_a3b6d0:
                                return 0;
                            }
                        }
                        else
                        {
                            v24 = (long long)a2[48];
                            sub_a70404(*(long long *)(idx + 40), a2 + 28);
                        }
                    case 4:
                        v24 = (long long)a2[48];
                        sub_a71618(*(long long *)(idx + 40), (long long)a2[32], (int)a2[28]);
                        break;
                    default:
                        return 1;
                    }
                }
                else
                {
                    if (v23 != 5)
                    {
                        if (v23 != 6)
                        {
                            if (v23 == 7)
                            {
                                v24 = (long long)a2[48];
                                sub_a718b8(*(long long *)(idx + 40), (long long)a2[32], (int)a2[28]);
                            }
                            else
                            {
                                return 1;
                            }
                        }
                        else
                        {
                            v24 = (long long)a2[48];
                            sub_a7189c(*(long long *)(idx + 40), (long long)a2[32], (int)a2[28]);
                        }
                    }
                    else
                    {
                        v24 = (long long)a2[48];
                        sub_a71670(*(long long *)(idx + 40), (long long)a2[32], (int)a2[28]);
                    }
                }
                *(unsigned long long *)&v24[32] = v6;
                *(uint128_t *)v24 = v4;
                *(uint128_t *)&v24[16] = v5;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("crypto/evp/ctrl_params_translate.c", 424, "default_fixup_args");
            v0 = (int)a2[8];
            v1 = 1;
            v19 = "[action:%d, state:%d]";
            goto LABEL_a3b6c0;
        }
        else if ((unsigned int)a0 == 2)
        {
            if ((int)a2[8] != 1)
            {
                return 1;
            }
            else if (((unsigned int)(*(int *)(idx + 48)) >> 2 & 0x3fffffff) == 1)
            {
                *(int *)&a2[28] = *(long long *)((long long)a2[48] + 32);
                return 1;
            }
            else
            {
                return 1;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/ctrl_params_translate.c", 407, "default_fixup_args");
    v0 = (int)a2[8];
    v1 = a0;
    v19 = "[action:%d, state:%d]";
    v20 = 786689;
    goto LABEL_a3b6cc;
}
