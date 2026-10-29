/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaec5c..0xaaec98 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaec5c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_aaec5c_0;


long long sub_aaec5c(st_aaec5c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_20)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_9ffdd0();
        return v8 != sub_ab3878(v8);
    }
    return 1;
}
