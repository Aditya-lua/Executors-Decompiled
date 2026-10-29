/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab7fd0..0xab8028 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab7fd0_1 {
    char padding_0[136];
    long long field_88;
} st_ab7fd0_1;

typedef struct st_ab7fd0_0 {
    char padding_0[56];
    unsigned long long field_38;
} st_ab7fd0_0;


long long sub_ab7fd0(st_ab7fd0_0 *a0, st_ab7fd0_1 *a1)
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

    if (!a0->field_38)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a1->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
        a0->field_38 = v8;
        return v8 != 0;
    }
    return 1;
}
