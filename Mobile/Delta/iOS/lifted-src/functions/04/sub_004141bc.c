/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4141bc..0x4142c8 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4141bc_0 {
    char field_0;
} st_4141bc_0;

extern unsigned long long g_e801a0;

void sub_4141bc(unsigned long long *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_4141bc_0 *v10;  // x9
    unsigned long long v11;  // x11
    unsigned long long v12;  // x9
    unsigned long v13;  // x10
    st_4141bc_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_4141bc_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!*a0)
        return;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    sub_c84c();
    v1 = &v0;
    v0 = &v1;
    v10 = v1;
    v11 = (char *)v10 + 0x2 * ~v10 + 1;
    v12 = (v10 ^ -v0) - (v0 ^ -v10) + (v11 + (v10 & -v0) - (v0 & -v10 | v10 & ~v0) + (v0 | ~v11)) * 2;
    v13 = (((v12 + 2) * 2 | v12 + 2 >> 63) & 14 & 15) + (v12 + 2 ^ 7);
    v0 = ~v13 + v13 * 2;
    v1 = v12 + 4;
    (g_e801a0 - 0x4cb25200)();
}
