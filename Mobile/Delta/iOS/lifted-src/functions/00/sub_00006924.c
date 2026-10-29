/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6924..0x6984 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6924_0 {
    char padding_0[368];
    struct st_6924_1 *field_170;
} st_6924_0;

typedef struct st_6924_1 {
    unsigned long long field_0;
} st_6924_1;


void sub_6924(unsigned long a0, st_6924_0 **a1)
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
    *a1->field_170();
}
