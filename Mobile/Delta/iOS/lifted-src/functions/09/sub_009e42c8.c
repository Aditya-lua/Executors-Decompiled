/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e42c8..0x9e4320 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e42c8_0 {
    unsigned long long field_0;
    int field_8;
} st_9e42c8_0;


int sub_9e42c8(long long a0, st_9e42c8_0 *a1, int a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1->field_8 > a2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    _bzero();
    if (!a1->field_0)
        return 1;
    _memcpy(a0);
    return 1;
}
