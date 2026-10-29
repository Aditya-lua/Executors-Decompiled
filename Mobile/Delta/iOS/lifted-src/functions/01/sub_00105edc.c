/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x105edc..0x106188 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_105edc_5 {
    char padding_0[8];
    struct st_105edc_1 *field_8;
} st_105edc_5;

typedef struct st_105edc_1 {
    struct st_105edc_0 *field_0;
} st_105edc_1;

typedef struct st_105edc_6 {
    char padding_0[40];
    struct st_105edc_5 *field_28;
    char padding_30[16];
    struct st_105edc_5 *field_40;
    char padding_48[32];
    unsigned long long field_68;
} st_105edc_6;

typedef struct st_105edc_0 {
    char field_0;
} st_105edc_0;

typedef struct st_105edc_8 {
    unsigned long long field_0;
} st_105edc_8;

typedef struct st_105edc_2 {
    char padding_0[257];
    char field_101;
} st_105edc_2;

typedef struct st_105edc_7 {
    char padding_0[288];
    struct st_105edc_8 *field_120;
} st_105edc_7;

typedef struct st_105edc_3 {
    char padding_0[96];
    struct st_105edc_2 *field_60;
} st_105edc_3;

extern st_105edc_3 *g_f0d198;
extern st_105edc_7 *g_f0d3d8;
extern unsigned long long g_f0d528;

char sub_105edc(st_105edc_6 *a0)
{
    char v9;  // x0
    char idx;  // x21
    unsigned long v11;  // x23
    char v12;  // x8
    unsigned long v13;  // x20
    char index;  // x8
    char idx1;  // x9
    unsigned long long v16;  // 4380
    unsigned long long v17;  // 4118
    unsigned long v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    st_105edc_0 **v3;  // [bp-0x60], Other Possible Types: char
    st_105edc_0 *v4;  // [bp-0x58]
    st_105edc_0 **v5;  // [bp-0x50], Other Possible Types: st_105edc_1 **, char
    st_105edc_1 **v6;  // [bp-0x48], Other Possible Types: st_105edc_0 *
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v4 = &v3;
    v3 = &v4;
    v6 = &v5;
    v5 = &v6;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v9 = sub_f2358(a0, 1);
        if (v9)
        {
            idx = *(long long *)(v9 + 24);
            if (idx)
            {
                if (*(char *)(idx + 84) != 1 || (v6 = &v5, v5 = &v6, !*(long long *)(idx + 72) || !*(long long *)*(long long *)(idx + 72) || *(char *)*(long long *)*(long long *)(idx + 72) != 15 || !*(long long *)(idx + 88)))
                {
                    v11 = g_f0d528 + 4713;
                    v6 = &v5;
                    v5 = &v6;
                    if (a0->field_40 > a0->field_28 && !(v12 = *(long long *)a0->field_40->field_8, !v12 || *(char *)(v12 + 3) != 1 || !*(long long *)(v12 + 32)))
                    {
                        v13 = *(long long *)(v12 + 32) + 24;
                        if (!_strcmp(v13, g_f0d528 + 1823))
                        {
                            if (!a0->field_68)
                                goto LABEL_10601c;
                            v13 = a0->field_68 + 24;
                        }
                        v1 = v13;
                        v2 = v11;
                        v0 = 1;
                    }
                    else
                    {
LABEL_10601c:
                        v0 = 1;
                        v1 = v11;
                    }
                    sub_d5c30(a0);
                }
                index = *(long long *)*(long long *)(idx + 72);
                idx1 = *(long long *)(idx + 88);
                *(long long *)(index + 40) = *(long long *)(idx1 + 40);
                *(int *)(index + 148) = *(int *)(idx1 + 148);
                *(long long *)(index + 88) = *(long long *)(idx1 + 88);
                *(long long *)(index + 32) = *(long long *)(idx1 + 32);
                *(int *)(index + 152) = *(int *)(idx1 + 152);
                *(long long *)(index + 24) = *(long long *)(idx1 + 24);
                *(int *)(index + 156) = *(int *)(idx1 + 156);
                *(char *)(index + 7) = *(char *)(idx1 + 7);
                *(char *)(index + 4) = *(char *)(idx1 + 4);
                *(char *)(index + 3) = *(char *)(idx1 + 3);
                *(char *)(index + 5) = *(char *)(idx1 + 5);
                *(char *)(index + 6) = *(char *)(idx1 + 6);
                *(long long *)(index + 112) = *(long long *)(idx1 + 112);
                *(long long *)(index + 56) = *(long long *)(idx1 + 56);
                *(int *)(index + 140) = *(int *)(idx1 + 140);
                *(int *)(index + 164) = *(int *)(idx1 + 164);
                *(long long *)(index + 80) = *(long long *)(idx1 + 80);
                *(int *)(index + 172) = *(int *)(idx1 + 172);
                *(long long *)(index + 120) = *(long long *)(idx1 + 120);
                *(int *)(index + 144) = *(int *)(idx1 + 144);
                *(long long *)(index + 128) = *(long long *)(idx1 + 128);
                *(int *)(index + 0x88) = *(int *)(idx1 + 0x88);
                *(unsigned long long *)(idx1 + 56) = 0;
                *(unsigned long long *)(idx1 + 80) = 0;
                *(unsigned int *)(idx1 + 172) = 0;
                memset(idx1 + 24, 0, 24);
                memset(idx1 + 112, 0, 48);
                v16 = arm64g_calculate_condition(1, *(int *)(idx + 96), 1, 0);
                if (!(v16 & 1))
                    g_f0d3d8->field_120();
                v17 = arm64g_calculate_condition(1, *(int *)(idx + 100), 1, 0);
                if (v17 & 1)
                {
                    *(unsigned long long *)(idx + 88) = 0;
                    *(char *)(idx + 84) = 0;
                    return 0;
                }
                g_f0d3d8->field_120();
            }
        }
    }
    sub_c60cc4(a0);
}
