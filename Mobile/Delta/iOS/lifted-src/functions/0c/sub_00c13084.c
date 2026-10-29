/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc13084..0xc133dc (856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c13084_3 {
    char padding_0[8];
    struct st_c13084_1 *field_8;
} st_c13084_3;

typedef struct st_c13084_1 {
    char padding_0[24];
    struct st_c13084_2 *field_18;
} st_c13084_1;

typedef struct st_c13084_2 {
    unsigned long long field_0;
} st_c13084_2;

typedef struct st_c13084_0 {
    char field_0;
} st_c13084_0;

extern long long g_c128b0;
extern long long g_c133dc;
extern long long g_c135b0;
extern long long g_c1367c;

unsigned int sub_c13084(st_c13084_0 **a0, st_c13084_3 *a1)
{
    char *v4;  // x20
    unsigned int v5;  // w8
    unsigned int v6;  // w0
    unsigned long v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x50]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a0;
    v5 = *v4;
    if (!v5)
    {
        v1 = v4 + 8;
        v6 = sub_be9f94(a1, "BC", 2, "op_code", v4 + 4, &g_c1367c, "a", 1, v4 + 1, &g_c128b0, "b", 1, v4 + 2, &g_c128b0, "c", 1, v4 + 3, &g_c128b0, "aux", 3, &v1, &g_c135b0);
    }
    else if (v5 == 1)
    {
        v1 = v4 + 8;
        v6 = sub_be9e38(a1, "AD", 2, "op_code", 7, v4 + 2, &g_c1367c, "a", 1, v4 + 1, &g_c128b0, "dEe", 1, v4 + 4, &g_c133dc, "aux", 3, &v1, &g_c135b0);
    }
    else
    {
        v0 = v4 + 4;
        a1->field_8->field_18();
    }
    return v6 & 1;
}
