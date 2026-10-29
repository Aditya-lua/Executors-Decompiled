/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981250..0x9812b8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981250_0 {
    char padding_0[48];
    long long field_30;
    long long field_38;
    char padding_40[90];
    unsigned short field_9a;
} st_981250_0;


unsigned short sub_981250(st_981250_0 *a0, unsigned int a1)
{
    unsigned int v2;  // w0
    unsigned short v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 && !(a0->field_9a >> 8 & 1))
        return 0;
    v2 = sub_9812b8(a0, a0->field_30, 0);
    if (!sub_9812b8(a0, a0->field_38, 1))
        v3 = 0;
    else
        v3 = v2;
    a0->field_9a = a0->field_9a & 0xfffffeff;
    return v3;
}
