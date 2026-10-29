/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b164..0x6b52c (968 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b164_1 {
    struct st_6b164_0 *field_0;
} st_6b164_1;

typedef struct st_6b164_0 {
    char field_0;
} st_6b164_0;

extern unsigned long long g_e6a668;
extern unsigned long long g_e6a670;

unsigned long long sub_6b164(long long a0, unsigned long long a1)
{
    unsigned long long v7;  // x0
    unsigned long long v8;  // x28
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    st_6b164_0 **v0;  // [bp-0x200], Other Possible Types: char
    st_6b164_0 *v1;  // [bp-0x1f8]
    st_6b164_0 **v2;  // [bp-0x168], Other Possible Types: st_6b164_1 **, char
    st_6b164_0 *v3;  // [bp-0xd8], Other Possible Types: st_6b164_1 **
    unsigned long long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v4 = 0;
    v3 = &v2;
    v2 = &v3;
    v7 = sub_6ac74();
    if ((unsigned int)v7 == 1)
        return v7;
    if (a1)
        v8 = g_e6a670;
    else
        v8 = g_e6a668;
    v3 = &v2;
    v2 = &v3;
    v9 = sub_6ac74(a0);
    if ((unsigned int)v9 == 2)
        return v9;
    v10 = sub_60768(a0 + 1192, 5);
    if (v10 & 1)
        return v10;
    goto *((void *)(v8));
}
