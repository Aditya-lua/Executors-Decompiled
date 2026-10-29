/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf51d0..0xaf5208 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af51d0_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_af51d0_0;


int sub_af51d0(st_af51d0_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af5208();
    if (!v2)
        return v2;
    a0->field_100 = a2;
    return 1;
}
