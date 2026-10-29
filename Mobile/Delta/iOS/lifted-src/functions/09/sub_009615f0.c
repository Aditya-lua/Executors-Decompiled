/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9615f0..0x961650 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9615f0_0 {
    unsigned int field_0;
    char padding_4[1204];
    unsigned long long field_4b8;
    unsigned int field_4c0;
} st_9615f0_0;


void sub_9615f0(st_9615f0_0 *a0, unsigned long a1, unsigned int *a2)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && !(v2 = a0->field_0, (unsigned int)v2 && (!(v2 >> 7 & 1) || (a0 = sub_980dc8(), a1 = a1, a2 = a2, !a0))))
    {
        v3 = a0->field_4b8;
        *(unsigned long *)a1 = v3;
        if (v3)
            v3 = a0->field_4c0;
    }
    else
    {
        v3 = 0;
        *(unsigned long long *)a1 = 0;
    }
    *a2 = v3;
    return;
}
