/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0694c..0xb069a4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0694c_0 {
    char padding_0[84];
    char field_54;
    char padding_55[163];
    char field_f8;
    char padding_f9[447];
    unsigned long long field_2b8;
} st_b0694c_0;


int sub_b0694c(st_b0694c_0 *a0, long long a1, unsigned int a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9bf864(a1, a2 * 8, a0 + 1);
    sub_a94ad4(&a0->field_f8, a0 + 1, " )");
    a0->field_2b8 = 0;
    a0->field_54 = a0->field_54 | 4;
    return 1;
}
