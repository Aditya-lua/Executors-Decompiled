/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5dadc..0xa5db1c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5dadc_0 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[80];
    struct st_a5dadc_1 *field_78;
} st_a5dadc_0;

typedef struct st_a5dadc_1 {
    unsigned int field_0;
} st_a5dadc_1;


long long sub_a5dadc(st_a5dadc_0 *a0, long long a1)
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

    if (!a0->field_20)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a5b060(a1);
        return *(int *)a0->field_78 == v8;
    }
}
