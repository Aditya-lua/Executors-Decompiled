/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3bdfbc..0x3be068 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3bdfbc_0 {
    char field_0;
} st_3bdfbc_0;

typedef struct st_3bdfbc_1 {
    unsigned long long field_0;
} st_3bdfbc_1;

typedef struct st_3bdfbc_2 {
    struct st_3bdfbc_1 *field_0;
} st_3bdfbc_2;

extern st_3bdfbc_2 *g_f0d3e0;
extern long long g_f11d00;
extern long long g_f11d08;

int sub_3bdfbc(void)
{
    st_3bdfbc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3bdfbc_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (g_f11d00 == g_f11d08)
        return sub_c84c(&g_f11d00, g_f11d00);
    v3 = 2765228019484112359;
    v2 = 2765228019484112175;
    (*(long long *)((v2 ^ v3) + (char *)g_f0d3e0))();
}
