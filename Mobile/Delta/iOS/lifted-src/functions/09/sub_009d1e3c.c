/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d1e3c..0x9d1fec (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d1e3c_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[16];
    unsigned long long field_18;
    unsigned int field_20;
    unsigned int field_24;
} st_9d1e3c_0;

typedef struct st_9d1e3c_1 {
    char padding_0[64];
    struct st_9d1e3c_0 *field_40;
} st_9d1e3c_1;


unsigned long long sub_9d1e3c(st_9d1e3c_1 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x19
    st_9d1e3c_0 *v3;  // x24
    unsigned int v12;  // w9
    unsigned int v13;  // x20
    unsigned long long v14;  // x19
    unsigned long v15;  // x10
    unsigned long long v16;  // x0
    unsigned long long v17;  // x19
    unsigned long long v18;  // x20
    unsigned int v19;  // w19
    unsigned int v20;  // w8
    long long iter;  // x21
    unsigned long v5;  // x2
    unsigned long v6;  // x8
    long long v7;  // x9
    unsigned long long v8;  // x25
    unsigned int v9;  // x20
    unsigned long long n;  // x23
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = a2;
    if ((int)a2 < 1)
        return 0;
    v3 = a0->field_40;
    if (!v3 || !*(long long *)&a0[1].padding_0[0])
        return 0;
    iter = a1;
    sub_9d3d58(a0, 15);
    v5 = v3->field_20;
    v6 = v3->field_24;
    v7 = v6 + v5;
    v8 = v3->field_4 - v7;
    if ((int)v2 > (int)v8)
    {
        v9 = 0;
        do
        {
            if ((unsigned int)v5)
            {
                if ((int)v8 >= 1)
                {
                    n = v8 & 0xffffffff;
                    _memcpy(v3->field_18 + (int)v7, iter, n);
                    iter += n;
                    v2 -= v8;
                    v9 += v8;
                    v6 = v3->field_24;
                    v3->field_20 = v3->field_20 + (unsigned int)v8;
                }
                do
                {
                    v11 = sub_9d3fec(*(long long *)&a0[1].padding_0[0], v3->field_18 + (int)v6);
                    if ((int)v11 <= 0)
                    {
                        v17 = v11;
                        sub_9d5054(a0);
                        if (!(v17 >> 31 & 1))
                            return v9;
                        if (0 < (int)v9)
                            v18 = v9 & 0xffffffff;
                        else
                            v18 = v17 & 0xffffffff;
                        return v18;
                    }
                } while ((v12 = v3->field_20, v6 = v3->field_24 + v11, v3->field_20 = v12 - v11, v3->field_24 = v6, v12 != (unsigned int)v11));
            }
            v3->field_24 = 0;
            v13 = v9;
            v14 = v2;
            while (1)
            {
                v2 = v14;
                v9 = v13;
                v15 = v3->field_4;
                if ((int)v2 < (int)v15)
                    break;
                v16 = sub_9d3fec(*(long long *)&a0[1].padding_0[0], iter, v2);
                if ((int)v16 > 0)
                {
                    v13 = v16 + v9;
                    iter += v16 & 0xffffffff;
                    v14 = v2 - v16;
                    if ((unsigned int)v2 == (unsigned int)v16)
                        return v16 + v9;
                }
                else
                {
                    v19 = v16;
                    sub_9d5054(a0);
                    if (0 < (int)v9)
                        v20 = v9;
                    else
                        v20 = v19;
                    if (v19 & 0x80000000)
                        return v20;
                    return v9 & 0xffffffff;
                }
            }
            v5 = v3->field_20;
            v6 = v3->field_24;
            v7 = v6 + v5;
            v8 = v15 - v7;
        } while ((int)v8 < (int)v2);
    }
    else
    {
        v9 = 0;
    }
    _memcpy(v3->field_18 + (int)v7, iter, (int)v2);
    v3->field_20 = v3->field_20 + (unsigned int)v2;
    return v9 + v2;
    return 0;
}
