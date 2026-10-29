/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x234a74..0x234af4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_234a74_0 {
    char field_0;
} st_234a74_0;

typedef struct st_234a74_2 {
    unsigned long long field_0;
} st_234a74_2;

typedef struct st_234a74_1 {
    struct st_234a74_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_234a74_1;

extern st_234a74_1 g_e79dd8;

unsigned long long sub_234a74(unsigned long long a0, long long a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    unsigned long long v6;  // x0
    st_234a74_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_234a74_0 *v1;  // [bp-0x38], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    sub_168634();
    v1 = &v0;
    v0 = &v1;
    v4 = sub_167278(a1);
    v5 = arm64g_calculate_condition(2, v4, 1, 0);
    if (v5 & 1)
        return v4;
    v6 = sub_167278(a1);
    v1 = a0;
    (&g_e79dd8.field_0)[v6]();
}
