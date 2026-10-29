/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5764c..0xb5768c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5764c_0 {
    char padding_0[192];
    char field_c0;
    char padding_c1[127];
    unsigned long long field_140;
    char padding_148[120];
    unsigned long long field_1c0;
} st_b5764c_0;


int sub_b5764c(st_b5764c_0 *a0, unsigned long long *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9fc26c(a1, &a0->field_c0);
    a0->field_140 = a1[1];
    a0->field_1c0 = a1[2];
    return 1;
}
