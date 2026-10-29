/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6904..0x1a6a44 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6904_1 {
    unsigned long long field_0;
    struct st_1a6904_1 *field_8;
    char field_10;
} st_1a6904_1;

typedef struct st_1a6904_2 {
    char padding_0[56];
    struct st_1a6904_1 *field_38;
} st_1a6904_2;

typedef struct st_1a6904_0 {
    char field_0;
} st_1a6904_0;

extern char g_e6fa98;
extern char g_e6fac8;

char * sub_1a6904(st_1a6904_2 *a0, char *a1, char *a2)
{
    st_1a6904_1 *v4;  // x21
    char v5;  // x0
    st_1a6904_1 *v6;  // x8
    st_1a6904_1 *v7;  // x9
    char *v8;  // x22
    char v9;  // x0
    st_1a6904_1 *v10;  // x8
    st_1a6904_1 *v11;  // x9
    long long v12;  // x0
    long long v13;  // x0
    st_1a6904_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a6904_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    if (*a1 == 94)
    {
        v4 = operatornew(24);
        v5 = sub_1a635c(a0);
        v6 = a0->field_38;
        v7 = v6->field_8;
        v4->field_0 = &g_e6fa98;
        v4->field_8 = v7;
        v4->field_10 = v5;
        v6->field_8 = v4;
        a0->field_38 = v4;
        a1 += 1;
    }
    if (a1 != a2)
    {
        a1 = sub_1d324c(a0);
        if (a1 != a2)
        {
            v8 = a1 + 1;
            if (v8 == a2 && *a1 == 36)
            {
                v4 = operatornew(24);
                v9 = sub_1a635c(a0);
                v10 = a0->field_38;
                v11 = v10->field_8;
                v4->field_0 = &g_e6fac8;
                v4->field_8 = v11;
                v4->field_10 = v9;
                v10->field_8 = v4;
                a0->field_38 = v4;
                a1 = v8;
            }
        }
    }
    if (a1 == a2)
        return a1;
    v12 = sub_1a3d88();
    operatordelete(v4);
    v13 = __Unwind_Resume(v12);
    operatordelete(v4);
    __Unwind_Resume(v13);
}
