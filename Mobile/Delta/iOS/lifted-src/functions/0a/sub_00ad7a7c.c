/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7a7c..0xad7abc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7a7c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ad7a7c_0;


int sub_ad7a7c(unsigned long a0)
{
    st_ad7a7c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/store/store_lib.c", 917);
    if (v2)
    {
        v2->field_0 = 1;
        v2->field_8 = a0;
    }
    return (unsigned int)v2;
}
