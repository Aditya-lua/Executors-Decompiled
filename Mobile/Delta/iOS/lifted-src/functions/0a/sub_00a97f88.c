/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97f88..0xa97ff8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97f88_0 {
    char padding_0[16];
    char field_10;
    char padding_11[15];
    struct st_a97f88_0 *field_20;
    struct st_a97f88_0 *field_28;
    struct st_a97f88_0 *field_30;
} st_a97f88_0;


int sub_a97f88(st_a97f88_0 *a0)
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
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a4bca0(a0->field_20);
    a0->field_20 = 0;
    sub_a57f0c(a0->field_30);
    a0->field_30 = 0;
    sub_a58aa4(a0->field_28);
    a0->field_28 = 0;
    sub_a66ec0(a0, 16);
    sub_a66ec0(&a0->field_10, 16);
    *(double *)&a0[1].padding_0[0] = 4.2439915814e-314;
    return 1;
}
