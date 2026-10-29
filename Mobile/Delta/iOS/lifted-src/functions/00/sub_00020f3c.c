/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20f3c..0x20fe8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20f3c_1 {
    char padding_0[216];
    long long field_d8;
} st_20f3c_1;

typedef struct st_20f3c_0 {
    char field_0;
} st_20f3c_0;

typedef struct st_20f3c_3 {
    unsigned long long field_0;
} st_20f3c_3;

typedef struct st_20f3c_2 {
    struct st_20f3c_3 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_20f3c_2;

extern st_20f3c_2 g_e61fb8;

long long sub_20f3c(st_20f3c_1 *a0, int *a1, unsigned long a2)
{
    unsigned int *v4;  // x0
    unsigned long v5;  // x8
    st_20f3c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_20f3c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return 0;
    v4 = sub_404c(a0->field_d8, a2 * 80);
    v5 = *a1;
    *v4 = v5;
    (&g_e61fb8.field_0)[v5]();
}
