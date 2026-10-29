/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a26c..0x3a2e0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a26c_1 {
    long long field_0;
} st_3a26c_1;

typedef struct st_3a26c_0 {
    char field_0;
} st_3a26c_0;


long long sub_3a26c(long long a0, long long a1, st_3a26c_1 **a2, long long a3)
{
    long long *i;  // x22
    unsigned long long *v5;  // x22
    long long v6;  // x0
    st_3a26c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3a26c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    i = *a2;
    if (*a2 == a2[1])
        return a0;
    do
    {
        v5 = i + 1;
        v6 = sub_41380(a0, a1, *i, a3);
        i = v5;
    } while (i != a2[1]);
    return v6;
}
