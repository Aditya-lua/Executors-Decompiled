/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5604..0x9c5788 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5604_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_9c5604_0;


unsigned long long sub_9c5604(st_9c5604_0 *a0, unsigned long long a1, unsigned long long *a2)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // x8
    unsigned long v10;  // x9
    unsigned long v11;  // x11
    unsigned int v12;  // w8
    unsigned long long v13;  // x8
    unsigned long long v14;  // 4156
    unsigned int v2;  // w9
    unsigned int v3;  // w8
    unsigned int v4;  // w9
    unsigned int v5;  // w10
    unsigned int v6;  // w8
    unsigned int v7;  // w8
    unsigned long long v8;  // x8
    unsigned int v9;  // w10

    if (a1 < 1)
        return 0;
    v0 = a0->field_0;
    v1 = (unsigned int)v0 & 0xff;
    if (!(v0 >> 31 & 1))
    {
        *a2 = v1;
        return 1;
    }
    else if (((unsigned int)v1 >> 5 & 7) == 6)
    {
        if (a1 == 1)
            return 0xffffffff;
        v2 = a0->field_1;
        if ((v2 & 192) != 128)
            return 0xfffffffd;
        v3 = ((unsigned int)v1 * 64 | (unsigned int)v1 >> 26) & 1984 & 0x7ff;
        if (128 <= v3)
        {
            *a2 = v2 & 63 | v3;
            return 2;
        }
        return 0xfffffffc;
    }
    else
    {
        if (((unsigned int)v1 & 240) == 224)
        {
            if (3 > a1)
                return 0xffffffff;
            v4 = a0->field_1;
            if ((v4 & 192) != 128)
                return 0xfffffffd;
            v5 = a0->field_2;
            if ((v5 & 192) != 128)
                return 0xfffffffd;
            v6 = ((unsigned int)v1 * 0x1000 | (unsigned int)v1 >> 20) & 0xf000 & 0xffff;
            v7 = v6 & 0xfffff000 | (v6 & 0xfffff03f | (v4 * 64 | v4 >> 26) & 4032) & 0xfff;
            if (0x800 > v7)
                return 0xfffffffc;
            v8 = v7 | v5 & 63;
            if ((v8 & 0xf800) != 0xd800)
            {
                *a2 = v8;
                return 3;
            }
            return 0xfffffffe;
        }
        else
        {
            if (((unsigned int)v1 >> 3 & 31) != 30)
            {
                return 0xfffffffe;
            }
            else if (4 > a1)
            {
                return 0xffffffff;
            }
            else
            {
                v9 = a0->field_1;
                if ((v9 & 192) != 128)
                    return 0xfffffffd;
                v10 = a0->field_2;
                if (((unsigned int)v10 & 192) != 128)
                    return 0xfffffffd;
                v11 = a0->field_3;
                if (((unsigned int)v11 & 192) != 128)
                    return 0xfffffffd;
                v12 = __ROL__((unsigned int)v1, 18) & 0x1c0000 & 0x1fffff;
                v13 = v12 & 0xfffc0000 | (v12 & 0xfffc0fff | __ROL__(v9, 12) & 0x3f000) & 0x3ffff;
                v14 = arm64g_calculate_condition(33, (unsigned int)v13 - 0x110000, 0x100000, 0);
                if (v14 & 1)
                {
                    *a2 = v11 & 63 & 0xfffffffffffff000 | (v11 & 63 & 0xfffffffffffff03f | (v10 * 64 | v10 >> 58) & 4032) & 0xfff | v13;
                    return 4;
                }
                return 0xfffffffc;
            }
        }
    }
}
