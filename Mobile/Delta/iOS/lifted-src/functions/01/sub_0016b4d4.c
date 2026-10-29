/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16b4d4..0x16b618 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16b4d4_0 {
    struct st_16b4d4_0 *field_0;
    struct st_16b4d4_0 *field_8;
    char padding_10[12];
    unsigned int field_1c;
} st_16b4d4_0;

typedef struct st_16b4d4_1 {
    struct st_16b4d4_0 *field_0;
    struct st_16b4d4_0 *field_8;
    struct st_16b4d4_0 *field_10;
    char padding_18[12];
    int field_24;
} st_16b4d4_1;


st_16b4d4_0 * sub_16b4d4(st_16b4d4_1 *a0, st_16b4d4_0 *a1, st_16b4d4_0 **a2, st_16b4d4_0 *a3, int *a4)
{
    st_16b4d4_0 *v3;  // x20
    st_16b4d4_0 *v4;  // x23
    st_16b4d4_0 *v5;  // x0
    st_16b4d4_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    v4 = &a0->field_8;
    if (v4 != a1 && (int)v3->field_1c <= *a4)
    {
        if (*a4 > (int)v3->field_1c)
        {
            v0 = v3;
            sub_62fd8(&v0, 1);
            if (v0 != v4 && (int)v0->field_1c <= *a4)
                return sub_173cdc(a0, a2, a4);
            if (!v3->field_8)
            {
                *a2 = v3;
                return &v3->field_8;
            }
            *a2 = v0;
            return v0;
        }
        else
        {
            *a2 = v3;
            a3->field_0 = v3;
            return a3;
        }
    }
    if (a0->field_0 != v3)
    {
        v5 = sub_62884(v3);
        if ((int)v5->field_1c >= *a4)
            return sub_173cdc();
    }
    else
    {
        v5 = v3;
    }
    if (!v3->field_0)
    {
        *a2 = v3;
        return v3;
    }
    *a2 = v5;
    return &v5->field_8;
}
