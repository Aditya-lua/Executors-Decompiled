/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9248..0xad92d4 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9248_0 {
    char padding_0[16];
    struct st_ad9248_1 *field_10;
} st_ad9248_0;

typedef struct st_ad9248_1 {
    unsigned long long field_0;
} st_ad9248_1;


void sub_ad9248(st_ad9248_0 *a0)
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
    a0->field_10();
}
