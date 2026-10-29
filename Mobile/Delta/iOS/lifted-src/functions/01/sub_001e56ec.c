/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e56ec..0x1e57d0 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e56ec_1 {
    struct st_1e56ec_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_1e56ec_1;

typedef struct st_1e56ec_0 {
    char field_0;
} st_1e56ec_0;

typedef struct st_1e56ec_2 {
    struct st_1e56ec_1 *field_0;
} st_1e56ec_2;

extern st_1e56ec_2 *g_f10d50;
extern st_1e56ec_1 *g_f10d58;

st_1e56ec_1 * sub_1e56ec(unsigned long a0, unsigned long long *a1)
{
    long long v6;  // x0
    long long v7;  // x20
    unsigned long long idx;  // x0
    st_1e56ec_1 *v9;  // x21
    st_1e56ec_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1e56ec_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x49]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = *a1;
    v6 = sub_1a1bc(&v2, &v3, 8);
    if (!g_f10d58)
        return 0;
    v7 = v6;
    idx = sub_10c04();
    if (*(long long *)&g_f10d50[idx])
    {
        v9 = *(long long *)*(long long *)&g_f10d50[idx];
        if (!v9)
            return v9;
        while (1)
        {
            if (v9->field_8 != v7)
            {
                if (sub_10c04(v9->field_8, g_f10d58) != idx)
                    break;
                if (v9->field_8 != v7)
                    goto LABEL_1e5778;
            }
            if (v9->field_10 == *a1)
                return v9;
LABEL_1e5778:
            v9 = v9->field_0;
            if (!v9)
                return v9;
        }
    }
    return 0;
}
