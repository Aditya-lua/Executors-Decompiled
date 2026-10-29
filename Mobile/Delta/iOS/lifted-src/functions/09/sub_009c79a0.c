/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c79a0..0x9c79e8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c79a0_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_9c79a0_0;


unsigned long long sub_9c79a0(st_9c79a0_0 *a0, long long a1, unsigned int a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6c2e4(a0->field_8, "crypto/asn1/asn1_lib.c", 341);
    a0->field_8 = a1;
    a0->field_0 = a2;
    return v2;
}
