/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f20b4..0x9f2134 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f20b4_0 {
    long long field_0;
    char field_8;
    char padding_9[31];
    char field_28;
    char padding_29[31];
    char field_48;
    char padding_49[31];
    char field_68;
    char padding_69[31];
    unsigned int field_88;
} st_9f20b4_0;


void sub_9f20b4(st_9f20b4_0 *a0)
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
    sub_a4bab0(a0->field_0);
    sub_a66ec0(&a0->field_48, 32);
    sub_a66ec0(&a0->field_8, 32);
    sub_a66ec0(&a0->field_28, 32);
    sub_a66ec0(&a0->field_68, 32);
    a0->field_88 = 0xffffffff;
    sub_a4bca0(a0->field_0);
}
