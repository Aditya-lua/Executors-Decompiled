/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4034f4..0x403768 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4034f4_0 {
    char field_0;
} st_4034f4_0;

extern long long g_e7f640;
extern unsigned long long g_e804e8;

void sub_4034f4(char *a0, unsigned long a1)
{
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    long long v20;  // x0
    st_4034f4_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_4034f4_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    char v3;  // [bp-0x58]
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
    v1 = &v0;
    v0 = &v1;
    if (*a0 != 1)
    {
        v20 = ___cxa_allocate_exception(32);
        v2 = sub_2aeb88(a0);
        sub_425bac("cannot use at() with ", &v2);
        sub_2acd44(304, &v3, a0);
        ___cxa_throw(v20, &g_e7f640, 0x2aedb8);
        __debugbreak();
    }
    (g_e804e8 - 0xa9838700)();
}
