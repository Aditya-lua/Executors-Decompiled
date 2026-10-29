/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x140bc4..0x140ca0 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_140bc4_0 {
    char field_0;
} st_140bc4_0;


unsigned long long * sub_140bc4(unsigned long long *a0, unsigned long long *a1, unsigned long a2)
{
    long long v4;  // x22
    long long v5;  // x20
    unsigned long long v6;  // x0
    unsigned long long *iter;  // x9
    unsigned long v8;  // x10
    unsigned long long *v9;  // x12
    unsigned long long *v10;  // x13
    unsigned long long *v11;  // x11
    long long v12;  // x12
    st_140bc4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_140bc4_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1 - a0;
    v5 = v4 >> 3;
    if (v5 == a2 - (char *)a1 >> 3)
    {
        sub_13e320();
        return a1;
    }
    v6 = sub_13c36c(v5);
    if (!v6)
        return a2 - (char *)a1 + a0;
    iter = &a0[v6];
    do
    {
        v8 = *(long long *)((char *)iter - 8);
        iter = (char *)iter - 8;
        v9 = v4 + (char *)iter;
        v10 = iter;
        do
        {
            v11 = v9;
            *v10 = *v9;
            v12 = a2 - (char *)v11 >> 3;
            v9 = &a0[v5 + -1 * v12];
            if (v5 < v12)
                v9 = &v11[v5];
        } while ((v10 = v11, v9 != iter));
        *v11 = v8;
    } while (iter != a0);
    return a2 - (char *)a1 + a0;
}
