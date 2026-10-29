/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7af8..0x9c7b68 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7af8_0 {
    int field_0;
    unsigned int field_4;
    long long field_8;
} st_9c7af8_0;


unsigned long long sub_9c7af8(st_9c7af8_0 *a0, st_9c7af8_0 *a1)
{
    unsigned long v5;  // x2
    unsigned long v6;  // x8
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_0;
    v6 = a1->field_0;
    if ((unsigned int)v5 != (unsigned int)v6)
        return v5 - v6;
    if ((unsigned int)v5)
    {
        v0 = v7;
        v1 = v8;
        v2 = &v4;
        v3 = v9;
        v10 = _memcmp(a0->field_8, a1->field_8);
        if ((unsigned int)v10)
            return v10;
    }
    return a0->field_4 - a1->field_4;
}
