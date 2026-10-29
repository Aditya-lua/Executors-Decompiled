/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91da14..0x91dc7c (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91da14_1 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[28];
    int field_60;
    char padding_64[156];
    unsigned long long field_100;
    char padding_108[56];
    struct st_91da14_0 *field_140;
    char padding_148[24];
    struct st_91da14_0 *field_160;
    char padding_168[24];
    unsigned long long field_180;
    char padding_188[312];
    struct st_91da14_0 *field_2c0;
    char padding_2c8[440];
    struct st_91da14_2 *field_480;
    char padding_488[248];
    struct st_91da14_0 *field_580;
} st_91da14_1;

typedef struct st_91da14_2 {
    int field_0;
} st_91da14_2;

typedef struct st_91da14_0 {
    char padding_0[104];
    unsigned long long field_68;
} st_91da14_0;

typedef struct st_91da14_4 {
    char field_0;
} st_91da14_4;

typedef struct st_91da14_3 {
    char padding_0[96];
    struct st_91da14_1 *field_60;
    char padding_68[1048];
    unsigned long long field_480;
} st_91da14_3;

extern char g_400001;
extern st_91da14_3 *g_f0d198;
extern char g_10002b0;

st_91da14_0 * sub_91da14(void)
{
    st_91da14_1 *v8;  // x8
    unsigned long long v9;  // x10
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v10;  // x10
    unsigned long long v21;  // x9
    unsigned long long v22;  // x9
    unsigned long long v23;  // x9
    long long v24;  // x0
    long long v25;  // x0
    unsigned long long v11;  // x11
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    st_91da14_4 **v0;  // [bp-0x78], Other Possible Types: char
    st_91da14_4 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    char v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x38]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v8 = g_f0d198->field_60;
    v9 = v8->field_100;
    if ((v9 + 0x400 ^ -(v9 | 0x400)) + (v9 + 0x400 & -(v9 | 0x400)) * 2 != 0x400)
    {
        v21 = (((v9 & 0xffffefffffffffff) - (v9 | 0xf7ffffffffffffff) + 0xf7ffffffffffffff & 0xffffffffffffffbf) - ((v9 & 0xffffefffffffffff) - (v9 | 0xf7ffffffffffffff) + 0xf7ffffffffffffff | 0xfffffffffffffbff) - 1025 & 0xfffffffffffffeff) - (((v9 & 0xffffefffffffffff) - (v9 | 0xf7ffffffffffffff) + 0xf7ffffffffffffff & 0xffffffffffffffbf) - ((v9 & 0xffffefffffffffff) - (v9 | 0xf7ffffffffffffff) + 0xf7ffffffffffffff | 0xfffffffffffffbff) - 1025 | 0xffffffffffbfffff) - &g_400001;
        v8->field_100 = ((v21 & 0xffffffffefffffff) - (v21 | 0xfff7ffffffffffff) + 0xfff7ffffffffffff & 0xffffffffff7fffff) - ((v21 & 0xffffffffefffffff) - (v21 | 0xfff7ffffffffffff) + 0xfff7ffffffffffff | 0xefffffffffffffff) + 0xefffffffffffffff;
        v22 = v8->field_180;
        v23 = (v22 + ~v22 * 2 + 1 | 0xff7fffffffffffff) + v22;
        v8->field_180 = v23 + (0x1fe - v23 | 0xfffffffffffffeff) + 2;
        *(unsigned int *)&v8->field_140 = 0;
        v8->field_40 = 0xffffffff;
        v8->field_60 = -0x1;
        *(unsigned int *)&v8->field_2c0 = 0;
        *(unsigned int *)&v8->field_160 = 0;
    }
    else if ((v9 + 0x800000000000000 ^ -(v9 | 0x800000000000000)) + (v9 + 0x800000000000000 & -(v9 | 0x800000000000000)) * 2 == 0x800000000000000)
    {
        v10 = v9 | 0x1000000000000000;
        if ((v9 + 0x1000000000000000 ^ -v10) + (v9 + 0x1000000000000000 & -v10) * 2 != 0x1000000000000000 && !(v11 = (0xfffffffffffffc20 & v8->field_580->field_68 * 2) + (v8->field_580->field_68 ^ 0xfffffffffffffe10), *(char *)((v11 ^ 1497) + (2994 & v11 * 2) - 1) != 1))
        {
            v8->field_100 = v10;
            sub_8f1d6c();
        }
        else
        {
            if (v8->field_60 >= 1)
                *(int *)v8->field_480 = v8->field_60;
            if (*(long long *)(g_f0d198->field_480 + 30248))
            {
                sub_91edd8(g_f0d198->field_480 + 0x7600);
                if (g_f0d198->field_60->field_580)
                {
                    v12 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
                    v13 = arm64g_calculate_condition(20, (v12 & 1 ? v4 : 0), (v12 & 1 ? g_f0d198->field_60->field_580 : 0), 0);
                    if (!(v13 & 1))
                        goto LABEL_91dc1c;
                }
                else
                {
                    v18 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
                    v19 = arm64g_calculate_condition(16, (v18 & 1 ? v4 : 0), 0, 0);
                    if (!(v19 & 1))
                    {
LABEL_91dc1c:
                        sub_91e744(&v2);
                    }
                }
                sub_15b6c0(&v3);
            }
        }
    }
    else
    {
        v8->field_100 = v9 & 0xffffffffffffffbf | 0x800000000000000;
        sub_8ae3ac(sub_91dd38());
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    v24 = ___stack_chk_fail();
    sub_15b6c0(&v3);
    v25 = __Unwind_Resume(v24);
    __Unwind_Resume(v25);
}
