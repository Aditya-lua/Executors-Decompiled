/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x80564..0x806ac (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_80564_0 {
    char field_0;
} st_80564_0;


unsigned long long sub_80564(void* a0, void* a1, unsigned long a2)
{
    unsigned int v4;  // w8
    unsigned long v5;  // x19
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4106
    unsigned long v8;  // x19
    void* v10;  // x8
    unsigned long v12;  // x19
    void* iter;  // x20
    st_80564_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_80564_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    switch (v4)
    {
    case 0:
        return 0xffffffffffffffc4;
    case 3:
        v5 = a2;
        v12 = v5;
        if (!(int)a0[276])
        {
            *(unsigned int *)a0 = 0;
            return a1 - a1;
        }
        goto LABEL_80614;
    case 1:
        v6 = sub_82490(a1, v5, a0 + 240, 0, 0);
        v7 = arm64g_calculate_condition(130, v6, 120, 0);
        if (v7 & 1)
            return v6;
        v8 = v5 - v6;
        v10 = a1 + v6;
        *(unsigned int *)a0 = 2;
        v12 = v8 - 3;
        if (v8 < 3)
            return 0xffffffffffffffba;
    default:
        v10 = a1;
        v12 = v5 - 3;
        if (3 > v5)
            return 0xffffffffffffffba;
    }
    *(unsigned short *)v10 = 1;
    *(char *)&v10[2] = 0;
    iter = v10 + 3;
    if (!(int)a0[276])
    {
        *(unsigned int *)a0 = 0;
        return v10 + 3 - a1;
    }
LABEL_80614:
    if (4 <= v12)
    {
        *(unsigned int *)iter = sub_77abc(a0 + 808);
        *(unsigned int *)a0 = 0;
        return iter + 4 - a1;
    }
    return 0xffffffffffffffba;
}
