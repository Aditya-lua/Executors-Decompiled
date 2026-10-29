/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cb9f4..0x3cbaa0 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cb9f4_0 {
    char field_0;
} st_3cb9f4_0;

typedef struct st_3cb9f4_1 {
    char padding_0[960];
    char field_3c0;
} st_3cb9f4_1;

extern st_3cb9f4_1 *g_f0d198;
extern char g_10002b0;

int sub_3cb9f4(unsigned long long a0, int a1)
{
    st_3cb9f4_0 **v0;  // [bp-0x120], Other Possible Types: char
    st_3cb9f4_0 *v1;  // [bp-0x118]
    unsigned long v2;  // [bp-0x110]
    char v3;  // [bp-0x108]
    unsigned long v4;  // [bp-0xf8]
    unsigned int v5;  // [bp-0xd8]
    unsigned int v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long v11;  // [bp-0x28]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    if (g_f0d198->field_3c0)
    {
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v9 = a0;
        v10 = a0 + a1;
        v7 = a0;
        v8 = v10;
        if (sub_3c9214(&v3, (char *)&v2 + 4, &v2, 0, 4))
            _free();
    }
    if (*(long long *)&g_10002b0 == v11)
        return 0;
    ___stack_chk_fail();
}
