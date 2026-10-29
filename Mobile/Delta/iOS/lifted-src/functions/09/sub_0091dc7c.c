/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91dc7c..0x91dcac (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91dc7c_0 {
    char padding_0[2];
    char field_2;
} st_91dc7c_0;


st_91dc7c_0 * sub_91dc7c(st_91dc7c_0 *a0)
{
    unsigned int v0;  // w8

    v0 = a0->field_2;
    a0->field_2 = ((char)v0 & 254 ^ 129) + ((char)v0 & 1) + ((char)v0 + (char)~v0 * 2 + 1 | 127);
    return a0;
}
