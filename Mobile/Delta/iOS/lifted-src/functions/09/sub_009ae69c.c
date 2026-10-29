/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ae69c..0x9ae6f0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ae69c_1 {
    char padding_0[216];
    struct st_9ae69c_0 *field_d8;
} st_9ae69c_1;

typedef struct st_9ae69c_2 {
    char padding_0[24];
    struct st_9ae69c_1 *field_18;
} st_9ae69c_2;

typedef struct st_9ae69c_0 {
    char padding_0[80];
    char field_50;
} st_9ae69c_0;


unsigned long long sub_9ae69c(st_9ae69c_2 *a0, int a1, int a2)
{
    if (a1 == a2)
    {
        return 0;
    }
    else if (a0->field_18->field_d8->field_50 >> 3 & 1)
    {
        if (a1 == 0x100)
            a1 = 0xff00;
        if (a2 == 0x100)
            a2 = 0xff00;
        if (a2 >= a1)
            return 0;
        return 0xffffffff;
    }
    else if (a1 < a2)
    {
        return 0xffffffff;
    }
    else
    {
        return 0;
    }
}
