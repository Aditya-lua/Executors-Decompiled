/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1516c..0xb15540 (980 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b1516c_2 {
    long long field_0;
    struct st_b1516c_0 *field_8;
    unsigned long long field_10;
} st_b1516c_2;

typedef struct st_b1516c_0 {
    unsigned int field_0;
    char padding_4[20];
    struct st_b1516c_1 *field_18;
    struct st_b1516c_1 *field_20;
    char padding_28[8];
    struct st_b1516c_1 *field_30;
} st_b1516c_0;

typedef struct st_b1516c_1 {
    unsigned long long field_0;
} st_b1516c_1;

extern char g_10002b0;

unsigned long long sub_b1516c(st_b1516c_2 *a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long a4, long long a5, long long a6)
{
    unsigned long long v13;  // x0
    unsigned long long v14;  // x20
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x23
    long long v18;  // x21
    long long v19;  // x22
    unsigned long long v20;  // w2
    unsigned long long v21;  // x0
    unsigned long long v0;  // [bp-0x140]
    unsigned long long v1;  // [bp-0x138]
    unsigned long long v2;  // [bp-0x134]
    char v3;  // [bp-0x130]
    unsigned int v4;  // [bp-0x12c]
    char *v5;  // [bp-0x128], Other Possible Types: unsigned long long
    unsigned long long v6;  // [bp-0x120]
    unsigned long long v7;  // [bp-0x110]
    unsigned long long v8;  // [bp-0x100]
    char v9;  // [bp-0x78]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v13 = sub_afd760(a0->field_0);
    v1 = 0xffffffff;
    v2 = 0xffffffff;
    v0 = 0;
    if (v13)
    {
        v14 = v13;
        if (sub_9d3d84() != 16)
        {
            v17 = 0;
            v18 = 123;
            v19 = 111;
            goto LABEL_b15270;
        }
        sub_a36c8c();
        v5 = &v9;
        v15 = sub_a9e490(&v5, 16, &v3, &v4, &v2, &v1);
        sub_a36cd4(v15, 16, &v3, &v4, &v2, &v1);
        if ((int)v15 >= 1)
        {
            *(unsigned int *)&a0->field_10 = a2;
            if (v2)
            {
                if (a0->field_8->field_0 == 116)
                    goto LABEL_b15238;
                goto LABEL_b152a8;
            }
            if (a0->field_8->field_0 != 6)
                goto LABEL_b152a8;
LABEL_b15238:
            v16 = sub_a9e750(v4);
            if ((unsigned int)v16 > 0x19000)
            {
                v17 = 0;
                v18 = 128;
                v19 = 130;
                goto LABEL_b15270;
            }
            else
            {
                v17 = sub_a6bf4c(v16 & 0xffffffff, "providers/implementations/encode_decode/decode_msblob2key.c", 133);
                if (!v17)
                {
LABEL_b15464:
                    v21 = v14;
LABEL_b152d4:
                    sub_9d3c28(v21);
                    sub_a6c2e4(v17, "providers/implementations/encode_decode/decode_msblob2key.c", 202);
                    a0->field_8->field_30();
                }
                v5 = v17;
                if (sub_9d3d84(v14, v17, v16) == (unsigned int)v16)
                {
                    if ((unsigned int)a2)
                    {
                        v20 = v1;
                        if (!(a2 & 1) || v20)
                            goto LABEL_b153fc;
                    }
                    else if (v1)
                    {
                        goto LABEL_b15404;
                    }
                    if (a0->field_8->field_18)
                    {
                        v7 = 0;
                        v8 = 0;
                        v6 = 0;
                        if (sub_a76e48(&v6, a5, a6))
                        {
                            v5 = v17;
                            a0->field_8->field_18();
                        }
                        goto LABEL_b15464;
                    }
                    v20 = v1;
                    if (!(unsigned int)a2)
                        goto LABEL_b15400;
LABEL_b153fc:
                    if (a2 >> 1 & 1)
                    {
LABEL_b15400:
                        if (v20)
                        {
LABEL_b15404:
                            if (a0->field_8->field_20)
                            {
                                v5 = v17;
                                a0->field_8->field_20();
                            }
                        }
                    }
                }
                else
                {
                    v18 = 123;
                    v19 = 138;
LABEL_b15270:
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/decode_msblob2key.c", v19, "msblob2key_decode");
                    sub_a36abc(9, v18, 0);
                }
            }
        }
        else
        {
LABEL_b152a8:
            v17 = 0;
        }
        sub_a6c2e4(v17, "providers/implementations/encode_decode/decode_msblob2key.c", 180);
        sub_9d3c28(v14);
        v21 = 0;
        v17 = 0;
        goto LABEL_b152d4;
    }
    else
    {
        if (*(long long *)&g_10002b0 == v10)
            return 0;
        ___stack_chk_fail();
    }
}
