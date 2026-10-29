/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x530bc..0x531a4 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_530bc_0 {
    unsigned long long field_0;
} st_530bc_0;

typedef struct st_530bc_1 {
    struct st_530bc_0 *field_0;
} st_530bc_1;

extern char g_10002b0;

void sub_530bc(long long a0, long long a1, long long a2, st_530bc_1 **a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, uint128_t a8, unsigned long a9, unsigned long long a10)
{
    unsigned long long v10;  // x28
    unsigned long long v11;  // x27
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    uint128_t v0;  // [bp-0x170]
    unsigned long long v1;  // [bp-0x160]
    char v2;  // [bp-0x148]
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
    v1 = a10;
    v0 = a8;
    sub_532c0(&v2, a0, a1, a2);
    (*(long long *)*a3)();
}
