/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb79ed4..0xb7a030 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b79ed4_4 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b79ed4_4;

typedef struct st_b79ed4_2 {
    long long field_0;
    struct st_b79ed4_0 *field_8;
} st_b79ed4_2;

typedef struct st_b79ed4_0 {
    char padding_0[24];
    struct st_b79ed4_1 *field_18;
} st_b79ed4_0;

typedef struct st_b79ed4_3 {
    char padding_0[48];
    struct st_b79ed4_4 *field_30;
} st_b79ed4_3;

typedef struct st_b79ed4_1 {
    unsigned long long field_0;
} st_b79ed4_1;

extern unsigned long long g_b7a7fc;
extern long long g_cba9c2;

int sub_b79ed4(st_b79ed4_2 **a0, st_b79ed4_3 *a1)
{
    unsigned long v4;  // x8
    st_b79ed4_2 *v5;  // x21
    st_b79ed4_3 *v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a1->field_30->field_0 < 2)
        goto LABEL_b79f10;
    switch (v4)
    {
    case 11:
        if (a1->field_30->field_8 == 0x8000000000000000)
            *a0->field_8->field_18();
    case 7:
LABEL_b79f10:
        if (sub_b79024(a0) & 1)
            return 1;
        v5 = *a0;
        v0 = a1;
        v1 = &g_b7a7fc;
        if (sub_be769c(v5->field_0, v5->field_8, &g_cba9c2, &v0) & 1)
            return 1;
        v5->field_8->field_18();
    default:
        *a0->field_8->field_18();
    }
}
