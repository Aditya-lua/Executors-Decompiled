/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4254ac..0x4255e8 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4254ac_0 {
    char field_0;
} st_4254ac_0;

extern unsigned long long g_e80278;

void sub_4254ac(void* a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    st_4254ac_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_4254ac_0 *v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = &v12;
    v11 = v19;
    memset(a0, 0, 24);
    v0 = a2;
    v1 = a1;
    v3 = &v2;
    v2 = &v3;
    (g_e80278 - 0x3f07c00)();
}
