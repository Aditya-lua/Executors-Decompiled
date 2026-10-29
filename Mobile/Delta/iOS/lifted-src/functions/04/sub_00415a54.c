/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x415a54..0x415b6c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_415a54_0 {
    char field_0;
} st_415a54_0;

extern unsigned long long g_e7fc00;

void sub_415a54(unsigned long long *a0, long long a1)
{
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    st_415a54_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_415a54_0 *v1;  // [bp-0x58]
    st_415a54_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_415a54_0 *v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
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
    v1 = &v0;
    v0 = &v1;
    a0[3] = 0;
    a0[4] = (a1 | 1) + (a1 & 1) - 2;
    a0[5] = sub_41d6cc();
    v3 = &v2;
    v2 = &v3;
    v4 = 0xff;
    v5 = sub_41d6cc(a0, a1);
    (g_e7fc00 - 0x1cb08200)();
}
