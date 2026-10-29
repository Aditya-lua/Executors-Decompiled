/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x514bc..0x51594 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_514bc_0 {
    char field_0;
} st_514bc_0;

extern unsigned int g_f00b40;

void* sub_514bc(void* a0, void* a1, unsigned long long a2)
{
    void* v6;  // x0
    void* v7;  // x20
    void* v8;  // x0
    void* v9;  // x0
    st_514bc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_514bc_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        return a0;
    }
    else if ((int)a1[8] == g_f00b40)
    {
        v6 = sub_158b8(a0 + 16, a1 + 32);
        if (!v6)
            return v6;
        v7 = v6;
        v2 = (long long)v6[8];
        v3 = a2;
        v8 = sub_515f8(a0 + 56, &v2);
        if (!v8)
        {
            sub_5130c(a0 + 56, &v2);
            sub_50ed8(a0 + 56, &v2);
            sub_40074((long long)a0[8], v7 + 8);
            v9 = sub_12484((long long)a0[8], v7 + 8);
            *(int *)&v9[12] = (int)v9[12] + 1;
            return v9;
        }
        return v8;
    }
    else
    {
        return a0;
    }
}
