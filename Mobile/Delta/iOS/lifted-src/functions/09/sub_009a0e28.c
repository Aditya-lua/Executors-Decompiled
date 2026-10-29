/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0e28..0x9a0e78 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a0e28_1 {
    char padding_0[128];
    struct st_9a0e28_0 *field_80;
    unsigned long long field_88;
} st_9a0e28_1;

typedef struct st_9a0e28_2 {
    char padding_0[344];
    struct st_9a0e28_1 *field_158;
} st_9a0e28_2;

typedef struct st_9a0e28_0 {
    unsigned short field_0;
    char padding_2[2];
    unsigned int field_4;
} st_9a0e28_0;


unsigned long long sub_9a0e28(st_9a0e28_2 *a0, unsigned int a1)
{
    unsigned long long v0;  // x8
    unsigned int *v1;  // x9
    unsigned long long v2;  // x8

    v0 = a0->field_158->field_88;
    if (!a0->field_158->field_88)
        return 0;
    v1 = &a0->field_158->field_80->field_4;
    while (1)
    {
        v2 = v0;
        if (*(short *)((char *)v1 - 4) == a1 && (*v1 | 2) == 2)
            return 1;
        v1 += 14;
        v0 = v2 - 1;
        if (v2 == 1)
            return 0;
    }
}
