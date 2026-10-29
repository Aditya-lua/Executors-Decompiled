/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5b200..0xb5b36c (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5b200_0 {
    struct st_b5b200_0 *field_0;
    char padding_8[16];
    struct st_b5b200_0 *field_18;
} st_b5b200_0;

extern char g_10002b0;

long long sub_b5b200(st_b5b200_0 *a0, unsigned long long a1, unsigned long a2)
{
    st_b5b200_0 *v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    st_b5b200_0 *v2;  // [bp-0x70], Other Possible Types: unsigned int
    st_b5b200_0 **v3;  // [bp-0x68]
    st_b5b200_0 *v4;  // [bp-0x60], Other Possible Types: uint128_t
    st_b5b200_0 *v5;  // [bp-0x50]
    st_b5b200_0 *v6;  // [bp-0x40]
    st_b5b200_0 *v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v0 = 0;
    v7 = 0;
    v5 = (st_b5b200_0 *)0;
    v6 = (st_b5b200_0 *)0;
    v2 = (st_b5b200_0 *)0;
    v4 = (st_b5b200_0 *)0;
    if (a0 && a0->field_0 && a0->field_18)
    {
        v1 = a1;
        v2 = 6;
        v3 = &v0;
        v4 = 0xffffffffffffffff0000000000000008;
        a0->field_18();
    }
    if (*(long long *)&g_10002b0 == v8)
        return a2;
    ___stack_chk_fail();
}
