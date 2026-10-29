/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6d6b8..0x6d8cc (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6d6b8_0 {
    char field_0;
} st_6d6b8_0;


long long sub_6d6b8(void* a0)
{
    unsigned long iter;  // x9
    unsigned int v3;  // w13
    unsigned int v12;  // w2
    unsigned int v13;  // w13
    unsigned int v14;  // w2
    unsigned int v15;  // w2
    unsigned int v16;  // w2
    unsigned long v17;  // x11
    unsigned int *v18;  // x10
    unsigned int v19;  // w13
    unsigned int v20;  // w14
    char v21;  // x15
    unsigned long v4;  // x15
    unsigned int v22;  // w3
    unsigned int v23;  // w14
    unsigned int v24;  // w3
    unsigned int v25;  // w3
    unsigned int v26;  // w3
    unsigned int v27;  // w1
    unsigned int v28;  // w14
    unsigned int v29;  // w1
    unsigned int v30;  // w1
    unsigned long v5;  // x8
    unsigned int v6;  // w4
    unsigned int v7;  // w13
    unsigned int v8;  // w4
    unsigned int v9;  // w4
    unsigned int v10;  // w4
    unsigned long v11;  // x8
    st_6d6b8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_6d6b8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    iter = (long long)a0[32];
    if (iter)
    {
        v3 = *(int *)*(long long *)a0;
        if (32 > (unsigned long long)(long long)a0[16])
        {
            v4 = 0;
            v5 = 0;
            do
            {
                do
                {
                    v6 = v3 / 44488;
                    v7 = 48271 * (v3 - 44488 * v6);
                    v8 = 3399 * v6;
                    if (v7 < v8)
                        v9 = 0x7fffffff;
                    else
                        v9 = 0;
                } while ((v3 = v9 + v7 - v8, v10 = v3 - 1, (unsigned int)(int)a0[40] <= v10));
            } while ((v5 = ((int)a0[48] & v10) + ((unsigned int)v5 << ((char)(long long)a0[16] & 31)), v4 += 1, v4 != iter));
        }
        else
        {
            v11 = 0;
            do
            {
                do
                {
                    v12 = v3 / 44488;
                    v13 = 48271 * (v3 - 44488 * v12);
                    v14 = 3399 * v12;
                    if (v13 < v14)
                        v15 = 0x7fffffff;
                    else
                        v15 = 0;
                } while ((v3 = v15 + v13 - v14, v16 = v3 - 1, (unsigned int)(int)a0[40] <= v16));
            } while ((v11 += 1, v11 != iter));
            v5 = (int)a0[48] & v16;
        }
        *(unsigned int *)*(long long *)a0 = v3;
        v17 = (long long)a0[24];
        if ((unsigned long long)(long long)a0[24] <= iter)
            return v5;
    }
    else
    {
        v5 = 0;
        v17 = (long long)a0[24];
        if (0 >= v17)
            return 0;
    }
    v18 = *(long long *)a0;
    v19 = (int)a0[52];
    v20 = *v18;
    if (31 > (unsigned long long)(long long)a0[16])
    {
        v21 = (char)(long long)a0[16] + 1;
        do
        {
            do
            {
                v22 = v20 / 44488;
                v23 = 48271 * (v20 - 44488 * v22);
                v24 = 3399 * v22;
                if (v23 < v24)
                    v25 = 0x7fffffff;
                else
                    v25 = 0;
            } while ((v20 = v25 + v23 - v24, v26 = v20 - 1, (unsigned int)(int)a0[44] <= v26));
        } while ((v5 = (v19 & v26) + ((unsigned int)v5 << ((char)(long long)a0[16] + 1 & 31)), iter += 1, iter != v17));
        *v18 = v20;
        return (v19 & v26) + ((unsigned int)v5 << (v21 & 31));
    }
    else
    {
        do
        {
            do
            {
                v27 = v20 / 44488;
                v28 = 48271 * (v20 - 44488 * v27);
                v29 = 3399 * v27;
                if (v28 < v29)
                    v30 = 0x7fffffff;
                else
                    v30 = 0;
            } while ((v20 = v30 + v28 - v29, (unsigned int)(int)a0[44] <= v20 - 1));
        } while ((iter += 1, iter != v17));
        *v18 = v20;
        return v19 & v20 - 1;
    }
}
