/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x269c4..0x26ac8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_269c4_0 {
    char field_0;
} st_269c4_0;

extern unsigned long long g_f0cb18;
extern unsigned int g_f0cb20;
extern char g_f0cb28;
extern char g_f0cb48;
extern unsigned long long g_f0cb50;
extern unsigned int g_f0cb58;
extern char g_f0cb60;
extern char g_f0cb80;
extern unsigned long long g_f0cb88;
extern unsigned int g_f0cb90;
extern long long g_f0cb98;
extern char g_f0cbb8;
extern unsigned long long g_f0cbc0;
extern unsigned int g_f0cbc8;
extern char g_f0cbd0;
extern char g_f0cbf0;

int sub_269c4(void)
{
    st_269c4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_269c4_0 *v1;  // [bp-0x48]
    st_269c4_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_269c4_0 *v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    char v5;  // [bp-0x21]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    g_f0cb18 = "checked";
    g_f0cb20 = 0;
    g_f0cb28 = 0;
    g_f0cb48 = 0;
    g_f0cb50 = "native";
    g_f0cb58 = 1;
    g_f0cb60 = 0;
    g_f0cb80 = 0;
    g_f0cb88 = "deprecated";
    g_f0cb90 = 2;
    v3 = &v2;
    v2 = &v3;
    v4 = 108628;
    sub_108e0(&g_f0cb98, &v4, &v5);
    g_f0cbb8 = 1;
    g_f0cbc0 = 0;
    g_f0cbc8 = 0;
    g_f0cbd0 = 0;
    g_f0cbf0 = 0;
    return ___cxa_atexit(0x25410, 0, 0);
}
