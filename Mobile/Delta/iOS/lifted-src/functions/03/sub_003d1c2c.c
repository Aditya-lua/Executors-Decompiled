/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d1c2c..0x3d1d64 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


float sub_3d1c2c(unsigned int *ptr, char *a1, int a2)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w8
    float v4;  // s0
    float v5;  // s0
    float v7;  // s0
    float v8;  // s0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1[3];
    if (v2)
    {
        _ldexpf(v2 - 0x88);
        v3 = *a1;
        if (2 >= a2)
        {
            v4 = (float)(a1[1] + v3 + a1[2]) / 3.0f;
            *(float *)ptr = v4;
            if (a2 == 4)
            {
                ptr[3] = 0x3f800000;
                return v4;
            }
        }
        else
        {
            *(float *)ptr = (float)v3;
            *(float *)&ptr[1] = (float)(unsigned int)(uint128_t)a1[1];
            v4 = (float)(unsigned int)(uint128_t)a1[2];
            *(float *)&ptr[2] = v4;
            if (a2 == 4)
            {
                ptr[3] = 0x3f800000;
                return v4;
            }
        }
        if (a2 != 2)
            return v4;
        ptr[1] = 0x3f800000;
        return v4;
    }
    else if (2 >= a2)
    {
        if (a2 != 1)
        {
            if (a2 != 2)
                return v5;
            ptr[1] = 0x3f800000;
        }
        *ptr = 0;
        return v8;
    }
    else
    {
        if (a2 != 3)
        {
            if (a2 != 4)
                return v7;
            ptr[3] = 0x3f800000;
        }
        memset(ptr, 0, 12);
        return v8;
    }
}
