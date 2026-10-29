/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x233c64..0x233ee4 (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_233c64_0 {
    char field_0;
} st_233c64_0;

typedef struct st_233c64_4 {
    unsigned long long field_0;
} st_233c64_4;

typedef struct st_233c64_1 {
    char padding_0[257];
    char field_101;
} st_233c64_1;

typedef struct st_233c64_3 {
    char padding_0[312];
    struct st_233c64_4 *field_138;
} st_233c64_3;

typedef struct st_233c64_2 {
    char padding_0[96];
    struct st_233c64_1 *field_60;
} st_233c64_2;

extern st_233c64_2 *g_f0d198;
extern st_233c64_3 *g_f0d3d8;
extern char g_10002b0;

void sub_233c64(long long a0)
{
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    char v18;  // x0
    st_233c64_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_233c64_0 *v1;  // [bp-0xb8]
    st_233c64_0 **v2;  // [bp-0x98], Other Possible Types: char
    char v3;  // [bp-0x68]
    st_233c64_0 *v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = v16;
    v10 = &v12;
    v11 = v17;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v4 = &v2;
    v2 = &v4;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v18 = sub_234774(a0, 1);
        if (v18 && *(long long *)(v18 + 24))
        {
            v3 = 0;
            g_f0d3d8->field_138();
        }
    }
    sub_c60e2c(a0);
    __debugbreak();
}
