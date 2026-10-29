/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988ae8..0x988b64 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988ae8_0 {
    long long field_0;
    long long field_8;
    char padding_10[16];
    char field_20;
    char padding_21[23];
    char field_38;
    char padding_39[23];
    char field_50;
} st_988ae8_0;


void sub_988ae8(st_988ae8_0 *a0)
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
    sub_991a44(&a0->field_20);
    sub_991a44(&a0->field_38);
    if (!(a0->field_50 >> 3 & 1))
        sub_a6c2e4(a0->field_0, "include/internal/ring_buf.h", 60);
    else
        sub_a6c4e8(a0->field_0, a0->field_8, "include/internal/ring_buf.h", 58);
    a0->field_0 = 0;
    a0->field_8 = 0;
    sub_a6c2e4();
    return;
}
