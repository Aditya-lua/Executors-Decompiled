/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ae5c8..0x1ae6fc (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ae5c8_2 {
    char padding_0[8];
    struct st_1ae5c8_1 *field_8;
} st_1ae5c8_2;

typedef struct st_1ae5c8_1 {
    unsigned long long field_0;
    struct st_1ae5c8_1 *field_8;
    struct st_1ae5c8_1 *field_10;
} st_1ae5c8_1;

typedef struct st_1ae5c8_3 {
    char padding_0[56];
    struct st_1ae5c8_2 *field_38;
} st_1ae5c8_3;

typedef struct st_1ae5c8_0 {
    char field_0;
} st_1ae5c8_0;

extern char g_e6fa38;
extern char g_e6fdf8;
extern char g_e6fe28;

char * sub_1ae5c8(st_1ae5c8_3 *a0, char *a1, char *a2)
{
    st_1ae5c8_2 *v4;  // x23
    char *v5;  // x0
    st_1ae5c8_1 *v14;  // x0
    st_1ae5c8_1 *v15;  // x8
    st_1ae5c8_2 *v6;  // x27
    char *v7;  // x22
    char *v8;  // x0
    st_1ae5c8_1 *v9;  // x0
    st_1ae5c8_1 *v10;  // x9
    st_1ae5c8_1 *v11;  // x0
    st_1ae5c8_2 *v12;  // x22
    st_1ae5c8_1 *v13;  // x8
    st_1ae5c8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1ae5c8_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_38;
    v5 = sub_1c57b0();
    if (v5 != a1)
    {
        if (v5 != a2)
        {
            while (1)
            {
                if (*v5 != 124)
                    return v5;
                v6 = a0->field_38;
                v7 = v5 + 1;
                v8 = sub_1c57b0(a0, v7, a2);
                if (v8 == v7)
                    break;
                v5 = v8;
                v9 = operatornew(24);
                v10 = v6->field_8;
                v9->field_8 = v4->field_8;
                v9->field_10 = v10;
                v9->field_0 = &g_e6fdf8;
                v4->field_8 = v9;
                v6->field_8 = 0;
                v11 = operatornew(16);
                v12 = a0->field_38;
                v13 = v12->field_8;
                v11->field_0 = &g_e6fa38;
                v11->field_8 = v13;
                v6->field_8 = v11;
                v12->field_8 = 0;
                v14 = operatornew(16);
                v15 = v6->field_8;
                v14->field_0 = &g_e6fe28;
                v14->field_8 = v15;
                v12->field_8 = v14;
                a0->field_38 = v6->field_8;
                if (v5 == a2)
                    return v5;
            }
        }
        else
        {
            return v5;
        }
    }
    sub_1a3d88();
}
