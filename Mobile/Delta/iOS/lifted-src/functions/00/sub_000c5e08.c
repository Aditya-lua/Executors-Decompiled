/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e08..0xc5f0c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5e08_0 {
    char field_0;
} st_c5e08_0;


long long sub_c5e08(long long index, unsigned long a1, unsigned long a2)
{
    long long idx;  // x21
    long long v5;  // x0
    unsigned long long v6;  // 4106
    long long v7;  // w8
    st_c5e08_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_c5e08_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = index + 0x7000;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_c52e8(index + 29928);
    v6 = arm64g_calculate_condition(130, v5, 120, 0);
    if (v6 & 1)
    {
        return v5;
    }
    else if (v5)
    {
        return -0x48;
    }
    else
    {
        if (*(int *)(idx + 1552) == 1 && *(long long *)(index + 30216))
            sub_c6134(index);
        if (*(int *)(idx + 1284) && *(int *)(idx + 1528) != *(int *)(idx + 1284))
            return -0x20;
        if (*(int *)(idx + 1288))
        {
            v7 = *(int *)(idx + 1436);
            *(unsigned int *)(idx + 1440) = !v7;
            if (!v7)
                sub_77e64(index + 30008, 0);
        }
        else
        {
            *(unsigned int *)(idx + 1440) = 0;
        }
        *(unsigned long *)(index + 29976) = *(long long *)(index + 29976) + a2;
        return 0;
    }
}
