/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c1888..0x3c1968 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c1888_2 {
    struct st_3c1888_3 *field_0;
    struct st_3c1888_1 *field_8;
} st_3c1888_2;

typedef struct st_3c1888_1 {
    struct st_3c1888_1 *field_0;
    long long field_8;
    unsigned long long field_10;
} st_3c1888_1;

typedef struct st_3c1888_3 {
    struct st_3c1888_1 *field_0;
} st_3c1888_3;

typedef struct st_3c1888_0 {
    char field_0;
} st_3c1888_0;


st_3c1888_1 * sub_3c1888(st_3c1888_2 *a0, unsigned long long *a1)
{
    long long v6;  // x0
    long long v7;  // x20
    unsigned long long idx;  // x0
    st_3c1888_1 *v9;  // x21
    st_3c1888_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3c1888_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x49]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = *a1;
    v6 = sub_1a1bc(&v2, &v3, 8);
    if (!a0->field_8)
        return 0;
    v7 = v6;
    idx = sub_10c04();
    if (*(long long *)&a0->field_0[idx])
    {
        v9 = *(long long *)*(long long *)&a0->field_0[idx];
        if (!v9)
            return v9;
        while (1)
        {
            if (v9->field_8 != v7)
            {
                if (sub_10c04(v9->field_8, a0->field_8) != idx)
                    break;
                if (v9->field_8 != v7)
                    goto LABEL_3c1910;
            }
            if (v9->field_10 == *a1)
                return v9;
LABEL_3c1910:
            v9 = v9->field_0;
            if (!v9)
                return v9;
        }
    }
    return 0;
}
