/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a950..0xa2a984 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2a950_0 {
    char padding_0[80];
    unsigned long long field_50;
    long long field_58;
} st_a2a950_0;


unsigned long long sub_a2a950(st_a2a950_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ce80(a0->field_58, "crypto/ec/ecx_key.c", 105);
    a0->field_50 = v2;
    return v2;
}
