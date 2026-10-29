/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb15f44..0xb15fd0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b15f44_0 {
    char padding_0[16];
    long long field_10;
} st_b15f44_0;

typedef struct st_b15f44_1 {
    char padding_0[264];
    struct st_b15f44_0 *field_108;
    unsigned long long field_110;
} st_b15f44_1;


unsigned long long sub_b15f44(st_b15f44_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b26c80(a0->field_108->field_10);
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
