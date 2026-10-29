/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1db250..0x1dc874 (5668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1db250_5 {
    char padding_0[8];
    struct st_1db250_6 *field_8;
} st_1db250_5;

typedef struct st_1db250_1 {
    char padding_0[24];
    struct st_1db250_2 *field_18;
} st_1db250_1;

typedef struct st_1db250_2 {
    char padding_0[48];
    unsigned long long field_30;
} st_1db250_2;

typedef struct st_1db250_7 {
    char padding_0[72];
    char field_48;
} st_1db250_7;

typedef struct st_1db250_6 {
    unsigned long long field_0;
} st_1db250_6;

typedef struct st_1db250_8 {
    char padding_0[8];
    struct st_1db250_1 *field_8;
    char padding_10[48];
    struct st_1db250_5 *field_40;
    unsigned long long field_48;
    struct st_1db250_7 *field_50;
    unsigned long long field_58;
} st_1db250_8;

typedef struct st_1db250_3 {
    char field_0;
} st_1db250_3;

typedef struct st_1db250_0 {
    char padding_0[1408];
    unsigned long long field_580;
} st_1db250_0;

typedef struct st_1db250_9 {
    char padding_0[368];
    struct st_1db250_6 *field_170;
} st_1db250_9;

typedef struct st_1db250_4 {
    char padding_0[96];
    struct st_1db250_0 *field_60;
} st_1db250_4;

extern long long g_f02778;
extern st_1db250_6 *g_f0b0d8;
extern st_1db250_4 *g_f0d198;
extern st_1db250_9 *g_f0d3d8;

unsigned int sub_1db250(st_1db250_8 *a0)
{
    unsigned int v6;  // x0
    unsigned int v7;  // x0
    unsigned int v8;  // x22
    st_1db250_3 **v0;  // [bp-0x100], Other Possible Types: char
    st_1db250_3 *v1;  // [bp-0xf8]
    unsigned int v2;  // [bp-0xec]
    unsigned long v3;  // [bp-0xe8]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!g_f0d198)
    {
        return 0;
    }
    else if (!g_f0d198->field_60)
    {
        return 0;
    }
    else if (!a0->field_8)
    {
        return 0;
    }
    else if (a0->field_8->field_18)
    {
        if (a0->field_8->field_18->field_30 != g_f0d198->field_60->field_580)
            return 0;
        v3 = *(long long *)a0->field_40->field_8;
        v6 = sub_1dc980(*(long long *)a0->field_40->field_8);
        if (!v6)
            return 0;
        if (!((a0->field_50->field_48 ^ 3) & (*(char *)(v6 + 2) ^ 3)))
            return 0;
        v7 = sub_1da9ac(std::__1::mutex::lock(&g_f02778), &v3);
        if (!v7 || *(long long *)(v7 + 32) != a0->field_50)
            v8 = 0;
        else
            v8 = *(long long *)(v7 + 64);
        std::__1::mutex::unlock(&g_f02778);
        v2 = 0;
        if (!sub_1dac8c(a0, v6, v8, a0->field_58 - a0->field_48 >> 4, &v2))
            g_f0d3d8->field_170();
        g_f0b0d8();
    }
    else
    {
        return 0;
    }
}
