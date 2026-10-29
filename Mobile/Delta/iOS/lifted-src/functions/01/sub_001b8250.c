/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b8250..0x1b82ec (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b8250_0 {
    char padding_0[56];
    char field_38;
    char padding_39[15];
    long long field_48;
    char padding_50[72];
    char field_98;
    char padding_99[31];
    char field_b8;
    char padding_b9[23];
    long long field_d0;
    char padding_d8[1];
    char field_d9;
} st_1b8250_0;


st_1b8250_0 * sub_1b8250(st_1b8250_0 *a0)
{
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0->field_d0)
    {
        v0 = a0->field_d9;
        sub_6b0cc(&a0->field_b8, &v0);
    }
    sub_181a8(&a0->field_b8);
    sub_181a8(&a0->field_98);
    sub_1a42cc(&a0->field_38, a0->field_48);
    sub_2219c(&a0->field_38, 0);
    return a0;
}
