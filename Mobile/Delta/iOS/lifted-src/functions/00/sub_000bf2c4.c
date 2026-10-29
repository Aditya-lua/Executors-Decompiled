/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbf2c4..0xbf30c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bf2c4_0 {
    char field_0;
} st_bf2c4_0;


void sub_bf2c4(unsigned long a0, unsigned long a1, unsigned int a2, unsigned long a3)
{
    st_bf2c4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_bf2c4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
    {
        sub_bef90();
        return;
    }
    sub_bf124();
}
