/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6d858..0xa6d93c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6d858_0 {
    struct st_a6d858_0 *field_0;
} st_a6d858_0;


long long sub_a6d858(st_a6d858_0 **a0, st_a6d858_0 **a1)
{
    st_a6d858_0 **v2;  // x8
    st_a6d858_0 **v3;  // x0
    st_a6d858_0 **ptr;  // x0
    st_a6d858_0 **ptr1;  // x0
    st_a6d858_0 **v6;  // x0
    unsigned int v7;  // w20
    long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = ___error();
    if (a0 && a1)
    {
        *(unsigned int *)v2 = 0;
        if (*a0)
        {
            v3 = *(long long *)*a0;
        }
        else
        {
            ptr = _calloc(1, 1040);
            *a0 = ptr;
            if (!ptr)
            {
                *(unsigned int *)___error() = 12;
                return 0;
            }
            ptr1 = _opendir(a1);
            *(st_a6d858_0 ***)*a0 = ptr1;
            v3 = *(long long *)*a0;
            if (!v3)
            {
                v7 = *(int *)___error(NULL);
                v8 = _free(*a0);
                *a0 = 0;
                *(unsigned int *)___error(v8) = v7;
                return 0;
            }
        }
        v6 = _readdir(v3);
        if (!v6)
            return v6;
        sub_a6db20(*a0 + 1, (char *)&v6[2] + 5, 1025);
        return *a0 + 1;
    }
    *(unsigned int *)v2 = 22;
    return 0;
}
