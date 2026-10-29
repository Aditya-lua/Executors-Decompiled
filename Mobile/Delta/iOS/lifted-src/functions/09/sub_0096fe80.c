/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96fe80..0x970188 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96fe80_2 {
    char padding_0[8];
    struct st_96fe80_3 *field_8;
    char padding_10[752];
    struct st_96fe80_0 *field_300;
    char padding_308[128];
    unsigned long long field_388;
    char padding_390[1392];
    struct st_96fe80_1 *field_900;
    struct st_96fe80_1 *field_908;
} st_96fe80_2;

typedef struct st_96fe80_0 {
    char padding_0[36];
    unsigned int field_24;
} st_96fe80_0;

typedef struct st_96fe80_1 {
    char padding_0[760];
    unsigned int field_2f8;
} st_96fe80_1;

typedef struct st_96fe80_3 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96fe80_3;


unsigned int sub_96fe80(st_96fe80_2 *a0, long long a1, long long a2, unsigned int a3, unsigned int a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9, long long a10, long long *a11, void* a12, long long *a13, unsigned long long *a14)
{
    unsigned int v2;  // w0
    unsigned long long v12;  // x0
    unsigned int v13;  // x0
    long long v14;  // x2
    st_96fe80_2 *v15;  // x0
    unsigned int v4;  // w0
    long long v5;  // x8
    long long v6;  // x2
    long long v7;  // x1
    unsigned int v8;  // x8
    long long v9;  // x1
    long long v10;  // x8
    long long v11;  // x0
    long long v0;  // [bp-0x70]
    char *v1;  // [bp-0x10]

    v1 = &a8;
    v2 = sub_a50ac8(a1);
    if ((int)v2 <= 0)
    {
        sub_c61544(a0);
        return 0;
    }
    *(unsigned int *)&v0 = 0;
    if (!sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, a1, a5, a7, a8, a6, v2, a9, v2, v0))
    {
LABEL_970078:
        sub_a368c8();
        v6 = "tls13_hkdf_expand";
        v7 = 113;
        goto LABEL_970090;
    }
    if (a3 == 855 && a4 && sub_a4fe08(a2, "NULL"))
    {
        v4 = sub_a50ac8(a4);
        if ((int)v4 > 0)
        {
            v5 = v4;
            *a14 = v5;
            *a13 = v5;
            *a11 = a0->field_388;
            goto LABEL_96ffa8;
        }
        else
        {
            sub_a368c8();
            v6 = "derive_secret_key_and_iv";
            v7 = 384;
LABEL_970090:
            sub_a369bc("ssl/tls13_enc.c", v7, v6);
            v15 = a0;
            v14 = 786691;
        }
    }
    else
    {
        *a11 = sub_9e4290(a2);
        if (sub_a4fdf4(a2) == 7)
        {
            *a13 = 12;
            v8 = (unsigned int)a0->field_300;
            if (a0->field_300 || (v8 = *(long long *)&a0->field_900->field_2f8, v8 || a0->field_908 && !(v8 = *(long long *)&a0->field_908->field_2f8, !v8)))
            {
                v10 = 8;
                if (!(*(int *)(v8 + 36) & 0x30000))
                    v10 = 16;
                *a14 = v10;
LABEL_96ffa8:
                v11 = *a13;
LABEL_96ffcc:
                if ((unsigned long long)v11 < 0x11 || (v13 = sub_a6bf4c(), *(unsigned long long *)a12 = v13, v13))
                {
                    *(unsigned int *)&v0 = 0;
                    if (sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, a1, a9, "key", 3, 0, 0, a10, *a11, v0))
                    {
                        *(unsigned int *)&v0 = 0;
                        if (sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, a1, a9, "iv", 2, 0, 0, *(long long *)a12, *a13, v0))
                            return 1;
                    }
                    goto LABEL_970078;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/tls13_enc.c", 435, "derive_secret_key_and_iv");
                    v14 = 0xc0100;
                    v15 = a0;
                }
            }
            else
            {
                sub_a368c8();
                v9 = 407;
LABEL_970138:
                sub_a369bc("ssl/tls13_enc.c", v9, "derive_secret_key_and_iv");
                v15 = a0;
                v14 = 524294;
            }
        }
        else
        {
            *a14 = 16;
            v12 = sub_a50728(a2);
            if (!(v12 >> 31 & 1))
            {
                v11 = v12 & 0xffffffff;
                *a13 = v11;
                goto LABEL_96ffcc;
            }
            else
            {
                sub_a368c8();
                v9 = 425;
                goto LABEL_970138;
            }
        }
    }
    sub_9a58a4(v15, 80, v14, 0);
    return 0;
}
