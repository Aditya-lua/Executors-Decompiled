/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bf324..0x1bf410 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bf324_1 {
    struct st_1bf324_2 *field_0;
    struct st_1bf324_0 *field_8;
} st_1bf324_1;

typedef struct st_1bf324_0 {
    struct st_1bf324_0 *field_0;
    unsigned long long field_8;
} st_1bf324_0;

typedef struct st_1bf324_2 {
    struct st_1bf324_0 *field_0;
} st_1bf324_2;

typedef struct st_1bf324_3 {
    char field_0;
} st_1bf324_3;


st_1bf324_0 * sub_1bf324(st_1bf324_1 *a0, long long a1)
{
    long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x21
    unsigned long long idx;  // x0
    st_1bf324_0 *v8;  // x20
    st_1bf324_3 **v0;  // [bp-0x50], Other Possible Types: char
    st_1bf324_3 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_a0c8(a1);
    v5 = sub_1a5cdc(a0, v4, sub_6b08(a1), 0);
    if (!a0->field_8)
        return 0;
    v6 = v5;
    idx = sub_10c04();
    if (*(long long *)&a0->field_0[idx])
    {
        v8 = *(long long *)*(long long *)&a0->field_0[idx];
        if (!v8)
            return v8;
        while (1)
        {
            if (v6 != v8->field_8)
            {
                if (sub_10c04(v8->field_8, a0->field_8) != idx)
                    break;
                if (v8->field_8 != v6)
                    goto LABEL_1bf3bc;
            }
            if (sub_1b01e8(v8 + 1, a1))
                return v8;
LABEL_1bf3bc:
            v8 = v8->field_0;
            if (!v8)
                return v8;
        }
    }
    return 0;
}
