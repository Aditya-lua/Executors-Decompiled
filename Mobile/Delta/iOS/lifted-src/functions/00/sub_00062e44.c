/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62e44..0x62e64 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62e44_0 {
    char padding_0[16];
    char field_10[8];
    char field_17;
} st_62e44_0;


long long sub_62e44(st_62e44_0 *a0)
{
    if ((char)a0->field_10[7] < 0)
        return (a0->field_10 & 0x7fffffffffffffff) - 1;
    return 22;
}
