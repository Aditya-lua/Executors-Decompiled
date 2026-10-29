/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a298..0xa1a2e8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a298_0 {
    struct st_a1a298_1 *field_0;
} st_a1a298_0;

typedef struct st_a1a298_1 {
    char padding_0[88];
    struct st_a1a298_0 *field_58;
    struct st_a1a298_0 *field_60;
} st_a1a298_1;


void sub_a1a298(st_a1a298_1 **a0)
{
    st_a1a298_1 **v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v5 = *a0->field_60;
    if (!*a0->field_60)
        v5 = *a0->field_58;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    v5();
}
