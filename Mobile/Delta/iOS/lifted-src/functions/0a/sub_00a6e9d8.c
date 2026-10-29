/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e9d8..0xa6ea2c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e9d8_0 {
    char padding_0[48];
    char field_30;
} st_a6e9d8_0;


char sub_a6e9d8(st_a6e9d8_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // w0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a3 && a0->field_30 & 1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_c68684();
    if (!v8)
        return v8;
    if (!*a2)
        return 1;
    *a2 = *a2 + a3;
    return 1;
}
