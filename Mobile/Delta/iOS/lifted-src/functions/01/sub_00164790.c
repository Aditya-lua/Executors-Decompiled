/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x164790..0x164824 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_164790_0 {
    char field_0;
} st_164790_0;

typedef struct st_164790_2 {
    unsigned long long field_0;
} st_164790_2;

typedef struct st_164790_1 {
    struct st_164790_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_164790_1;

extern st_164790_1 g_e6f660;

void sub_164790(unsigned long a0, long long *a1)
{
    long long v8;  // x20
    unsigned long long v9;  // x0
    st_164790_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_164790_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    char *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = *a1;
    if (v8 == a1[1])
        return;
    v2 = a0;
    v3 = a0;
    v4 = a0;
    sub_1657e8(v8);
    v5 = &v2;
    v9 = sub_167278(v8);
    (&g_e6f660.field_0)[v9]();
}
