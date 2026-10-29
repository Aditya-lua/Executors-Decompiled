/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bbc88..0x1bbedc (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bbc88_0 {
    char field_0;
} st_1bbc88_0;

extern unsigned long long g_e69c70;
extern unsigned long long g_e69f28;
extern char g_e69f50;
extern char g_10001c8;

char * sub_1bbc88(long long a0)
{
    long long v8;  // x1
    unsigned int *v9;  // x8
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long v22;  // cc_op
    unsigned long long v23;  // 4110
    char *iter;  // x20
    unsigned long long v24;  // 4102
    unsigned long long **v25;  // x0
    unsigned long long v11;  // x0
    long long v27;  // x8
    char *v12;  // x23
    unsigned long v13;  // x22
    unsigned int v15;  // w8
    unsigned long long v16;  // x8
    st_1bbc88_0 **v0;  // [bp-0x180], Other Possible Types: char
    st_1bbc88_0 *v1;  // [bp-0x178]
    unsigned int v2[3];  // [bp-0x170]
    unsigned int v3;  // [bp-0x168], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x100]
    char v5;  // [bp-0x61]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    sub_63a00(v2);
    v8 = 48;
    sub_63720((char *)v2 + *(long long *)(v2 - 24), 48);
    v9 = (char *)v2 + *(long long *)(v2 - 24);
    v9[2] = v9[2] & 0xffffffb5 | 8;
    iter = sub_a0c8(a0);
    v11 = sub_a0c8(a0);
    v12 = v11 + sub_6b08(a0);
    if (iter != v12)
    {
        while (1)
        {
            v13 = *iter;
            if (!sub_58440(v13, 0x500))
            {
                v15 = (unsigned int)v13 - 33;
                v16 = 1 << ((char)v15 & 63) & 4611686018427401153;
                if (v15 <= 62)
                {
                    v20 = arm64g_calculate_condition(v22 | 144, v17, v18, v19);
                    v21 = arm64g_calculate_condition(4, (v20 & 1 ? v16 : 0x40000000), 0, 0);
                    if (v21 & 1)
                        goto LABEL_1bbd94;
                }
                else
                {
                    v23 = arm64g_calculate_condition(v22 | 144, v17, v18, v19);
                    v24 = arm64g_calculate_condition(0, (v23 & 1 ? v16 : 0x40000000), 0, 0);
                    if (v24 & 1)
                    {
LABEL_1bbd94:
                        if ((unsigned int)v13 != 126)
                        {
                            *(unsigned int *)((char *)&v3 + *(long long *)(v2 - 24)) = *(int *)((char *)&v3 + *(long long *)(v2 - 24)) | 0x4000;
                            v5 = 37;
                            v25 = sub_60404(v2, &v5, 1);
                            *(unsigned long long *)((char *)v25 + *(long long *)((char *)*v25 - 24) + 24) = 2;
                            v8 = v13;
                            std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(v25, v8, 1);
                            *(unsigned int *)((char *)&v3 + *(long long *)(v2 - 24)) = *(int *)((char *)&v3 + *(long long *)(v2 - 24)) & 0xffffbfff;
                            iter += 1;
                            if (iter == v12)
                                break;
                            else
                                continue;
                        }
                    }
                }
            }
            v5 = v13;
            v8 = &v5;
            sub_60404(v2, &v5, 1);
            iter += 1;
            if (iter == v12)
                break;
        }
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v27, sub_62368(&v3), v8, v8);
    v4 = &g_e69f50;
    v2 = (unsigned int (32 bits)[3])&g_e69f28;
    v3 = &g_e69c70;
    v3 = &g_10001c8;
    return &v4;
}
