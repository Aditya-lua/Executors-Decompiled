/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50cb0..0x50dd0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50cb0_0 {
    unsigned long long field_0;
} st_50cb0_0;

typedef struct st_50cb0_1 {
    struct st_50cb0_0 *field_0;
} st_50cb0_1;

extern unsigned long long g_e68478;
extern char g_10002b0;

void sub_50cb0(unsigned long long a0, st_50cb0_1 **a1)
{
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long v0;  // [bp-0xd8]
    unsigned long v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xc0]
    char v4;  // [bp-0xb8]
    char v5;  // [bp-0x90]
    char v6;  // [bp-0x60]
    unsigned long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v8 = v15;
    v9 = v16;
    v10 = v17;
    v11 = v18;
    v12 = &v14;
    v13 = v19;
    v7 = *(long long *)&g_10002b0;
    v2 = &g_e68478;
    v3 = a0;
    v0 = 0;
    sub_17ef4(&v4, &v0, 0);
    v0 = 0;
    v1 = 0;
    sub_bfd0(&v5, &v0, 0);
    v0 = 0;
    sub_37228(&v6, &v0, 0);
    (*(long long *)*a1)();
}
