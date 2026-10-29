/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a46c..0x95a664 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a46c_1 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_95a46c_1;

typedef struct st_95a46c_0 {
    int field_0;
    char padding_4[748];
    unsigned int field_2f0;
    char padding_2f4[4];
    struct st_95a46c_1 *field_2f8;
} st_95a46c_0;


unsigned long long sub_95a46c(long long *a0, st_95a46c_0 *a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned int *v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v5;  // x27
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // w0
    unsigned long long v9;  // x0
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    unsigned long long v12;  // x0
    unsigned int v0;  // [bp-0x78]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1->field_2f8;
    if (!v3)
        return 0;
    if (a6)
    {
        *(unsigned long long *)a6 = 0;
        v0 = a1->field_2f0;
        v4 = sub_a68354(0, 21);
        if (v4)
        {
            v5 = *(long long *)v4;
            if (v5)
            {
                v6 = sub_ad66d4(v5, &v0);
                if (!(v6 >> 31 & 1))
                    *(unsigned long long *)a6 = sub_ad69f8(v5, v6);
            }
        }
        if (!a2 && !a3)
            return 1;
    }
    if (!a2)
    {
        return 0;
    }
    else if (a3)
    {
        v7 = sub_95a0e8(a0, v3, a2);
        if (!(unsigned int)v7)
            return v7;
        v8 = (unsigned int)sub_95a2fc(a0, v3, a3, a4, a5);
        v9 = *(long long *)a2;
        if (!v8)
        {
            sub_961c44(v9);
            return 0;
        }
        else if (!v9)
        {
            return v9;
        }
        else if ((*(long long *)a3 || sub_a2cf88() >> 21 & 1) && (!a4 || v3[10] == 64 || *(int *)a4))
        {
            if (a7)
                return 1;
            if (a1->field_0 < 769)
            {
                return 1;
            }
            else if (((unsigned int)(a1->field_0) >> 8 & 0xffffff) != 3)
            {
                return 1;
            }
            else
            {
                switch (v11)
                {
                case 128:
                    switch (v10)
                    {
                    case 2:
                        break;
                    case 16:
                        break;
                    default:
                        return 1;
                    }
                    break;
                case 64:
                    switch (v10)
                    {
                    case 2:
                        break;
                    case 16:
                        break;
                    default:
                        return 1;
                    }
                    break;
                case 4:
                    if (v3[10] != 1)
                        return 1;
                    break;
                default:
                    return 1;
                }
                v12 = sub_963d3c(*a0);
                if (v12)
                {
                    sub_961c44(*(long long *)a2);
                    sub_961c0c(*(long long *)a3);
                    *(unsigned long long *)a2 = v12;
                    *(unsigned long long *)a3 = 0;
                }
            }
            return 1;
        }
    }
    else
    {
        return 0;
    }
    return 0;
}
