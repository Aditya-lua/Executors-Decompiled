/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb241f0..0xb24230 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b241f0_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_b241f0_0;


int sub_b241f0(unsigned long a0)
{
    st_b241f0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(64, "providers/implementations/encode_decode/encode_key2ms.c", 74);
    if (v2)
    {
        v2->field_0 = a0;
        v2->field_8 = 2;
    }
    return (unsigned int)v2;
}
