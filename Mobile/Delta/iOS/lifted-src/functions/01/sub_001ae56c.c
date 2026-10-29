/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ae56c..0x1ae5c8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ae56c_0 {
    unsigned long long field_0;
    struct st_1ae56c_0 *field_8;
    unsigned int field_10;
    char padding_14[4];
    char field_18;
    char padding_19[3];
    unsigned int field_1c;
    char padding_20[24];
    struct st_1ae56c_0 *field_38;
} st_1ae56c_0;

extern char g_e6fd08;

int sub_1ae56c(st_1ae56c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_1ae56c_0 *v8;  // x0
    unsigned int v9;  // w8
    st_1ae56c_0 *v10;  // x9
    st_1ae56c_0 *v11;  // x10
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!(a0->field_18 >> 1 & 1))
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = operatornew(24);
        v9 = a0->field_1c + 1;
        a0->field_1c = v9;
        v10 = a0->field_38;
        v11 = v10->field_8;
        v8->field_0 = &g_e6fd08;
        v8->field_8 = v11;
        v8->field_10 = v9;
        v10->field_8 = v8;
        a0->field_38 = v8;
        a0 = v8;
    }
    return (unsigned int)a0;
}
