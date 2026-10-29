/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6c158..0xc6c28c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6c158_0 {
    struct st_c6c158_0 *field_0;
    struct st_c6c158_0 *field_8;
} st_c6c158_0;


st_c6c158_0 * sub_c6c158(st_c6c158_0 *a0, st_c6c158_0 *a1, long long ptr, st_c6c158_0 *a3, st_c6c158_0 *a4, uint128_t a5)
{
    st_c6c158_0 *v3;  // x20
    st_c6c158_0 *v4;  // x8
    long long v5;  // x9
    st_c6c158_0 *ptr1;  // x0
    st_c6c158_0 *v7;  // x21
    st_c6c158_0 *v8;  // x10
    st_c6c158_0 *v9;  // x8
    st_c6c158_0 *v10;  // x0
    st_c6c158_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 0;
    v4 = 1;
    v5 = 8;
    ptr1 = a0;
    if (a5 * a3 <= 0xffffffffffffffff)
    {
        v7 = a4;
        v8 = a3 * a5;
        ptr1 = a0;
        if (-0x1 * a4 + 0x8000000000000000 >= v8)
        {
            v3 = v8;
            if (!a1)
            {
                if (!v3)
                    goto LABEL_c6c244;
                if (v7 > v3)
                {
                    v0 = 0;
                    ptr1 = _posix_memalign(&v0, 8, v3);
                    if ((unsigned int)ptr1 || (ptr1 = v0, !ptr1))
                        goto LABEL_c6c260;
                }
                else
                {
                    ptr1 = _malloc(v3);
                    if (!ptr1)
                        goto LABEL_c6c260;
                }
LABEL_c6c248:
                v4 = 0;
                a0->field_8 = ptr1;
            }
            else if (v7 > v3)
            {
                v0 = 0;
                ptr1 = _posix_memalign(&v0, 8, v3);
                if ((unsigned int)ptr1 || (v9 = v0, !v9))
                    goto LABEL_c6c260;
                _memcpy(v9, ptr, a1 * a5);
                _free(ptr);
                v7 = v9;
LABEL_c6c244:
                ptr1 = v7;
                goto LABEL_c6c248;
            }
            else
            {
                ptr1 = _realloc(ptr, v3);
                if (ptr1)
                    goto LABEL_c6c248;
LABEL_c6c260:
                a0->field_8 = v7;
                v4 = 1;
            }
            v5 = 16;
        }
    }
    v10 = ptr1;
    *(st_c6c158_0 **)((char *)a0 + v5) = v3;
    a0->field_0 = v4;
    return v10;
}
