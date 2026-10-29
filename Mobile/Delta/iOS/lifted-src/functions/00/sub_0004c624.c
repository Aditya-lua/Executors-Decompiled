/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c624..0x4c714 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c624_0 {
    unsigned long long field_0;
} st_4c624_0;

typedef struct st_4c624_1 {
    struct st_4c624_0 *field_0;
} st_4c624_1;

extern char g_10002b0;

void sub_4c624(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, st_4c624_1 **a7, uint128_t a8, unsigned long a9, unsigned long long a10, unsigned long long a11)
{
    unsigned long long v10;  // x28
    unsigned long long v11;  // x27
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    unsigned long long v0;  // [bp-0x110]
    unsigned long long v1;  // [bp-0x108]
    char v2;  // [bp-0xf0]
    unsigned long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]

    v4 = v10;
    v5 = v11;
    v6 = v12;
    v7 = v13;
    v8 = &a8;
    v9 = v14;
    v3 = *(long long *)&g_10002b0;
    v0 = a10;
    v1 = a11;
    sub_4c494(&v2, a0, a1, a2, a3, a4, a5, a6, *(unsigned long long *)&a8);
    (*(long long *)*a7)();
}
