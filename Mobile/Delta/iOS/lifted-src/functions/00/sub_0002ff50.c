/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ff50..0x2ffe8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ff50_0 {
    char field_0;
} st_2ff50_0;


unsigned long long * sub_2ff50(unsigned long long *a0, unsigned long long *a1, unsigned long a2, long long a3)
{
    unsigned long v4;  // x20
    unsigned long long *v5;  // x1
    unsigned long long *v6;  // x8
    st_2ff50_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2ff50_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a3 < 2)
        return a0;
    v4 = *a0;
    v5 = sub_2e340();
    v6 = (char *)a1 - 8;
    if (v5 == v6)
    {
        *v5 = v4;
        return v5;
    }
    *v5 = *v6;
    *v6 = v4;
    return sub_2beb0(a0, v5 + 1);
}
