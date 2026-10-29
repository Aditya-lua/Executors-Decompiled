/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb32914..0xb32e30 (1308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b32914_0 {
    char padding_0[16];
    char field_10;
    char padding_11[31];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
} st_b32914_0;

extern char g_1000000;
extern char g_10002b0;

unsigned long long sub_b32914(st_b32914_0 *a0, long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long n;  // x19
    long long iter;  // x20
    unsigned long v28;  // x28
    unsigned long long v29;  // x0
    unsigned long long v30;  // x25
    unsigned long long v31;  // x24
    unsigned long long v32;  // x25
    unsigned long long v33;  // x1
    unsigned long long v34;  // x2
    unsigned long long v36;  // x8
    unsigned long long v37;  // x27
    unsigned long long v20;  // x0
    char *v38;  // x21
    unsigned long long v39;  // x0
    unsigned long long v40;  // x28
    unsigned long long v41;  // x23
    unsigned long long v42;  // x0
    unsigned long long v43;  // x22
    unsigned long long v44;  // x0
    unsigned long long v46;  // x21
    unsigned long long v47;  // x1
    unsigned long long v21;  // x23
    long long v22;  // x0
    unsigned long long v23;  // w0
    unsigned long long v24;  // w0
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    long long v27;  // x1
    char *v0;  // [bp-0x118]
    unsigned long v1;  // [bp-0x110]
    unsigned long long v2;  // [bp-0x108]
    unsigned long long v3;  // [bp-0x100]
    unsigned long long v4;  // [bp-0xf8]
    uint128_t v5;  // [bp-0xf0], Other Possible Types: unsigned int
    uint128_t v6;  // [bp-0xe0]
    unsigned long long v7;  // [bp-0xd0]
    unsigned long long v8;  // [bp-0xc8]
    char v9;  // [bp-0xc0], Other Possible Types: uint128_t
    uint128_t v10;  // [bp-0xb0]
    unsigned long long v11;  // [bp-0xa0]
    uint128_t v12;  // [bp-0x98]
    uint128_t v13;  // [bp-0x88]
    unsigned long long v14;  // [bp-0x78]
    unsigned long v15;  // [bp-0x70]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    n = a2;
    iter = a1;
    v15 = *(long long *)&g_10002b0;
    if (sub_a2f9e0() && (!a3 || !*(long long *)a3 || sub_b331fc(a0, a3)))
    {
        if (!*(long long *)&a0->padding_11[23])
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/sskdf.c", 422, "sskdf_derive");
            v47 = 132;
            goto LABEL_b32c80;
        }
        v20 = sub_954340(&a0->field_10);
        if (!*(long long *)&a0->padding_0[8])
        {
            if (!v20)
            {
                sub_a368c8();
                v27 = 473;
                goto LABEL_b32c4c;
            }
            else if (*(long long *)&g_10002b0 != v15)
            {
                ___stack_chk_fail();
            }
            goto LABEL_b32c4c;
        }
        v21 = v20;
        v22 = sub_954340(*(long long *)&a0->padding_0[8]);
        v23 = (unsigned int)sub_a5842c(v22, "HMAC");
        if (!v23)
        {
            if (*(int *)&a0[1].padding_0[8])
            {
                if (!sub_a5842c(v22, "KMAC128"))
                    v24 = 132;
                else
                    v24 = 164;
                v25 = "KDFKEM";
                v26 = 3;
                if (a0->field_48)
                {
LABEL_b32a90:
                    if (a0->field_50)
                        goto LABEL_b32ac0;
                    goto LABEL_b32a98;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/sskdf.c", 454, "sskdf_derive");
                v47 = 137;
                goto LABEL_b32c80;
            }
            goto LABEL_b32c80;
        }
        else if (v21)
        {
            v24 = (unsigned int)sub_a50ac8(v21);
            if (v24 >= 1)
            {
                v25 = 0;
                v26 = 0;
                if (a0->field_48)
                    goto LABEL_b32a90;
LABEL_b32a98:
                v28 = v24;
                v29 = sub_a6bffc(v28, "providers/implementations/kdfs/sskdf.c", 459);
                a0->field_48 = v29;
                if (v29)
                {
                    a0->field_50 = v28;
LABEL_b32ac0:
                    if (n + 0xffffffffbfffffff < 0xffffffffc0000000)
                    {
                        if (*(long long *)&g_10002b0 == v15)
                            return 0;
                        ___stack_chk_fail();
                    }
                    else if (0x40000000 >= a0->field_30)
                    {
                        v4 = a0->field_40;
                        if (0x40000000 >= a0->field_40)
                        {
                            v31 = *(long long *)&a0->padding_0[8];
                            v32 = *(long long *)&a0[1].padding_0[0];
                            v2 = *(long long *)&a0->padding_11[23];
                            v3 = a0->field_30;
                            v1 = a0->field_38;
                            v8 = v32;
                            if (v23)
                            {
LABEL_b32b1c:
                                v37 = 0;
LABEL_b32b20:
                                if (!v37)
                                    v38 = &v9;
                                else
                                    v38 = v37;
                                if (sub_a58104() && !(v39 = sub_a58044(v31), !v39))
                                {
                                    v40 = v39;
                                    if (v37 || 64 >= v40)
                                    {
                                        v41 = v32;
                                        v5 = (unsigned int)&g_1000000;
                                        v42 = sub_a57f5c(v31);
                                        if (v42)
                                        {
                                            v0 = v38;
                                            v43 = 2;
                                            while (1)
                                            {
                                                if (!sub_a58164(v42, &v5, 4) || !sub_a58164(v42, v2, v3) || !sub_a58164(v42, v1, v4))
                                                {
LABEL_b32e20:
                                                    v30 = 0;
                                                    v46 = v42;
                                                    break;
                                                }
                                                v44 = v42;
                                                if (n >= v40)
                                                {
                                                    if (!sub_a58170(v44, iter, 0, n))
                                                        goto LABEL_b32e20;
                                                    if (n == v40)
                                                        goto LABEL_b32e14;
                                                    iter += v40;
                                                    sub_a57f0c(v42);
                                                    v5 = (((((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                                    v42 = sub_a57f5c(v31);
                                                    v30 = 0;
                                                    v46 = 0;
                                                    v43 += 1;
                                                    n -= v40;
                                                    if (!v42)
                                                        break;
                                                }
                                                else
                                                {
                                                    if (!sub_a58170(v44, v0, 0, v40))
                                                        goto LABEL_b32e20;
                                                    _memcpy(iter, v0, n);
LABEL_b32e14:
                                                    v30 = 1;
                                                    v46 = v42;
                                                    break;
                                                }
                                            }
                                            goto LABEL_b32cd4;
                                        }
                                        goto LABEL_b32ccc;
                                    }
                                }
                                else
                                {
                                    v41 = v32;
LABEL_b32ccc:
                                    v30 = 0;
                                    v46 = 0;
LABEL_b32cd4:
                                    if (v37)
                                    {
                                        sub_a6c4e8(v37, v41, "providers/implementations/kdfs/sskdf.c", 301);
                                        sub_a57f0c(v46);
                                        if (*(long long *)&g_10002b0 == v15)
                                            return v30;
                                        ___stack_chk_fail();
                                    }
                                    goto LABEL_b32dd4;
                                }
                            }
                            else
                            {
                                v33 = v25;
                                v34 = v26;
                                sub_a71bbc(sub_a71670("custom", v33, v34), v33, v34);
                                v12 = v5;
                                v13 = v6;
                                v14 = v7;
                                if (sub_a58410(v31, &v9))
                                {
                                    if (!v32)
                                    {
                                        v8 = n;
LABEL_b32d70:
                                        sub_a70ed8("size", &v8);
                                        v9 = v5;
                                        v10 = v6;
                                        v11 = v7;
                                        if ((int)sub_a58410(v31, &v9) >= 1)
                                        {
                                            if (v8 < 65)
                                                goto LABEL_b32b1c;
                                            v37 = sub_a6bffc(v8, "providers/implementations/kdfs/sskdf.c", 222);
                                            if (v37)
                                                goto LABEL_b32b20;
                                        }
                                    }
                                    else if (v32 == n || (v36 = __ROL__(v32 - 20, 62), 11 >= __ROL__(v32 - 20, 62) && 1 << ((char)(__ROL__(v32 - 20, 62)) & 63) & 2189))
                                    {
                                        goto LABEL_b32d70;
                                    }
                                }
                            }
                            v46 = 0;
                            v30 = 0;
LABEL_b32dd4:
                            sub_a66ec0(&v9, 64);
                            sub_a57f0c(v46);
                            if (*(long long *)&g_10002b0 == v15)
                                return v30;
                            ___stack_chk_fail();
                        }
                    }
                }
            }
        }
        else
        {
            sub_a368c8();
            v27 = 439;
LABEL_b32c4c:
            sub_a369bc("providers/implementations/kdfs/sskdf.c", v27, "sskdf_derive");
            v47 = 129;
LABEL_b32c80:
            sub_a36abc(57, v47, 0);
        }
    }
    if (*(long long *)&g_10002b0 == v15)
        return 0;
    ___stack_chk_fail();
}
