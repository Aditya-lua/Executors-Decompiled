/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e89c..0xb2eb78 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e89c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[16];
    long long field_40;
    long long field_48;
    char padding_50[8];
    unsigned long long field_58;
    unsigned int field_60;
    unsigned int field_64;
    unsigned int field_68;
} st_b2e89c_0;

extern char g_10002b0;

long long sub_b2e89c(st_b2e89c_0 *a0, long long a1, unsigned long a2, long long a3)
{
    unsigned long v18;  // x0
    unsigned long v19;  // x21
    unsigned int v21;  // w0
    unsigned long v22;  // x23
    unsigned long v23;  // x21
    long long v24;  // x22
    long long v25;  // x23
    unsigned int v26;  // w8
    long long v27;  // x1
    unsigned long v0;  // [bp-0x110]
    unsigned long v1;  // [bp-0x108]
    unsigned int v2;  // [bp-0x100]
    unsigned int v3;  // [bp-0xfc]
    long long v4;  // [bp-0xf8]
    unsigned long v5;  // [bp-0xf0]
    unsigned int v6;  // [bp-0xe8]
    uint128_t v7;  // [bp-0xd8]
    uint128_t v8;  // [bp-0xc8]
    unsigned long long v9;  // [bp-0xb8]
    unsigned long v10;  // [bp-0xb0]
    char v11;  // [bp-0xa8]
    uint128_t v12;  // [bp-0x80]
    uint128_t v13;  // [bp-0x70]
    unsigned long long v14;  // [bp-0x60]
    unsigned long v15;  // [bp-0x58]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    v18 = sub_a2f9e0();
    if ((unsigned int)v18)
    {
        v18 = sub_b2eb84(a0, a3);
        if ((unsigned int)v18)
        {
            v19 = a0->field_10;
            if (v19)
            {
                if (a2)
                {
                    if (a0->field_64)
                    {
                        v10 = a2;
                        sub_a71bbc(sub_a70ed8("size", &v10), &v10);
                        v12 = v7;
                        v13 = v8;
                        v14 = v9;
                        if ((int)sub_a58410(v19, &v11) >= 1)
                        {
                            v21 = sub_a58164(v19, a0->field_40, a0->field_48);
                            if (v21)
                                v21 = sub_a58170(v19, a1, 0, v10) != 0;
                        }
                        else
                        {
                            v21 = 0;
                        }
                        v22 = 0;
                        v23 = 0;
                        if (v21)
                        {
LABEL_b2ea84:
                            v18 = 1;
                            goto LABEL_b2eb08;
                        }
                    }
                    else
                    {
                        v23 = sub_a58044(v19);
                        if (v23)
                        {
                            if (a0->field_58 && a0->field_58 != v23)
                            {
                                v24 = 154;
                                v25 = 336;
                                goto LABEL_b2ea40;
                            }
                            if (a0->field_8 || !(a2 / v23 >> ((char)a0->field_18 & 63)))
                            {
                                v22 = sub_a6bffc(v23, "providers/implementations/kdfs/kbkdf.c", 352);
                                if (v22)
                                {
                                    if (!a0->field_60)
                                        v26 = 0;
                                    else
                                        v26 = ((((((unsigned int)a2 * 8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)a2 * 8 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((unsigned int)a2 * 8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)a2 * 8 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                    v6 = a0->field_18;
                                    v4 = a1;
                                    v5 = a2;
                                    v0 = v22;
                                    v1 = v23;
                                    v2 = v26;
                                    v3 = a0->field_68;
                                    if (sub_b2ee8c())
                                        goto LABEL_b2ea84;
                                }
                            }
                            else
                            {
                                v24 = 105;
                                v25 = 344;
LABEL_b2ea40:
                                sub_a368c8();
                                sub_a369bc("providers/implementations/kdfs/kbkdf.c", v25, "kbkdf_derive");
                                sub_a36abc(57, v24, 0);
                                goto LABEL_b2ea6c;
                            }
                        }
                        else
                        {
LABEL_b2ea6c:
                            v22 = 0;
                        }
                    }
                    sub_a66ec0(a1, a2);
                    v18 = 0;
LABEL_b2eb08:
                    sub_a6c4e8(v22, v23, "providers/implementations/kdfs/kbkdf.c", 362);
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/kbkdf.c", 321, "kbkdf_derive");
                    v27 = 105;
LABEL_b2ea08:
                    sub_a36abc(57, v27, 0);
                    v18 = 0;
                }
            }
            else
            {
                if (a0->field_28 && a0->field_20)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/kbkdf.c", 315, "kbkdf_derive");
                    v27 = 150;
                    goto LABEL_b2ea08;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/kbkdf.c", 310, "kbkdf_derive");
                    v27 = 114;
                    goto LABEL_b2ea08;
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v15)
        return v18;
    ___stack_chk_fail();
}
