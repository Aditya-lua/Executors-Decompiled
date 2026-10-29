/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8adfbc..0x8ae3ac (1008 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8adfbc_0 {
    char field_0;
} st_8adfbc_0;

typedef struct st_8adfbc_1 {
    char padding_0[496];
    long long field_1f0;
} st_8adfbc_1;

typedef struct st_8adfbc_2 {
    char padding_0[928];
    unsigned long long field_3a0;
} st_8adfbc_2;

extern unsigned long long g_e82dd8;
extern unsigned long long g_e82ee0;
extern st_8adfbc_2 *g_f0d198;
extern st_8adfbc_1 *g_f0d3d8;
extern char g_f12661;
extern char g_10002b0;

void sub_8adfbc(void)
{
    st_8adfbc_0 **v0;  // [bp-0x560], Other Possible Types: char
    st_8adfbc_0 *v1;  // [bp-0x558]
    char *v2;  // [bp-0x550]
    char *v3;  // [bp-0x548]
    char v4;  // [bp-0x540]
    char v5;  // [bp-0x52f]
    char v6;  // [bp-0x528]
    char v7;  // [bp-0x517]
    st_8adfbc_0 *v8;  // [bp-0x508]
    st_8adfbc_0 **v9;  // [bp-0x478], Other Possible Types: char
    unsigned long v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!(g_f12661 & 1))
    {
        g_f12661 = 1;
        sub_41530c(&v6, sub_a0c8(g_f0d3d8->field_1f0));
        sub_41530c(&v4, *(long long *)*(long long *)(g_f0d198->field_3a0 + 80952));
        v2 = &v4;
        v3 = &v6;
        if (v7 == 1 && v5 == 1)
        {
            v8 = &v9;
            v9 = &v8;
            if (v6 && *(char *)v6)
                (g_e82ee0 - 0xaa317400)();
        }
        (g_e82dd8 - 0x900d0d00)();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v10)
            return;
        ___stack_chk_fail();
        (g_e82dd8 - 0x900d0d00)();
    }
}
