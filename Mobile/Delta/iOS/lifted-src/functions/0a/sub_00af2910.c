/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2910..0xaf295c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2910_0 {
    unsigned int field_0;
} st_af2910_0;


long long sub_af2910(st_af2910_0 **a0, st_af2910_0 **a1)
{
    unsigned long v0;  // x10
    unsigned long v1;  // x11

    v0 = *(int *)*a0;
    v1 = *(int *)*a1;
    if ((unsigned int)v0 != (unsigned int)v1)
    {
        return v0 - v1;
    }
    else if ((unsigned int)v0 != 2 && (unsigned int)v0 != 1)
    {
        return 0;
    }
}
