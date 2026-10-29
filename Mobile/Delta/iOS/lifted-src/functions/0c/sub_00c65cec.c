/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc65cec..0xc65e04 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c65cec_0 {
    struct st_c65cec_0 *field_0;
} st_c65cec_0;


st_c65cec_0 ** sub_c65cec(st_c65cec_0 **a0, st_c65cec_0 **a1, st_c65cec_0 **a2, st_c65cec_0 **a3, char a4)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_c65cec_0 **v19;  // x0
    st_c65cec_0 **v20;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_c65cec_0 **v16;  // x24
    st_c65cec_0 **v17;  // x1
    st_c65cec_0 **v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a1 && !*a0)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a2;
    if (*a3 < v16)
        return 0;
    if (a1 && v16 == *a3)
    {
        if (v16 > 0x7ffffbff)
            return 0;
        v17 = v16 + 128;
        *a3 = v17;
        if (*a1)
        {
            v18 = sub_a6c1b4(*a1, v17, "crypto/bio/bio_print.c", 862);
            if (!v18)
                return v18;
            *a1 = v18;
            v16 = *a2;
        }
        else
        {
            v19 = sub_a6bf4c(v17, "crypto/bio/bio_print.c", 851);
            *a1 = v19;
            if (!v19)
                return v19;
            v16 = *a2;
            if (v16)
            {
                if (!*a0)
                    return 0;
                _memcpy();
            }
            *a0 = 0;
        }
    }
    if (*a3 <= v16)
        return 1;
    v20 = *a0;
    if (!*a0)
        v20 = *a1;
    *a2 = (char *)v16 + 1;
    *(char *)(v20 + v16) = a4;
    return 1;
}
