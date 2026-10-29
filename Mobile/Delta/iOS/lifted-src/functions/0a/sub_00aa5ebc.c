/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5ebc..0xaa5f40 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa5ebc_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_aa5ebc_0;


unsigned long long sub_aa5ebc(unsigned long long a0, st_aa5ebc_0 *a1)
{
    unsigned int v2;  // w9
    unsigned long long v3;  // x9
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = v2 ^ v2 * 0x2000 ^ (v2 ^ v2 * 0x2000) >> 0x11;
    a1->field_10 = (unsigned int)v3 ^ (unsigned int)v3 * 32;
    if (!(v3 & 1))
    {
        a1->field_8 = a1->field_8 + 1;
        return a0;
    }
    v4 = sub_a66994(a1->field_0, a0);
    if (!v4)
        return v4;
    (*(long long *)(v4 + 32))();
}
