/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2c2c..0x1a2da4 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2c2c_1 {
    struct st_1a2c2c_2 *field_0;
    unsigned long long field_8;
} st_1a2c2c_1;

typedef struct st_1a2c2c_2 {
    unsigned long long field_0;
} st_1a2c2c_2;

typedef struct st_1a2c2c_3 {
    struct st_1a2c2c_0 *field_0;
} st_1a2c2c_3;

typedef struct st_1a2c2c_0 {
    char field_0;
} st_1a2c2c_0;


unsigned long long * sub_1a2c2c(st_1a2c2c_1 *a0, unsigned long long *a1, st_1a2c2c_2 **a2, long long a3)
{
    unsigned long long *v8;  // x19
    unsigned long v9;  // x0
    unsigned long long v10;  // x0
    long long v11;  // x0
    unsigned long long *v12;  // x0
    unsigned long long *v13;  // x23
    unsigned long v14;  // x0
    unsigned long long v15;  // x0
    long long v16;  // x0
    st_1a2c2c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1a2c2c_0 *v1;  // [bp-0x78]
    st_1a2c2c_0 **v2;  // [bp-0x70], Other Possible Types: st_1a2c2c_3 **, char
    st_1a2c2c_0 *v3;  // [bp-0x68], Other Possible Types: st_1a2c2c_3 **
    unsigned long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    v1 = &v0;
    v0 = &v1;
    if (&a0->field_8 != a1)
    {
        v9 = sub_a0c8(v8 + 4);
        v10 = sub_6b08(v8 + 4);
        v11 = sub_a0c8(a3);
        v3 = &v2;
        v4 = v9;
        v2 = &v3;
        v5 = v10;
        if (!(sub_2a304(&v4, v11, sub_6b08(a3)) >> 31 & 1))
            goto LABEL_1a2cc8;
        v12 = sub_1b812c(a0, a2, a3);
    }
    else
    {
LABEL_1a2cc8:
        if (a0->field_0 != v8)
        {
            v13 = sub_62884(v8);
            v14 = sub_a0c8(a3);
            v15 = sub_6b08(a3);
            v16 = sub_a0c8(v13 + 4);
            v3 = &v2;
            v4 = v14;
            v2 = &v3;
            v5 = v15;
            if (!(sub_2a304(&v4, v16, sub_6b08(v13 + 4)) >> 31 & 1))
            {
                if (*v8)
                {
                    *a2 = v13;
                    return v13 + 1;
                }
                *a2 = v8;
                return v8;
            }
            v12 = sub_1bc104(a0, a2, a3);
        }
        else
        {
            v13 = v8;
            if (!*v13)
            {
                *a2 = v8;
                return v8;
            }
            *a2 = v13;
            return v13 + 1;
        }
    }
    return v12;
}
