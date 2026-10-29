/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa608b8..0xa609cc (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a608b8_0 {
    char padding_0[8];
    long long field_8;
} st_a608b8_0;


unsigned long long sub_a608b8(long long a0, st_a608b8_0 *a1, unsigned long long a2, unsigned long long a3, long long a4)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // w0
    unsigned long long v4;  // w8
    unsigned long long v5;  // x21
    unsigned long long v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = (unsigned int)sub_9e46a8(a1->field_8);
    if (!a3)
    {
        sub_9e48d4(0);
        return 0;
    }
    if ((unsigned int)v2)
    {
        v4 = a3 * 2;
    }
    else
    {
        v4 = a3 * 2;
        if (!(int)a1[5].field_8)
            v2 = v4;
        else
            v2 = (unsigned int)a1[5].field_8;
    }
    if ((int)v2 < v4)
    {
        return 0;
    }
    else if (v3 >= (int)v2)
    {
        v5 = sub_9e4958();
        if (v5 && sub_9ea668(v5, sub_9e4624(), v2))
        {
            v6 = v5;
            if ((int)sub_9e5528(v6, a1->field_8) >= 1)
                v6 = a1->field_8;
            while (sub_9e93c8(a4, v5, 0, a0) && sub_9eb9e0(a4, 1))
            {
                if (sub_9e5528(a4, v6) >> 31 & 1)
                {
                    sub_9e48d4(v5);
                    return 1;
                }
            }
        }
        sub_9e48d4(v5);
        return 0;
    }
    else
    {
        return 0;
    }
}
