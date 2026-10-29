/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfb22c..0xbfb318 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfb22c_2 {
    char padding_0[8];
    struct st_bfb22c_0 *field_8;
} st_bfb22c_2;

typedef struct st_bfb22c_0 {
    char padding_0[24];
    struct st_bfb22c_1 *field_18;
} st_bfb22c_0;

typedef struct st_bfb22c_1 {
    unsigned long long field_0;
} st_bfb22c_1;


void sub_bfb22c(unsigned long a0, st_bfb22c_2 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    v0 = a0 + 24;
    a1->field_8->field_18();
}
