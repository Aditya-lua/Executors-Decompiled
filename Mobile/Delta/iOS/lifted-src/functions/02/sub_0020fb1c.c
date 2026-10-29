/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20fb1c..0x210e24 (4872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20fb1c_2 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_20fb1c_1 *field_50;
    char padding_58[32];
    unsigned long long field_78;
} st_20fb1c_2;

typedef struct st_20fb1c_1 {
    char padding_0[32];
    struct st_20fb1c_2 *field_20;
} st_20fb1c_1;

typedef struct st_20fb1c_0 {
    char field_0;
} st_20fb1c_0;

typedef struct st_20fb1c_6 {
    unsigned long long field_0;
} st_20fb1c_6;

typedef struct st_20fb1c_3 {
    char padding_0[1376];
    struct st_20fb1c_2 *field_560;
    char padding_568[280];
    struct st_20fb1c_1 *field_680;
} st_20fb1c_3;

typedef struct st_20fb1c_5 {
    char padding_0[376];
    struct st_20fb1c_6 *field_178;
} st_20fb1c_5;

typedef struct st_20fb1c_4 {
    char padding_0[96];
    struct st_20fb1c_3 *field_60;
    char padding_68[1048];
    unsigned long long field_480;
} st_20fb1c_4;

extern st_20fb1c_4 *g_f0d198;
extern st_20fb1c_5 *g_f0d3d8;

unsigned long long sub_20fb1c(st_20fb1c_2 *a0)
{
    st_20fb1c_2 *v6;  // x20
    st_20fb1c_1 *v7;  // x8
    st_20fb1c_2 *v8;  // x20
    unsigned long v9;  // x8
    st_20fb1c_1 *v10;  // x9
    unsigned long v11;  // x8
    st_20fb1c_1 *v12;  // x9
    unsigned long v13;  // x9
    st_20fb1c_0 **v0;  // [bp-0x100], Other Possible Types: char
    st_20fb1c_0 *v1;  // [bp-0xf8]
    st_20fb1c_0 *v2;  // [bp-0xc0]
    st_20fb1c_0 **v3;  // [bp-0x78], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    v6 = g_f0d198->field_60->field_560;
    v7 = v6->field_50;
    if (a0->field_50 != v7)
    {
        v8 = *(long long *)sub_e2588(g_f0d198->field_480 + 72024, &a0->field_50);
        if (v8)
        {
            v2 = &v3;
            v3 = &v2;
            v9 = v8->field_2;
            if (v9 >> 2 & 1)
            {
                v10 = v8->field_50;
                v8->field_2 = (char)v9 & 251;
                v8->field_78 = v10->field_20;
                v10->field_20 = v8;
            }
            g_f0d3d8->field_178();
        }
        else
        {
            v11 = a0->field_2;
            if (v11 >> 2 & 1)
            {
                v12 = a0->field_50;
                a0->field_2 = (char)v11 & 251;
                a0->field_78 = v12->field_20;
                v12->field_20 = a0;
            }
            g_f0d3d8->field_178();
        }
    }
    else
    {
        v2 = &v3;
        v3 = &v2;
        v13 = v6->field_2;
        if (v13 >> 2 & 1)
        {
            v6->field_2 = (char)v13 & 251;
            v6->field_78 = v7->field_20;
            v7->field_20 = v6;
        }
        g_f0d3d8->field_178();
    }
}
