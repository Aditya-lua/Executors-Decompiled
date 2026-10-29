/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d5f50..0x3d5fcc (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d5f50_0 {
    char field_0;
} st_3d5f50_0;


unsigned int sub_3d5f50(unsigned long long a0)
{
    unsigned long long idx;  // x19
    unsigned int v5;  // w8
    unsigned int v6;  // w9
    st_3d5f50_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d5f50_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = a0 + 0x4000;
    v1 = &v0;
    v0 = &v1;
    v5 = *(int *)(idx + 2084);
    if (0 >= *(int *)(idx + 2084))
    {
        sub_3ce8a0();
        v5 = *(int *)(idx + 2084);
        if (*(int *)(idx + 2084) < 1)
            return 0;
    }
    v6 = *(int *)(idx + 2080);
    *(unsigned int *)(idx + 2080) = v6 * 2;
    *(unsigned int *)(idx + 2084) = v5 - 1;
    return v6 & 0x80000000;
}
