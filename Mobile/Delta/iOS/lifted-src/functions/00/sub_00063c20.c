/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63c20..0x63c58 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63c20_0 {
    long long field_0;
    char field_8;
} st_63c20_0;


st_63c20_0 * sub_63c20(st_63c20_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_8 != 1)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    std::__1::mutex::unlock(a0->field_0);
    return a0;
}
