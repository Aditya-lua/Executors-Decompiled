/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6dc50..0xa6dd0c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6dc50_0 {
    struct st_a6dc50_0 *field_0;
} st_a6dc50_0;


st_a6dc50_0 ** sub_a6dc50(st_a6dc50_0 **a0, st_a6dc50_0 **a1, long long a2, st_a6dc50_0 **a3)
{
    st_a6dc50_0 **v3;  // x20
    st_a6dc50_0 **v4;  // x1
    st_a6dc50_0 **num;  // x0
    st_a6dc50_0 **v0;  // [bp-0x48], Other Possible Types: char
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1)
        v3 = &v0;
    else
        v3 = a1;
    *(unsigned int *)___error() = 0;
    *v3 = a0;
    if (!a0)
    {
        return 0;
    }
    else if (a3)
    {
        if (*(char *)a0 == 45)
            return 0;
        v4 = v3;
        num = _strtoul(a0, v4, a2);
        *a3 = num;
        if (!*(int *)___error(num, v4, a2) && (a1 || !*(char *)v0))
            return *v3 != a0;
        return 0;
    }
    else
    {
        return 0;
    }
}
