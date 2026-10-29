/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7abe8..0xa7ac94 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7abe8_0 {
    struct st_a7abe8_0 *field_0;
} st_a7abe8_0;


st_a7abe8_0 ** sub_a7abe8(unsigned long a0, long long a1, st_a7abe8_0 **a2, long long a3)
{
    unsigned long long v2;  // x19
    st_a7abe8_0 **v3;  // w0
    st_a7abe8_0 **v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99eb4(a1);
    v3 = (st_a7abe8_0 **)(unsigned int)sub_a99eb4(a3);
    if (a2)
    {
        if (*(char *)a2)
        {
            v4 = sub_a99eb4(a2);
            if (!(unsigned int)v4)
                return v4;
        }
        else
        {
            if (!(unsigned int)v2)
                return 0;
LABEL_a7ac44:
            if (sub_a9ae64(v2, 0, 0))
            {
                return 1;
            }
            else if (!v3)
            {
                return 0;
            }
        }
    }
    if (!(unsigned int)v2)
        return 0;
    goto LABEL_a7ac44;
}
