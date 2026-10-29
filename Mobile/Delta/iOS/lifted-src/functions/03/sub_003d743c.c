/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d743c..0x3d770c (720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d743c_3 {
    struct st_3d743c_0 *field_0;
} st_3d743c_3;

typedef struct st_3d743c_0 {
    char field_0;
} st_3d743c_0;

typedef struct st_3d743c_1 {
    char padding_0[8];
    unsigned int field_8;
} st_3d743c_1;

typedef struct st_3d743c_4 {
    unsigned long long field_0;
} st_3d743c_4;

extern st_3d743c_4 *g_f0b120;
extern char _NSHomeDirectory;

long long sub_3d743c(uint128_t *a0, long long a1, long long a2, long long a3, unsigned long long a4, st_3d743c_1 *a5, long long a6)
{
    unsigned int v10;  // w0
    unsigned int v11;  // w0
    unsigned int v12;  // w0
    unsigned int v13;  // w0
    unsigned int v14;  // w27
    unsigned int v15;  // w26
    unsigned int v16;  // w0
    unsigned int v17;  // w0
    st_3d743c_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_3d743c_0 *v1;  // [bp-0xb8]
    st_3d743c_0 *v2;  // [bp-0xb0], Other Possible Types: st_3d743c_3 **, uint128_t *
    st_3d743c_0 **v3;  // [bp-0x88], Other Possible Types: char
    st_3d743c_0 *v4;  // [bp-0x80]
    st_3d743c_0 **v5;  // [bp-0x78], Other Possible Types: char
    st_3d743c_0 *v6;  // [bp-0x70]
    st_3d743c_0 **v7;  // [bp-0x68], Other Possible Types: st_3d743c_3 **, char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    a5->field_8 = 0;
    *(double *)a5->padding_0 = 4e-323;
    v10 = sub_3ca60c();
    a0[12] = a0[13];
    if (v10)
    {
        v2 = a0;
        return sub_3ce150(&v2, a1, a2, a3, a4, a5);
    }
    v11 = sub_3cef5c(a0);
    a0[12] = a0[13];
    if (v11)
        return sub_3d5228(a0, a1, a2, a3, a4);
    v12 = sub_3cdc68(a0);
    a0[12] = a0[13];
    if (v12)
        return sub_3d4cf0(a0, a1, a2, a3, a4);
    v4 = &v3;
    v3 = &v4;
    v6 = &v5;
    v5 = &v6;
    v2 = &v7;
    v7 = &v2;
    v13 = sub_3d706c(a0);
    v14 = v13 * &_NSHomeDirectory | sub_3d706c(a0) * 0x10000;
    v2 = &v7;
    v7 = &v2;
    v15 = sub_3d706c(a0);
    v16 = sub_3d706c(a0);
    a0[12] = a0[13];
    if ((v16 | v15 * 0x100 | v14) == 943870035)
        return sub_3ca6f4(a0, a1, a2, a3, a4, a5, a6);
    v17 = sub_3d330c(a0);
    a0[12] = a0[13];
    if (v17)
        return sub_3c95c0(a0, a1, a2, a3, a4);
    if (sub_3c9bbc(a0))
        return sub_3d4654(a0, a1, a2, a3, a4);
    if (sub_3ce304(a0))
        return sub_3d42b8(a0, a1, a2, a3, a4, a5);
    if (sub_3d1570(a0))
    {
        sub_3cb15c(a0, a1, a2, a3, a4);
        return sub_3c8698();
    }
    if (sub_3d72a8(a0))
        return sub_3c7e1c(a0, a1, a2, a3, a4);
    g_f0b120();
}
