/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd14c..0xcd16c (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd14c_0 {
    char padding_0[104];
    uint128_t field_68;
} st_cd14c_0;


st_cd14c_0 * sub_cd14c(st_cd14c_0 *a0, uint128_t *a1)
{
    if (!a0)
        return 0xffffff9a;
    *a1 = *(int128_t *)&(a0->padding_0)[1];
    return 0;
}
