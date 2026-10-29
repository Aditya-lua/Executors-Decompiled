/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cef5c..0x3cf0fc (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cef5c_1 {
    struct st_3cef5c_0 *field_0;
} st_3cef5c_1;

typedef struct st_3cef5c_0 {
    char field_0;
} st_3cef5c_0;

extern char g_1000000;

unsigned long long sub_3cef5c(long long a0)
{
    unsigned int v8;  // w0
    unsigned int v9;  // w0
    unsigned int v10;  // w0
    unsigned int v11;  // w8
    st_3cef5c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_3cef5c_0 *v1;  // [bp-0x68]
    st_3cef5c_0 *v2;  // [bp-0x60], Other Possible Types: st_3cef5c_1 **
    st_3cef5c_0 **v3;  // [bp-0x58], Other Possible Types: st_3cef5c_1 **, char
    st_3cef5c_0 *v4;  // [bp-0x50], Other Possible Types: st_3cef5c_1 **
    st_3cef5c_0 **v5;  // [bp-0x48], Other Possible Types: st_3cef5c_1 **, char
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (sub_3d706c() != 66)
    {
        return 0;
    }
    else if (sub_3d706c(a0) == 77)
    {
        v2 = &v3;
        v3 = &v2;
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v2 = &v3;
        v3 = &v2;
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        sub_3d706c(a0);
        sub_3d706c(a0);
        v2 = &v3;
        v3 = &v2;
        v4 = &v5;
        v5 = &v4;
        v8 = sub_3d706c(a0);
        v9 = sub_3d706c(a0);
        v4 = &v5;
        v5 = &v4;
        v10 = sub_3d706c(a0);
        v11 = v10 * 0x10000 | (unsigned int)sub_3d706c(a0) * &g_1000000 | v8 | v9 * 0x100;
        if (56 >= v11 && 1 << ((char)v11 & 63) & 0x100010000001000)
            return 1;
        if (v11 != 108)
            return v11 == 124;
        return 1;
    }
    else
    {
        return 0;
    }
}
