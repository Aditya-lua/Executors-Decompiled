/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68ad4..0xa68b38 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a68ad4_0 {
    struct st_a68ad4_1 *field_0;
    unsigned long long field_8;
} st_a68ad4_0;

typedef struct st_a68ad4_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[4];
    unsigned int field_14;
    struct st_a68ad4_0 *field_18;
} st_a68ad4_2;

typedef struct st_a68ad4_1 {
    unsigned long long field_0;
} st_a68ad4_1;


void sub_a68ad4(unsigned int a0, st_a68ad4_2 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0 && !a1->field_14 && !a1->field_8)
        a1->field_18->field_0();
    goto *((void *)(a1->field_18->field_8));
}
