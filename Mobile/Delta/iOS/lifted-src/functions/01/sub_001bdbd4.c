/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bdbd4..0x1bdca8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bdbd4_1 {
    unsigned long long field_0;
    char padding_8[40];
    unsigned long long field_30;
    char padding_38[80];
    unsigned long long field_88;
    unsigned int field_90;
    char padding_94[4];
    unsigned long long field_98;
    char padding_a0[56];
    struct st_1bdbd4_0 *field_d8;
} st_1bdbd4_1;

typedef struct st_1bdbd4_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[24];
    unsigned long long field_38;
    char padding_40[24];
    unsigned long long field_58;
    char padding_60[24];
    unsigned long long field_78;
    unsigned long long field_80;
    unsigned long long field_88;
    char padding_90[40];
    unsigned long long field_b8;
    char padding_c0[80];
    unsigned long long field_110;
    unsigned int field_118;
    char padding_11c[4];
    unsigned long long field_120;
    char field_128;
    char padding_129[7];
    char field_130;
    char padding_131[47];
    struct st_1bdbd4_0 *field_160;
} st_1bdbd4_0;

extern unsigned long long g_e702b8;
extern char g_10001c8;
extern char g_10001f0;

st_1bdbd4_0 * sub_1bdbd4(st_1bdbd4_0 *a0)
{
    st_1bdbd4_1 *v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_88 = &g_10001f0;
    v2 = &a0->field_88;
    *(unsigned long long *)((char *)v2 - 112) = 0;
    *(unsigned long long *)((char *)v2 - 80) = 0;
    *(unsigned long long *)((char *)v2 - 48) = 0;
    v2->field_30 = 0;
    *(unsigned long long *)((char *)v2 - 16) = 0;
    *(char **)((char *)v2 - 8) = &g_10001c8;
    std::__1::ios_base::init(v2, &v2->field_98);
    a0->field_110 = 0;
    a0->field_118 = 0xffffffff;
    a0->field_120 = &g_10001c8;
    std::__1::locale::locale(&a0->field_128);
    memset(&a0->field_130, 0, 48);
    a0->field_120 = &g_e702b8;
    a0->field_160 = a0;
    return a0;
}
