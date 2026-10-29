/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16665c..0x16717c (2848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16665c_0 {
    char field_0;
} st_16665c_0;

typedef struct st_16665c_4 {
    unsigned long long field_0;
} st_16665c_4;

typedef struct st_16665c_1 {
    char padding_0[257];
    char field_101;
} st_16665c_1;

typedef struct st_16665c_3 {
    char padding_0[376];
    struct st_16665c_4 *field_178;
} st_16665c_3;

typedef struct st_16665c_2 {
    char padding_0[96];
    struct st_16665c_1 *field_60;
} st_16665c_2;

extern st_16665c_2 *g_f0d198;
extern st_16665c_3 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern char g_10002b0;

char sub_16665c(long long a0)
{
    char v10;  // x0
    long long v12;  // x0
    long long v13;  // x0
    long long v0;  // [bp-0x180]
    unsigned long v1;  // [bp-0x178]
    st_16665c_0 **v2;  // [bp-0x160], Other Possible Types: char
    st_16665c_0 *v3;  // [bp-0x158]
    uint128_t v4;  // [bp-0x150], Other Possible Types: char
    char v5;  // [bp-0x148]
    uint128_t v6;  // [bp-0x110]
    unsigned long v7;  // [bp-0x80]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && !(v10 = sub_e21e0(a0, 1), !v10))
    {
        sub_66d5c(&v4, v10 + 24, *(long long *)(v10 + 24));
        if (!*(unsigned long long *)&v4)
            goto LABEL_166ef8;
        if (*(char *)(*(unsigned long long *)&v4 + 65) != 1)
            goto LABEL_166f2c;
    }
    else
    {
        v4 = 0;
LABEL_166ef8:
        v0 = 1;
        v1 = g_f0d528 + 2735;
        sub_d5c30(a0, g_f0d528 + 958);
        if (*(char *)(*(unsigned long long *)&v4 + 65) != 1)
        {
LABEL_166f2c:
            sub_60b78(&v4);
            if (*(long long *)&g_10002b0 == v7)
                return 0;
            v12 = ___stack_chk_fail();
            sub_e1830(&v6);
            sub_60b78(&v4);
            v13 = __Unwind_Resume(v12);
            sub_60b78(&v4);
            __Unwind_Resume(v13);
        }
    }
    sub_1656ec(operatornew(80), &v4, a0);
    v6 = v4;
    v4 = 0;
    v5 = 0;
    sub_60b78(&v6);
    g_f0d3d8->field_178();
}
