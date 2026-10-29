/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03744..0xa03780 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03744_0 {
    char padding_0[16];
    long long field_10;
} st_a03744_0;


unsigned int sub_a03744(st_a03744_0 *a0)
{
    unsigned long long v5;  // x30
    unsigned int v6;  // w0
    long long v0;  // [bp-0x20]
    long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_10)
        return 0xffffffff;
    v2 = &v4;
    v3 = v5;
    v0 = a0->field_10;
    v1 = v0;
    v6 = sub_a03638(&v0, 0);
    return v6 & ~((int)(v6) >> 31);
}
