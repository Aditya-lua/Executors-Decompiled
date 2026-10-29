/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9568a0..0x9568f8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9568a0_1 {
    char padding_0[216];
    struct st_9568a0_0 *field_d8;
} st_9568a0_1;

typedef struct st_9568a0_2 {
    char padding_0[28];
    unsigned short field_1c;
    char padding_1e[34];
    unsigned int field_40;
} st_9568a0_2;

typedef struct st_9568a0_3 {
    char padding_0[24];
    struct st_9568a0_1 *field_18;
    char padding_20[736];
    struct st_9568a0_2 *field_300;
} st_9568a0_3;

typedef struct st_9568a0_0 {
    char padding_0[80];
    char field_50;
} st_9568a0_0;


unsigned long long sub_9568a0(st_9568a0_3 *a0)
{
    st_9568a0_2 *v0;  // x9
    unsigned long long v1;  // x0

    v0 = a0->field_300;
    if (!v0)
        return 0xffffffffffffffff;
    v1 = v0->field_40;
    if (!(a0->field_18->field_d8->field_50 >> 2 & 1))
    {
        if (!(v0->field_1c & 456))
        {
            return v1;
        }
        else if ((unsigned int)v1 == 0x505)
        {
            return 0x909;
        }
        else
        {
            return v1;
        }
    }
    else
    {
        if ((unsigned int)v1 != 0x909)
            return v1;
        return 0x404;
    }
}
