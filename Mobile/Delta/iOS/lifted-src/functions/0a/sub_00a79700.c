/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79700..0xa79808 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79700_0 {
    char padding_0[80];
    long long field_50;
    char padding_58[120];
    char field_d0;
} st_a79700_0;

typedef struct st_a79700_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[32];
    char field_48;
} st_a79700_1;


st_a79700_0 * sub_a79700(st_a79700_0 *a0, long long a1, char a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned int v17;  // w0
    unsigned int v18;  // w0
    unsigned int v19;  // w0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    char v12;  // w0
    unsigned long long v13;  // 4102
    char v14;  // x0
    st_a79700_1 *v15;  // x20
    char v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (!a2 || a0->field_d0 & 1)
    {
        v12 = sub_a79808(a0, 1, a1);
        if (v12 >= 1)
        {
            v13 = arm64g_calculate_condition(19, v12, 1, 0);
            if (v13 & 1)
                goto LABEL_a797b4;
            v14 = sub_a6820c(a0->field_50, 1);
            if (v14)
            {
                v15 = (st_a79700_1 *)v14;
                v16 = sub_a7c17c(*(long long *)(v14 + 32));
                if (v16)
                {
                    sub_a7c1b4(v15->field_20);
                    if (v15->field_48 >> 1 & 1)
                        goto LABEL_a797b4;
                    v17 = sub_a4eb1c(a0->field_50);
                    v18 = sub_a302c4(a0->field_50);
                    v19 = sub_a2d664(a0->field_50);
                    v16 = v18 + v17 + v19 + sub_ad7dec(a0->field_50) == 4;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
                sub_a36abc(15, 0xc0103, 0);
                v16 = 0;
            }
        }
        else
        {
            v16 = 0;
        }
    }
    else
    {
LABEL_a797b4:
        v16 = 1;
    }
    return v16;
}
