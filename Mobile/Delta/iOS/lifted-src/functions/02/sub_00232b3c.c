/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x232b3c..0x233428 (2284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_232b3c_0 {
    char field_0;
} st_232b3c_0;

typedef struct st_232b3c_2 {
    unsigned long long field_0;
} st_232b3c_2;

typedef struct st_232b3c_1 {
    char padding_0[72];
    struct st_232b3c_2 *field_48;
} st_232b3c_1;

extern st_232b3c_1 *g_f0d3d8;
extern char g_10002b0;

void sub_232b3c(unsigned long a0)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_232b3c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_232b3c_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    g_f0d3d8->field_48();
}
