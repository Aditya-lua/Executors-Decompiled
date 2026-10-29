/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5788..0x9c58c4 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5788_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_9c5788_0;


unsigned long long sub_9c5788(st_9c5788_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    st_9c5788_0 *v1;  // x8
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8

    if (!a0)
    {
        if (128 > a2)
            return 1;
        a1 = 4;
    }
    else if (a1 < 1)
    {
        return 0xffffffff;
    }
    else if (127 >= a2)
    {
        a0->field_0 = a2;
        return 1;
    }
    if (0x7ff >= a2)
    {
        if (2 <= a1)
            v0 = 2;
        else
            v0 = 0xffffffff;
        if (!a0)
        {
            return v0;
        }
        else if (a1 >= 2)
        {
            a0->field_0 = (char)a2 * 0 | (char)(a2 >> 6) | 192;
            a0->field_1 = 128 | (128 | (char)a2 & 63) & 63;
            return 2;
        }
        else
        {
            return v0;
        }
    }
    else
    {
        v1 = a2 >> 16;
        if (!v1)
        {
            if ((a2 & 0xf800) != 0xd800)
            {
                if (3 <= a1)
                    v2 = 3;
                else
                    v2 = 0xffffffff;
                if (!a0)
                {
                    return v2;
                }
                else if (a1 >= 3)
                {
                    a0->field_0 = (char)a2 * 0 | (char)(a2 >> 12) | 224;
                    a0->field_1 = 128 | (128 | (char)(__ROL__((unsigned int)a2, 26)) & 63) & 63;
                    a0->field_2 = 128 | (128 | (char)a2 & 63) & 63;
                    return 3;
                }
                else
                {
                    return v2;
                }
            }
            else
            {
                return 0xfffffffe;
            }
        }
        else
        {
            if (16 >= v1)
            {
                if (4 <= a1)
                    v3 = 4;
                else
                    v3 = 0xffffffff;
                if (!a0 || a1 < 4)
                    return v3;
                a0->field_0 = (char)a2 * 0 | (char)(a2 >> 18) | 240;
                a0->field_1 = 128 | (128 | (char)(__ROL__((unsigned int)a2, 20)) & 63) & 63;
                a0->field_2 = 128 | (128 | (char)(__ROL__((unsigned int)a2, 26)) & 63) & 63;
                a0->field_3 = 128 | (128 | (char)a2 & 63) & 63;
                return v3;
            }
            else
            {
                return 0xfffffffe;
            }
        }
    }
}
