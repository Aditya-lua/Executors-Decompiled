/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1baa8..0xa1bafc (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1baa8_0 {
    char padding_0[4];
    unsigned int field_4;
} st_a1baa8_0;

typedef struct st_a1baa8_1 {
    struct st_a1baa8_0 *field_0;
    char padding_8[64];
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    unsigned int field_54;
    unsigned int field_58;
} st_a1baa8_1;


long long sub_a1baa8(st_a1baa8_1 *a0)
{
    if (a0->field_0->field_4 != 407)
    {
        return 0;
    }
    else if (!a0->field_48)
    {
        return 0;
    }
    else if (!a0->field_4c)
    {
        return 0;
    }
    else if (!a0->field_50)
    {
        return 682;
    }
    else if (!a0->field_54)
    {
        return 0;
    }
    else if (!a0->field_58)
    {
        return 683;
    }
    else
    {
        return 0;
    }
}
