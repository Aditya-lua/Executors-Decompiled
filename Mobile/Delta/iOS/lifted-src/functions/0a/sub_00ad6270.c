/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad6270..0xad62a8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad6270_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_ad6270_0;


int sub_ad6270(unsigned long a0)
{
    st_ad6270_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(32, "crypto/stack/stack.c", 229);
    if (v2)
        v2->field_18 = a0;
    return (unsigned int)v2;
}
