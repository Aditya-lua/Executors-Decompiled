/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd968..0x9fd9a4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd968_0 {
    char padding_0[168];
    unsigned long long field_a8;
} st_9fd968_0;


long long sub_9fd968(st_9fd968_0 *a0)
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

    if (!a0->field_a8)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_9ff990();
        return v8 != sub_9ff2e4(v8);
    }
    return 1;
}
