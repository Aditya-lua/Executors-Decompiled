/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5164..0xb5198 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5164_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_b5164_0;


long long sub_b5164(st_b5164_0 *a0)
{
    unsigned int v0;  // w9
    char v1;  // x8

    v0 = a0->field_4;
    if (a0->field_8 < v0)
        v1 = a0->field_8;
    else
        v1 = v0;
    if (a0->field_0 != 1)
        return 0;
    return (1 << ((char)(v0 - v1) & 63)) + (8 << ((char)v0 & 63));
}
