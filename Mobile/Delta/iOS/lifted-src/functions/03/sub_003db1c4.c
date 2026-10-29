/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3db1c4..0x3db220 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3db1c4_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_3db1c4_0;

typedef struct st_3db1c4_1 {
    struct st_3db1c4_0 *field_0;
} st_3db1c4_1;


void sub_3db1c4(st_3db1c4_1 **a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_413fa0(a0 + 2, a0 + 10);
    goto *((void *)(*(long long *)(*(long long *)*a0 + 8)));
}
