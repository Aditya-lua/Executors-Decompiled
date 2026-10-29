/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x651ec..0x6549c (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_651ec_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char padding_80[4];
    unsigned int field_84;
    char padding_88[2];
    char field_8a;
} st_651ec_6;

typedef struct st_651ec_4 {
    struct st_651ec_3 *field_0;
    char padding_8[16];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    char padding_38[64];
    long long field_78;
    struct st_651ec_5 *field_80;
    char padding_88[128];
    uint128_t field_108;
    uint128_t field_118;
    uint128_t field_128;
    uint128_t field_138;
    uint128_t field_148;
    uint128_t field_158;
    uint128_t field_168;
    uint128_t field_178;
    char padding_188[4];
    unsigned int field_18c;
    char padding_190[2];
    long long field_192;
} st_651ec_4;

typedef struct st_651ec_0 {
    char padding_0[40];
    struct st_651ec_1 *field_28;
    struct st_651ec_1 *field_30;
} st_651ec_0;

typedef struct st_651ec_1 {
    unsigned long long field_0;
} st_651ec_1;

typedef struct st_651ec_5 {
    struct st_651ec_0 *field_0;
} st_651ec_5;

typedef struct st_651ec_3 {
    char padding_0[104];
    struct st_651ec_1 *field_68;
} st_651ec_3;

typedef struct st_651ec_2 {
    char field_0;
} st_651ec_2;

extern unsigned long long g_e69fd0;
extern unsigned long long g_e6a148;
extern char g_10002b0;

unsigned long long sub_651ec(st_651ec_4 *a0)
{
    st_651ec_0 **v13;  // x0
    unsigned long v14;  // x8
    st_651ec_6 *v15;  // x8
    st_651ec_2 **v0;  // [bp-0xd0], Other Possible Types: char
    st_651ec_2 *v1;  // [bp-0xc8]
    uint128_t v2;  // [bp-0xc0]
    uint128_t v3;  // [bp-0xb0]
    uint128_t v4;  // [bp-0xa0]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    uint128_t v7;  // [bp-0x70]
    uint128_t v8;  // [bp-0x60]
    uint128_t v9;  // [bp-0x50]
    unsigned long v10;  // [bp-0x38]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_78)
    {
        v13 = a0->field_80;
        if (!v13)
        {
            sub_64d58(v13);
            __debugbreak();
        }
        v14 = *(int *)((char *)&a0->field_178 + 12);
        if (!(v14 >> 4 & 1))
        {
            if (v14 >> 3 & 1)
            {
                v15 = (a0->padding_88)[1];
                v6 = v15->field_40;
                v7 = v15->field_50;
                v8 = v15->field_60;
                v9 = v15->field_70;
                v2 = v15->field_0;
                v3 = v15->field_10;
                v4 = v15->field_20;
                v5 = v15->field_30;
                if (a0->padding_188[2] != 1)
                {
                    *v13->field_30();
                }
                else if (_fseeko(a0->field_78, -(a0->field_20 - a0->field_18), 1))
                {
                    goto *((void *)(g_e6a148));
                }
                else
                {
                    goto *((void *)(g_e69fd0));
                }
            }
        }
        else
        {
            if (a0->field_30 != a0->field_28)
                a0->field_0->field_68();
            (*(long long *)(*(long long *)a0->field_80 + 40))();
        }
    }
    if (*(long long *)&g_10002b0 == v10)
        return 0;
    sub_64d58(___stack_chk_fail());
    __debugbreak();
}
