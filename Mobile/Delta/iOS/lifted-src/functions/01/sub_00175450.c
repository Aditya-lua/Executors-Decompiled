/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x175450..0x1754ac (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_175450_0 {
    struct st_175450_0 *field_0;
} st_175450_0;


unsigned long long sub_175450(unsigned long long a0, st_175450_0 **a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_175450_0 **v9;  // x8
    st_175450_0 **v10;  // x20
    unsigned long long v11;  // x0
    unsigned long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
        return a0;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    do
    {
        v9 = a1;
        v10 = *v9;
        v0 = v9 + 5;
        sub_271a8(&v0);
        v11 = sub_4e14(a1, 1, 8);
        a1 = v10;
    } while (*v9);
    return v11;
}
