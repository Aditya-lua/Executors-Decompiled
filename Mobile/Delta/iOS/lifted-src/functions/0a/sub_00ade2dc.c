/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xade2dc..0xade300 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ade2dc_0 {
    char field_0;
} st_ade2dc_0;


st_ade2dc_0 ** sub_ade2dc(st_ade2dc_0 **a0)
{
    if (!*a0)
    {
        return a0;
    }
    else if (!((char)(*(char *)*a0) >> 3 & 1))
    {
        return a0;
    }
}
