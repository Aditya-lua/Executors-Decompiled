/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2814..0x9b2894 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b2814_1 {
    int field_0;
    char padding_4[212];
    struct st_9b2814_0 *field_d8;
} st_9b2814_1;

typedef struct st_9b2814_3 {
    char padding_0[24];
    struct st_9b2814_1 *field_18;
    char padding_20[736];
    struct st_9b2814_2 *field_300;
    char padding_308[1608];
    unsigned int field_950;
    char padding_954[596];
    unsigned int field_ba8;
    char padding_bac[20];
    int field_bc0;
} st_9b2814_3;

typedef struct st_9b2814_2 {
    char padding_0[32];
    unsigned int field_20;
} st_9b2814_2;

typedef struct st_9b2814_0 {
    char padding_0[80];
    char field_50;
} st_9b2814_0;


unsigned long long sub_9b2814(st_9b2814_3 *a0)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x8

    v0 = a0->field_950;
    if (!(v0 & 1))
        return 0;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && v0 >> 3 & 1 && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && a0->field_ba8 != 3)
        return 0;
    if (v0 >> 2 & 1 && a0->field_bc0 > 0)
        return 0;
    if (a0->field_300->field_20 & 4)
        v1 = ((unsigned int)v0 * 0x80000000 | (unsigned int)v0 >> 1) & 0x80000001 & 1;
    else
        v1 = 1;
    if (a0->field_300->field_20 & 80)
    {
        return 0;
    }
    else if (!(v1 & 1))
    {
        return 0;
    }
    else
    {
        return 1;
    }
}
