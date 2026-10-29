/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966df0..0x966f78 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966df0_0 {
    struct st_966df0_0 *field_0;
    char padding_8[680];
    unsigned int field_2b0;
    char padding_2b4[204];
    struct st_966df0_0 *field_380;
    struct st_966df0_0 *field_388;
    struct st_966df0_0 *field_390;
} st_966df0_0;

typedef struct st_966df0_1 {
    char padding_0[48];
    long long field_30;
    char padding_38[8];
    struct st_966df0_0 *field_40;
    struct st_966df0_0 *field_48;
    char padding_50[24];
    struct st_966df0_0 *field_68;
    char padding_70[640];
    unsigned int field_2f0;
    char padding_2f4[4];
    unsigned int field_2f8;
    char padding_2fc[196];
    struct st_966df0_0 *field_3c0;
    struct st_966df0_0 *field_3c8;
    struct st_966df0_0 *field_3d0;
    struct st_966df0_0 *field_3d8;
    char padding_3e0[16];
    long long field_3f0;
} st_966df0_1;


unsigned long long sub_966df0(st_966df0_1 *a0, st_966df0_0 *a1)
{
    unsigned long long v2;  // x0
    st_966df0_0 *v3;  // x21
    long long v4;  // x0
    st_966df0_0 *v5;  // x23
    st_966df0_0 *v6;  // x24
    st_966df0_0 *v7;  // x26
    st_966df0_0 *v8;  // x8
    st_966df0_0 *v9;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7c198(a0->field_3f0);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_ad61b4();
    v4 = sub_a19700(a0->field_30);
    sub_a19710(a0->field_30, 0);
    v5 = a0->field_48;
    v6 = &a0->field_48;
    if (v5)
    {
        v7 = &a0->field_40;
        do
        {
            if (a1 && a1 * 1000000000 <= (unsigned long long)*(long long *)&v5->padding_2b4[52])
                break;
            sub_a66994(a0->field_30, v5);
            v8 = v5->field_390;
            if (v8)
            {
                v9 = v5->field_388;
                if (v9)
                {
                    if (v8 != v6)
                    {
                        if (v9 != v7)
                        {
                            v8->field_388 = v9;
                            v5->field_388->field_390 = v8;
                        }
                        else
                        {
                            v7->field_0 = v8;
                            v8->field_388 = v7;
                        }
                    }
                    else
                    {
                        if (v9 != v7)
                        {
                            v6->field_0 = v9;
                            v9->field_390 = v6;
                        }
                        else
                        {
                            v7->field_0 = 0;
                            *(unsigned long long *)&v7->padding_8[0] = 0;
                        }
                    }
                    v5->field_390 = 0;
                    *(uint128_t *)&v5->field_380 = 0;
                }
            }
            v5->field_2b0 = 1;
            if (a0->field_68)
                a0->field_68();
            if (!v3 || !sub_ad68a0(v3, v5))
                sub_9662a0(v5);
            v5 = v6->field_0;
        } while (v6->field_0);
    }
    sub_a19710(a0->field_30, v4);
    sub_a7c1b4(a0->field_3f0);
}
