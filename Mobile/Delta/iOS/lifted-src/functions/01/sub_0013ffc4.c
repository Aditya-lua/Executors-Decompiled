/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13ffc4..0x140054 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13ffc4_0 {
    char field_0;
    char padding_1[11];
    long long field_c;
} st_13ffc4_0;

typedef struct st_13ffc4_1 {
    char padding_0[88];
    struct st_13ffc4_0 *field_58;
} st_13ffc4_1;

typedef struct st_13ffc4_2 {
    char field_0;
} st_13ffc4_2;

typedef struct st_13ffc4_3 {
    char padding_0[257];
    char field_101;
} st_13ffc4_3;

typedef struct st_13ffc4_4 {
    char padding_0[96];
    struct st_13ffc4_3 *field_60;
} st_13ffc4_4;

extern st_13ffc4_4 *g_f0d198;

long long sub_13ffc4(st_13ffc4_1 *a0)
{
    char v4;  // x0
    char v5;  // w8
    st_13ffc4_0 *v6;  // x9
    st_13ffc4_2 **v0;  // [bp-0x30], Other Possible Types: char
    st_13ffc4_2 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && !(v4 = sub_13e800(a0, 1), !v4))
        v5 = *(long long *)(v4 + 24) != 0;
    else
        v5 = 0;
    v6 = a0->field_58;
    *(unsigned int *)&v6->field_0 = v5;
    *(unsigned int *)&(v6->padding_1)[1] = 1;
    a0->field_58 = &a0->field_58->field_c;
    return 1;
}
