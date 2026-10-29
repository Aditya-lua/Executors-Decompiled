/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7158..0x7270 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7158_1 {
    unsigned int field_0;
} st_7158_1;

typedef struct st_7158_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_7158_1 *field_20;
    unsigned long long field_28;
} st_7158_0;

typedef struct st_7158_2 {
    char field_0;
} st_7158_2;

extern unsigned long long g_e61448;
extern unsigned long long g_e614c0;
extern unsigned int g_f00bb0;

int sub_7158(st_7158_0 *a0)
{
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4105
    unsigned long long v7;  // 4105
    st_7158_2 **v0;  // [bp-0x70], Other Possible Types: char
    st_7158_2 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 != g_f00bb0)
    {
        return 0;
    }
    else if (a0->field_28)
    {
        v4 = *(int *)a0->field_20;
        if (*(int *)a0->field_20 == 2)
        {
            v5 = 72;
            v6 = arm64g_calculate_condition(0x33, v4, 2, 0);
            if (!(v6 & 1))
                goto LABEL_71f2;
LABEL_71f1:
            v5 = 88;
        }
        else
        {
            v5 = 112;
            v7 = arm64g_calculate_condition(0x33, v4, 2, 0);
            if (v7 & 1)
                goto LABEL_71f1;
LABEL_71f2:
        }
        goto *((void *)(*(long long *)((char *)&g_e61448 + v5)));
    }
    else
    {
        goto *((void *)(g_e614c0));
    }
}
