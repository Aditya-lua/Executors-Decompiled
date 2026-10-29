/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e3220..0x1e3304 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e3220_0 {
    struct st_1e3220_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_1e3220_0;

typedef struct st_1e3220_2 {
    char field_0;
} st_1e3220_2;

typedef struct st_1e3220_1 {
    struct st_1e3220_0 *field_0;
} st_1e3220_1;

extern st_1e3220_1 *g_f10d00;
extern st_1e3220_0 *g_f10d08;

st_1e3220_0 * sub_1e3220(unsigned long a0, unsigned long long *a1)
{
    long long v6;  // x0
    long long v7;  // x20
    unsigned long long idx;  // x0
    st_1e3220_0 *v9;  // x21
    st_1e3220_2 **v0;  // [bp-0x60], Other Possible Types: char
    st_1e3220_2 *v1;  // [bp-0x58]
    char v2;  // [bp-0x49]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = *a1;
    v6 = sub_1a1bc(&v2, &v3, 8);
    if (!g_f10d08)
        return 0;
    v7 = v6;
    idx = sub_10c04();
    if (*(long long *)&g_f10d00[idx])
    {
        v9 = *(long long *)*(long long *)&g_f10d00[idx];
        if (!v9)
            return v9;
        while (1)
        {
            if (v9->field_8 != v7)
            {
                if (sub_10c04(v9->field_8, g_f10d08) != idx)
                    break;
                if (v9->field_8 != v7)
                    goto LABEL_1e32ac;
            }
            if (v9->field_10 == *a1)
                return v9;
LABEL_1e32ac:
            v9 = v9->field_0;
            if (!v9)
                return v9;
        }
    }
    return 0;
}
