/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa394c0..0xa39650 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a394c0_0 {
    struct st_a394c0_0 *field_0;
    struct st_a394c0_0 *field_4;
    char padding_c[4];
    struct st_a394c0_0 *field_10;
} st_a394c0_0;


st_a394c0_0 * sub_a394c0(long long a0, st_a394c0_0 *a1, st_a394c0_0 *a2)
{
    st_a394c0_0 *v2;  // x19
    st_a394c0_0 *v3;  // x21
    st_a394c0_0 *v12;  // w8
    unsigned long v13;  // x26
    unsigned long long v14;  // x0
    st_a394c0_0 *v4;  // x23
    unsigned long v5;  // x8
    unsigned long long v6;  // x24
    unsigned long long v7;  // x24
    st_a394c0_0 *v8;  // x0
    st_a394c0_0 *v9;  // x27
    st_a394c0_0 *v10;  // x25
    unsigned long v11;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_975ffc();
    v4 = sub_9d500c(a0);
    if (!v3)
    {
        return 0;
    }
    else if (v4)
    {
        sub_9d3d58(a0, 15);
        v5 = *(int *)((char *)&v3->field_0 + 4);
        v6 = (int)v3->field_0 - v5;
        if ((int)v6 >= 1)
        {
            do
            {
                v7 = v6;
                v8 = sub_9d3fec(v4, &v3[1].padding_c[(int)v5], v7);
                if ((int)(unsigned int)v8 <= 0)
                {
                    sub_9d5054(a0);
                    return v8;
                }
            } while ((v5 = *(int *)((char *)&v3->field_0 + 4) + (char *)v8, *(unsigned int *)((char *)&v3->field_0 + 4) = v5, v6 = v7 - (char *)v8, (int)(unsigned int)v8 < (int)v7));
        }
        if (!a1)
        {
            return 0;
        }
        else if ((int)(unsigned int)v2 >= 1)
        {
            *(unsigned int *)((char *)&v3->field_0 + 4) = 0;
            v9 = v2;
            while (1)
            {
                if ((unsigned int)v9 < 0x1000)
                    v10 = v9 & 0xffffffff;
                else
                    v10 = 0x1000;
                if (!sub_a4c6a0())
                {
                    sub_9d3d58(a0, 15);
                    *(unsigned int *)v3->padding_c = 0;
                    return 0;
                }
                v9 -= v10;
                *(unsigned int *)((char *)&v3->field_0 + 4) = 0;
                v11 = (int)v3->field_0;
                if ((int)v11 >= 1)
                {
                    v12 = (st_a394c0_0 *)0;
                    do
                    {
                        v13 = v11;
                        v14 = sub_9d3fec(v4, v3[1].padding_c + v12, v13);
                        if ((int)v14 <= 0)
                        {
                            sub_9d5054(a0);
                            if ((unsigned int)v2 != (unsigned int)v9)
                                return v2 - v9 & 0xffffffff;
                            return v14 & 0xffffffff;
                        }
                    } while ((v12 = (st_a394c0_0 *)(*(int *)((char *)&v3->field_0 + 4) + (unsigned int)v14), *(unsigned int *)((char *)&v3->field_0 + 4) = (unsigned int)v12, v11 = v13 - v14, (int)v14 < (int)v13));
                }
                v3->field_0 = 0;
                if ((int)(unsigned int)v9 <= 0)
                {
                    sub_9d5054(a0);
                    return v2;
                }
            }
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
