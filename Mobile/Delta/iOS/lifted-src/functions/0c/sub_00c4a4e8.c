/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4a4e8..0xc4a724 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4a4e8_0 {
    char *field_0;
    unsigned long long field_8;
} st_c4a4e8_0;

typedef struct st_c4a4e8_1 {
    unsigned short field_0;
    char padding_2[6];
    char *field_8;
} st_c4a4e8_1;


st_c4a4e8_1 * sub_c4a4e8(st_c4a4e8_1 *a0, st_c4a4e8_0 *a1)
{
    char *v0;  // x9
    unsigned long long v1;  // x11
    char *v10;  // x12
    unsigned long long v11;  // x13
    unsigned long long v12;  // x13
    unsigned long long v13;  // x13
    unsigned long long v14;  // x12
    char *v15;  // x10
    unsigned long v16;  // x13
    unsigned long long v17;  // x12
    unsigned long v18;  // x13
    unsigned long long v19;  // x12
    unsigned long long v2;  // x13
    unsigned long v20;  // x13
    unsigned long long v21;  // x12
    unsigned long v22;  // x13
    unsigned long long v23;  // x9
    char *v3;  // x12
    unsigned long v4;  // x10
    char *v5;  // x12
    unsigned long long v6;  // x8
    unsigned long long v7;  // w9
    unsigned long long v8;  // x11
    unsigned long long v9;  // x13

    v0 = a1->field_0;
    v1 = a1->field_8;
    if (!v1)
    {
        a0->field_0 = 19;
        *(unsigned short *)&a0->padding_2[4] = 0;
        *(unsigned int *)&a0->padding_2[0] = 0;
        a0->field_8 = v0;
        return a0;
    }
    v2 = v1 - 1;
    v3 = v0;
    v4 = *v3;
    v5 = v3 + 1;
    a1->field_0 = v5;
    a1->field_8 = v2;
    v6 = v4 & 127;
    if (!(v4 >> 7 & 1))
    {
        v7 = 1;
        v8 = 7;
    }
    else if (v2)
    {
        v9 = v1 - 2;
        v10 = v0 + 2;
        a1->field_0 = v10;
        a1->field_8 = v9;
        v4 = v0[1];
        v6 = v6 & 0xffffffffffffc000 | (v6 & 0xffffffffffffc07f | (v4 * 128 | v4 >> 57) & 16256) & 0x3fff;
        if (!(v4 >> 7 & 1))
        {
            v7 = 1;
            v8 = 14;
        }
        else if (v9)
        {
            v11 = v1 - 3;
            v10 = v0 + 3;
            a1->field_0 = v10;
            a1->field_8 = v11;
            v4 = v0[2];
            v6 = v6 & 0xffffffffffe00000 | (v6 & 0xffffffffffe03fff | (v4 * 0x4000 | v4 >> 50) & 0x1fc000) & 0x1fffff;
            if (!(v4 >> 7 & 1))
            {
                v7 = 1;
                v8 = 21;
            }
            else if (v11)
            {
                v12 = v1 - 4;
                v10 = v0 + 4;
                a1->field_0 = v10;
                a1->field_8 = v12;
                v4 = v0[3];
                v6 = v6 & 0xfffffffff0000000 | (v6 & 0xfffffffff01fffff | (v4 * 0x200000 | v4 >> 43) & 0xfe00000) & 0xfffffff;
                if (!(v4 >> 7 & 1))
                {
                    v7 = 1;
                    v8 = 28;
                }
                else if (v12)
                {
                    v13 = v1 - 5;
                    v10 = v0 + 5;
                    a1->field_0 = v10;
                    a1->field_8 = v13;
                    v4 = v0[4];
                    v6 = v6 & 0xfffffff800000000 | (v6 & 0xfffffff80fffffff | (v4 * 0x10000000 | v4 >> 36) & 0x7f0000000) & 0x7ffffffff;
                    if (!(v4 >> 7 & 1))
                    {
                        v7 = 1;
                        v8 = 35;
                    }
                    else if (v13)
                    {
                        v14 = v1 - 6;
                        v15 = v0 + 6;
                        a1->field_0 = v15;
                        a1->field_8 = v14;
                        v16 = v0[5];
                        v6 |= ((unsigned int)v16 & 127) * 0x800000000;
                        if (!(v16 >> 31 & 1))
                        {
                            v4 = (unsigned int)v16 & 0xff;
                            v7 = 1;
                            v8 = 42;
                        }
                        else if (v14)
                        {
                            v17 = v1 - 7;
                            v15 = v0 + 7;
                            a1->field_0 = v15;
                            a1->field_8 = v17;
                            v18 = v0[6];
                            v6 |= ((unsigned int)v18 & 127) * 0x40000000000;
                            if (!(v18 >> 31 & 1))
                            {
                                v4 = (unsigned int)v18 & 0xff;
                                v7 = 1;
                                v8 = 49;
                            }
                            else if (v17)
                            {
                                v19 = v1 - 8;
                                v15 = v0 + 8;
                                a1->field_0 = v15;
                                a1->field_8 = v19;
                                v20 = v0[7];
                                v6 |= ((unsigned int)v20 & 127) * 0x2000000000000;
                                if (!(v20 >> 31 & 1))
                                {
                                    v4 = (unsigned int)v20 & 0xff;
                                    v7 = 1;
                                    v8 = 56;
                                }
                                else if (v19)
                                {
                                    v21 = v1 - 9;
                                    v15 = v0 + 9;
                                    a1->field_0 = v15;
                                    a1->field_8 = v21;
                                    v22 = v0[8];
                                    v6 |= ((unsigned int)v22 & 127) * 0x100000000000000;
                                    if (!(v22 >> 31 & 1))
                                    {
                                        v4 = (unsigned int)v22 & 0xff;
                                        v7 = 1;
                                        v8 = 63;
                                    }
                                    else if (v21)
                                    {
                                        a1->field_0 = v0 + 10;
                                        a1->field_8 = v1 - 10;
                                        v4 = v0[9];
                                        if ((unsigned int)v4 != 127 && (unsigned int)v4)
                                        {
                                            *(char *)&a0->field_0 = 7;
                                            return a0;
                                        }
                                        v7 = 0;
                                        v6 |= v4 * 0x8000000000000000;
                                        v8 = 6;
                                    }
                                    else
                                    {
                                        a0->field_0 = 19;
                                        *(unsigned short *)&a0->padding_2[4] = 0;
                                        *(unsigned int *)&a0->padding_2[0] = 0;
                                        a0->field_8 = v15;
                                        return a0;
                                    }
                                }
                                else
                                {
                                    a0->field_0 = 19;
                                    *(unsigned short *)&a0->padding_2[4] = 0;
                                    *(unsigned int *)&a0->padding_2[0] = 0;
                                    a0->field_8 = v15;
                                    return a0;
                                }
                            }
                            else
                            {
                                a0->field_0 = 19;
                                *(unsigned short *)&a0->padding_2[4] = 0;
                                *(unsigned int *)&a0->padding_2[0] = 0;
                                a0->field_8 = v15;
                                return a0;
                            }
                        }
                        else
                        {
                            a0->field_0 = 19;
                            *(unsigned short *)&a0->padding_2[4] = 0;
                            *(unsigned int *)&a0->padding_2[0] = 0;
                            a0->field_8 = v15;
                            return a0;
                        }
                    }
                    else
                    {
                        a0->field_0 = 19;
                        *(unsigned short *)&a0->padding_2[4] = 0;
                        *(unsigned int *)&a0->padding_2[0] = 0;
                        a0->field_8 = v10;
                        return a0;
                    }
                }
                else
                {
                    a0->field_0 = 19;
                    *(unsigned short *)&a0->padding_2[4] = 0;
                    *(unsigned int *)&a0->padding_2[0] = 0;
                    a0->field_8 = v10;
                    return a0;
                }
            }
            else
            {
                a0->field_0 = 19;
                *(unsigned short *)&a0->padding_2[4] = 0;
                *(unsigned int *)&a0->padding_2[0] = 0;
                a0->field_8 = v10;
                return a0;
            }
        }
        else
        {
            a0->field_0 = 19;
            *(unsigned short *)&a0->padding_2[4] = 0;
            *(unsigned int *)&a0->padding_2[0] = 0;
            a0->field_8 = v10;
            return a0;
        }
    }
    else
    {
        v0 = v5;
        a0->field_0 = 19;
        *(unsigned short *)&a0->padding_2[4] = 0;
        *(unsigned int *)&a0->padding_2[0] = 0;
        a0->field_8 = v0;
        return a0;
    }
    if ((unsigned int)v4 > 63 & v7)
        v23 = 0xffffffffffffffff << (v8 & 63);
    else
        v23 = 0;
    a0->field_8 = v23 | v6;
    *(char *)&a0->field_0 = 82;
    return a0;
}
