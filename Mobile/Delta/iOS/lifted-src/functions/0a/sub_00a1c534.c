/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1c534..0xa1c64c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1c534_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    char padding_18[12];
    struct st_a1c534_0 *field_24;
    char padding_2c[4];
    struct st_a1c534_0 *field_30;
    struct st_a1c534_0 *field_38;
    char padding_40[104];
    long long field_a8;
    long long field_b0;
} st_a1c534_0;


st_a1c534_0 * sub_a1c534(st_a1c534_0 *a0, long long a1, long long a2, long long a3)
{
    st_a1c534_0 *v2;  // x20
    unsigned long v3;  // x24
    st_a1c534_0 *v4;  // x26
    long long v5;  // x25
    st_a1c534_0 *v6;  // x19
    unsigned long long v7;  // x0
    st_a1c534_0 *v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = a0->field_10;
    v4 = *(long long *)a0->padding_2c;
    v5 = v2->field_8;
    v6 = sub_a19fb4(*(long long *)&a0->padding_40[96], v2->field_a8, v2->field_0);
    if (v6)
    {
        if (sub_a1a2e8(v6, v2))
        {
            sub_a6c2e4(*(long long *)v6->padding_2c, "crypto/ec/ec_lib.c", 534);
            *(unsigned long long *)v6->padding_2c = 0;
            v6->field_30 = 0;
            if (sub_a1a764(v6, v5, v3, 0))
            {
                v7 = sub_a186bc(v6, a3);
                if (!(unsigned int)v7)
                {
                    sub_a1a174(v6);
                    return v2;
                }
                v8 = sub_a18150(a1, a2, v7);
                if (v8)
                {
                    v2 = v8;
                    *(unsigned int *)&(v8->padding_18)[1] = 0;
                    if (v4)
                    {
                        sub_a1a174(v6);
                        return v2;
                    }
                    sub_a6c2e4(*(long long *)v2->padding_2c, "crypto/ec/ec_lib.c", 534);
                    *(unsigned long long *)v2->padding_2c = 0;
                    v2->field_30 = 0;
                    sub_a1a174(v6);
                    return v2;
                }
            }
        }
        else
        {
            sub_a1a174(v6);
            v6 = 0;
        }
    }
    sub_a1a174(v6);
    sub_a1a174(0);
    return 0;
}
