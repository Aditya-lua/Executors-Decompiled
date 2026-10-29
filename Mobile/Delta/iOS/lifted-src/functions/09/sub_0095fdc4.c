/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fdc4..0x95fe78 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fdc4_1 {
    unsigned int field_0;
    char padding_4[20];
    struct st_95fdc4_0 *field_18;
} st_95fdc4_1;

typedef struct st_95fdc4_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_95fdc4_0;


unsigned long long sub_95fdc4(st_95fdc4_1 *a0)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x8
    unsigned long long v4;  // x0
    unsigned long long idx;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = a0->field_0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
        {
            v3 = 0;
            v4 = a0;
        }
        else
        {
            v3 = sub_980dc8();
            v4 = a0;
            v2 = a0->field_0;
            if (v2 >> 7 & 1)
                goto *((void *)(a0->field_18->field_48));
        }
        a0 = v3;
        if (!a0)
            return 0;
    }
    else
    {
        v4 = a0;
    }
    if (!*(long long *)&a0[3].padding_4[12])
    {
        if (!(unsigned int)v2)
            idx = v4;
        else
            idx = 0;
        *(unsigned int *)(idx + 120) = 0;
        *(unsigned int *)(idx + 132) = 0;
        sub_9a575c();
        *(long long *)(idx + 112) = *(long long *)(*(long long *)(v4 + 24) + 72);
        sub_99206c(idx + 3160);
    }
}
