/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2a744..0xc2a824 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c2a744_0 {
    unsigned long long field_0;
} st_c2a744_0;


st_c2a744_0 ** sub_c2a744(st_c2a744_0 **a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long *v3;  // x1
    unsigned long long *ptr;  // x0
    unsigned long long *v5;  // x8
    unsigned long long *v6;  // x2
    unsigned long long *v7;  // x9
    unsigned long long *v8;  // x11
    unsigned long long *i;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v3 = a2 * 8;
    if (a2 > 0x1fffffffffffffff)
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
                v7 = a1;
                v8 = 0;
                i = v6;
                do
                {
                    if (v7 == (char *)a1 + 0x8 * v6)
                        break;
                    i = (char *)i - 1;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ < 0)
                    {
                        sub_c769bc();
                        sub_c6b970(8);
                    }
                    *(unsigned long long *)((char *)v5 + 0x8 * v8) = *v7;
                    v8 = (char *)v8 + 1;
                    v7 += 1;
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
