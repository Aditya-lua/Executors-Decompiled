/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3ba0..0x1a3d18 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3ba0_1 {
    unsigned long long field_0;
    struct st_1a3ba0_1 *field_8;
    struct st_1a3ba0_1 *field_10;
} st_1a3ba0_1;

typedef struct st_1a3ba0_2 {
    char padding_0[56];
    struct st_1a3ba0_1 *field_38;
} st_1a3ba0_2;

typedef struct st_1a3ba0_0 {
    char field_0;
} st_1a3ba0_0;

extern char g_e6fa38;
extern char g_e6fdf8;
extern char g_e6fe28;

char * sub_1a3ba0(st_1a3ba0_2 *a0, char *a1, char *a2)
{
    st_1a3ba0_1 *v4;  // x23
    char *v5;  // x21
    st_1a3ba0_1 *v14;  // x0
    st_1a3ba0_1 *v15;  // x9
    st_1a3ba0_1 *v16;  // x0
    st_1a3ba0_1 *v17;  // x22
    st_1a3ba0_1 *v18;  // x8
    st_1a3ba0_1 *v19;  // x0
    st_1a3ba0_1 *v20;  // x8
    st_1a3ba0_1 *v6;  // x0
    st_1a3ba0_1 *v7;  // x8
    st_1a3ba0_1 *v8;  // x9
    st_1a3ba0_1 *v9;  // x28
    char *v10;  // x22
    st_1a3ba0_1 *v11;  // x0
    st_1a3ba0_1 *v12;  // x8
    st_1a3ba0_1 *v13;  // x9
    st_1a3ba0_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1a3ba0_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_38;
    v5 = sub_1a6784();
    if (v5 == a1)
    {
        v6 = operatornew(16);
        v7 = a0->field_38;
        v8 = v7->field_8;
        v6->field_0 = &g_e6fa38;
        v6->field_8 = v8;
        v7->field_8 = v6;
        a0->field_38 = v6;
    }
    if (v5 == a2)
        return v5;
    while (*v5 == 124)
    {
        v9 = a0->field_38;
        v10 = v5 + 1;
        v5 = sub_1a6784(a0, v10, a2);
        if (v5 == v10)
        {
            v11 = operatornew(16);
            v12 = a0->field_38;
            v13 = v12->field_8;
            v11->field_0 = &g_e6fa38;
            v11->field_8 = v13;
            v12->field_8 = v11;
            a0->field_38 = v11;
        }
        v14 = operatornew(24);
        v15 = v9->field_8;
        v14->field_8 = v4->field_8;
        v14->field_10 = v15;
        v14->field_0 = &g_e6fdf8;
        v4->field_8 = v14;
        v9->field_8 = 0;
        v16 = operatornew(16);
        v17 = a0->field_38;
        v18 = v17->field_8;
        v16->field_0 = &g_e6fa38;
        v16->field_8 = v18;
        v9->field_8 = v16;
        v17->field_8 = 0;
        v19 = operatornew(16);
        v20 = v9->field_8;
        v19->field_0 = &g_e6fe28;
        v19->field_8 = v20;
        v17->field_8 = v19;
        a0->field_38 = v9->field_8;
        if (v5 == a2)
            return v5;
    }
    return v5;
}
