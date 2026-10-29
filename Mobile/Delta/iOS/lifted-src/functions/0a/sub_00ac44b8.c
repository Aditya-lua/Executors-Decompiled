/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac44b8..0xac46e0 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac44b8_2 {
    char padding_0[168];
    struct st_ac44b8_0 *field_a8;
} st_ac44b8_2;

typedef struct st_ac44b8_1 {
    unsigned long long field_0;
} st_ac44b8_1;

typedef struct st_ac44b8_0 {
    char padding_0[48];
    struct st_ac44b8_1 *field_30;
    char padding_38[24];
    struct st_ac44b8_1 *field_50;
} st_ac44b8_0;

extern char g_10002b0;

unsigned int sub_ac44b8(st_ac44b8_2 **a0, long long a1, long long a2, long long a3, unsigned int a4, unsigned int a5, unsigned long long a6)
{
    unsigned long long v6;  // x27
    unsigned long v7;  // x26
    unsigned long long v0;  // [bp-0xb0]
    char v1;  // [bp-0xa8]
    char v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (!a5)
        *a0->field_a8->field_50();
    v0 = a6;
    v6 = a4 * 2;
    v7 = a5 - 1;
    if (sub_ac44b8(a0, a1, a2, a3, v6, v7, &v2) && sub_ac44b8(a0, a1, a2, a3, (unsigned int)v6 | 1, v7, &v1))
        *a0->field_a8->field_30();
    sub_a66ec0(&v2, 32);
    sub_a66ec0(&v1, 32);
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}
