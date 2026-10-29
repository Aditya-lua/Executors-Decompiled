/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2f6e8..0xa2f748 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2f6e8_0 {
    struct st_a2f6e8_0 *field_0;
    struct st_a2f6e8_0 *field_8;
    char padding_10[40];
    struct st_a2f6e8_1 *field_38;
} st_a2f6e8_0;

typedef struct st_a2f6e8_1 {
    unsigned long long field_0;
} st_a2f6e8_1;


void sub_a2f6e8(st_a2f6e8_0 *a0)
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
    if (!a0->field_0)
    {
        a0->field_8 = 0;
        sub_a2fffc(0);
        a0->field_0 = 0;
    }
    a0->field_0->field_38();
}
