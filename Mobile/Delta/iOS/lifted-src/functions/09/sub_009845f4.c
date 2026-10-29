/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9845f4..0x984644 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9845f4_0 {
    char padding_0[168];
    char field_a8;
    char padding_a9[847];
    unsigned long long field_3f8;
    char padding_400[16];
    unsigned long long field_410;
} st_9845f4_0;


unsigned long long sub_9845f4(st_9845f4_0 *a0, unsigned long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_984b64(&a0->field_a8, 3);
    if (!(unsigned int)v2)
        return v2;
    a0->field_3f8 = a1;
    if (!a0->field_410)
        return v2;
    goto *((void *)(a0->field_410));
}
