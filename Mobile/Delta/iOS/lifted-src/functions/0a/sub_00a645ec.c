/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa645ec..0xa646b8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a645ec_0 {
    unsigned int field_0;
} st_a645ec_0;

extern unsigned int g_f12a48;

unsigned int * sub_a645ec(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long a4, unsigned int *a5, unsigned int *a6)
{
    unsigned int *v7;  // x23
    unsigned int v8;  // w0
    unsigned int *v9;  // x8
    unsigned int *v10;  // w0
    unsigned long long v0;  // [bp-0x80]
    unsigned int *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    st_a645ec_0 **v3;  // [bp-0x68]
    unsigned int *v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a5;
    v8 = sub_a50ac8();
    v4 = 0;
    if ((int)v8 < 1)
        return 0;
    sub_a50a58(a0);
    v9 = &g_f12a48;
    if (!v7)
        v7 = v9;
    v2 = v8;
    v3 = &v4;
    v0 = a4;
    v1 = v7;
    v10 = (unsigned int *)(unsigned int)sub_a58460();
    if (!a6)
        return v10;
    *a6 = (unsigned int)v4;
    return v10;
}
