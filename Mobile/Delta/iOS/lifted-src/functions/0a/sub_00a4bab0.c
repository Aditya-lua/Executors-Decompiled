/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4bab0..0xa4bbe4 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4bab0_0 {
    struct st_a4bab0_0 *field_0;
    long long field_8;
    struct st_a4bab0_0 *field_10;
    struct st_a4bab0_0 *field_18;
    char field_20;
    char padding_21[15];
    struct st_a4bab0_0 *field_30;
    struct st_a4bab0_0 *field_38;
    char padding_40[40];
    long long field_68;
    unsigned int field_6c;
    char padding_70[8];
    struct st_a4bab0_0 *field_78;
    char padding_80[48];
    struct st_a4bab0_0 *field_b0;
    struct st_a4bab0_0 *field_b8;
    char padding_c0[24];
    struct st_a4bab0_0 *field_d8;
} st_a4bab0_0;


unsigned int sub_a4bab0(st_a4bab0_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a4bab0_0 *v12;  // x8
    st_a4bab0_0 *v13;  // x20
    unsigned int v14;  // w8
    unsigned long long v15;  // 4102
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_0;
    if (v12)
    {
        if (*(long long *)&v12->padding_70[4])
        {
            if (*(long long *)&a0->padding_80[40])
            {
                if (*(long long *)&v12->padding_c0[16])
                    (*(long long *)&v12->padding_c0[16])();
                *(unsigned long long *)&a0->padding_80[40] = 0;
            }
            v13 = a0->field_b0;
            if (v13 && !(int)v13->field_18)
            {
                do
                {
                    /* unsupported instruction */;
                    v14 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v15 = arm64g_calculate_condition(19, v14, 1, 0);
                if (!(v15 & 1))
                {
                    /* unsupported instruction */;
                }
                else
                {
                    if (1 < (int)v14)
                    {
                        memset(&a0->field_20, 0, 160);
                        *(unsigned int *)((char *)&a0->field_68 + 4) = 0xffffffff;
                        *(uint128_t *)&a0->field_0 = 0;
                        *(uint128_t *)&a0->field_10 = 0;
                        return 1;
                    }
                }
                sub_a6c2e4(v13->field_68, "crypto/evp/evp_enc.c", 2113);
                sub_a78ccc(*(long long *)&v13->padding_70[4]);
                sub_a6c2e4(v13, "crypto/evp/evp_enc.c", 2116);
                memset(&a0->field_20, 0, 160);
                *(unsigned int *)((char *)&a0->field_68 + 4) = 0xffffffff;
                *(uint128_t *)&a0->field_0 = 0;
                *(uint128_t *)&a0->field_10 = 0;
                return 1;
            }
            goto LABEL_a4bb70;
        }
        else if (v12->field_30)
        {
            v12->field_30();
        }
        else if (*(long long *)&a0->padding_70[4] && (int)a0->field_0->field_38)
        {
            sub_a66ec0();
        }
    }
    sub_a6c2e4(*(long long *)&a0->padding_70[4], "crypto/evp/evp_enc.c", 63);
    sub_a32e7c(a0->field_8);
LABEL_a4bb70:
    memset(&a0->field_20, 0, 160);
    *(unsigned int *)((char *)&a0->field_68 + 4) = 0xffffffff;
    *(uint128_t *)&a0->field_0 = 0;
    *(uint128_t *)&a0->field_10 = 0;
    return 1;
}
