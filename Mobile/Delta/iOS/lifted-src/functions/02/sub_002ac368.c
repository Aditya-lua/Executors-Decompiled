/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ac368..0x2ac45c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ac368_1 {
    char padding_0[56];
    struct st_2ac368_1 *field_38;
} st_2ac368_1;

typedef struct st_2ac368_0 {
    char field_0;
} st_2ac368_0;


st_2ac368_1 * sub_2ac368(long long a0, unsigned long a1, long long a2)
{
    st_2ac368_1 **v12;  // x0
    st_2ac368_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2ac368_0 *v1;  // [bp-0x78]
    st_2ac368_1 *v2;  // [bp-0x70]
    st_2ac368_1 *v3;  // [bp-0x70]
    long long v4;  // [bp-0x68]
    st_2ac368_1 *v5;  // [bp-0x60], Other Possible Types: long long
    char v6;  // [bp-0x5f]
    long long v7;  // [bp-0x58]
    st_2ac368_0 **v8;  // [bp-0x50], Other Possible Types: char
    st_2ac368_0 *v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v12 = sub_71c98();
    if (!*v12)
    {
        v9 = &v8;
        v8 = &v9;
        v3 = sub_46c80(a0, 1);
        v4 = a0;
        v5 = (st_2ac368_1 *)0;
        sub_16f34(&v6);
        sub_5c38(&v3->padding_0[32], a2);
        *(char *)&v3->field_38 = 0;
        sub_2ae53c(v3 + 1, 0);
        v5 = 1;
        sub_626e0(a0, v7, v12, v3);
        v2 = 0;
        sub_2aa29c(&v2, 0);
        return v3;
    }
    return *v12;
}
