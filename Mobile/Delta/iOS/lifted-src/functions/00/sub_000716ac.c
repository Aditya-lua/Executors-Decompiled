/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x716ac..0x7172c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_716ac_0 {
    char field_0;
} st_716ac_0;


char * sub_716ac(unsigned long a0, char *a1)
{
    char *iter;  // x19
    char *i;  // x21
    st_716ac_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_716ac_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    iter = sub_717f8();
    if (iter == a1)
        return iter;
    for (i = iter + 1; i != a1; i += 1)
    {
        if (!sub_58440(*i, 0x4000))
        {
            *iter = *i;
            iter += 1;
        }
    }
    return iter;
}
