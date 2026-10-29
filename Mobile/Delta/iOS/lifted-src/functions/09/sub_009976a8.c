/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9976a8..0x99805c (2484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9976a8_1 {
    char padding_0[4];
    unsigned int field_4;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[2280];
    unsigned int field_918;
    char padding_91c[4];
    unsigned long long field_920;
    unsigned long long field_928;
} st_9976a8_1;

typedef struct st_9976a8_0 {
    char field_0;
    char padding_1[2];
    unsigned short field_3;
} st_9976a8_0;

extern char g_10002b0;

unsigned long long sub_9976a8(void* a0)
{
    unsigned long long v3;  // w0
    unsigned long long v4;  // x8
    void* v13;  // x26
    unsigned long long v14;  // x1
    unsigned long v15;  // x8
    unsigned long long v16;  // x8
    unsigned int v17;  // w8
    st_9976a8_0 *v18;  // x8
    unsigned long v19;  // x8
    void* v20;  // x21
    unsigned long long v21;  // x8
    void* v22;  // x0
    unsigned long long v5;  // x9
    long long v23;  // x1
    long long v24;  // x2
    unsigned int v25;  // w0
    unsigned long long v26;  // x23
    st_9976a8_1 *v27;  // x22
    unsigned long long v6;  // x10
    unsigned long long v7;  // x25
    long long v8;  // x10
    unsigned long long v9;  // x24
    long long v10;  // x22
    unsigned long long v11;  // x23
    unsigned int v12;  // w8
    unsigned long v0;  // [bp-0x78]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if ((long long)a0[1696] || sub_9972a0(a0))
    {
        v4 = 0;
        v5 = 0;
        v6 = (long long)a0[4408];
        if (1 >= (unsigned long long)(long long)a0[4408])
            v6 = 1;
        v7 = v6 - 1;
        v8 = 16;
        while (1)
        {
            v9 = v5;
            v10 = v8;
            v11 = v4;
            if ((int)a0[4072] != 241 || 4 >= (unsigned long long)(long long)a0[0xff8])
                (*(long long *)((long long)a0[4416] + 32))();
            v12 = *(int *)((char *)a0 + v4 + 1744);
            v13 = a0 + v11;
            if (v12 == 2)
                v14 = (long long)v13[1752] - 3;
            else
                v14 = (long long)v13[1752];
            if (v14)
                (*(long long *)((long long)a0[4416] + 32))();
            *(unsigned int *)&a0[4072] = 240;
            v15 = 5;
            if (v12 == 2)
                v15 = 2;
            v16 = (long long)a0[0xff0] + v15;
            *(unsigned long long *)&v13[1784] = v16;
            *(unsigned long long *)&v13[1776] = v16;
            *(long long *)&v13[1760] = (long long)v13[1752];
            *(unsigned long long *)&a0[0xff8] = 0;
            *(unsigned int *)&a0[4308] = 0;
            if (v7 == v9)
                break;
            if (*(int *)((char *)a0 + v11 + 1748) == 23)
            {
                v17 = (int)a0[20];
                if (65276 >= (int)v17)
                {
                    if (v17 - 770 >= 2 && v17 != 0x100)
                        goto LABEL_9979bc;
                }
                else
                {
                    if (v17 != 0xfeff && v17 != 65277)
                        goto LABEL_9979bc;
                }
                if (!(long long)a0[4128] || !(sub_a2cf88(sub_a2d030((long long)a0[4128])) >> 23 & 1) || !(long long)a0[1696] || (unsigned long long)(long long)a0[1728] < 5 || !(v18 = (long long)a0[1696] + (long long)a0[1720], v18->field_0 == 23 && (v19 = (unsigned long long)(v18->padding_1)[1], v8 = v10 + 16, v4 = v11 + 72, v5 = v9 + 1, ((unsigned int)((v19 & 0xff00) >> 8) | (unsigned int)v19 * 0x100 & 0xff00ff00) + 5 <= (unsigned long long)(long long)a0[1728])))
                    goto LABEL_9979bc;
            }
            else
            {
LABEL_9979bc:
                v7 = v9;
                break;
            }
        }
        if (!(!v7 && (v20 = a0 + v11, (int)v20[1748] == 20 && (int)a0[20] == 772 && (int)a0[4168])))
        {
            if (!(long long)a0[4152] || !sub_a2d030((long long)a0[4152]))
            {
                v26 = 0;
                goto LABEL_997a98;
            }
            v25 = sub_a50ac8();
            if (63 >= v25 - 1)
            {
                v26 = v25;
LABEL_997a98:
                if ((int)a0[4272] && (long long)a0[4152])
                {
                    v27 = a0 + 1744;
                    if (v27->field_8 >= v26)
                    {
                        v27->field_8 = v27->field_8 - v26;
                        (*(long long *)((long long)a0[4416] + 16))();
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/record/methods/tls_common.c", 799, "tls_get_more_records");
                    v22 = a0;
                    v23 = 50;
                    v24 = 160;
                    goto LABEL_997cb8;
                }
                else
                {
                    if (v26)
                    {
                        if (!sub_a6bffc(v10, "ssl/record/methods/tls_common.c", 819))
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/record/methods/tls_common.c", 821, "tls_get_more_records");
                            v22 = a0;
                            v23 = 80;
                            v24 = 524303;
                            goto LABEL_997cb8;
                        }
                        else
                        {
                            sub_a36c8c();
                            (*(long long *)((long long)a0[4416] + 8))();
                        }
                    }
                    else
                    {
                        sub_a36c8c();
                        (*(long long *)((long long)a0[4416] + 8))();
                    }
                }
                goto LABEL_997cb8;
            }
            else
            {
                sub_c64f58(a0);
                v3 = 0xfffffffe;
            }
        }
        else if ((long long)v20[1752] == 1 && *(char *)(long long)v20[1776] == 1)
        {
            if ((long long)a0[4384])
                (long long)a0[4384]();
            *(unsigned int *)&v20[1748] = 22;
            v21 = (long long)a0[0x1010] + 1;
            *(unsigned long long *)&a0[0x1010] = v21;
            if (v21 >= 33)
            {
                sub_a368c8();
                sub_a369bc("ssl/record/methods/tls_common.c", 765, "tls_get_more_records");
                v22 = a0;
                v23 = 10;
                v24 = 262;
LABEL_997cb8:
                sub_996e84(v22, v23, v24, 0);
                v3 = 0xfffffffe;
            }
            else
            {
                *(unsigned long long *)&a0[4064] = 0;
                *(uint128_t *)&a0[4048] = 0;
                v3 = 1;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls_common.c", 752, "tls_get_more_records");
            v22 = a0;
            v23 = 10;
            v24 = 260;
            goto LABEL_997cb8;
        }
    }
    else
    {
        v3 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v0)
        return v3;
    ___stack_chk_fail();
}
