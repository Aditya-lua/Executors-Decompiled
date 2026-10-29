/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990214..0x990284 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_990214_0 {
    struct st_990214_1 *field_0;
    unsigned long long field_8;
} st_990214_0;

typedef struct st_990214_1 {
    char field_0;
} st_990214_1;


unsigned long long sub_990214(st_990214_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x19
    unsigned long long v9;  // x0
    unsigned long long v10;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (v8 <= a0->field_8)
    {
        v9 = sub_a7b0d8(a0->field_0);
        v10 = a0->field_8 - v8;
        a0->field_0 = &a0->field_0[v8];
        a0->field_8 = v10;
        return v9 == 1;
    }
    return 0;
}
