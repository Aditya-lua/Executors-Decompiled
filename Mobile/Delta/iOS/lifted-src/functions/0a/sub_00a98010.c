/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98010..0xa98184 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a98010_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a98010_0;

extern unsigned long long g_df0010;
extern char g_10002b0;

unsigned long long sub_a98010(unsigned long a0, unsigned long long a1, st_a98010_0 *a2, long long a3, long long n, unsigned long long *a5)
{
    unsigned long long v5;  // x23
    unsigned long long v6;  // x8
    unsigned long v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!(n & 7) && (unsigned long long)(n + 0xffffffff7fffffff) >= 0xffffffff8000000f)
    {
        v5 = a1;
        _memmove(&a2->field_8, a3, n);
        v6 = &g_df0010;
        if (!v5)
            v5 = v6;
        v0 = *(long long *)v5;
        v1 = a2->field_8;
        a5();
    }
    if (*(long long *)&g_10002b0 == v2)
        return 0;
    ___stack_chk_fail();
}
