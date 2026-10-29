/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5c70..0x1c5cb0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c5c70_1 {
    struct st_1c5c70_1 *field_0;
} st_1c5c70_1;

typedef struct st_1c5c70_0 {
    char field_0;
} st_1c5c70_0;


st_1c5c70_1 ** sub_1c5c70(st_1c5c70_1 **a0, long long a1)
{
    st_1c5c70_1 **v2;  // x8
    long long i;  // x9
    st_1c5c70_1 **v4;  // x8
    st_1c5c70_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1c5c70_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1 < 1)
        return a0;
    v2 = *a0;
    i = a1 + 1;
    do
    {
        v4 = v2;
        i -= 1;
        v2 = *v4;
    } while (1 < i);
    *a0 = *v4;
    return a0;
}
