/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb12604..0xb12690 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b12604_0 {
    char padding_0[8];
    long long field_8;
} st_b12604_0;

typedef struct st_b12604_1 {
    char padding_0[264];
    struct st_b12604_0 *field_108;
    unsigned long long field_110;
} st_b12604_1;


unsigned long long sub_b12604(st_b12604_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b26c80(a0->field_108->field_8);
    if (a2 != 8)
    {
        return 0;
    }
    else if (v2)
    {
        goto *((void *)(v2));
    }
    else
    {
        return 0;
    }
}
