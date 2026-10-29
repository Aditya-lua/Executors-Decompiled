/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4de0..0xac4ec8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4de0_2 {
    struct st_ac4de0_1 *field_0;
    long long field_8;
} st_ac4de0_2;

typedef struct st_ac4de0_1 {
    char padding_0[160];
    struct st_ac4de0_0 *field_a0;
} st_ac4de0_1;

typedef struct st_ac4de0_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac4de0_0;


long long sub_ac4de0(st_ac4de0_2 *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v2;  // x21
    unsigned long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_0->field_a0->field_10;
    if (sub_a3f7f0(v2, 0, 0) == 1 && sub_a3fe10(v2, a1, v3) == 1 && sub_a3fe10(v2, a2, 32) == 1 && sub_a3fe10(v2, a3, v3) == 1 && sub_a3fe10(v2, a4, v3) == 1)
        return sub_a400f8(v2, a5, v3) == 1;
    return 0;
}
