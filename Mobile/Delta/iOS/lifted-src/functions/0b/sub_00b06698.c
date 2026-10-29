/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb06698..0xb066f8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b06698_0 {
    char field_0;
    char padding_1[7];
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    char padding_14[60];
    char field_50;
    char padding_51[55];
    unsigned long long field_88;
} st_b06698_0;


int sub_b06698(st_b06698_0 *a0, long long a1, unsigned int a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9bf864(a1, a2 * 8, &a0[1].field_8);
    sub_a93220(&a0->field_50, a0->field_10, a0->field_8, &a0[1].field_8, " )");
    a0->field_88 = 0;
    a0->field_0 = a0->field_0 | 2;
    return 1;
}
