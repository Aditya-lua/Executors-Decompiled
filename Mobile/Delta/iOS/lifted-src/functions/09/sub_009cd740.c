/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cd740..0x9cd780 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cd740_0 {
    char padding_0[8];
    unsigned int field_8;
} st_9cd740_0;


long long sub_9cd740(st_9cd740_0 *a0, st_9cd740_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = _memcmp();
    if (v8)
        return v8;
    return a0->field_8 - a1->field_8 & 0xffffffff;
}
