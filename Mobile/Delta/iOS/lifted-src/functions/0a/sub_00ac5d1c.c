/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac5d1c..0xac5fb8 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac5d1c_3 {
    char padding_0[160];
    struct st_ac5d1c_0 *field_a0;
    struct st_ac5d1c_1 *field_a8;
    unsigned long long field_b0;
} st_ac5d1c_3;

typedef struct st_ac5d1c_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac5d1c_0;

typedef struct st_ac5d1c_2 {
    unsigned long long field_0;
} st_ac5d1c_2;

typedef struct st_ac5d1c_1 {
    char padding_0[80];
    struct st_ac5d1c_2 *field_50;
} st_ac5d1c_1;

extern char g_10002b0;

long long sub_ac5d1c(st_ac5d1c_3 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long a4, unsigned long long a5)
{
    st_ac5d1c_3 *v10;  // x8
    unsigned long long v0;  // [bp-0x9a8]
    unsigned long long v1;  // [bp-0x9a0]
    unsigned long v2;  // [bp-0x998]
    unsigned long v3;  // [bp-0x978]
    long long v4;  // [bp-0x970]
    char v5;  // [bp-0x968]
    char v6;  // [bp-0x8f0]
    unsigned long v7;  // [bp-0x70]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v10 = *a0;
    v4 = 0;
    v2 = v10->field_b0;
    if (sub_c68800(&v5, &v6, 2144, 0))
    {
        v0 = a4;
        v1 = a5;
        v3 = v10->field_a0->field_10;
        v10->field_a8->field_50();
    }
    if (*(long long *)&g_10002b0 == v7)
        return 0;
    ___stack_chk_fail();
}
