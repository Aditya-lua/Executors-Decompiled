/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237a50..0x237b38 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_237a50_0 {
    char field_0;
} st_237a50_0;


void sub_237a50(long long a0, long long a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    long long v15;  // x0
    st_237a50_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_237a50_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
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
    v1 = &v0;
    v0 = &v1;
    sub_3c6660();
    v15 = operatornew(224);
    sub_5c38(&v2, a1);
    sub_233efc(v15, a0, &v2);
}
