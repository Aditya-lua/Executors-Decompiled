/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956690..0x956720 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956690_0 {
    struct st_956690_0 *field_0;
    char padding_8[452];
    struct st_956690_0 *field_1cc;
    unsigned long long field_1d0;
} st_956690_0;


double sub_956690(st_956690_0 *a0, st_956690_0 *a1)
{
    unsigned long v5;  // d0
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long v9;  // d0
    unsigned long v10;  // d0
    unsigned long v11;  // d0
    unsigned long v12;  // d0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return v12;
    if ((int)a0->field_0 || !*(int *)&(a0->padding_8)[1])
        return v5;
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    if (!sub_9929fc(&a0[6].padding_8[272]) && !sub_992a48(&a0[6].padding_8[272]) && (a1 || !sub_9a5694(a0)))
    {
        sub_9a57c8(a0);
        *(unsigned int *)&(a0->padding_8)[1] = 0;
        v9 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(*(unsigned long long *)&*(double *)&a0->field_1cc, _mm_set_epi32(0, 0, 1, 1)));
        a0->field_1cc = v9;
        return v10;
    }
    return v11;
    return v5;
}
