/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b081c..0x1b08a4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b081c_0 {
    char field_0;
} st_1b081c_0;


char * sub_1b081c(char *a0, char *a1, char *a2, char *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    char *v3;  // x9
    char *v4;  // x2
    char *v5;  // x11
    char *v6;  // x12
    char *v7;  // x12
    char *v8;  // x11
    st_1b081c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1b081c_0 *v1;  // [bp-0x8]
    unsigned long v2;  // [bp+0x0]

    v1 = &v0;
    v0 = &v1;
    v3 = &a0[a7 + -1 * v2 + 1];
    if (v3 == a0)
        return a1;
    v4 = a2 + 1;
    do
    {
        if (*a0 == *a2)
        {
            v5 = a0 + 1;
            v6 = v4;
            do
            {
                v7 = v6;
                v8 = v5;
                if (v7 == a3)
                    return a0;
            } while ((v5 = v8 + 1, v6 = v7 + 1, *v8 == *v7));
        }
    } while ((a0 += 1, a0 != v3));
    return a1;
}
