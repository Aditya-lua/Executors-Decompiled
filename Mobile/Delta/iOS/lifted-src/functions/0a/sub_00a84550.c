/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa84550..0xa8461c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a84550_1 {
    struct st_a84550_0 *field_0;
    long long field_8;
} st_a84550_1;

typedef struct st_a84550_0 {
    char padding_0[84];
    unsigned int field_54;
} st_a84550_0;

extern char g_10002b0;

st_a84550_1 * sub_a84550(long long a0, long long a1, long long a2, long long a3, st_a84550_1 *a4)
{
    char v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a4 && (int)sub_aa8658(a4->field_8, &v0, 32, a4->field_0->field_54) >= 1)
        sub_a8425c(a0, a1, a2, a3, &v0, 32, a4);
    if (*(long long *)&g_10002b0 == v1)
        return 0;
    ___stack_chk_fail();
}
