/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x413ed0..0x413f38 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_413ed0_0 {
    char field_0;
} st_413ed0_0;

extern unsigned long long g_e80258;

void sub_413ed0(unsigned long a0, unsigned long a1, unsigned long long a2, unsigned long a3)
{
    unsigned long long v7;  // x30
    st_413ed0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_413ed0_0 *v1;  // [bp-0x38]
    long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v3 = a2;
    v2 = a3 - (a2 - a1);
    sub_13bbc(v2);
    (g_e80258 - 0x57949900)();
}
