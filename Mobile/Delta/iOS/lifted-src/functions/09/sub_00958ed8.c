/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958ed8..0x958f34 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958ed8_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_958ed8_0 *field_8;
} st_958ed8_1;

typedef struct st_958ed8_0 {
    char padding_0[296];
    unsigned long long field_128;
} st_958ed8_0;


unsigned long long sub_958ed8(st_958ed8_1 *a0)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = a0->field_0;
    v3 = a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            return 0;
        v3 = sub_980dc8();
        if (!v3)
            return v3;
    }
    if (*(long long *)(v3 + 2464))
        return *(long long *)(v3 + 2464);
    return a0->field_8->field_128;
}
