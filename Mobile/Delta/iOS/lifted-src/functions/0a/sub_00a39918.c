/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39918..0xa39bb0 (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a39918_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_a39918_0;


unsigned long long sub_a39918(long long a0, unsigned int a1, long long a2, long long *a3)
{
    void* v2;  // x21
    long long v3;  // x0
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v14;  // w9
    unsigned int v15;  // w8
    unsigned long long v16;  // x0
    unsigned int v17;  // w0
    unsigned long long v18;  // x0
    unsigned long v19;  // x8
    unsigned long v20;  // x9
    unsigned long v5;  // x8
    unsigned long v6;  // x9
    st_a39918_0 *v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // w0
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_975ffc();
    v3 = sub_9d500c(a0);
    if (!v2)
        return 0;
    if ((int)a1 > 11)
    {
        if ((int)a1 > 100)
        {
            if (a1 == 101)
            {
                sub_9d3d58(a0, 15);
                v18 = sub_9d46fc(v3, 101, a2, a3);
                sub_9d5054(a0);
                return v18;
            }
            else if (a1 == 113)
            {
                return (int)v2[16];
            }
            else if (a1 == 129)
            {
                *a3 = (long long)v2[24];
                sub_9d3d2c(a0, 1);
                return 1;
            }
            goto LABEL_a39b68;
        }
        else
        {
            if (a1 == 12)
            {
                v8 = sub_975ffc(a3);
                v9 = sub_a4bc70(v8);
                v8->field_18 = v9;
                if (!v9)
                    return v9;
                v10 = (unsigned int)sub_a4de68();
                if (!v10)
                    return 0;
                sub_9d3d2c(a3, 1);
                return v10;
            }
            if (a1 != 13)
                goto LABEL_a39b68;
            v5 = *(int *)v2;
            v6 = (int)v2[4];
            if ((int)v6 < (int)v5)
                return v5 - v6;
        }
    }
    else
    {
        if (9 >= (int)a1)
        {
            if (a1 != 1)
            {
                if (a1 != 2)
                    goto LABEL_a39b68;
                if ((int)v2[8] < 1)
                    return 1;
            }
            else
            {
                *(double *)&v2[12] = 2.121995791e-314;
                v11 = sub_a50720((long long)v2[24]);
                if (!sub_a4c694((long long)v2[24], 0, 0, 0, 0, v11))
                    return 0;
            }
        }
        else
        {
            if (a1 != 10)
            {
                if (a1 == 11)
                {
                    while (1)
                    {
                        v12 = *(int *)v2;
                        v13 = (int)v2[4];
                        while (1)
                        {
                            v14 = v13;
                            v15 = v12;
                            if (v15 == v14)
                                break;
                            v16 = sub_a394c0(a0, 0, 0);
                            if (v16 >> 31 & 1 || !(v12 = *(int *)v2, v13 = (int)v2[4], v12 - v13 != v15 - v14))
                                return (int)v16;
                        }
                        if ((int)v2[12])
                        {
                            v18 = sub_9d46fc(v3, 11, a2, a3);
                            sub_9d5054(a0);
                            return v18;
                        }
                        *(unsigned int *)&v2[12] = 1;
                        *(unsigned int *)&v2[4] = 0;
                        v17 = sub_a4ca14((long long)v2[24], v2 + 48, v2);
                        *(unsigned int *)&v2[16] = v17;
                        if (1 > (int)v17)
                            return v17;
                    }
                }
LABEL_a39b68:
            }
            else
            {
                v19 = *(int *)v2;
                v20 = (int)v2[4];
                if ((int)v19 > (int)v20)
                    return v19 - v20;
            }
        }
    }
    return sub_9d46fc();
}
