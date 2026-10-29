/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44688..0xb446e8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44688_0 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[31];
    long long field_30;
    long long field_38;
} st_b44688_0;


void sub_b44688(st_b44688_0 *a0)
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
    sub_a3f73c(a0->field_8);
    sub_afe028(&a0->field_10);
    sub_a66ec0(&a0[1].padding_0[4], a0->field_30);
    sub_a66ec0(&a0[11].padding_11[19], a0->field_38);
}
