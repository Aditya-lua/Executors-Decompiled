/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2f88..0x9d30f4 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d2f88_0 {
    char padding_0[64];
    void* field_40;
} st_9d2f88_0;


unsigned long long sub_9d2f88(st_9d2f88_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x21
    void* v3;  // x25
    unsigned int v12;  // w24
    unsigned long long v13;  // x0
    unsigned long v14;  // x21
    unsigned long long v15;  // x19
    unsigned long long v4;  // x19
    unsigned long v5;  // x0
    unsigned int v6;  // w9
    unsigned long long v7;  // x27
    unsigned long long v9;  // w8
    unsigned long long v10;  // w10
    unsigned long long v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = a2;
    if (!(unsigned int)a2)
        return 0;
    v3 = a0->field_40;
    if (!v3)
    {
        return 0;
    }
    else if (*(long long *)&a0[1].padding_0[0])
    {
        sub_9d3d58(a0, 15);
        v4 = 0;
        v5 = (int)v3[16];
        v6 = (int)v3[20];
        if (!(unsigned int)v5)
            goto LABEL_9d3040;
        while (1)
        {
            if ((int)v5 < (int)v2)
                v7 = v5 & 0xffffffff;
            else
                v7 = v2 & 0xffffffff;
            _memcpy();
            v6 = (int)v3[20] + (unsigned int)v7;
            *(unsigned int *)&v3[16] = (int)v3[16] - v7;
            *(unsigned int *)&v3[20] = v6;
            if ((int)v2 <= (int)v5)
                break;
            v2 -= (int)v7;
            v4 += v7;
            do
            {
LABEL_9d3040:
                v9 = (unsigned int)v2 + v6;
                v10 = v9 + 0xfff;
                if (v10 < 0)
                    v11 = v9 + 0x1ffe;
                else
                    v11 = v10;
                v12 = v11 & 0xfffff000;
                v13 = (long long)v3[8];
                if ((int)v12 > *(int *)v3)
                {
                    v13 = sub_a6c1b4(v13, v12, "crypto/bio/bf_readbuff.c", 97);
                    if (!v13)
                        return 0;
                    *(unsigned long long *)&v3[8] = v13;
                    *(unsigned int *)v3 = v12;
                    v6 = (int)v3[20];
                }
                v5 = sub_9d3d84(*(long long *)&a0[1].padding_0[0], v13 + v6, v2);
                if ((int)v5 <= 0)
                {
                    v14 = v5;
                    sub_9d5054(a0);
                    if (!(v14 >> 31 & 1))
                        return v4;
                    if (0 < (int)v4)
                        v15 = v4 & 0xffffffff;
                    else
                        v15 = v14 & 0xffffffff;
                    return v15;
                }
                *(unsigned int *)&v3[16] = v5;
                v6 = (int)v3[20];
            } while (!(unsigned int)v5);
        }
        return v7 + v4;
    }
    else
    {
        return 0;
    }
}
