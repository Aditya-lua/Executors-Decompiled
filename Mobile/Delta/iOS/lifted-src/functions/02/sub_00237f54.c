/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237f54..0x237fe4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_237f54_1 {
    char padding_0[104];
    struct st_237f54_1 *field_68;
    char padding_70[1692];
    unsigned int field_70c;
} st_237f54_1;

typedef struct st_237f54_0 {
    char field_0;
} st_237f54_0;

typedef struct st_237f54_2 {
    unsigned long long field_0;
} st_237f54_2;

extern unsigned long long g_e79fd0;
extern unsigned long long g_e79ff8;
extern st_237f54_2 *g_f0d1e8;

void sub_237f54(st_237f54_1 *a0)
{
    unsigned long long v5;  // x30
    st_237f54_1 *v6;  // x8
    st_237f54_1 *v7;  // x0
    st_237f54_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_237f54_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        g_f0d1e8();
    do
    {
        v6 = a0;
        v7 = v6;
        a0 = v6->field_68;
    } while (v6->field_68);
    if (v7 != 496 && v7->field_70c > 104)
        goto *((void *)(g_e79ff8));
    goto *((void *)(g_e79fd0));
}
