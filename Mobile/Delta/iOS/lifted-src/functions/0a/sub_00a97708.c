/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97708..0xa97754 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97708_0 {
    char padding_0[48];
    unsigned long long field_30;
    char padding_38[32];
    long long field_58;
} st_a97708_0;


void sub_a97708(st_a97708_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a6c4e8(a0->field_58, a0->field_30 * 16, "crypto/modes/ocb128.c", 558);
}
