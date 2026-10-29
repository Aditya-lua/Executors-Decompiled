/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d1fec..0x9d2120 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d1fec_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    unsigned int field_10;
    unsigned int field_14;
} st_9d1fec_0;

typedef struct st_9d1fec_1 {
    char padding_0[64];
    struct st_9d1fec_0 *field_40;
} st_9d1fec_1;


unsigned long long sub_9d1fec(st_9d1fec_1 *a0, long long a1, unsigned long long a2)
{
    st_9d1fec_0 *v2;  // x24
    unsigned long long v3;  // x21
    unsigned long long v12;  // x19
    unsigned long long v13;  // x19
    unsigned long long v14;  // x21
    unsigned int v15;  // w21
    unsigned int v16;  // w8
    unsigned long long v17;  // x19
    long long iter;  // x22
    unsigned int v5;  // x19
    unsigned long v6;  // x0
    unsigned long v7;  // x2
    unsigned int v8;  // x0
    unsigned long long v9;  // x25
    unsigned long v10;  // x23
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = a0->field_40;
    if (v2 && *(long long *)&a0[1].padding_0[0])
    {
        v3 = a2;
        iter = a1;
        sub_9d3d58(a0, 15);
        v5 = 0;
        v6 = v2->field_10;
        if (!(unsigned int)v6)
            goto LABEL_9d2088;
        while (1)
        {
            if ((int)v6 < (int)v3)
                v9 = v6 & 0xffffffff;
            else
                v9 = v3 & 0xffffffff;
            v10 = (int)v9;
            _memcpy();
            v11 = v2->field_14 + (unsigned int)v9;
            v2->field_10 = v2->field_10 - v9;
            v2->field_14 = v11;
            v12 = v9 + v5;
            if ((int)v3 <= (int)v6)
                break;
            v3 -= v10;
            iter += v10;
            v5 = v12;
            do
            {
LABEL_9d2088:
                v7 = v2->field_0;
                v8 = *(long long *)&a0[1].padding_0[0];
                if ((int)v7 >= (int)v3)
                {
                    v6 = sub_9d3d84(*(long long *)&a0[1].padding_0[0], v2->field_8, v7);
                    if ((int)v6 <= 0)
                        goto LABEL_9d2100;
                }
                else
                {
                    while (1)
                    {
                        v6 = sub_9d3d84(v8, iter, v3);
                        if ((int)v6 < 1)
                            break;
                        v13 = v6 + v5;
                        v14 = v3 - v6;
                        if ((unsigned int)v3 == (unsigned int)v6)
                            return v6 + v5;
                        iter += v6 & 0xffffffff;
                        v8 = *(long long *)&a0[1].padding_0[0];
                        v3 = v14;
                        v5 = v13;
                    }
LABEL_9d2100:
                    v15 = v6;
                    sub_9d5054(a0);
                    if (0 < (int)v5)
                        v16 = v5;
                    else
                        v16 = v15;
                    if (!(v15 & 0x80000000))
                        v17 = v5 & 0xffffffff;
                    else
                        v17 = v16;
                    return v17;
                }
            } while ((v2->field_10 = v6, v2->field_14 = 0, !(unsigned int)v6));
        }
        return v9 + v5;
    }
    return 0;
}
