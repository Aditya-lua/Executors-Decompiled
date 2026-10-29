/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7185c..0x71aac (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7185c_0 {
    struct st_7185c_0 *field_0;
} st_7185c_0;

typedef struct st_7185c_1 {
    char field_0;
} st_7185c_1;


st_7185c_0 ** sub_7185c(st_7185c_0 **a0, st_7185c_0 **a1, st_7185c_0 **a2, st_7185c_0 **a3, long long a4)
{
    st_7185c_0 **v6;  // x20
    st_7185c_0 **v7;  // x27
    long long v16;  // x0
    st_7185c_0 **v17;  // x23
    unsigned long v18;  // x0
    unsigned long long v19;  // x0
    long long v20;  // x0
    unsigned long v8;  // x0
    unsigned long long v9;  // x0
    long long v10;  // x0
    unsigned long v11;  // x0
    unsigned long long v12;  // x0
    long long v13;  // x0
    unsigned long v14;  // x0
    unsigned long long v15;  // x0
    st_7185c_1 *v0;  // [bp-0x80], Other Possible Types: st_7185c_1 **, st_7185c_0 **
    st_7185c_1 *v1;  // [bp-0x78], Other Possible Types: st_7185c_1 **, st_7185c_0 **, char
    st_7185c_0 **v2;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1;
    v7 = a0 + 1;
    if (v7 != a1)
    {
        v8 = sub_a0c8(a4);
        v9 = sub_6b08(a4);
        v10 = sub_a0c8(v6 + 4);
        v0 = &v1;
        v1 = &v0;
        v2 = v8;
        v3 = v9;
        if (!(sub_2a304(&v2, v10, sub_6b08(v6 + 4)) >> 31 & 1))
        {
            v11 = sub_a0c8(v6 + 4);
            v12 = sub_6b08(v6 + 4);
            v13 = sub_a0c8(a4);
            v0 = &v1;
            v1 = &v0;
            v2 = v11;
            v3 = v12;
            if (!(sub_2a304(&v2, v13, sub_6b08(a4)) >> 31 & 1))
            {
                *a2 = v6;
                *a3 = v6;
                return a3;
            }
            v2 = v6;
            sub_62fd8(&v2, 1);
            if (v2 != v7)
            {
                v14 = sub_a0c8(a4);
                v15 = sub_6b08(a4);
                v16 = sub_a0c8(v2 + 4);
                v1 = &v0;
                v2 = v14;
                v0 = &v1;
                v3 = v15;
                if (!(sub_2a304(&v2, v16, sub_6b08(v2 + 4)) >> 31 & 1))
                    return sub_71c98(a0, a2, a4);
            }
            if (!v6[1])
            {
                *a2 = v6;
                return v6 + 1;
            }
            *a2 = v2;
            return v2;
        }
    }
    if (*a0 != v6)
    {
        v17 = sub_62884(v6);
        v18 = sub_a0c8(v17 + 4);
        v19 = sub_6b08(v17 + 4);
        v20 = sub_a0c8(a4);
        v1 = &v0;
        v2 = v18;
        v0 = &v1;
        v3 = v19;
        if (!(sub_2a304(&v2, v20, sub_6b08(a4)) >> 31 & 1))
            return sub_71c98(a0, a2, a4);
    }
    else
    {
        v17 = v6;
    }
    if (!*v6)
    {
        *a2 = v6;
        return v6;
    }
    *a2 = v17;
    return v17 + 1;
}
