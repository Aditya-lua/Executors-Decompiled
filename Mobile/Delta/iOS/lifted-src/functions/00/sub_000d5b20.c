/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd5b20..0xd5c30 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d5b20_3 {
    char padding_0[8];
    struct st_d5b20_2 *field_8;
} st_d5b20_3;

typedef struct st_d5b20_7 {
    char padding_0[12];
    struct st_d5b20_2 *field_c;
} st_d5b20_7;

typedef struct st_d5b20_6 {
    char padding_0[24];
    struct st_d5b20_1 *field_18;
} st_d5b20_6;

typedef struct st_d5b20_4 {
    char padding_0[536];
    unsigned int field_218;
    unsigned int field_21c;
} st_d5b20_4;

typedef struct st_d5b20_1 {
    char padding_0[48];
    struct st_d5b20_2 *field_30;
} st_d5b20_1;

typedef struct st_d5b20_2 {
    struct st_d5b20_2 *field_0;
    struct st_d5b20_1 *field_8;
    struct st_d5b20_3 *field_10;
    struct st_d5b20_4 *field_18;
    char padding_20[48];
    unsigned long long field_50;
} st_d5b20_2;

typedef struct st_d5b20_8 {
    char padding_0[8];
    struct st_d5b20_6 *field_8;
    char padding_10[64];
    unsigned long long field_50;
    struct st_d5b20_7 *field_58;
} st_d5b20_8;

typedef struct st_d5b20_0 {
    char field_0;
} st_d5b20_0;

typedef struct st_d5b20_10 {
    unsigned long long field_0;
} st_d5b20_10;

typedef struct st_d5b20_9 {
    char padding_0[392];
    struct st_d5b20_10 *field_188;
} st_d5b20_9;

extern st_d5b20_9 *g_f0d3d8;

long long sub_d5b20(st_d5b20_8 *a0)
{
    st_d5b20_2 *v6;  // x20
    st_d5b20_2 *v7;  // x20
    unsigned int *v8;  // x8
    st_d5b20_2 *v9;  // x8
    st_d5b20_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_d5b20_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x40]
    st_d5b20_0 **v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_8->field_18->field_30[20].field_18;
    if (a0->field_8->field_18->field_30[20].field_18)
    {
        do
        {
            v7 = v6;
            v8 = v7->field_18;
            v2 = &v3;
            v3 = &v2;
            v9 = v8[134] + (char *)v8 + 134 | (v8[135] + (char *)v8 + 134) * 0x100000000;
            if (v9 && !(int)v9->field_8->field_30 && v9->field_50 == a0->field_50)
            {
                v2 = &v3;
                v3 = &v2;
                if (v7->field_10->field_8 && sub_e0630(&v7->field_10->field_8) >= 1)
                    g_f0d3d8->field_188();
            }
        } while ((v6 = v7->field_0, v7->field_0));
    }
    *(unsigned int *)&(a0->field_58->padding_0)[1] = 0;
    a0->field_58 = &a0->field_58->field_c;
    return 1;
}
