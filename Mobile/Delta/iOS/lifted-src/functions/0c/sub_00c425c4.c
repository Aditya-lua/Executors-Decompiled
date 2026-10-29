/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc425c4..0xc42608 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c425c4_2 {
    char padding_0[8];
    struct st_c425c4_0 *field_8;
} st_c425c4_2;

typedef struct st_c425c4_0 {
    char padding_0[32];
    struct st_c425c4_1 *field_20;
} st_c425c4_0;

typedef struct st_c425c4_1 {
    unsigned long long field_0;
} st_c425c4_1;


void sub_c425c4(unsigned long long a0, st_c425c4_2 *a1)
{
    unsigned long long v5;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v0 = 0;
    v1 = a0;
    a1->field_8->field_20();
}
