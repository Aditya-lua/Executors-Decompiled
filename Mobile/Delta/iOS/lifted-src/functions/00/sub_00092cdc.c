/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92cdc..0x92d20 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_92cdc_0 {
    char field_0;
} st_92cdc_0;


void sub_92cdc(unsigned long a0, unsigned long a1, unsigned long a2, unsigned int a3)
{
    st_92cdc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_92cdc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a3 != 1)
    {
        sub_92628();
        return;
    }
    sub_91f44();
    return;
}
