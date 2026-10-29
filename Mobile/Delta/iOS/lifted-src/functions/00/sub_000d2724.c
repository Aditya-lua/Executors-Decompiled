/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd2724..0xd294c (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d2724_0 {
    char padding_0[8];
    struct st_d2724_1 *field_8;
} st_d2724_0;

typedef struct st_d2724_1 {
    char padding_0[72];
    struct st_d2724_2 *field_48;
} st_d2724_1;

typedef struct st_d2724_4 {
    char padding_0[64];
    uint128_t field_40;
} st_d2724_4;

typedef struct st_d2724_3 {
    struct st_d2724_4 *field_0;
} st_d2724_3;

typedef struct st_d2724_2 {
    char padding_0[67];
    char field_43;
    char padding_44[4];
    struct st_d2724_3 *field_48;
    char field_50;
    char padding_51[15];
    uint128_t field_60;
    unsigned long long field_70;
} st_d2724_2;

extern long long g_f01360;
extern long long g_f013a8;
extern long long g_f0dca8;

long long sub_d2724(void)
{
    st_d2724_0 *i;  // x0
    st_d2724_2 *v20;  // x26
    st_d2724_4 **iter;  // x27
    uint128_t v22;  // q1
    uint128_t v23;  // q2
    st_d2724_4 *v24;  // x8
    st_d2724_0 *v0;  // [bp-0x138]
    char *v1;  // [bp-0x130]
    unsigned long v2;  // [bp-0x128]
    char *v3;  // [bp-0x120]
    st_d2724_0 *v4;  // [bp-0x118]
    unsigned long long v5;  // [bp-0x110]
    st_d2724_0 v6;  // [bp-0x108], Other Possible Types: uint128_t
    double v7;  // [bp-0xf8]
    st_d2724_3 **v8;  // [bp-0xf0]
    st_d2724_3 **v9;  // [bp-0xe8]
    st_d2724_3 **v10;  // [bp-0xe0], Other Possible Types: uint128_t
    unsigned long v11;  // [bp-0xd0], Other Possible Types: unsigned long long
    st_d2724_4 **v12;  // [bp-0xc0], Other Possible Types: char
    st_d2724_4 **v13;  // [bp-0xc0]
    uint128_t v14;  // [bp-0xb8]
    unsigned long long v15;  // [bp-0xb0]
    char *v16;  // [bp-0x80], Other Possible Types: uint128_t
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v2 = 0xc4ceb9fe1a85ec53;
    v3 = &v6.padding_0[0];
    v4 = &v6;
    v5 = 0;
    v6 = __double_as_longlong(0) * 0x10000000000000000;
    v7 = 1.6e-322;
    std::__1::mutex::lock(&g_f013a8);
    sub_d6d5c(&v12, &g_f0dca8);
    sub_e264c(&g_f0dca8, &v2);
    sub_e264c(&v2, &v12);
    sub_d294c(&v12);
    std::__1::mutex::unlock(&g_f013a8);
    i = sub_d26e4(&v2);
    v0 = i;
    v1 = &v12;
    if (v4 == i)
        return sub_d294c(&v2);
    do
    {
        if (i->field_8)
        {
            v20 = i->field_8->field_48;
            if (v20)
            {
                v8 = &v9;
                v9 = &v8;
                v12 = (st_d2724_4 **)0;
                v15 = 0;
                v10 = 0;
                v11 = 0;
                std::__1::mutex::lock(&g_f01360);
                if (!(sub_e6a04(&v20->field_43, 1, 4) & 1))
                {
                    iter = v20->field_48;
                    v13 = iter;
                    v22 = *(int128_t *)&v20->field_50;
                    v23 = v20->field_60;
                    *(uint128_t *)&v20->field_48 = (uint128_t)v12;
                    v14 = v22;
                    *(unsigned long long *)&v20->padding_51[7] = v15;
                    v10 = v23;
                    v20->field_60 = v10;
                    v11 = v20->field_70;
                    v20->field_70 = v11;
                    while (1)
                    {
                        if (iter == *(unsigned long long *)&*(unsigned long long *)(void*)&v14)
                            break;
                        v24 = *iter;
                        if (v24)
                        {
                            v16 = v24->field_40;
                            *(unsigned long long *)&v24->field_40 = 0;
                            *(unsigned long long *)((char *)&v24->field_40 + 8) = 0;
                            sub_611fc(&v16);
                            (*iter)[1].padding_0[0] = 0;
                        }
                        iter += 2;
                    }
                }
                std::__1::mutex::unlock(&g_f01360);
                v16 = &v10;
                sub_d7bcc(&v16);
                v10 = &v13;
                sub_d62c4(&v10);
                i = v0;
            }
        }
        v0 = &i[1].field_8;
        v1 += 1;
        sub_d50b8(&v0);
        i = v0;
    } while (i != v4);
    return sub_d294c(&v2);
}
