/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe12c8..0xe13bc (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e12c8_0 {
    unsigned int field_0;
    char padding_4[8];
    long long field_c;
} st_e12c8_0;

typedef struct st_e12c8_3 {
    struct st_e12c8_2 *field_0;
} st_e12c8_3;

typedef struct st_e12c8_1 {
    char padding_0[88];
    struct st_e12c8_0 *field_58;
} st_e12c8_1;

typedef struct st_e12c8_2 {
    char field_0;
} st_e12c8_2;

typedef struct st_e12c8_4 {
    char padding_0[257];
    char field_101;
} st_e12c8_4;

typedef struct st_e12c8_5 {
    char padding_0[96];
    struct st_e12c8_4 *field_60;
} st_e12c8_5;

extern st_e12c8_5 *g_f0d198;

long long sub_e12c8(st_e12c8_1 *a0)
{
    char v6;  // x0
    char v7;  // x0
    st_e12c8_0 *v8;  // x9
    st_e12c8_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_e12c8_2 *v1;  // [bp-0x48]
    st_e12c8_2 **v2;  // [bp-0x40], Other Possible Types: st_e12c8_3 **, char
    st_e12c8_2 *v3;  // [bp-0x38], Other Possible Types: st_e12c8_3 **
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && !(v6 = sub_e287c(a0, 1), !v6 || !*(long long *)(v6 + 24)))
    {
        v3 = &v2;
        v2 = &v3;
        if (g_f0d198->field_60->field_101 >> 2 & 1)
        {
            v7 = sub_e287c(a0, 2);
            if (v7 && *(long long *)(v7 + 24))
            {
                v8 = a0->field_58;
                v8->field_0 = *(long long *)(*(long long *)(v6 + 24) + 64) == *(long long *)(*(long long *)(v7 + 24) + 64);
                *(unsigned int *)&(v8->padding_4)[1] = 1;
                a0->field_58 = &a0->field_58->field_c;
                return 1;
            }
        }
    }
    else
    {
        sub_c60c7c(a0);
    }
    sub_c60c4c(a0);
}
