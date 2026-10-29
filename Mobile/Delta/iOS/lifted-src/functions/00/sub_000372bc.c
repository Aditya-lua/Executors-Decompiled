/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x372bc..0x3733c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_372bc_0 {
    unsigned long long field_0;
} st_372bc_0;

typedef struct st_372bc_1 {
    struct st_372bc_0 *field_0;
} st_372bc_1;

extern char g_10002b0;

void sub_372bc(long long a0, long long a1, long long a2, long long a3, st_372bc_1 **a4)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    char v0;  // [bp-0x158]
    unsigned long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = *(long long *)&g_10002b0;
    sub_3709c(&v0, a0, a1, a2, a3);
    (*(long long *)*a4)();
}
