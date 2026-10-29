/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22470c..0x224808 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22470c_1 {
    struct st_22470c_2 *field_0;
    struct st_22470c_0 *field_8;
} st_22470c_1;

typedef struct st_22470c_0 {
    struct st_22470c_0 *field_0;
    unsigned long long field_8;
} st_22470c_0;

typedef struct st_22470c_2 {
    struct st_22470c_0 *field_0;
} st_22470c_2;

typedef struct st_22470c_3 {
    char field_0;
} st_22470c_3;


st_22470c_0 * sub_22470c(st_22470c_1 *a0, long long a1)
{
    long long v5;  // x0
    unsigned long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x20
    unsigned long long idx;  // x0
    st_22470c_0 *v10;  // x21
    st_22470c_3 **v0;  // [bp-0x58], Other Possible Types: char
    st_22470c_3 *v1;  // [bp-0x50]
    char v2;  // [bp-0x41]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_a0c8(a1);
    v6 = sub_a0c8(a1);
    v7 = sub_1a1bc(&v2, v5, v6 + sub_6b08(a1) - v5);
    if (!a0->field_8)
        return 0;
    v8 = v7;
    idx = sub_10c04();
    if (*(long long *)&a0->field_0[idx])
    {
        v10 = *(long long *)*(long long *)&a0->field_0[idx];
        if (!v10)
            return v10;
        while (1)
        {
            if (v8 != v10->field_8)
            {
                if (sub_10c04(v10->field_8, a0->field_8) != idx)
                    break;
                if (v10->field_8 != v8)
                    goto LABEL_2247b0;
            }
            if (sub_20b98(v10 + 1, a1))
                return v10;
LABEL_2247b0:
            v10 = v10->field_0;
            if (!v10)
                return v10;
        }
    }
    return 0;
}
