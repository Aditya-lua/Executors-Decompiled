/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2272e4..0x227420 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2272e4_0 {
    char field_0;
} st_2272e4_0;

typedef struct st_2272e4_4 {
    unsigned long long field_0;
} st_2272e4_4;

typedef struct st_2272e4_1 {
    char padding_0[257];
    char field_101;
} st_2272e4_1;

typedef struct st_2272e4_3 {
    char padding_0[376];
    struct st_2272e4_4 *field_178;
} st_2272e4_3;

typedef struct st_2272e4_2 {
    char padding_0[96];
    struct st_2272e4_1 *field_60;
} st_2272e4_2;

extern st_2272e4_2 *g_f0d198;
extern st_2272e4_3 *g_f0d3d8;
extern unsigned long long g_f0d528;

void sub_2272e4(long long a0)
{
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    char v14;  // x0
    long long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    st_2272e4_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_2272e4_0 *v3;  // [bp-0x38]
    char v4;  // [bp-0x30]
    char v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v6 = v11;
    v7 = v12;
    v8 = &v10;
    v9 = v13;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && !(v14 = sub_2194ec(a0, 1), !v14))
    {
        sub_66d5c(&v4, v14 + 24, *(long long *)(v14 + 24));
        if (v4)
            goto LABEL_227380;
    }
    else
    {
        v4 = 0;
        v5 = 0;
    }
    v0 = 1;
    v1 = g_f0d528 + 3362;
    sub_d5c30(a0, g_f0d528 + 958);
LABEL_227380:
    g_f0d3d8->field_178();
}
