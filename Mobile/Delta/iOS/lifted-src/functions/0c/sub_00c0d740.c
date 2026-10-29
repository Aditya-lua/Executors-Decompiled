/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d740..0xc0d8fc (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c0d850;

double sub_c0d740(void* a0, char *a1, char *a2)
{
    unsigned long v3;  // x10
    unsigned long long v4;  // x11
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    unsigned long v7;  // x12
    unsigned long long v8;  // d0
    char *v0;  // [bp-0x10]
    unsigned long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a2)
    {
        v3 = *a1;
        if (!(v3 >> 31 & 1))
        {
            v4 = 0;
            v5 = 0;
            v6 = 1;
            goto LABEL_c0d758;
        }
        else if (a2 != 1)
        {
            v5 = v3 & 0xff & 127;
            v3 = a1[1];
            if (!(v3 >> 31 & 1))
            {
                v4 = 7;
                v6 = 2;
            }
            else
            {
                if (a2 == 2)
                {
                    *(uint128_t *)a0 = 0x10000000000000000;
                    return 0;
                }
                v5 = v5 & 0xffffffffffffc000 | (v5 & 0xffffffffffffc07f | (v3 * 128 | v3 >> 57) & 16256) & 0x3fff;
                v3 = a1[2];
                if (!(v3 >> 31 & 1))
                {
                    v4 = 14;
                    v6 = 3;
                }
                else
                {
                    if (a2 == 3)
                    {
                        *(uint128_t *)a0 = 0x10000000000000000;
                        return 0;
                    }
                    v5 = v5 & 0xffffffffffe00000 | (v5 & 0xffffffffffe03fff | (v3 * 0x4000 | v3 >> 50) & 0x1fc000) & 0x1fffff;
                    v3 = a1[3];
                    if (!(v3 >> 31 & 1))
                    {
                        v4 = 21;
                        v6 = 4;
                    }
                    else
                    {
                        if (a2 == 4)
                        {
                            *(uint128_t *)a0 = 0x10000000000000000;
                            return 0;
                        }
                        v5 = v5 & 0xfffffffff0000000 | (v5 & 0xfffffffff01fffff | (v3 * 0x200000 | v3 >> 43) & 0xfe00000) & 0xfffffff;
                        v3 = a1[4];
                        if (!(v3 >> 31 & 1))
                        {
                            v4 = 28;
                            v6 = 5;
                        }
                        else
                        {
                            if (a2 == 5)
                            {
                                *(uint128_t *)a0 = 0x10000000000000000;
                                return 0;
                            }
                            v5 = v5 & 0xfffffff800000000 | (v5 & 0xfffffff80fffffff | (v3 * 0x10000000 | v3 >> 36) & 0x7f0000000) & 0x7ffffffff;
                            v3 = a1[5];
                            if (v3 >> 31 & 1)
                                goto LABEL_c0d850;
                            v4 = 35;
                            v6 = 6;
                        }
                    }
                }
            }
            while (1)
            {
LABEL_c0d758:
                if (a2 >= v6)
                {
                    *(char **)&a0[16] = &a2[-1 * v6];
                    *(unsigned long long *)&a0[24] = (int)v3 << (v4 & 63) | v5;
                    *(unsigned long long *)a0 = 3;
                    *(char **)&a0[8] = &a1[v6];
                    return v8;
                }
                v0 = &v2;
                v1 = x30;
                a1 = a2;
                x30 = (int)&g_c0d850;
                a0 = sub_c73bb0(v6, a1);
LABEL_c0d850:
                if (a2 == 6)
                    break;
                v5 |= ((unsigned int)v3 & 127) * 0x800000000;
                v3 = a1[6];
                if (!(v3 >> 31 & 1))
                {
                    v4 = 42;
                    v6 = 7;
                }
                else
                {
                    if (a2 == 7)
                        break;
                    v5 |= ((unsigned int)v3 & 127) * 0x40000000000;
                    v3 = a1[7];
                    if (!(v3 >> 31 & 1))
                    {
                        v4 = 49;
                        v6 = 8;
                    }
                    else
                    {
                        if (a2 == 8)
                            break;
                        v5 |= ((unsigned int)v3 & 127) * 0x2000000000000;
                        v3 = a1[8];
                        if (!(v3 >> 31 & 1))
                        {
                            v4 = 56;
                            v6 = 9;
                        }
                        else
                        {
                            if (a2 == 9)
                                break;
                            v7 = a1[9];
                            if (v7 >> 31 & 1)
                            {
                                *(unsigned long long *)a0 = 1;
                                *(char **)&a0[8] = a1;
                                *(char **)&a0[16] = a2;
                                *(char *)&a0[24] = 47;
                                return v8;
                            }
                            v5 |= ((unsigned int)v3 & 127) * 0x100000000000000;
                            v4 = 63;
                            v6 = 10;
                            v3 = v7;
                        }
                    }
                }
            }
        }
    }
    *(uint128_t *)a0 = 0x10000000000000000;
    return 0;
}
