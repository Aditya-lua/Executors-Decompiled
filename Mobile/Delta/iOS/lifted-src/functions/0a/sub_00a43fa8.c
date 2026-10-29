/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa43fa8..0xa4410c (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a43fa8_1 {
    char padding_0[496];
    struct st_a43fa8_0 *field_1f0;
    char padding_1f8[176];
    unsigned long long field_2a8;
    struct st_a43fa8_0 *field_2b0;
    char padding_2b8[40];
    struct st_a43fa8_0 *field_2e0;
    struct st_a43fa8_0 *field_2e8;
    struct st_a43fa8_0 *field_2ec;
} st_a43fa8_1;

typedef struct st_a43fa8_0 {
    struct st_a43fa8_0 *field_0;
} st_a43fa8_0;


st_a43fa8_0 ** sub_a43fa8(long long *a0, st_a43fa8_0 **a1, st_a43fa8_0 **a2, st_a43fa8_0 **a3)
{
    st_a43fa8_0 **v2;  // x19
    st_a43fa8_1 *v3;  // x8
    unsigned long long v4;  // 4118
    st_a43fa8_1 *v5;  // x19
    unsigned long n;  // x2
    st_a43fa8_0 **ptr;  // x0
    st_a43fa8_0 **ptr1;  // x1
    st_a43fa8_0 **v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = sub_9ffdd8();
    if (15 >= a1)
    {
        switch (a1)
        {
        case 0:
            v3->field_1f0 = 0;
            v5 = v3;
            *(unsigned int *)&v5->field_2e8 = sub_a50728(*a0);
            v5->field_2a8 = a0 + 5;
            *(unsigned int *)((char *)&v5->field_2e8 + 4) = 16;
            v5->field_2e0 = 0;
            break;
        case 8:
            sub_9ffdd8(v2);
        case 9:
            v4 = arm64g_calculate_condition(49, (unsigned long long)((char *)a2 - 16), 15, 0);
            if (v4 & 1)
                return 0;
            *(unsigned int *)&v3->field_2e8 = (unsigned int)a2;
            break;
        default:
            return 0xffffffff;
        }
    }
    else
    {
        switch (a1)
        {
        case 16:
            if (*(int *)((char *)&v3->field_2e8 + 4) == a2)
            {
                v9 = sub_a50720(a0);
                if (!(unsigned int)v9)
                    return v9;
                n = a2;
                ptr1 = &v3->field_2b0;
                ptr = v2;
                goto LABEL_a440dc;
            }
            else
            {
                return 0;
            }
        case 17:
            if (v2)
            {
                if (*(int *)((char *)&v3->field_2e8 + 4) != a2)
                {
                    return 0;
                }
                else if (!sub_a50720(a0))
                {
                    n = a2;
                    ptr = &v3->field_2b0;
                    ptr1 = v2;
                }
                else
                {
                    return 0;
                }
LABEL_a440dc:
                _memcpy(ptr, ptr1, n);
                break;
            }
            else
            {
                if (a2 > 16)
                    return 0;
                *(unsigned int *)((char *)&v3->field_2e8 + 4) = (unsigned int)a2;
                break;
            }
        case 37:
            *(int *)v2 = (int)v3->field_2e8;
            break;
        default:
            return 0xffffffff;
        }
    }
    return 1;
}
