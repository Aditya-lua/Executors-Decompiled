/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa644c4..0xa64530 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a644c4_0 {
    struct st_a644c4_0 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
} st_a644c4_0;


void sub_a644c4(st_a644c4_0 *a0)
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
    sub_a3f568(a0->field_10);
    sub_a3f568(a0->field_18);
    sub_a3f568(a0->field_8);
    a0->field_0 = 0;
    sub_a3f73c(a0->field_10);
    sub_a3f73c(a0->field_18);
    sub_a3f73c(a0->field_8);
}
