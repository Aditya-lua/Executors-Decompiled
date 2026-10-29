/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2843b0..0x284a84 (1748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2843b0_1 {
    char padding_0[259];
    char field_103;
    char padding_104[604];
    char field_360;
    char padding_361[543];
    unsigned long long field_580;
} st_2843b0_1;

typedef struct st_2843b0_4 {
    char padding_0[8];
    struct st_2843b0_3 *field_8;
} st_2843b0_4;

typedef struct st_2843b0_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_2843b0_3;

typedef struct st_2843b0_0 {
    char field_0;
} st_2843b0_0;

typedef struct st_2843b0_6 {
    unsigned long long field_0;
} st_2843b0_6;

typedef struct st_2843b0_5 {
    char padding_0[376];
    struct st_2843b0_6 *field_178;
} st_2843b0_5;

typedef struct st_2843b0_2 {
    char padding_0[96];
    struct st_2843b0_1 *field_60;
} st_2843b0_2;

extern st_2843b0_2 *g_f0d198;
extern st_2843b0_5 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern char g_10002b0;

unsigned int sub_2843b0(st_2843b0_4 *a0)
{
    st_2843b0_1 *v7;  // x9
    st_2843b0_0 **v0;  // [bp-0x150], Other Possible Types: char
    st_2843b0_0 *v1;  // [bp-0x148]
    st_2843b0_0 **v2;  // [bp-0xe0], Other Possible Types: char
    st_2843b0_0 *v3;  // [bp-0xa0]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = g_f0d198->field_60;
    if (!(v7->field_103 >> 4 & 1))
    {
        if (!(v7->field_360 & 1) && *(long long *)&v7[1].padding_0[248] && v7->field_580 && *(long long *)(a0->field_8->field_18 + 48) == v7->field_580 && a0[5].padding_0 != *(long long *)&v7[1].padding_0[248])
            sub_d5c30(a0, g_f0d528 + 5158);
        v3 = &v2;
        v2 = &v3;
        g_f0d3d8->field_178();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v4)
            return 0xffffffff;
        ___stack_chk_fail(0xffffffff);
        __debugbreak();
    }
}
