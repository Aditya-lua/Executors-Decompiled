/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe2ca4..0xbe2e7c (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be2ca4_1 {
    char padding_0[128];
    unsigned long long field_80;
} st_be2ca4_1;

typedef struct st_be2ca4_2 {
    struct st_be2ca4_3 *field_0;
    struct st_be2ca4_0 *field_8;
    struct st_be2ca4_1 *field_10;
} st_be2ca4_2;

typedef struct st_be2ca4_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_be2ca4_0;

typedef struct st_be2ca4_3 {
    unsigned long long field_0;
} st_be2ca4_3;


unsigned long long sub_be2ca4(st_be2ca4_1 *a0, long long a1)
{
    st_be2ca4_2 *ptr;  // x0
    st_be2ca4_2 *ptr1;  // x19
    unsigned long long v4;  // x9
    unsigned long long v5;  // x21
    st_be2ca4_2 *ptr2;  // x0
    unsigned long long *v7;  // x23
    st_be2ca4_0 *v8;  // x22
    st_be2ca4_1 *v9;  // x22
    long long v10;  // x0
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(8);
    if (ptr)
    {
        ptr1 = ptr;
        v4 = a0->field_80;
        ptr->field_0 = &a0->field_80;
        if (v4 != 9223372036854775810 || !(v5 = sub_bd3cac(a0 + 1, a1) & 0xff, (unsigned int)v5 != 2))
        {
            _free(ptr1);
            ptr2 = _malloc(24);
            if (!ptr2)
                goto LABEL_be2e48;
            ptr1 = ptr2;
            v7 = &a0[1].padding_0[16];
            ptr2->field_0 = v7;
            ptr2->field_8 = &a0->padding_0[64];
            ptr2->field_10 = a0;
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
    sub_c6ba70(8, 8);
LABEL_be2e48:
    v10 = sub_c6ba70(8, 24);
    _free(ptr1);
    v11 = __Unwind_Resume(v10);
    _free(ptr1);
    __Unwind_Resume(v11);
}
