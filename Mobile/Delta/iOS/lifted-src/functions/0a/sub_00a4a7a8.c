/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4a7a8..0xa4a874 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4a7a8_0 {
    char padding_0[136];
    unsigned long long field_88;
} st_a4a7a8_0;


unsigned long long sub_a4a7a8(long long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v3;  // x24
    st_a4a7a8_0 *v4;  // x0
    st_a4a7a8_0 *v5;  // x23
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a507d0();
    v4 = sub_9ffdd8(a0);
    if (v3 >> 31 & 1)
        return 0;
    v5 = v4;
    v0 = v3;
    sub_a507c8(a0);
    if (v4->field_88)
        sub_a947f4(a2, a1, a3, v5, a0 + 40);
    else
        sub_a94558(a2, a1, a3, v5, a0 + 40);
    sub_a50868(a0, v0);
    return 1;
}
