/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e774..0xb5e7d4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e774_0 {
    char padding_0[160];
    unsigned int field_a0;
} st_b5e774_0;


int sub_b5e774(st_b5e774_0 *a0, unsigned long a1, long long a2, unsigned long a3)
{
    unsigned int v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0->field_a0;
    sub_a94484(a2);
    a0->field_a0 = v0;
    return 1;
}
