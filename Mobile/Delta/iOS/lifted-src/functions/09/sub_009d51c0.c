/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d51c0..0x9d5204 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d51c0_2 {
    char padding_0[8];
    struct st_9d51c0_0 *field_8;
} st_9d51c0_2;

typedef struct st_9d51c0_0 {
    char padding_0[40];
    struct st_9d51c0_1 *field_28;
} st_9d51c0_0;

typedef struct st_9d51c0_1 {
    unsigned long long field_0;
} st_9d51c0_1;


void sub_9d51c0(st_9d51c0_2 *a0, unsigned long a1, unsigned long long a2, unsigned long a3)
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
    a0->field_8->field_28();
}
