/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d34b4..0x9d353c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d34b4_0 {
    char padding_0[1];
    struct st_9d34b4_0 *field_1;
    char padding_9[83];
    struct st_9d34b4_0 *field_5c;
} st_9d34b4_0;


st_9d34b4_0 * sub_9d34b4(st_9d34b4_0 *ptr, st_9d34b4_0 *a1)
{
    st_9d34b4_0 *v3;  // w8
    st_9d34b4_0 *v4;  // w8
    unsigned long long v5;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!ptr)
    {
        return 0;
    }
    else if (a1)
    {
        v3 = (st_9d34b4_0 *)(unsigned int)(a1->padding_0)[1];
        *(uint128_t *)&ptr->padding_9[76] = 0;
        memset(ptr, 0, 96);
        if (!v3)
        {
            *(char *)(ptr->padding_0)[1] = 0;
            return 1;
        }
        v4 = (st_9d34b4_0 *)(unsigned int)(a1->padding_0)[1];
        switch (v4)
        {
        case 1:
            break;
        case 2:
            break;
        case 30:
            break;
        default:
            return 0;
        }
        v0 = &v2;
        v1 = v5;
        _memcpy();
        return 1;
    }
    else
    {
        return 0;
    }
}
