/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c0a7c..0x3c0b44 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c0a7c_2 {
    struct st_3c0a7c_3 *field_0;
    struct st_3c0a7c_1 *field_8;
} st_3c0a7c_2;

typedef struct st_3c0a7c_1 {
    struct st_3c0a7c_1 *field_0;
    unsigned long long field_8;
    int field_10;
} st_3c0a7c_1;

typedef struct st_3c0a7c_3 {
    struct st_3c0a7c_1 *field_0;
} st_3c0a7c_3;

typedef struct st_3c0a7c_0 {
    char field_0;
} st_3c0a7c_0;


st_3c0a7c_1 * sub_3c0a7c(st_3c0a7c_2 *a0, int *a1)
{
    st_3c0a7c_1 *v4;  // x21
    unsigned long v5;  // x22
    unsigned long long idx;  // x0
    st_3c0a7c_1 *v7;  // x20
    st_3c0a7c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3c0a7c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    if (!v4)
        return 0;
    v5 = *a1;
    idx = sub_10c04(v5, v4);
    if (*(long long *)&a0->field_0[idx])
    {
        v7 = *(long long *)*(long long *)&a0->field_0[idx];
        if (!v7)
            return v7;
        while (1)
        {
            if (v7->field_8 != v5)
            {
                if (sub_10c04(v7->field_8, v4) != idx)
                    break;
                if (v7->field_8 != v5)
                    goto LABEL_3c0af0;
            }
            if (v7->field_10 == *a1)
                return v7;
LABEL_3c0af0:
            v7 = v7->field_0;
            if (!v7)
                return v7;
        }
    }
    return 0;
}
