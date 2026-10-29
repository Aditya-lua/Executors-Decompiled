/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x72478..0x724d8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_72478_0 {
    char field_0;
} st_72478_0;


char * sub_72478(char **a0, long long a1, char *a2)
{
    char *v2;  // x2
    long long i;  // x8
    char *v4;  // x2
    char *v5;  // x9
    st_72478_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_72478_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1 < 1)
        return a2;
    *a2 = **a0;
    v2 = a2 + 1;
    if (a1 == 1)
        return a2 + 1;
    i = a1 + 1;
    do
    {
        v4 = v2;
        v5 = *a0;
        *a0 = v5 + 1;
        *v4 = v5[1];
        i -= 1;
        v2 = v4 + 1;
    } while (2 < i);
    return v4 + 1;
}
