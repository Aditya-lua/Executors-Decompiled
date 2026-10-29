/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5625c..0x56328 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5625c_1 {
    struct st_5625c_1 *field_0;
    struct st_5625c_1 *field_8;
} st_5625c_1;

typedef struct st_5625c_0 {
    char field_0;
} st_5625c_0;


st_5625c_1 * sub_5625c(long long a0, long long a1, st_5625c_1 *a2)
{
    st_5625c_1 *v5;  // x0
    st_5625c_1 **v6;  // x21
    st_5625c_1 **v7;  // x21
    st_5625c_1 *v8;  // x0
    st_5625c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_5625c_0 *v1;  // [bp-0x40]
    st_5625c_1 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_cd98(a1, "_G");
    v2 = v5;
    if (v5)
    {
        sub_567ac(a0, &v2);
        v5 = sub_fb84(a0, &v2);
        *(unsigned int *)&v5->field_8 = 1;
    }
    if (!a2)
    {
        return v5;
    }
    else if (a2->field_0)
    {
        v6 = &a2->field_8;
        do
        {
            v7 = v6;
            v8 = sub_cd98(a1);
            v2 = v8;
            if (v8)
            {
                sub_567ac(a0, &v2);
                v8 = sub_fb84(a0, &v2);
                *(unsigned int *)&v8->field_8 = 1;
            }
        } while ((v6 = v7 + 1, *v7));
        return v8;
    }
    else
    {
        return v5;
    }
}
