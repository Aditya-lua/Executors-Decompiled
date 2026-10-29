/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x140054..0x140128 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_140054_0 {
    char field_0;
} st_140054_0;


unsigned long long * sub_140054(unsigned long long *a0, unsigned long a1, unsigned long long *a2)
{
    st_140054_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_140054_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0 + 1 == a1)
    {
        v1 = &v0;
        v0 = &v1;
        sub_13bbc();
        *(unsigned long long *)(a0 + (char *)a2 - a1) = *a0;
        return a0 + (char *)a2 - a1;
    }
    else if (a1 + 8 == a2)
    {
        v1 = &v0;
        v0 = &v1;
        sub_13bbc(a2 - a2 + (char *)a0 + 8, a0, (long long)((char *)a2 - 8 - a0) >> 3);
        *a0 = *(long long *)((char *)a2 - 8);
        return a2 - a2 + (char *)a0 + 8;
    }
}
