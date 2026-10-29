/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa53c54..0xa53c94 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a53c54_0 {
    char padding_0[96];
    unsigned long long field_60;
} st_a53c54_0;


int sub_a53c54(st_a53c54_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_60)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a79f54(sub_954340());
    goto *((void *)(a0->field_60));
}
