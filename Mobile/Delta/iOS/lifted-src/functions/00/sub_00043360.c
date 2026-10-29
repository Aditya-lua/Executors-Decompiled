/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43360..0x43398 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43360_0 {
    struct st_43360_0 *field_0;
} st_43360_0;


st_43360_0 ** sub_43360(st_43360_0 **a0, st_43360_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_43360_0 **v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    do
    {
        v8 = a1;
        sub_4e14(v8, 1, 8);
        a1 = *v8;
    } while (*v8);
    return *v8;
}
