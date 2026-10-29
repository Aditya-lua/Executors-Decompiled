/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff99c..0xaff9d4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aff99c_0 {
    struct st_aff99c_0 *field_0;
} st_aff99c_0;


st_aff99c_0 ** sub_aff99c(st_aff99c_0 **a0, st_aff99c_0 **a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (!a1)
    {
        return 1;
    }
    else if (*a1)
    {
        v0 = &v2;
        v1 = v3;
        return sub_afe114(a0 + 2) != 0;
    }
    else
    {
        return 1;
    }
}
