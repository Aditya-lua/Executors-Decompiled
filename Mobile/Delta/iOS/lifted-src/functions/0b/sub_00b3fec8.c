/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3fec8..0xb40154 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3fec8_1 {
    char padding_0[8];
    struct st_b3fec8_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b3fec8_1;

typedef struct st_b3fec8_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b3fec8_3;

typedef struct st_b3fec8_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_b3fec8_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_b3fec8_0;

typedef struct st_b3fec8_2 {
    char padding_0[16];
    struct st_b3fec8_3 *field_10;
    struct st_b3fec8_1 *field_18;
    char padding_20[16];
    struct st_b3fec8_0 *field_30;
} st_b3fec8_2;


st_b3fec8_0 * sub_b3fec8(st_b3fec8_2 *a0, long long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x23
    st_b3fec8_0 *v18;  // w8
    st_b3fec8_0 *v19;  // x0
    st_b3fec8_0 *v10;  // x0
    st_b3fec8_0 *v11;  // x0
    st_b3fec8_0 *v12;  // x0
    st_b3fec8_0 *v13;  // x21
    unsigned long long v14;  // x24
    st_b3fec8_0 *v15;  // x0
    unsigned long long v16;  // x20
    st_b3fec8_0 *v17;  // w20
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    st_b3fec8_0 *v2;  // [bp-0x90]
    st_b3fec8_0 *v3;  // [bp-0x80]
    st_b3fec8_0 *v4;  // [bp-0x70]
    st_b3fec8_0 *v5;  // [bp-0x60]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a0->field_10->field_8;
    v9 = a0->field_18->field_18;
    if (sub_a6fbc4(a1, "bits"))
    {
        v10 = sub_a6fe3c();
        if (!(unsigned int)v10)
            return v10;
    }
    if (sub_a6fbc4(a1, "security-bits"))
    {
        v11 = sub_a6fe3c();
        if (!(unsigned int)v11)
            return v11;
    }
    if (sub_a6fbc4(a1, "max-size"))
    {
        v12 = sub_a6fe3c();
        if (!(unsigned int)v12)
            return v12;
    }
    if (!(int)a0->field_30)
        return 1;
    v4 = (st_b3fec8_0 *)0;
    v5 = (st_b3fec8_0 *)0;
    v2 = (st_b3fec8_0 *)0;
    v3 = (st_b3fec8_0 *)0;
    v13 = sub_a6fbc4(a1, "encoded-pub-key");
    if (v13)
    {
        if (v13->field_8 != 5)
            return 0;
        v14 = a0->field_18->field_10 + a0->field_10->field_18;
        v13->field_20 = v14;
        if (!v13->field_10)
        {
            v13 = 0;
        }
        else if (v14 > v13->field_18)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 534, "mlx_kem_get_params");
            v0 = v13->field_18;
            v1 = v14;
            goto LABEL_b40078;
        }
        else
        {
            (&v2)[1] = v13->field_10;
        }
    }
    if ((unsigned int)(int)a0->field_30 >= 2 && !(v15 = sub_a6fbc4(a1, "priv"), !v15))
    {
        if (v15->field_8 != 5)
            return 0;
        v16 = v9 + v8;
        v15->field_20 = v16;
        if (!v15->field_10)
            goto LABEL_b40088;
        if (v16 > v15->field_18)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 552, "mlx_kem_get_params");
            v0 = v15->field_18;
            v1 = v16;
LABEL_b40078:
            sub_a36abc(57, 106);
        }
        else
        {
            v3 = v15->field_10;
            v17 = (st_b3fec8_0 *)1;
LABEL_b40094:
            if (sub_b40e88() && (!v13 || *(unsigned int *)((void*)&v3 + 8) == 2))
            {
                if (*(unsigned int *)((void*)&v3 + 12) == 2)
                    v18 = (st_b3fec8_0 *)0;
                else
                    v18 = v17;
                if (v18 != 1)
                    return 1;
            }
            if (*(unsigned long long *)((void*)&v2 + 8))
                sub_a66ec0(*(unsigned long long *)((void*)&v2 + 8), a0->field_18->field_10 + a0->field_10->field_18);
            v19 = v3;
            if (!v19)
                return v19;
            sub_a66ec0(v19, a0->field_18->field_18 + a0->field_10->field_8);
        }
        return 0;
    }
LABEL_b40088:
    if (!v13)
        return 1;
    v17 = (st_b3fec8_0 *)0;
    goto LABEL_b40094;
}
