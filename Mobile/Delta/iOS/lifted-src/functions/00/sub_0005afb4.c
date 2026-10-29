/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5afb4..0x5aff4 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5afb4_0 {
    struct st_5afb4_0 *field_0;
} st_5afb4_0;

extern st_5afb4_0 *g_f011d0;

st_5afb4_0 ** sub_5afb4(long long a0, st_5afb4_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1 == &g_f011d0)
        return &g_f011d0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_5aa94(a0);
    return *a1;
}
