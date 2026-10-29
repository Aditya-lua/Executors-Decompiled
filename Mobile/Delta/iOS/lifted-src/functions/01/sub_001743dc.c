/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1743dc..0x1744b8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1743dc_1 {
    char padding_0[28];
    unsigned int field_1c;
    struct st_1743dc_1 *field_20;
} st_1743dc_1;

typedef struct st_1743dc_2 {
    unsigned int field_0;
} st_1743dc_2;

typedef struct st_1743dc_0 {
    char field_0;
} st_1743dc_0;


st_1743dc_1 * sub_1743dc(long long a0, unsigned long a1, unsigned long a2, st_1743dc_2 **a3)
{
    st_1743dc_1 **v12;  // x0
    st_1743dc_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1743dc_0 *v1;  // [bp-0x78]
    st_1743dc_1 *v2;  // [bp-0x70]
    st_1743dc_1 *v3;  // [bp-0x70]
    long long v4;  // [bp-0x68]
    st_1743dc_1 *v5;  // [bp-0x60], Other Possible Types: long long
    char v6;  // [bp-0x5f]
    long long v7;  // [bp-0x58]
    st_1743dc_0 **v8;  // [bp-0x50], Other Possible Types: char
    st_1743dc_0 *v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v12 = sub_173cdc();
    if (!*v12)
    {
        v9 = &v8;
        v8 = &v9;
        v3 = sub_166ec(a0, 1);
        v4 = a0;
        v5 = (st_1743dc_1 *)0;
        sub_16f34(&v6);
        v3->field_1c = *(int *)*a3;
        *(unsigned int *)&v3->field_20 = 0;
        v5 = 1;
        sub_626e0(a0, v7, v12, v3);
        v2 = 0;
        sub_3b024(&v2, 0);
        return v3;
    }
    return *v12;
}
