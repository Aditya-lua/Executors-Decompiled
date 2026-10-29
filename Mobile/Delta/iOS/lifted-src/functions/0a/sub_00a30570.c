/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa30570..0xa305a8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a30570_0 {
    long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_a30570_0;


unsigned long long sub_a30570(st_a30570_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
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
        v8 = sub_aa5208(a0->field_0);
        a0->field_20 = v8;
        return v8;
    }
    return a0->field_20;
}
