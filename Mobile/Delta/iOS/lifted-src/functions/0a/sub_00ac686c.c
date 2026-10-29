/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac686c..0xac6a24 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac686c_2 {
    char padding_0[168];
    struct st_ac686c_0 *field_a8;
} st_ac686c_2;

typedef struct st_ac686c_0 {
    char padding_0[16];
    struct st_ac686c_1 *field_10;
} st_ac686c_0;

typedef struct st_ac686c_1 {
    unsigned long long field_0;
} st_ac686c_1;

extern char g_10002b0;

unsigned int sub_ac686c(st_ac686c_2 **a0, long long a1, unsigned int a2, unsigned int a3, long long a4, long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v7;  // x28
    unsigned long v8;  // x27
    unsigned long long v0;  // [bp-0xb8]
    unsigned long long v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    char v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (!a3)
        *a0->field_a8->field_10();
    v0 = a6;
    v1 = a7;
    v7 = a2 * 2;
    v8 = a3 - 1;
    if (sub_ac686c(a0, a1, v7, v8, a4, a5, &v3, 32) && sub_ac686c(a0, a1, (unsigned int)v7 | 1, v8, a4, a5, &v2, 32))
        *a0->field_a8->field_10();
    sub_a66ec0(&v3, 32);
    sub_a66ec0(&v2, 32);
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
