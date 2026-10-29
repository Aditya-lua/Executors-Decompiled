/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6708..0x9f6918 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6708_4 {
    char field_0;
    char field_1;
    char padding_2[31];
    char field_21;
    char field_22;
    char field_23;
    char field_24;
    char field_25;
    char field_26;
    char field_27;
    char field_28;
    unsigned short field_29;
} st_9f6708_4;

typedef struct st_9f6708_0 {
    struct st_9f6708_0 *field_0;
    struct st_9f6708_0 *field_8;
    char *field_10;
    struct st_9f6708_0 *field_18;
    char padding_20[8];
    unsigned long long field_28;
    struct st_9f6708_0 *field_30;
    struct st_9f6708_0 *field_38;
} st_9f6708_0;

typedef struct st_9f6708_5 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
    unsigned short field_5;
} st_9f6708_5;

extern char g_1000000;

st_9f6708_0 * sub_9f6708(st_9f6708_0 *a0, st_9f6708_4 **a1, char *a2)
{
    st_9f6708_0 *v3;  // x19
    long long v4;  // x20
    st_9f6708_5 *v13;  // x21
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long v18;  // x8
    st_9f6708_0 *v19;  // x23
    long long v20;  // x22
    unsigned long v21;  // x21
    st_9f6708_0 *v22;  // x0
    st_9f6708_4 *v5;  // x21
    unsigned int v23;  // w0
    st_9f6708_0 *v6;  // w8
    st_9f6708_0 *v7;  // x0
    st_9f6708_0 *v8;  // x22
    st_9f6708_0 *v9;  // x0
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // x8
    st_9f6708_0 *v0;  // [bp-0x48], Other Possible Types: st_9f6708_5 *
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (0xffffffffffff0001 > a2 - 0x10000)
    {
        v3 = 0;
        v4 = 76;
        goto LABEL_9f6738;
    }
    v3 = sub_9f76d8();
    if (v3)
    {
        v5 = *a1;
        v6 = (st_9f6708_0 *)v5->field_0;
        *(unsigned int *)&v3->field_0 = (unsigned int)v6;
        if (v6)
        {
            v7 = sub_a6dac4(v5, a2, "crypto/ct/ct_oct.c", 135);
            v3->field_8 = v7;
            if (v7)
            {
                v3->field_10 = a2;
                *a1 = v5 + a2;
                if (!a0)
                    return v3;
                sub_9f770c(a0->field_0);
                a0->field_0 = v3;
                return v3;
            }
        }
        else
        {
            v8 = a2 - 43;
            if (43 > a2)
            {
                v4 = 99;
                goto LABEL_9f6738;
            }
            v9 = sub_a6dac4(&v5->field_1, 32, "crypto/ct/ct_oct.c", 104);
            v3->field_18 = v9;
            if (v9)
            {
                *(unsigned long long *)v3->padding_20 = 32;
                v10 = v5->field_21 * 0x100000000000000;
                v3->field_28 = v10;
                v11 = v10 | v5->field_22 * 0x1000000000000;
                v3->field_28 = v11;
                v12 = v11 | v5->field_23 * 0x10000000000;
                v3->field_28 = v12;
                v13 = &v5->field_24;
                v0 = v13;
                v14 = v12 | v5->field_24 * 0x100000000;
                v3->field_28 = v14;
                v15 = v14 | v13->field_1 * &g_1000000;
                v3->field_28 = v15;
                v16 = v15 | v13->field_2 * 0x10000;
                v3->field_28 = v16;
                v17 = v16 | v13->field_3 * 0x100;
                v3->field_28 = v17;
                v3->field_28 = v17 | v13->field_4;
                v18 = *(short *)&(&v13->field_4)[1];
                v19 = (unsigned int)((v18 & 0xff00) >> 8) | (unsigned int)v18 * 0x100 & 0xff00ff00;
                v20 = v8 - v19;
                if (v19 > v8)
                {
                    v4 = 114;
                    goto LABEL_9f6738;
                }
                else
                {
                    v21 = (char *)&v13->field_5 + 1;
                    if (!v19 || (v22 = sub_a6dac4(v21, v19, "crypto/ct/ct_oct.c", 118), v3->field_30 = v22, v22))
                    {
                        v3->field_38 = v19;
                        v0 = v21 + (char *)v19;
                        v23 = sub_9f65d0(v3, &v0, v20);
                        if ((int)v23 >= 1)
                        {
                            *a1 = (char *)v0 + v20 - v23;
                            if (!a0)
                                return v3;
                            sub_9f770c(a0->field_0);
                            a0->field_0 = v3;
                            return v3;
                        }
                        v4 = 128;
LABEL_9f6738:
                        sub_a368c8();
                        sub_a369bc("crypto/ct/ct_oct.c", v4, "o2i_SCT");
                        sub_a36abc(50, 104, 0);
                    }
                }
            }
        }
    }
    sub_9f770c(v3);
    return 0;
}
