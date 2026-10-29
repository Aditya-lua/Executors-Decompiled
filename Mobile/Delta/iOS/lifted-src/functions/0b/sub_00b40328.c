/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb40328..0xb403d8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b40328_0 {
    char padding_0[24];
    unsigned long long field_18;
    long long field_20;
    long long field_28;
} st_b40328_0;


unsigned long long sub_b40328(st_b40328_0 *a0, st_b40328_0 *a1, unsigned int a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (a0->field_18 != a1->field_18)
    {
        return 0;
    }
    else if (a2 & 3)
    {
        v3 = *(int *)&a0[1].padding_0[0] != 0 ^ *(int *)&a1[1].padding_0[0] != 0 ^ 1;
        if (!*(int *)&a0[1].padding_0[0])
        {
            return v3;
        }
        else if (!*(int *)&a1[1].padding_0[0])
        {
            return v3;
        }
        else
        {
            v4 = sub_a5a588(a0->field_20, a1->field_20);
            if ((unsigned int)v4)
                return sub_a5a588(a0->field_28, a1->field_28) != 0;
            return v4;
        }
    }
    else
    {
        return 1;
    }
}
