/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8920..0xaa89f4 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa8920_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    char padding_18[8];
    long long field_20;
    char field_28;
    char padding_29[7];
    char field_30;
    char padding_31[7];
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
} st_aa8920_0;


void sub_aa8920(st_aa8920_0 *a0)
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
    sub_a7c1d0(a0->field_0);
    sub_a7c240(&a0->field_30);
    sub_a7c240(&a0->field_28);
    sub_a51ef0(a0->field_10);
    sub_a51ef0(a0->field_8);
    sub_a6c2e4(a0->field_20, "crypto/rand/rand_lib.c", 579);
    sub_a6c2e4(a0->field_38, "crypto/rand/rand_lib.c", 581);
    sub_a6c2e4(a0->field_40, "crypto/rand/rand_lib.c", 582);
    sub_a6c2e4(a0->field_48, "crypto/rand/rand_lib.c", 583);
    sub_a6c2e4(a0->field_50, "crypto/rand/rand_lib.c", 584);
    sub_a6c2e4(a0->field_58, "crypto/rand/rand_lib.c", 585);
    sub_a6c2e4(a0->field_60, "crypto/rand/rand_lib.c", 586);
    sub_a6c2e4();
    return;
}
