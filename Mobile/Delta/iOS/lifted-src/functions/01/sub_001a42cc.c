/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a42cc..0x1a4318 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a42cc_0 {
    struct st_1a42cc_0 *field_0;
} st_1a42cc_0;


unsigned long long sub_1a42cc(unsigned long long a0, st_1a42cc_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_1a42cc_0 **v8;  // x0
    unsigned long long v9;  // x0
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
        v9 = sub_4e14(a1, 1, 8);
        a1 = *v8;
    } while (*v8);
    return v9;
}
