/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb782ec..0xb783f8 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b782ec_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b782ec_0;


unsigned long long * sub_b782ec(unsigned long long *a0, st_b782ec_0 *a1, unsigned long long a2)
{
    unsigned long long v3;  // x1
    unsigned long long v12;  // x15
    unsigned long long *v13;  // x10
    unsigned long long ptr;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // x2
    st_b782ec_0 *iter;  // x14
    unsigned long long v8;  // x10
    unsigned long long i;  // x11
    unsigned long v10;  // x14
    unsigned long long v11;  // x16
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v3 = a2 * 16;
    if (a2 > 0xfffffffffffffff)
    {
        sub_c6b970(0);
    }
    else if (0x7ffffffffffffff8 < v3)
    {
        sub_c6b970(0);
    }
    else if (v3)
    {
        ptr = _malloc(v3);
        if (ptr)
        {
            v5 = ptr;
            v6 = a2;
            if (a2)
            {
                iter = a1;
                v8 = 0;
                i = v6;
                do
                {
                    if (iter == &a1[v6])
                        break;
                    i -= 1;
                    v10 = iter->field_8;
                    do
                    {
                        /* unsupported instruction */;
                        v11 = /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if (*(int *)&iter->padding_0[0])
                    {
                        if ((long long)v11 >= 0)
                        {
                            v12 = 1;
                        }
                        else
                        {
                            sub_c769bc();
                            sub_c6b970(8);
                        }
                    }
                    else
                    {
                        if ((long long)v11 >= 0)
                        {
                            v12 = 0;
                        }
                        else
                        {
                            sub_c769bc();
                            sub_c6b970(8);
                        }
                    }
                    v13 = v5 + v8 * 16;
                    *v13 = v12;
                    v13[1] = v10;
                    iter += 1;
                    v8 += 1;
                } while (i);
            }
            a2 = v6;
            *a0 = v6;
            a0[1] = v5;
            a0[2] = a2;
            return a0;
        }
        sub_c6b970(8);
    }
    else
    {
        *a0 = 0;
        a0[1] = 8;
        a0[2] = a2;
        return a0;
    }
}
