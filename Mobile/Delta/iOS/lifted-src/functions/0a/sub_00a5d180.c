/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5d180..0xa5d5a8 (1064 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a5ed54;
extern long long g_f08ea0;
extern char g_f12a40;

unsigned long long sub_a5d180(long long a0, unsigned long long index, unsigned long long a2, unsigned long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long v4;  // x22
    unsigned long long v5;  // x24
    unsigned long long v14;  // x0
    unsigned long long v15;  // x28
    unsigned long long v16;  // x26
    unsigned long long idx;  // x27
    unsigned long long v18;  // w0
    unsigned long v19;  // cc_dep1
    unsigned long long v20;  // x9
    unsigned long long v21;  // 4108
    unsigned long long v22;  // 4108
    unsigned long long v23;  // x8
    unsigned long long v6;  // 4186
    unsigned long long v24;  // w8
    unsigned long long v25;  // x0
    unsigned long long v7;  // 4118
    unsigned long long v8;  // 4112
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // w27
    unsigned long v0;  // [bp-0x170]
    unsigned int v1;  // [bp-0x168]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v5 = a2;
    v6 = arm64g_calculate_condition(1, a5 & 0xffffffff, 1, 0);
    if (v6 & 1)
    {
        if (index)
        {
            if (*(long long *)(index + 96))
            {
                v4 = sub_c4ba8(*(long long *)(index + 96));
                goto LABEL_a5d220;
            }
            a5 = *(int *)index;
            v7 = arm64g_calculate_condition(0x11, a5 & 0xffffffff, 1, 0);
            if (!(v7 & 1))
            {
LABEL_a5d41c:
                if (v5)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/pmeth_lib.c", 192, "int_ctx_new");
                    sub_a36abc(6, 156, 0);
                    return 0;
                }
                v11 = 0;
                a5 = 0xffffffff;
                v13 = 1;
LABEL_a5d480:
                v5 = 0;
                if (1)
                    goto LABEL_a5d4f8;
LABEL_a5d1e4:
                if (v11)
                {
                    v15 = 0;
                    v16 = 0;
                    goto LABEL_a5d1f0;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/pmeth_lib.c", 295, "int_ctx_new");
                    sub_a36abc(6, 156, 0);
                    v16 = 0;
                    idx = 0;
                    v15 = 1;
LABEL_a5d354:
                    if (idx)
                        v24 = (unsigned int)v15;
                    else
                        v24 = 1;
                    if (v5 && v24)
                        sub_a32e7c(v5);
                    if (!idx)
                    {
                        sub_a55830(v16);
                        return idx;
                    }
                    if (a4)
                    {
                        v25 = sub_a6d9b4(a4, "crypto/evp/pmeth_lib.c", 310);
                        *(unsigned long long *)(idx + 16) = v25;
                        if (!v25)
                        {
                            sub_a6c2e4(idx, "crypto/evp/pmeth_lib.c", 312);
                            sub_a55830(v16);
                            return 0;
                        }
                    }
                    *(long long *)(idx + 8) = a0;
                    *(unsigned long *)(idx + 24) = v4;
                    *(unsigned long long *)(idx + 32) = v16;
                    *(unsigned int *)(idx + 116) = a5;
                    *(unsigned long long *)(idx + 120) = v11;
                    *(unsigned long long *)(idx + 128) = v5;
                    *(unsigned int *)idx = 0;
                    if (index && !sub_a5bba8(index))
                    {
                        sub_a5d6b0(idx);
                        return 0;
                    }
                    *(unsigned long long *)(idx + 0x88) = index;
                    if (v15 & 1)
                    {
                        return idx;
                    }
                    else if (*(long long *)(v11 + 8))
                    {
                        (*(long long *)(v11 + 8))();
                    }
                    else
                    {
                        return idx;
                    }
                }
            }
        }
        else
        {
LABEL_a5d220:
            if (!v4 || (a5 = sub_a5b060(v4), !(unsigned int)a5 || (v8 = arm64g_calculate_condition(0x11, a5 & 0xffffffff, 1, 0), !(v8 & 1))))
                goto LABEL_a5d41c;
        }
    }
    if (v5)
    {
        v4 = 0;
LABEL_a5d1c8:
        if (!sub_a32d54(v5))
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/pmeth_lib.c", 219, "int_ctx_new");
            sub_a36abc(6, 0x80026, 0);
            return 0;
        }
        goto LABEL_a5d1d4;
    }
    else if (index)
    {
        if (!(*(char *)(index + 76) & 1))
            v4 = sub_a9976c(a5);
        v5 = *(long long *)(index + 24);
        if (*(long long *)(index + 24) || (v5 = *(long long *)(index + 16), *(long long *)(index + 16)))
            goto LABEL_a5d1c8;
        v5 = sub_a3547c(a5);
        if (v5)
            goto LABEL_a5d408;
        if (*(char *)(index + 76) & 1)
        {
            if (!*(long long *)&g_f12a40 || (v1 = a5, v10 = sub_ad66d4(*(long long *)&g_f12a40, &v1), v10 >> 31 & 1 || (v11 = sub_ad69f8(*(long long *)&g_f12a40, v10), !v11)))
            {
                v1 = a5;
                v0 = &v1;
                v12 = sub_a99ef4(&v0, &g_f08ea0, 10, 8, &g_a5ed54);
                if (v12 && *(long long *)v12)
                    (*(long long *)v12)();
                v11 = 0;
            }
            v13 = 0;
            goto LABEL_a5d480;
        }
LABEL_a5d4b0:
        if (*(long long *)&g_f12a40 && !(v1 = a5, v14 = sub_ad66d4(*(long long *)&g_f12a40, &v1), v14 >> 31 & 1))
            v11 = sub_ad69f8(*(long long *)&g_f12a40, v14);
        else
            v11 = 0;
        v13 = 0;
        v5 = 0;
        if (!v11)
        {
            v5 = 0;
LABEL_a5d4f8:
            if (v4)
            {
                if (!index || !*(long long *)(index + 96))
                {
                    v16 = sub_a55808(a0, v4, a4);
                }
                else if (sub_a2d050(*(long long *)(index + 96)))
                {
                    v16 = *(long long *)(index + 96);
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/pmeth_lib.c", 0xff, "int_ctx_new");
                    sub_a36abc(6, 134, 0);
                    return 0;
                }
                if (!v16)
                    return 0;
                v18 = (unsigned int)sub_9e4290(v16);
                v19 = v18;
                if (v18)
                {
                    v20 = v13;
                    v21 = arm64g_calculate_condition(3, v19, 0, 0);
                    if (!(v21 & 1))
                        goto LABEL_a5d542;
LABEL_a5d541:
                    v23 = a5 & 0xffffffff;
                }
                else
                {
                    v20 = 1;
                    v22 = arm64g_calculate_condition(3, v19, 0, 0);
                    if (v22 & 1)
                        goto LABEL_a5d541;
LABEL_a5d542:
                    v23 = v18;
                }
                if (v20 & 1)
                {
                    a5 = v23;
                }
                else if ((unsigned int)a5 != v18)
                {
                    sub_c67f54(v16);
                    return 0;
                }
                v5 = 0;
                v15 = !v11;
LABEL_a5d1f0:
                idx = sub_a6bffc(176, "crypto/evp/pmeth_lib.c", 297);
                goto LABEL_a5d354;
            }
        }
    }
    else
    {
        v4 = sub_a9976c(a5);
        v5 = sub_a3547c(a5);
        if (!v5)
            goto LABEL_a5d4b0;
LABEL_a5d408:
LABEL_a5d1d4:
        v11 = sub_a35498(v5, a5);
        goto LABEL_a5d1e4;
    }
    goto LABEL_a5d1e4;
}
