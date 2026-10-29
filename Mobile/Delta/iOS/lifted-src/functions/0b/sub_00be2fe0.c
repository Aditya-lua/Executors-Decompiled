/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe2fe0..0xbe315c (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be2fe0_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    long long field_20;
    unsigned long long field_28;
} st_be2fe0_0;

typedef struct st_be2fe0_1 {
    unsigned long long field_0;
} st_be2fe0_1;


unsigned long long sub_be2fe0(st_be2fe0_0 *a0, long long a1)
{
    unsigned long long iter;  // x24
    unsigned long long v6;  // x23
    st_be2fe0_1 **ptr;  // x19
    unsigned long long v8;  // x22
    unsigned long long v9;  // x24
    unsigned long long *v10;  // x21
    unsigned long v0;  // [bp-0x68]
    st_be2fe0_1 **v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_b766f4(&v0, a0->field_8, a0->field_8 + 24 * a0->field_10);
    iter = 0;
    v6 = v0;
    ptr = v1;
    while (1)
    {
        if (v2 * 8 == iter)
        {
            if (v6)
                _free(ptr);
            sub_b76800(&v0, a0->field_20, a0->field_20 + a0->field_28 * 64);
            v9 = 0;
            v6 = v0;
            ptr = v1;
            do
            {
                if (v2 * 8 == v9)
                {
                    if (v6)
                    {
                        _free(ptr);
                        return 2;
                    }
                    return 2;
                }
            } while ((v10 = *(long long *)((char *)ptr + v9), v8 = sub_be2154(a1, 0, v10) & 0xff, (unsigned int)v8 == 2 && (v8 = sub_bd3c48(v10, a1) & 0xff, (unsigned int)v8 == 2 && (v8 = sub_be2154(a1, 1, v10) & 0xff, v9 += 8, (unsigned int)v8 == 2))));
        }
        else if (*(long long *)*(long long *)((char *)ptr + iter) != 9223372036854775810)
        {
            v8 = 2;
            iter += 8;
            if (0)
                break;
        }
        else
        {
            v8 = sub_bd3cac(*(long long *)((char *)ptr + iter) + 8, a1) & 0xff;
            iter += 8;
            if ((unsigned int)v8 != 2)
                break;
        }
    }
    if (!v6)
        return v8;
    _free(ptr);
    return v8;
}
