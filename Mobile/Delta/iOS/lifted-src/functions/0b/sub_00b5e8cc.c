/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e8cc..0xb5e94c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e8cc_0 {
    char padding_0[56];
    unsigned long long field_38;
    char padding_40[96];
    unsigned int field_a0;
} st_b5e8cc_0;


int sub_b5e8cc(st_b5e8cc_0 *a0, unsigned long a1, long long a2, unsigned long a3)
{
    unsigned int v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0->field_a0;
    if (a0->field_38)
        sub_a947f4(a2);
    else
        sub_a94558(a2);
    a0->field_a0 = v0;
    return 1;
}
