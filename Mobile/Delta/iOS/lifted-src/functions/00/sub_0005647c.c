/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5647c..0x564bc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5647c_0 {
    unsigned long long field_0;
} st_5647c_0;

typedef struct st_5647c_1 {
    struct st_5647c_0 *field_0;
} st_5647c_1;

extern unsigned long long g_e68f90;

void sub_5647c(unsigned long long a0, unsigned long long a1, unsigned long long a2, st_5647c_1 **a3)
{
    unsigned long long v9;  // x30
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v6 = &v8;
    v7 = v9;
    v0 = &g_e68f90;
    v1 = a0;
    v2 = a1;
    v3 = a2;
    v4 = 0;
    v5 = 0;
    (*(long long *)*a3)();
}
