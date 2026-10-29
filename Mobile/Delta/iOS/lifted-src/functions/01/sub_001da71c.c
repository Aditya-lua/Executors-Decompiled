/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1da71c..0x1da774 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1da71c_1 {
    unsigned long long field_0;
    unsigned long long *field_8;
} st_1da71c_1;

typedef struct st_1da71c_0 {
    char field_0;
} st_1da71c_0;


st_1da71c_1 * sub_1da71c(st_1da71c_1 *a0)
{
    unsigned long long v2;  // x8
    unsigned long long *v3;  // x10
    unsigned long long v12;  // x9
    unsigned long long v4;  // x9
    unsigned long long *v5;  // x10
    unsigned long long *v6;  // x10
    unsigned long long *v7;  // x10
    unsigned long long v8;  // 4128
    unsigned long long v9;  // 4130
    unsigned long long v10;  // x9
    unsigned long long v11;  // x9
    st_1da71c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1da71c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_8;
    v4 = *v3;
    if (!v4)
    {
        v5 = v3 + 1;
        do
        {
            v6 = v5;
            v2 += 128;
            a0->field_0 = v2;
            a0->field_8 = v6;
            v4 = *v6;
            v7 = v6 + 1;
            v5 = v7;
        } while (!*v6);
        v3 = (char *)v7 - 8;
    }
    v8 = ((((((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v9 = (((((((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v4 & 0xaaaaaaaaaaaaaaaa) >> 1 | v4 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v10 = ((((v9 | v8) & 0xffff0000ffff0000) >> 16 | (v9 | v8) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v9 | v8) & 0xffff0000ffff0000) >> 16 | (v9 | v8) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v10)
        v11 = 64;
    else
        v11 = Clz(v10);
    v12 = v11 >> 3;
    a0->field_0 = v2 + v12 * 16;
    a0->field_8 = (char *)v3 + v12;
    return a0;
}
