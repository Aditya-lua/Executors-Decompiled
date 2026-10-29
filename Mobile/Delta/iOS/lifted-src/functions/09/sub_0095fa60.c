/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fa60..0x95fa88 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fa60_0 {
    char padding_0[184];
    struct st_95fa60_1 *field_b8;
} st_95fa60_0;

typedef struct st_95fa60_2 {
    char padding_0[24];
    struct st_95fa60_0 *field_18;
} st_95fa60_2;

typedef struct st_95fa60_1 {
    unsigned long long field_0;
} st_95fa60_1;


void sub_95fa60(st_95fa60_2 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    a0->field_18->field_b8();
}
