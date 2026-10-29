/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb95e18..0xb95ec4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b95e18_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_b95e18_0;

extern unsigned long long g_b7a7fc;
extern long long g_cb8c48;

unsigned long long sub_b95e18(st_b95e18_0 **a0, long long *a1)
{
    unsigned long long v8;  // x0
    char v0;  // [bp-0x68]
    long long v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = *a0->field_8;
    v3 = *a0->field_8 + *a0->field_10 * 8;
    sub_b9475c(&v0, &v2, 0x202c);
    v4 = &v0;
    v5 = &g_b7a7fc;
    v8 = sub_be769c(*a1, a1[1], &g_cb8c48, &v4);
    if (!v0)
        return v8;
    _free(v1);
    return v8;
}
