/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb46c..0xaeb4a4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb46c_0 {
    char padding_0[232];
    char field_e8;
    char padding_e9[3];
    unsigned int field_ec;
} st_aeb46c_0;


unsigned int sub_aeb46c(st_aeb46c_0 *a0)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aea7f4();
    if (!v2)
    {
        return v2;
    }
    else if (!(a0->field_e8 >> 1 & 1))
    {
        return 0xffffffff;
    }
    else
    {
        return a0->field_ec;
    }
}
