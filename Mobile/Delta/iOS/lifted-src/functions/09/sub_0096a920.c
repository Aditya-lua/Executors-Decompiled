/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a920..0x96a9b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a920_0 {
    char padding_0[72];
    int field_48;
    char padding_4c[2405];
    char field_9b1;
} st_96a920_0;

typedef struct st_96a920_1 {
    char padding_0[648];
    unsigned long long field_288;
} st_96a920_1;


int sub_96a920(st_96a920_0 *a0, st_96a920_1 *a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned long long *)a2 = 0;
    *(unsigned int *)&a0[1].padding_4c[98] = 0;
    if (a0->field_48 < 769)
    {
        return 2;
    }
    else if (a0->field_9b1 >> 6 & 1)
    {
        return 2;
    }
    else if (!sub_959e54())
    {
        return 2;
    }
    else if (!*(int *)(a1->field_288 + 0x100))
    {
        return 2;
    }
}
