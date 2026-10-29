/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc655dc..0xc65a2c (1104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c655dc_0 {
    char padding_0[168];
    struct st_c655dc_1 *field_a8;
} st_c655dc_0;

typedef struct st_c655dc_2 {
    char padding_0[264];
    unsigned long long field_108;
    unsigned long long field_110;
    char padding_118[984];
    struct st_c655dc_3 *field_4f0;
    char padding_4f8[1920];
    struct st_c655dc_0 *field_c78;
} st_c655dc_2;

typedef struct st_c655dc_3 {
    char padding_0[304];
    unsigned long long field_130;
    char padding_138[8];
    unsigned long long field_140;
} st_c655dc_3;

typedef struct st_c655dc_1 {
    unsigned long long field_0;
} st_c655dc_1;

extern char g_10002b0;

unsigned int sub_c655dc(st_c655dc_2 *a0, unsigned int a1)
{
    unsigned long long v3;  // x0
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (sub_953dfc())
    {
        v3 = sub_953f20(a0);
        if (v3 <= a0->field_4f0->field_130 && (a1 != 22 || a0->field_110 || a0->field_108 == a0->field_4f0->field_140 + 12))
            a0->field_c78->field_a8();
    }
    if (*(long long *)&g_10002b0 == v0)
        return 0xffffffff;
    ___stack_chk_fail();
}
