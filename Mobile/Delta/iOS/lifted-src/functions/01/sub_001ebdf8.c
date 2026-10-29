/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ebdf8..0x1ebe5c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ebdf8_0 {
    char field_0;
} st_1ebdf8_0;


long long sub_1ebdf8(long long a0, double *a1, unsigned int i)
{
    unsigned int v5;  // w19
    double *v6;  // x20
    long long v7;  // x0
    st_1ebdf8_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1ebdf8_0 *v1;  // [bp-0x40]
    double v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!i)
        return a0;
    do
    {
        v5 = i;
        v6 = a1 + 1;
        v2 = *a1;
        v7 = sub_1fa300(a0, &v2);
        i = v5 - 1;
        a1 = v6;
    } while (i);
    return v7;
}
