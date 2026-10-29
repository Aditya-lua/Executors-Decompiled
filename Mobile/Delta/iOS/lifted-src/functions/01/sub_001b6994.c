/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6994..0x1b6a4c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6994_1 {
    struct st_1b6994_2 *field_0;
    struct st_1b6994_3 *field_8;
    struct st_1b6994_3 *field_10;
    struct st_1b6994_2 *field_18;
} st_1b6994_1;

typedef struct st_1b6994_2 {
    unsigned int field_0;
} st_1b6994_2;

typedef struct st_1b6994_3 {
    long long field_0;
} st_1b6994_3;

typedef struct st_1b6994_0 {
    char field_0;
} st_1b6994_0;


long long sub_1b6994(st_1b6994_1 *a0)
{
    long long count;  // x0
    long long count1;  // x0
    st_1b6994_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1b6994_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    count = _send(*(int *)a0->field_0, *(long long *)a0->field_8, *(long long *)a0->field_10, *(int *)a0->field_18);
    if (count >= 0)
    {
        return count;
    }
    else if (*(int *)___error() == 4)
    {
        while (1)
        {
            v2 = 1;
            sub_1adc88(&v2);
            count1 = _send(*(int *)a0->field_0, *(long long *)a0->field_8, *(long long *)a0->field_10, *(int *)a0->field_18);
            if (count1 >= 0)
            {
                return count1;
            }
            else if (*(int *)___error() != 4)
            {
                return count1;
            }
        }
    }
    else
    {
        return count;
    }
}
