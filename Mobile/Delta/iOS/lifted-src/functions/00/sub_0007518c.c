/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7518c..0x75454 (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7518c_0 {
    char padding_0[32];
    struct st_7518c_1 *field_20;
} st_7518c_0;

typedef struct st_7518c_1 {
    unsigned long long field_0;
} st_7518c_1;

typedef struct st_7518c_3 {
    struct st_7518c_0 *field_0;
} st_7518c_3;

typedef struct st_7518c_5 {
    unsigned long long field_0;
    char padding_8[144];
    struct st_7518c_3 *field_98;
    char padding_a0[552];
    unsigned long long field_2c8;
    char padding_2d0[4];
    unsigned int field_2d4;
    char padding_2d8[32];
    unsigned int field_2f8;
    char padding_2fc[76];
    unsigned long long field_348;
} st_7518c_5;

typedef struct st_7518c_2 {
    char padding_0[56];
    long long field_38;
    char padding_40[144];
    struct st_7518c_3 *field_d0;
    char field_d8;
    char padding_d9[63];
    char field_118;
    char padding_119[415];
    char field_2b8;
    char padding_2b9[7];
    char field_2c0;
    char padding_2c1[63];
    unsigned long long field_300;
    char padding_308[4];
    int field_30c;
    char field_310;
    char padding_311[31];
    unsigned int field_330;
    char padding_334[76];
    unsigned long long field_380;
} st_7518c_2;

typedef struct st_7518c_4 {
    char field_0;
} st_7518c_4;


unsigned long long sub_7518c(st_7518c_2 *a0)
{
    unsigned long long v4;  // w0
    int v5;  // w8
    unsigned long long t;  // x0
    unsigned long long v7;  // x8
    unsigned long long v8;  // w0
    unsigned long long t1;  // x0
    st_7518c_5 *v10;  // x21
    st_7518c_4 **v0;  // [bp-0x58], Other Possible Types: char
    st_7518c_4 *v1;  // [bp-0x50]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_740a4(&a0->field_118, 5) == 3 && sub_74dcc(a0))
    {
        if (a0->field_330 != 2)
        {
LABEL_751f4:
            sub_742c4(a0);
        }
        else if (sub_60768(&a0->field_310, 5))
        {
            goto LABEL_751f4;
        }
        else
        {
            sub_74f58(a0, 1011, "Ping timeout", 0, 0);
        }
    }
    v4 = (unsigned int)sub_740a4(&a0->field_118, 5);
    v5 = a0->field_30c;
    if (v4 != 3)
        v5 = 0;
    if (a0->field_30c >= 1)
    {
        t = std::__1::chrono::steady_clock::now();
        v7 = (t - a0->field_380) * -4835703278458516699 >> 64;
        v5 = (unsigned int)(v7 >> 18) + (unsigned int)(v7 >> 63) + 1000 * a0->field_30c;
    }
    v8 = (unsigned int)sub_666d4();
    if (3 >= v8)
    {
        switch (v8)
        {
        case 0:
            if (!(sub_73430(a0) & 1))
                return 1;
            break;
        case 3:
            std::__1::mutex::lock(&a0->field_d8);
            (*(long long *)(*(long long *)a0->field_d0 + 32))();
        default:
            break;
        }
    }
    else if (v8 == 5)
    {
        std::__1::mutex::lock(&a0->field_d8);
        (*(long long *)(*(long long *)a0->field_d0 + 32))();
    }
    else if (v8 == 4 && !(sub_73c30(a0) & 1))
    {
        return 2;
    }
    if (sub_740a4(&a0->field_118, 5))
        return 0;
    t1 = std::__1::chrono::steady_clock::now(std::__1::mutex::lock(&a0->field_2c0));
    std::__1::mutex::unlock(&a0->field_2c0);
    if ((long long)(t1 - a0->field_300) < 300000001)
        return 0;
    v10 = &a0->field_38;
    sub_c84c(v10, a0->field_38);
    std::__1::mutex::lock(v10->padding_a0);
    (*(long long *)(*(long long *)v10->field_98 + 32))();
}
