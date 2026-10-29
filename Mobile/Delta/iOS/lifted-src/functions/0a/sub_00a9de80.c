/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9de80..0xa9e430 (1456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;
extern char g_10002b0;

unsigned long long sub_a9de80(long long a0, long long *a1, unsigned long long a2, unsigned long a3, long long a4, long long a5, unsigned long long a6)
{
    long long *v12;  // x20
    unsigned long long v13;  // x25
    unsigned long long v23;  // x26
    unsigned long long v24;  // x0
    unsigned long long v25;  // x0
    unsigned long long v26;  // x0
    unsigned long long v27;  // x0
    unsigned long long v28;  // x23
    unsigned long long v29;  // x0
    unsigned long long v30;  // x25
    unsigned long long v31;  // x24
    unsigned long long v14;  // x19
    unsigned long long v32;  // x0
    unsigned long long v15;  // x27
    unsigned long long v16;  // x0
    unsigned long long v17;  // x26
    unsigned long long v18;  // x28
    unsigned long long v19;  // w0
    unsigned int v20;  // w8
    unsigned long long v0;  // [bp-0x4c8]
    unsigned long long v1;  // [bp-0x4c0]
    unsigned long long v2;  // [bp-0x4b0]
    unsigned long long v3;  // [bp-0x4a0]
    char v4;  // [bp-0x490]
    unsigned long long v5;  // [bp-0x488]
    unsigned long long v6;  // [bp-0x480]
    unsigned long long v7;  // [bp-0x478]
    unsigned long long v8;  // [bp-0x470]
    unsigned long v9;  // [bp-0x70]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a1;
    v9 = *(long long *)&g_10002b0;
    v2 = 0;
    v3 = 0;
    v1 = 0;
    v13 = sub_9d46fc();
    if (!(v13 >> 31 & 1))
    {
        v14 = 0;
        goto LABEL_a9df28;
    }
    else
    {
        v14 = sub_9d3c1c(sub_9d2f74());
        if (v14)
        {
            a0 = sub_9d4ec8();
            v13 = sub_9d46fc(a0, 133, 0, 0);
LABEL_a9df28:
            if (sub_a76db8() && sub_a76f68(&v1))
            {
                sub_a36c8c();
                v8 = 0;
                v15 = sub_9d46fc(a0, 133, 0, 0);
                if (!(v15 >> 31 & 1) && (v16 = sub_a2e274(&v8, "PEM", 0, 0, a6, a4, a5), v16))
                {
                    v17 = v16;
                    if (sub_a2de70())
                    {
                        v0 = v12;
                        sub_a36c8c();
                        if (!sub_a2beb4(v17, a0) || !v8)
                        {
                            do
                            {
                                if (!sub_9d46fc(a0, 2, 0, 0) && !(v18 = sub_9d46fc(a0, 133, 0, 0), v18 >> 31 & 1 || (int)v18 <= (int)v15))
                                {
                                    v19 = (unsigned int)sub_a35fe4();
                                    if (0 <= v19)
                                        v20 = (unsigned int)&g_7fffff;
                                    else
                                        v20 = 0x7fffffff;
                                    if ((v20 & v19) != 524556)
                                        goto LABEL_a9e0ac;
                                }
                                else
                                {
LABEL_a9e0ac:
                                    sub_a36e70();
                                    goto LABEL_a9e0ec;
                                }
                                sub_a36c8c(sub_a36cd4());
                                v15 = v18;
                            } while (!sub_a2beb4(v17, a0) || !(v15 = v18, v8));
                        }
                        sub_a36cd4();
                        if (sub_a54c94())
                        {
                            v12 = v0;
                            if (v12)
                            {
                                sub_a5a4c8(*v12);
                                *v12 = v8;
                            }
                        }
                        else
                        {
                            v8 = 0;
                            sub_a368c8(sub_a5a4c8(v8));
                            sub_a369bc("crypto/pem/pem_pkey.c", 0x55, "pem_read_bio_key_decoder");
                            sub_a36abc(9, 126, 0);
LABEL_a9e0ec:
                            v12 = v0;
                        }
                    }
                    sub_a2d974(v17);
                    v23 = v8;
                    if (v23)
                    {
LABEL_a9e3c4:
                        sub_a36cd4();
                        goto LABEL_a9e3d4;
                    }
                }
                if (!(sub_9d46fc(a0, 128, (int)v13, 0) >> 31 & 1))
                {
                    v7 = 0;
                    v5 = 0;
                    sub_a36c8c();
                    if (!(a6 & 1))
                    {
                        if (!sub_a9c07c())
                            goto LABEL_a9e21c;
LABEL_a9e164:
                        sub_a36e70();
                        v6 = v5;
                        if (!_strcmp(v7, "PRIVATE KEY"))
                        {
                            v32 = sub_9ca7fc(0, &v6, v4);
                            if (!v32)
                                goto LABEL_a9e324;
                            v23 = sub_a51458();
                            if (v12)
                            {
                                sub_a5a4c8(*v12);
                                *v12 = v23;
                            }
                            sub_9ca820(v32);
                            goto LABEL_a9e320;
                        }
                        if (_strcmp(v7, "ENCRYPTED PRIVATE KEY"))
                        {
                            v24 = sub_a9db70(v7, "PRIVATE KEY");
                            if ((int)v24 >= 1)
                            {
                                v25 = sub_9c5edc(0, v7, v24);
                                if (v25 && *(long long *)(v25 + 184))
                                {
                                    v26 = sub_9c8f34(*(int *)v25, v12, &v6, v4, a4, a5);
                                    goto LABEL_a9e314;
                                }
                                goto LABEL_a9e324;
                            }
                            else
                            {
                                if (((unsigned int)a6 & 3) != 2)
                                    goto LABEL_a9e324;
                                v26 = sub_afb528(v12, &v6, v4);
LABEL_a9e314:
                                v23 = v26;
                                goto LABEL_a9e320;
                            }
                            goto LABEL_a9e320;
                        }
                        v27 = sub_9d043c(0, &v6, v4);
                        if (v27)
                        {
                            v28 = v27;
                            v29 = sub_a774bc(&v8, 0x400, 0, &v1);
                            if (!(v29 >> 31 & 1))
                            {
                                v30 = v29;
                                v31 = sub_aa1f80(v28, &v8, v30);
                                sub_9d0454(v28);
                                sub_a66ec0(&v8, v30 & 0xffffffff);
                                if (!v31)
                                    goto LABEL_a9e31c;
                                v23 = sub_a51458(v31, a4, a5);
                                if (v12)
                                {
                                    sub_a5a4c8(*v12);
                                    *v12 = v23;
                                }
                                sub_9ca820(v31);
                                goto LABEL_a9e320;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/pem/pem_pkey.c", 159, "pem_read_bio_key_legacy");
                                sub_a36abc(9, 104, 0);
                                sub_9d0454(v28);
LABEL_a9e394:
                                v23 = 0;
                            }
                        }
                        else
                        {
LABEL_a9e31c:
                            v23 = 0;
LABEL_a9e320:
                            if (v23)
                                goto LABEL_a9e398;
LABEL_a9e324:
                            if (!sub_a36000())
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/pem/pem_pkey.c", 207, "pem_read_bio_key_legacy");
                                sub_a36abc(9, 0x8000d, 0);
                                goto LABEL_a9e394;
                            }
                        }
LABEL_a9e398:
                        sub_a6ce98(v7, "crypto/pem/pem_pkey.c", 209);
                        sub_a6d4c0(v5, v4, "crypto/pem/pem_pkey.c", 210);
                        if (v23)
                            goto LABEL_a9e3c4;
                    }
                    else
                    {
                        if (sub_a9c580(&v5, &v4, &v7, "ANY PRIVATE KEY", a0, sub_a774bc, &v1))
                            goto LABEL_a9e164;
LABEL_a9e21c:
                        sub_a36cd4();
                    }
                }
                sub_a36e70();
            }
            v23 = 0;
LABEL_a9e3d4:
            sub_a76d20(&v1);
            if (v14)
            {
                sub_9d4f1c(v14);
                sub_9d3c28(v14);
            }
        }
        else
        {
            v23 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v9)
        return v23;
    ___stack_chk_fail();
}
