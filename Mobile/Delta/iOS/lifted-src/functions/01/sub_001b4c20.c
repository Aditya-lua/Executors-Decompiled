/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4c20..0x1b4c90 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4c20_0 {
    char field_0;
} st_1b4c20_0;


char * sub_1b4c20(unsigned long a0, char *a1, char *a2)
{
    unsigned long long v4;  // x8
    st_1b4c20_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b4c20_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
    {
        return a1;
    }
    else if (a1 + 1 == a2)
    {
        return a1;
    }
    else if (*a1 == 92)
    {
        v4 = 2;
        if (!sub_1c29b8())
            v4 = 0;
        return &a1[v4];
    }
    else
    {
        return a1;
    }
}
