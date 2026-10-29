/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb05658..0xb057c8 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b05658_0 {
    char padding_0[248];
    struct st_b05658_1 *field_f8;
    struct st_b05658_0 *field_100;
    unsigned long long field_108;
    unsigned long long field_110;
    unsigned long long field_118;
} st_b05658_0;

typedef struct st_b05658_1 {
    char padding_0[496];
    struct st_b05658_1 *field_1f0;
    struct st_b05658_0 *field_1f8;
    unsigned long long field_200;
    unsigned long long field_208;
    unsigned long long field_210;
} st_b05658_1;

typedef struct st_b05658_2 {
    char padding_0[108];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[247];
    char field_1b8;
    char padding_1b9[247];
    struct st_b05658_1 *field_2b0;
    struct st_b05658_0 *field_2b8;
    unsigned long long field_2c0;
    unsigned long long field_2c8;
    unsigned long long field_2d0;
} st_b05658_2;

extern char g_9b8de4;
extern char g_9b9120;
extern char g_9b96e0;
extern char g_9b9740;
extern unsigned int g_9bdca0;
extern unsigned int g_9be260;
extern unsigned int g_f0d568;

int sub_b05658(st_b05658_2 *a0, long long a1, unsigned long long a2)
{
    unsigned long v2;  // cc_dep1
    unsigned int v3;  // x24
    st_b05658_0 *v12;  // x23
    unsigned long long v13;  // x8
    unsigned long long v14;  // x24
    long long v15;  // x0
    long long v16;  // x1
    st_b05658_1 *v17;  // x2
    unsigned long v18;  // x8
    st_b05658_0 *v19;  // x23
    unsigned long long v4;  // 4107
    unsigned long long v5;  // 4107
    unsigned int v6;  // x25
    unsigned long long v7;  // x26
    long long v8;  // x0
    long long v9;  // x1
    st_b05658_1 *v10;  // x2
    unsigned long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 2 & 1))
    {
        v2 = g_f0d568 & 1;
        if (!(g_f0d568 & 1))
        {
            v3 = 0;
            v4 = arm64g_calculate_condition(9, v2, 0, 0);
            if (!(v4 & 1))
                goto LABEL_b056a6;
LABEL_b056a5:
            v6 = 0;
        }
        else
        {
            v3 = (unsigned int)&g_9be260;
            v5 = arm64g_calculate_condition(9, v2, 0, 0);
            if (v5 & 1)
                goto LABEL_b056a5;
LABEL_b056a6:
            v6 = (unsigned int)&g_9bdca0;
        }
        v7 = a2 >> 1;
        v8 = a1;
        v9 = (unsigned int)v7 * 8;
        v10 = &a0->field_c0;
        if (!(a0->field_6c >> 1 & 1))
        {
            sub_9b8ba4(v8, v9, v10);
            v11 = &g_9b9120;
        }
        else
        {
            sub_9b8880(v8, v9, v10);
            v11 = &g_9b8de4;
        }
        a0->field_2c0 = v11;
        v12 = &a0->field_1b8;
        sub_9b8880(a1 + v7, v9, v12);
        a0->field_2c8 = &g_9b8de4;
        a0->field_2b0 = v10;
        a0->field_2b8 = v12;
        if (!(a0->field_6c & 2))
            v13 = v3;
        else
            v13 = v6;
    }
    else
    {
        v14 = a2 >> 1;
        v15 = a1;
        v16 = (unsigned int)v14 * 8;
        v17 = &a0->field_c0;
        if (!(a0->field_6c >> 1 & 1))
        {
            sub_9b9660(v15, v16, v17);
            v18 = &g_9b9740;
        }
        else
        {
            sub_9b9440(v15, v16, v17);
            v18 = &g_9b96e0;
        }
        a0->field_2c0 = v18;
        v19 = &a0->field_1b8;
        sub_9b9440(a1 + v14, v16, v19);
        a0->field_2c8 = &g_9b96e0;
        a0->field_2b0 = v17;
        a0->field_2b8 = v19;
        if (!(a0->field_6c & 2))
            v13 = "_@";
        else
            v13 = "_@";
    }
    a0->field_2d0 = v13;
    return 1;
}
