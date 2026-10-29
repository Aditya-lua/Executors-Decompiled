/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68fc8..0xc69188 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68fc8_2 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
} st_c68fc8_2;

typedef struct st_c68fc8_1 {
    char padding_0[7];
    struct st_c68fc8_1 *field_7;
    struct st_c68fc8_0 *field_b;
    struct st_c68fc8_0 *field_f;
    unsigned long long field_17;
    struct st_c68fc8_0 *field_1f;
} st_c68fc8_1;

typedef struct st_c68fc8_0 {
    unsigned long long field_0;
    struct st_c68fc8_1 *field_8;
    struct st_c68fc8_0 *field_c;
    struct st_c68fc8_0 *field_10;
    unsigned long long field_18;
    struct st_c68fc8_0 *field_20;
} st_c68fc8_0;


st_c68fc8_0 * sub_c68fc8(st_c68fc8_2 *a0, unsigned long a1, st_c68fc8_0 *a2, st_c68fc8_0 *a3, char *a4)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_c68fc8_0 *v21;  // x2
    long long v22;  // x1
    unsigned int v23;  // w0
    unsigned long long v24;  // 4112
    st_c68fc8_0 *v25;  // w25
    st_c68fc8_0 *v26;  // x0
    st_c68fc8_0 *v27;  // x24
    unsigned long long v28;  // x0
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_c68fc8_0 *v20;  // x21
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (1 < a4 - 1)
        return 0;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a3;
    if (!a2)
    {
        v25 = (st_c68fc8_0 *)0;
        goto LABEL_c690f0;
    }
    if (a4 == 2 && sub_9e5c94(a2))
    {
        sub_a368c8();
        sub_a369bc("crypto/param_build.c", 265, "push_BN");
        v21 = "Negative big numbers are unsupported for OSSL_PARAM_UNSIGNED_INTEGER";
        v22 = 524556;
        goto LABEL_c690c8;
    }
    v23 = sub_9e46a8(a2);
    v24 = arm64g_calculate_condition(193, v23, 15, 0);
    if (!(v24 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/param_build.c", 272, "push_BN");
        v22 = 115;
        goto LABEL_c690c4;
    }
    else if ((v23 + 7) / 8 > v20)
    {
        sub_a368c8();
        sub_a369bc("crypto/param_build.c", 276, "push_BN");
        v22 = 116;
LABEL_c690c4:
        v21 = 0;
LABEL_c690c8:
        sub_a36abc(15, v22, v21);
        goto LABEL_c690cc;
    }
    else
    {
        v25 = (st_c68fc8_0 *)(sub_9e48c8(a2, 8) == 8);
        if (1 >= v20)
            v20 = 1;
LABEL_c690f0:
        v26 = sub_a6bffc(56, "crypto/param_build.c", 55);
        if (v26)
        {
            v27 = v26;
            v26->field_0 = a1;
            *(unsigned int *)&v26->field_8 = (unsigned int)a4;
            v26->field_c = v20;
            v28 = sub_a71e18(v20);
            v27->field_10 = v28;
            *(unsigned int *)((char *)&v27->field_8 + 4) = (unsigned int)v25;
            *(unsigned long long *)((char *)a0 + 0x8 * v25) = *(long long *)((char *)a0 + 0x8 * v25) + v28;
            if ((int)sub_ad68a0(a0->field_10, v27) > 0)
            {
                v27->field_18 = a2;
                v26 = 1;
            }
            else
            {
                sub_a6c2e4(v27, "crypto/param_build.c", 0x44);
LABEL_c690cc:
                v26 = 0;
            }
        }
    }
    return (unsigned int)v26;
}
