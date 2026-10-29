/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd370c..0xbd3824 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd370c_0 {
    unsigned long long field_0[2];
    long long field_8;
} st_bd370c_0;


unsigned long long sub_bd370c(uint128_t *a0, long long a1)
{
    st_bd370c_0 *ptr;  // x0
    st_bd370c_0 *ptr1;  // x19
    unsigned long v5;  // x21
    unsigned long long v6;  // x22
    long long v7;  // x21
    long long v8;  // x0
    long long v9;  // x19
    uint128_t v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a0;
    ptr = _malloc(16);
    if (ptr)
    {
        ptr1 = ptr;
        v5 = *(unsigned long long *)&*(unsigned long long *)(void*)&v0;
        *(uint128_t *)ptr->field_0 = v0;
        v6 = sub_bd33a0(a1, 0, v5) & 0xff;
        if ((unsigned int)v6 == 2)
        {
            v6 = sub_bd36a8(v5, a1) & 0xff;
            if ((unsigned int)v6 == 2)
            {
                v6 = sub_bd33a0(a1, 1, v5) & 0xff;
                if ((unsigned int)v6 == 2)
                {
                    v7 = ptr1->field_0[1];
                    v6 = sub_bd33a0(a1, 0, v7) & 0xff;
                    if ((unsigned int)v6 == 2)
                    {
                        v6 = sub_bd36a8(v7, a1) & 0xff;
                        if ((unsigned int)v6 == 2)
                            v6 = sub_bd33a0(a1, 1, v7) & 0xff;
                    }
                }
            }
        }
        _free(ptr1);
        return v6;
    }
    v8 = sub_c6ba70(8, 16);
    _free(v9);
    __Unwind_Resume(v8);
}
