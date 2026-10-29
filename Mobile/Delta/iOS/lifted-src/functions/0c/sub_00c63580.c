/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc63580..0xc6366c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c63580_0 {
    struct st_c63580_0 *field_0;
    struct st_c63580_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
    struct st_c63580_0 *field_28;
} st_c63580_0;

typedef struct st_c63580_1 {
    struct st_c63580_0 *field_0;
    struct st_c63580_0 *field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_c63580_0 *field_28;
    struct st_c63580_0 *field_2c;
} st_c63580_1;


st_c63580_0 * sub_c63580(st_c63580_1 *a0, unsigned long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_c63580_0 *i;  // x23
    st_c63580_0 *v17;  // x22
    unsigned long v18;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a1 < a0->field_20)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if (a0->field_8)
    {
        if (a0->field_8->field_18 < a1)
            return 0;
    }
    else
    {
        if (a0->field_20 != a1)
            return 0;
    }
    a0->field_20 = a1;
    i = a0->field_0;
    if (i)
    {
        do
        {
            v17 = i;
            v18 = i->field_18;
            if (a1 < v18)
            {
                a0->field_0 = v17;
                v17->field_0 = 0;
                *(unsigned int *)&a0->field_28 = 0;
                return 1;
            }
            i = v17->field_8;
            a0->field_18 = a0->field_18 - 1;
            if (*(int *)((char *)&a0->field_28 + 4) && v17->field_28)
                sub_a66ec0(v17->field_28, v18 - v17->field_10);
            sub_9842b4(v17->field_20);
            sub_a6c2e4(v17, "ssl/quic/quic_sf_list.c", 27);
        } while (i);
    }
    a0->field_0 = 0;
    a0->field_8 = 0;
    *(unsigned int *)&a0->field_28 = 0;
    return 1;
}
