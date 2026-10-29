/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6000..0x6054 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6000_0 {
    char padding_0[376];
    struct st_6000_1 *field_178;
} st_6000_0;

typedef struct st_6000_1 {
    unsigned long long field_0;
} st_6000_1;


void sub_6000(unsigned long a0, st_6000_0 **a1)
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
    *a1->field_178();
}
