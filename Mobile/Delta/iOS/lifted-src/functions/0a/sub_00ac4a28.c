/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4a28..0xac4b20 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4a28_2 {
    struct st_ac4a28_0 *field_0;
    long long field_8;
} st_ac4a28_2;

typedef struct st_ac4a28_0 {
    char padding_0[160];
    struct st_ac4a28_1 *field_a0;
} st_ac4a28_0;

typedef struct st_ac4a28_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[20];
    unsigned int field_28;
} st_ac4a28_1;


long long sub_ac4a28(st_ac4a28_2 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    long long v2;  // x22
    unsigned long v3;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_0->field_a0->field_10;
    if (sub_a3f7f0(v2, 0, 0) == 1 && sub_a3fe10(v2, a1, v3) == 1 && sub_a3fe10(v2, a2, v3) == 1 && sub_a3fe10(v2, a3, v3) == 1 && sub_a3fe10(v2, a4, a5) == 1)
        return sub_a400f8(v2, a6, a0->field_0->field_a0->field_28) == 1;
    return 0;
}
