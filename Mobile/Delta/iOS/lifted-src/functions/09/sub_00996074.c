/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x996074..0x9964f8 (1156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_996074_0 {
    long long field_0;
    long long field_8;
    char padding_10[4];
    int field_14;
    char padding_18[4];
    int field_1c;
} st_996074_0;


int sub_996074(st_996074_0 *a0, unsigned int a1, long long a2, unsigned long a3, long long a4, long long a5, long long a6, unsigned long long a7, unsigned long a8, long long a9, unsigned int a10, long long a11, unsigned long long a12)
{
    long long v1;  // x25
    unsigned long long v2;  // x0
    long long v11;  // x1
    unsigned long long v12;  // x0
    unsigned int v13;  // w8
    unsigned int v14;  // w0
    unsigned long long v15;  // x8
    unsigned long long v16;  // x0
    unsigned long long v3;  // x20
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    long long v6;  // x1
    unsigned long v7;  // x0
    unsigned long long v8;  // x22
    long long v9;  // x0
    char *v0;  // [bp-0x10]

    v0 = &a8;
    v1 = a0->field_1c == 1;
    if (a1 != 3)
    {
LABEL_996368:
        return -0x2;
    }
    v2 = sub_a4bc70();
    a0[129].field_0 = v2;
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls1_meth.c", 37, "tls1_set_crypto_state");
        sub_996e84(a0, 80, 0x80006, 0);
        return -0x2;
    }
    v3 = v2;
    v4 = sub_a3f728();
    *(unsigned long long *)a0[129].padding_18 = v4;
    if (!v4)
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls1_meth.c", 45, "tls1_set_crypto_state");
        sub_996e84(a0, 80, 0xc0103, 0);
        return -0x2;
    }
    if (a12 && (v5 = sub_9f2a70(a12), a0[130].field_0 = v5, !v5))
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls1_meth.c", 52, "tls1_set_crypto_state");
        v6 = 142;
        goto LABEL_996360;
    }
    if (!(sub_a2cf88(a8) >> 21 & 1))
    {
        v7 = a10;
        if ((unsigned int)v7 == 855)
        {
            v8 = sub_a5a654(a0->field_0, "HMAC", a0->field_8, a6, a7);
            if (v8)
                goto LABEL_9961d0;
        }
        else
        {
            v8 = sub_a5ce78(v7, 0, a6, a7);
            if (v8)
            {
LABEL_9961d0:
                v9 = sub_a50a58(a11);
                if ((int)sub_a565c4(*(long long *)a0[129].padding_18, 0, v9, a0->field_0, a0->field_8, v8, 0) > 0)
                {
                    sub_a5a4c8(v8);
                    goto LABEL_996208;
                }
            }
        }
        sub_a368c8(sub_a5a4c8(v8));
        v11 = 82;
    }
    else
    {
LABEL_996208:
        if (sub_a4fdf4(a8) == 6)
        {
            if (sub_a4c694(v3, a8, 0, a2, 0, v1) && 0 < (int)sub_a4d5dc(v3, 18, a5, a4))
                goto LABEL_9963ac;
            sub_a368c8();
            v11 = 93;
        }
        else if (sub_a4fdf4(a8) == 7)
        {
            if (sub_a4c694(v3, a8, 0, 0, 0, v1) && (int)sub_a4d5dc(v3, 9, 12, 0) >= 1 && (int)sub_a4d5dc(v3, 0x11, a9, 0) >= 1 && (int)sub_a4d5dc(v3, 18, a5, a4) >= 1 && sub_a4c694(v3, 0, 0, a2, 0, v1))
                goto LABEL_9963ac;
            sub_a368c8();
            v11 = 108;
        }
        else if (sub_a4c694(v3, a8, 0, a2, a4, v1))
        {
LABEL_9963ac:
            v12 = sub_a2cf88(a8);
            if (!a7 || !(v12 >> 21 & 1) || (int)sub_a4d5dc(v3, 23) > 0)
            {
                if (!sub_9ffdd8(sub_a2d030(v3)) || sub_996ed0(a0, v3, a8, a11))
                {
                    v13 = a0->field_14;
                    if (65276 >= (int)v13)
                    {
                        if (v13 - 770 >= 2 && v13 != 0x100)
                            return 1;
                    }
                    else
                    {
                        if (v13 != 0xfeff && v13 != 65277)
                            return 1;
                    }
                    v14 = sub_a4fdf4(sub_a2d030(v3));
                    if (2 > v14 - 6)
                    {
                        *(unsigned long long *)a0[129].padding_10 = 8;
                        return 1;
                    }
                    else if (v14 == 2)
                    {
                        v16 = sub_a4fbf0(v3);
                        if (v16 >> 31 & 1)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/record/methods/tls1_meth.c", 145, "tls1_set_crypto_state");
                            sub_996e84(a0, 80, 274, 0);
                            return -0x2;
                        }
                        if ((unsigned int)v16 < 2)
                            v15 = 0;
                        else
                            v15 = v16 & 0xffffffff;
                        *(unsigned long long *)a0[129].padding_10 = v15;
                        return 1;
                    }
                    else
                    {
                        *(unsigned long long *)a0[129].padding_10 = 0;
                        return 1;
                    }
                }
                goto LABEL_996368;
            }
            else
            {
                sub_a368c8();
                v11 = 123;
            }
        }
        else
        {
            sub_a368c8();
            v11 = 113;
        }
    }
    sub_a369bc("ssl/record/methods/tls1_meth.c", v11, "tls1_set_crypto_state");
    v6 = 786691;
LABEL_996360:
    sub_a36abc(20, v6, 0);
    goto LABEL_996368;
}
