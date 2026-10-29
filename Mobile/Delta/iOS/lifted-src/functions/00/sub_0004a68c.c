/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a68c..0x4a82c (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a68c_1 {
    unsigned long long field_0;
} st_4a68c_1;

typedef struct st_4a68c_2 {
    struct st_4a68c_1 *field_0;
} st_4a68c_2;

typedef struct st_4a68c_0 {
    char field_0;
} st_4a68c_0;

extern unsigned long long g_e675c8;
extern char g_10002b0;

void sub_4a68c(unsigned long a0, unsigned long long a1, st_4a68c_2 **a2)
{
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    st_4a68c_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_4a68c_0 *v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x78]
    char v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = &v15;
    v14 = v22;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = &g_e675c8;
    v4 = a1;
    v2 = 0;
    sub_f6e8(&v5, &v2, 0);
    (*(long long *)*a2)();
}
