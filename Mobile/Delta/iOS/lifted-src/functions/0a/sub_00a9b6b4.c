/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b6b4..0xa9b704 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9b6b4_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_a9b6b4_0;


int sub_a9b6b4(st_a9b6b4_0 *a0, long long *a1)
{
    unsigned long v5;  // x0
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_0;
    if (a1)
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        _memcpy(*a1, a0->field_8, (int)v5);
        v5 = a0->field_0;
        *a1 = *a1 + v5;
    }
    return v5;
}
