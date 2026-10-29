/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x202e4..0x203d4 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_202e4_1 {
    char padding_0[132];
    uint128_t field_84;
    char padding_94[68];
    long long field_d8;
    char padding_e0[112];
    void* field_150;
} st_202e4_1;

typedef struct st_202e4_0 {
    char field_0;
} st_202e4_0;

extern char g_10002b0;

unsigned long long sub_202e4(st_202e4_1 *a0)
{
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    st_202e4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_202e4_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    char *v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    uint128_t v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v6 = *(int128_t *)&(a0->padding_0)[1];
    sub_f8d0();
    if (*(int *)(*(long long *)&a0->padding_e0[96] - 4))
    {
        v11 = sub_53f4(sub_404c(*(long long *)&a0->padding_94[56], 32), &v6);
        if (*(long long *)&g_10002b0 == v8)
            return v11;
    }
    else
    {
        v4 = 0;
        v5 = 0;
        v7 = sub_53f4(sub_404c(*(long long *)&a0->padding_94[56], 32), &v6);
        v2 = sub_19088(a0, &v7, 1);
        v3 = &v7;
        v12 = sub_ebbc(a0, &v6, &v4, &v2, "break statement must be inside a loop");
        if (*(long long *)&g_10002b0 == v8)
            return v12;
    }
    ___stack_chk_fail();
}
