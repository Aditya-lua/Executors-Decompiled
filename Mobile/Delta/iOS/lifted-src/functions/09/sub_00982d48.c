/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982d48..0x982de8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982d48_0 {
    char padding_0[40];
    struct st_982d48_1 *field_28;
} st_982d48_0;

typedef struct st_982d48_1 {
    unsigned long long field_0;
} st_982d48_1;


void sub_982d48(st_982d48_0 *a0, unsigned long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v0 = 0;
    v1 = 0;
    a0->field_28();
}
