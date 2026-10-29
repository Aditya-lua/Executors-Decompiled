/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a1ac..0xa5a1f8 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5a1ac_0 {
    char padding_0[144];
    struct st_a5a1ac_0 *field_90;
} st_a5a1ac_0;

typedef struct st_a5a1ac_2 {
    unsigned int field_0;
    char padding_4[92];
    struct st_a5a1ac_0 *field_60;
} st_a5a1ac_2;

typedef struct st_a5a1ac_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a5a1ac_0 *field_8;
    char padding_10[80];
    struct st_a5a1ac_0 *field_60;
} st_a5a1ac_1;


unsigned int sub_a5a1ac(st_a5a1ac_1 *a0, st_a5a1ac_2 *a1)
{
    if (!a0->field_60 && !a1->field_60)
    {
        if (a0->field_0 != a1->field_0)
        {
            return 0xffffffff;
        }
        else if (!a0->field_8)
        {
            return 0xfffffffe;
        }
        else if (a0->field_8->field_90)
        {
            goto *((void *)(a0->field_8->field_90));
        }
        else
        {
            return 0xfffffffe;
        }
    }
}
