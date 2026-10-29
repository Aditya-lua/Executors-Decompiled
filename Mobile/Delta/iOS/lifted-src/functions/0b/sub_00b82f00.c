/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb82f00..0xb82f98 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b82f00_0 {
    long long field_0;
    struct st_b82f00_0 *field_8;
    char field_10;
} st_b82f00_0;

typedef struct st_b82f00_1 {
    struct st_b82f00_0 *field_0;
    char field_8;
} st_b82f00_1;


long long sub_b82f00(st_b82f00_1 *a0)
{
    st_b82f00_0 *v0;  // x8
    long long v1;  // x9

    if (a0->field_8)
        return 1;
    while (1)
    {
        v0 = a0->field_0;
        v1 = v0->field_0;
        if (v1 != 8)
            break;
        a0 = &v0->field_8;
        if (v0->field_10)
            return 1;
    }
    if (v1 > 4)
    {
        if (8 >= v1)
        {
            if (v1 != 5)
            {
                if (v1 != 6)
                    return 1;
                return 0;
            }
        }
        else
        {
            if (v1 != 9)
            {
                if (v1 == 10)
                    return 0;
                return v0->field_8 != 0x8000000000000000;
            }
        }
    }
    else
    {
        if ((unsigned long long)(v1 - 1) < 3)
            return 1;
        return 0;
    }
}
