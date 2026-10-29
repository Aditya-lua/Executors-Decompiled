/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b2e84..0x8b4808 (6532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b2e84_4 {
    char padding_0[256];
    unsigned long long field_100;
    char padding_108[120];
    unsigned long long field_180;
    char padding_188[568];
    unsigned long long field_3c0;
    char padding_3c8[24];
    long long field_3e0;
    char padding_3e8[824];
    struct st_8b2e84_2 *field_720;
} st_8b2e84_4;

typedef struct st_8b2e84_1 {
    char padding_0[12];
    struct st_8b2e84_2 *field_c;
} st_8b2e84_1;

typedef struct st_8b2e84_3 {
    char padding_0[12];
    struct st_8b2e84_2 *field_c;
} st_8b2e84_3;

typedef struct st_8b2e84_6 {
    unsigned long long field_0;
    struct st_8b2e84_2 *field_8;
    char padding_10[8];
    struct st_8b2e84_2 *field_18;
    char padding_20[8];
    struct st_8b2e84_2 *field_28;
} st_8b2e84_6;

typedef struct st_8b2e84_2 {
    char padding_0[72];
    struct st_8b2e84_1 *field_48;
    char padding_50[8];
    struct st_8b2e84_3 *field_58;
} st_8b2e84_2;

typedef struct st_8b2e84_0 {
    char field_0;
} st_8b2e84_0;

typedef struct st_8b2e84_5 {
    char padding_0[96];
    struct st_8b2e84_4 *field_60;
    char padding_68[1048];
    unsigned long long field_480;
} st_8b2e84_5;

extern unsigned long long g_e82fd8;
extern st_8b2e84_5 *g_f0d198;
extern char g_f0d530;
extern unsigned long long g_f12600;
extern unsigned long long g_f12618;
extern char g_10002b0;

int sub_8b2e84(void)
{
    st_8b2e84_2 *v11;  // x23
    st_8b2e84_4 *v12;  // x9
    unsigned long long v21;  // x20
    st_8b2e84_6 *v22;  // x0
    st_8b2e84_3 *v23;  // x8
    unsigned long v25;  // x9
    unsigned long v13;  // x10
    unsigned long v14;  // x10
    unsigned long long v15;  // x11
    unsigned long v16;  // x9
    st_8b2e84_2 *v17;  // x0
    st_8b2e84_3 *v18;  // x8
    unsigned long v19;  // x12
    unsigned long long v20;  // x10
    st_8b2e84_2 *v0;  // [bp-0x1b8]
    st_8b2e84_0 **v1;  // [bp-0x150], Other Possible Types: char
    st_8b2e84_0 *v2;  // [bp-0x148]
    unsigned long long v3;  // [bp-0x110]
    st_8b2e84_2 *v4;  // [bp-0xf0]
    st_8b2e84_2 *v5;  // [bp-0xe8]
    st_8b2e84_2 *v6;  // [bp-0xe0]
    st_8b2e84_6 *v7;  // [bp-0xa0]
    unsigned long v8;  // [bp-0x78]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_91ed04(g_f0d198->field_60->field_3e0);
    g_f0d198->field_60->field_720 = v11;
    sub_3c5de4(v11, 8);
    sub_91eafc(v11);
    sub_41f164(v11);
    v12 = g_f0d198->field_60;
    if (v12->field_3c0 == 9743168276)
    {
        v13 = v12->field_180 + 1;
        v12->field_180 = v13 + (v13 + ~v12->field_180 * 2 | 0xf7ffffffffffffff);
        v14 = g_f0d198->field_60->field_180 + 1;
        v15 = (unsigned int)v14 + ~(unsigned int)g_f0d198->field_60->field_180 * 2 | 0xffffffffffffffbf;
        g_f0d198->field_60->field_180 = v14 + v15;
        v16 = g_f0d198->field_60->field_180 + 1;
        g_f0d198->field_60->field_180 = v16 + (v16 + ~g_f0d198->field_60->field_180 * 2 | 0xffffefffffffffff);
        v17 = sub_8b4808(v11, 0);
        if (v17)
        {
            while (1)
            {
                v18 = v17->field_58;
                if (v17->field_48 <= v18)
                    break;
                v17->field_58 = &v18->field_c;
                *(unsigned int *)&(v18->padding_0)[1] = 0;
            }
            v17->field_58 = v17->field_48;
            v19 = g_f0d198->field_60->field_100 + 0x10000000000;
            v20 = g_f0d198->field_60->field_100 | 0x10000000000;
            if ((v19 ^ -v20) + (v19 & -v20) * 2 != 0x10000000000)
            {
                g_f0d198->field_60->field_100 = v20;
                v21 = g_f0d198->field_480;
                v22 = operatornew(48);
                v22->field_28 = 0;
                *(uint128_t *)&v22->field_18 = 0;
                *(uint128_t *)&v22->field_8 = 0;
                v22->field_0 = 3;
                v7 = v22;
                std::__1::mutex::lock(v21 + 40656);
                sub_91dcac(v21 + 40608, &v7);
                std::__1::condition_variable::notify_one(v21 + 40720);
                std::__1::mutex::unlock(v21 + 40656);
            }
        }
        while (1)
        {
            v23 = v11->field_58;
            if (v23 >= v11->field_48)
                break;
            v11->field_58 = &v23->field_c;
            *(unsigned int *)&(v23->padding_0)[1] = 0;
        }
        v11->field_58 = v11->field_48;
        g_f0d530 = 2;
        if (*(long long *)&g_10002b0 == v8)
            return 1;
        __Unwind_Resume(__Unwind_Resume(___stack_chk_fail()));
    }
    else
    {
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v25 = v12->field_100 + 8;
        v0 = v11;
        if ((v25 ^ -(v12->field_100 | 8)) + (v25 & -(v12->field_100 | 8)) * 2 != 8)
        {
            v3 = &g_f12618;
            (g_e82fd8 - 0x1adeca00)();
        }
        v3 = &g_f12600;
        (g_e82fd8 - 0x1adeca00)();
    }
}
