/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb16418..0xb16458 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b16418_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_b16418_0;


int sub_b16418(unsigned long a0)
{
    st_b16418_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "providers/implementations/encode_decode/encode_key2any.c", 1108);
    if (v2)
    {
        v2->field_0 = a0;
        v2->field_8 = 1;
    }
    return (unsigned int)v2;
}
