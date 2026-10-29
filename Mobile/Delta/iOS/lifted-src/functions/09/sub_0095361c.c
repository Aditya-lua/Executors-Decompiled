/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95361c..0x95369c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95361c_0 {
    struct st_95361c_0 *field_0;
    char padding_8[272];
    long long field_118;
    long long field_120;
    char padding_128[968];
    struct st_95361c_0 *field_4f0;
} st_95361c_0;


st_95361c_0 * sub_95361c(st_95361c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_95361c_0 *v8;  // x19
    st_95361c_0 *v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if ((int)a0->field_0)
    {
        return a0;
    }
    else
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (a0->field_4f0)
        {
            sub_95369c();
            sub_954288(a0->field_4f0->field_118);
            sub_954288(a0->field_4f0->field_120);
        }
        v8 = a0;
        sub_991bd0(&a0[2].padding_128[320]);
        sub_954884(v8);
        v9 = sub_a6c2e4(v8->field_4f0, "ssl/d1_lib.c", 168);
        v8->field_4f0 = 0;
        return v9;
    }
}
