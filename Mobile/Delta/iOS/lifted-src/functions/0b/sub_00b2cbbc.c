/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cbbc..0xb2cbe4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cbbc_0 {
    unsigned int field_0;
    unsigned int field_4;
    char field_8;
    char padding_9[7];
    long long field_10;
} st_b2cbbc_0;


int sub_b2cbbc(st_b2cbbc_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_b2c0a8(a0->field_10, a0->field_0, a0->field_4, a0->field_8);
    return 0;
}
