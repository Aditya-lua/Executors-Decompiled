/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8495c..0x84a88 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8495c_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    char padding_c[140];
    unsigned long long field_98;
} st_8495c_1;

typedef struct st_8495c_0 {
    char field_0;
} st_8495c_0;

extern long long g_cc022e;
extern long long g_cc0252;
extern long long g_cc029a;
extern long long g_cc02d0;

long long sub_8495c(long long a0, long long a1, long long a2, long long a3, long long a4, st_8495c_1 *a5, long long a6, long long a7)
{
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned int v0;  // [bp-0x80], Other Possible Types: long long
    long long v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    st_8495c_0 **v3;  // [bp-0x60], Other Possible Types: char
    st_8495c_0 *v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = &v3;
    v3 = &v4;
    if (!a3)
        return 3;
    v1 = a6;
    v2 = a7;
    v0 = 28;
    v7 = sub_84274(a5->field_4, a0, 31);
    v0 = _INSERT(CONCAT(28, 0), 0, 35);
    v8 = sub_84274(a5->field_0, a1, 35, a3, a4 + 2224, &g_cc022e, &g_cc0252, 6, v0, a6, a7);
    *(unsigned int *)&v0 = 52;
    v9 = sub_84274(a5->field_8, a2, 52, a3, a4 + 772, &g_cc029a, &g_cc02d0, 6, v0, a6, a7);
    return v7 + v8 + v9 + a5->field_98 + 3;
}
