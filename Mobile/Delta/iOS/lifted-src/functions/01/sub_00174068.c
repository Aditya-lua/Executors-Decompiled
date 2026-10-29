/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174068..0x174144 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_174068_1 {
    char padding_0[28];
    unsigned long long field_1c;
} st_174068_1;

typedef struct st_174068_0 {
    char field_0;
} st_174068_0;


st_174068_1 * sub_174068(long long a0, unsigned long a1, unsigned long a2, unsigned long long *a3)
{
    st_174068_1 **v12;  // x0
    st_174068_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_174068_0 *v1;  // [bp-0x80]
    st_174068_1 *v2;  // [bp-0x78]
    st_174068_1 *v3;  // [bp-0x78]
    long long v4;  // [bp-0x70]
    st_174068_1 *v5;  // [bp-0x68], Other Possible Types: long long
    char v6;  // [bp-0x67]
    long long v7;  // [bp-0x58]
    st_174068_0 **v8;  // [bp-0x50], Other Possible Types: char
    st_174068_0 *v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v12 = sub_16b4d4();
    if (!*v12)
    {
        v9 = &v8;
        v8 = &v9;
        v3 = sub_166ec(a0, 1);
        v4 = a0;
        v5 = (st_174068_1 *)0;
        sub_16f34(&v6);
        *(unsigned long long *)&(v3->padding_0)[1] = *a3;
        v5 = 1;
        sub_626e0(a0, v7, v12, v3);
        v2 = 0;
        sub_3b024(&v2, 0);
        return v3;
    }
    return *v12;
}
