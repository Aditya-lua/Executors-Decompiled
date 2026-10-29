/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe2a7c..0xbe2ca4 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be2a7c_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[15];
    char field_18;
    char padding_19[63];
    unsigned long long field_58;
    char padding_60[16];
    unsigned long long field_70;
    char padding_78[56];
    unsigned long long field_b0;
    char padding_b8[16];
    unsigned long long field_c8;
} st_be2a7c_0;

typedef struct st_be2a7c_1 {
    struct st_be2a7c_0 *field_0;
    struct st_be2a7c_2 *field_8;
    struct st_be2a7c_2 *field_10;
} st_be2a7c_1;

typedef struct st_be2a7c_2 {
    unsigned long long field_0;
} st_be2a7c_2;


unsigned long long sub_be2a7c(st_be2a7c_0 *a0, long long a1)
{
    st_be2a7c_1 *ptr;  // x0
    st_be2a7c_1 *ptr1;  // x19
    unsigned long long v4;  // x9
    unsigned long long v5;  // x21
    st_be2a7c_1 *ptr2;  // x0
    st_be2a7c_0 *v7;  // x23
    unsigned long long *v8;  // x22
    unsigned long long *v9;  // x22
    long long v10;  // x0
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(24);
    if (ptr)
    {
        ptr1 = ptr;
        ptr->field_0 = a0;
        ptr->field_8 = &a0->field_58;
        v4 = a0->field_0;
        ptr->field_10 = &a0->field_b0;
        if ((v4 != 9223372036854775810 || (v5 = sub_bd3cac(&a0->field_8, a1) & 0xff, (unsigned int)v5 == 2)) && (*(long long *)ptr1->field_8 != 9223372036854775810 || (v5 = sub_bd3cac(ptr1->field_8 + 1, a1) & 0xff, (unsigned int)v5 == 2)) && (*(long long *)ptr1->field_10 != 9223372036854775810 || !(v5 = sub_bd3cac(ptr1->field_10 + 1, a1) & 0xff, (unsigned int)v5 != 2)))
        {
            _free(ptr1);
            ptr2 = _malloc(24);
            if (!ptr2)
                goto LABEL_be2c70;
            ptr1 = ptr2;
            v7 = &a0->field_18;
            ptr2->field_0 = v7;
            ptr2->field_8 = &a0->field_70;
            ptr2->field_10 = &a0->field_c8;
            v5 = sub_be2154(a1, 0, v7) & 0xff;
            if ((unsigned int)v5 == 2)
            {
                v5 = sub_bd3c48(v7, a1) & 0xff;
                if ((unsigned int)v5 == 2)
                {
                    v5 = sub_be2154(a1, 1, v7) & 0xff;
                    if ((unsigned int)v5 == 2)
                    {
                        v8 = ptr1->field_8;
                        v5 = sub_be2154(a1, 0, v8) & 0xff;
                        if ((unsigned int)v5 == 2)
                        {
                            v5 = sub_bd3c48(v8, a1) & 0xff;
                            if ((unsigned int)v5 == 2)
                            {
                                v5 = sub_be2154(a1, 1, v8) & 0xff;
                                if ((unsigned int)v5 == 2)
                                {
                                    v9 = ptr1->field_10;
                                    v5 = sub_be2154(a1, 0, v9) & 0xff;
                                    if ((unsigned int)v5 == 2)
                                    {
                                        v5 = sub_bd3c48(v9, a1) & 0xff;
                                        if ((unsigned int)v5 == 2)
                                            v5 = sub_be2154(a1, 1, v9) & 0xff;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        _free(ptr1);
        return v5;
    }
LABEL_be2c70:
    v10 = sub_c6ba70(8, 24);
    _free(ptr1);
    v11 = __Unwind_Resume(v10);
    _free(ptr1);
    __Unwind_Resume(v11);
}
