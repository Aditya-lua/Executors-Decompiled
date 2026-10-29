/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991a44..0x991a84 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991a44_0 {
    struct st_991a44_0 *field_0;
} st_991a44_0;


st_991a44_0 ** sub_991a44(st_991a44_0 **a0)
{
    st_991a44_0 **v5;  // x0
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_991a44_0 **v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = *a0;
    if (!v5)
        return v5;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    do
    {
        v9 = v5;
        sub_a6c2e4();
        v5 = *v9;
    } while (*v9);
    return *v9;
}
