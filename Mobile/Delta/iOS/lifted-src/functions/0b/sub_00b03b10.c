/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03b10..0xb03b54 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03b10_0 {
    char padding_0[32];
    struct st_b03b10_1 *field_20;
} st_b03b10_0;

typedef struct st_b03b10_1 {
    unsigned long long field_0;
} st_b03b10_1;

typedef struct st_b03b10_2 {
    char padding_0[104];
    struct st_b03b10_0 *field_68;
} st_b03b10_2;


void sub_b03b10(st_b03b10_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    a0->field_68->field_20();
}
