/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd8cc8..0xbd8d30 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd8cc8_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_bd8cc8_0;


unsigned long long sub_bd8cc8(st_bd8cc8_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b9f1a4(a0->field_10, a0->field_18);
    if (!a0->field_8)
        return v2;
    return _free();
}
