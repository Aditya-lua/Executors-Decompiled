/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa575c..0xaa57bc (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa575c_0 {
    char padding_0[8];
    long long field_8;
} st_aa575c_0;


st_aa575c_0 * sub_aa575c(unsigned long a0, long long a1, unsigned long a2)
{
    st_aa575c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6dac4(a1, 24, "crypto/property/property.c", 563);
    if (!v2)
        return NULL;
    v2->field_8 = sub_ad5f4c(v2->field_8);
}
