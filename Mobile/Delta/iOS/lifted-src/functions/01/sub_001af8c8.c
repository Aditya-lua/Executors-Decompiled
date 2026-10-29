/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1af8c8..0x1afbbc (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1af8c8_1 {
    unsigned long long field_0;
    char padding_8[56];
    char field_40;
    char padding_41[15];
    char field_50;
    char padding_51[127];
    long long field_d0;
    char padding_d8[16];
    char field_e8;
    char padding_e9[7];
    long long field_f0;
    char padding_f8[8];
    char field_100;
    char padding_101[15];
    long long field_110;
} st_1af8c8_1;

typedef struct st_1af8c8_0 {
    char field_0;
} st_1af8c8_0;

extern char g_e6fed0;

st_1af8c8_1 * sub_1af8c8(st_1af8c8_1 *a0)
{
    unsigned long long *v5;  // x20
    st_1af8c8_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1af8c8_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_e6fed0;
    v5 = &a0->field_50;
    std::__1::mutex::lock(v5);
    std::__1::mutex::unlock(v5);
    if (a0->field_d0)
    {
        v2 = 1;
        sub_6131c(&v2);
        std::__1::mutex::lock(v5);
        std::__1::mutex::unlock(v5);
        if (a0->field_d0)
        {
            v2 = 1;
            sub_6131c(&v2);
            std::__1::mutex::lock(v5);
            std::__1::mutex::unlock(v5);
            if (a0->field_d0)
            {
                v2 = 1;
                sub_6131c(&v2);
                std::__1::mutex::lock(v5);
                std::__1::mutex::unlock(v5);
                if (a0->field_d0)
                {
                    v2 = 1;
                    sub_6131c(&v2);
                    std::__1::mutex::lock(v5);
                    std::__1::mutex::unlock(v5);
                    if (a0->field_d0)
                    {
                        v2 = 1;
                        sub_6131c(&v2);
                        std::__1::mutex::lock(v5);
                        std::__1::mutex::unlock(v5);
                        if (a0->field_d0)
                        {
                            v2 = 1;
                            sub_6131c(&v2);
                            std::__1::mutex::lock(v5);
                            std::__1::mutex::unlock(v5);
                            if (a0->field_d0)
                            {
                                v2 = 1;
                                sub_6131c(&v2);
                                std::__1::mutex::lock(v5);
                                std::__1::mutex::unlock(v5);
                                if (a0->field_d0)
                                {
                                    v2 = 1;
                                    sub_6131c(&v2);
                                    std::__1::mutex::lock(v5);
                                    std::__1::mutex::unlock(v5);
                                    if (a0->field_d0)
                                    {
                                        v2 = 1;
                                        sub_6131c(&v2);
                                        std::__1::mutex::lock(v5);
                                        std::__1::mutex::unlock(v5);
                                        if (a0->field_d0)
                                        {
                                            v2 = 1;
                                            sub_6131c(&v2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    std::__1::mutex::lock(v5);
    sub_1ac7ec(a0, &a0->field_40);
    sub_1b684c(a0, &a0->field_40);
    std::__1::mutex::unlock(v5);
    sub_181a8(&a0[3].padding_8[32]);
    sub_181a8(a0[3].padding_8);
    sub_181a8(a0[2].padding_8);
    sub_181a8(&a0[1].padding_8[8]);
    sub_1a42cc(&a0->field_100, a0->field_110);
    sub_2219c(&a0->field_100, 0);
    sub_62aa0(&a0->field_e8, a0->field_f0);
    return a0;
}
