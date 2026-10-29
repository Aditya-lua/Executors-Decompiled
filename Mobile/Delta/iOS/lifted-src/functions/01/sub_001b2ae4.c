/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2ae4..0x1b2b74 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2ae4_0 {
    char padding_0[8];
    long long field_8;
} st_1b2ae4_0;


st_1b2ae4_0 * sub_1b2ae4(long long a0, st_1b2ae4_0 *a1)
{
    long long v3;  // x0
    unsigned long long v4;  // x0
    long long v5;  // x1
    char v0;  // [bp-0x31]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a0c8(a1 + 1);
    v4 = sub_a0c8(a1 + 1);
    v5 = sub_1a1bc(&v0, v3, v4 + sub_6b08(a1 + 1) - v3);
    a1->field_8 = v5;
    sub_1b08ec(a0, a1, sub_1a8b20(a0, v5, a1 + 1));
    return a1;
}
