/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4be4..0xac4d10 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4be4_2 {
    struct st_ac4be4_1 *field_0;
    long long field_8;
} st_ac4be4_2;

typedef struct st_ac4be4_1 {
    char padding_0[160];
    struct st_ac4be4_0 *field_a0;
} st_ac4be4_1;

typedef struct st_ac4be4_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac4be4_0;

extern char g_10002b0;

long long sub_ac4be4(st_ac4be4_2 *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v4;  // x21
    unsigned long v5;  // x20
    long long v6;  // x19
    char v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = a0->field_8;
    v5 = a0->field_0->field_a0->field_10;
    if (sub_a3f7f0(v4, 0, 0) == 1 && sub_a3fe10(v4, a1, v5) == 1 && sub_a3fe10(v4, a2, v5) == 1 && sub_a3fe10(v4, a3, a4) == 1 && sub_a400f8(v4, &v0, v5) == 1)
        v6 = sub_a6ebd4(a5, &v0, v5) != 0;
    else
        v6 = 0;
    sub_a66ec0(&v0, 32);
    if (*(long long *)&g_10002b0 == v1)
        return v6;
    ___stack_chk_fail();
}
