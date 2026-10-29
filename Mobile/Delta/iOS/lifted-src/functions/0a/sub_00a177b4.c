/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa177b4..0xa177f0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a177b4_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a177b4_0;


long long sub_a177b4(st_a177b4_0 *a0)
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

    if (!a0->field_8)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_954340();
        return v8 != sub_a19d2c(v8);
    }
    return 1;
}
