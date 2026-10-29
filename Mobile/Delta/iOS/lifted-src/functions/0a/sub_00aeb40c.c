/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb40c..0xaeb448 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb40c_1 {
    char padding_0[233];
    char field_e9;
} st_aeb40c_1;

typedef struct st_aeb40c_0 {
    char padding_0[232];
    unsigned int field_e8;
    char field_ec;
} st_aeb40c_0;


unsigned long long sub_aeb40c(st_aeb40c_0 *a0, st_aeb40c_1 *a1)
{
    unsigned long v0;  // x8

    v0 = a0->field_e8;
    if (!(a1->field_e9 >> 2 & 1))
    {
        if (!(v0 >> 1 & 1))
        {
            return 0;
        }
        else if (!(a0->field_ec >> 2 & 1))
        {
            return 32;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if (!(v0 >> 1 & 1))
        {
            return 0;
        }
        else if ((char)a0->field_ec >= 0)
        {
            return 39;
        }
        else
        {
            return 0;
        }
    }
}
