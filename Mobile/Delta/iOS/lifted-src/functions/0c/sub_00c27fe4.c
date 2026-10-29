/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc27fe4..0xc280ec (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c27fe4_0 {
    struct st_c27fe4_1 *field_0;
    long long field_8;
    struct st_c27fe4_1 *field_10;
} st_c27fe4_0;

typedef struct st_c27fe4_1 {
    unsigned int field_0;
} st_c27fe4_1;


double sub_c27fe4(st_c27fe4_0 *a0, uint128_t *a1)
{
    unsigned int *ptr;  // x0
    unsigned int *v7;  // x21
    unsigned int *v8;  // x20
    uint128_t *v9;  // x1
    unsigned long v10;  // d0
    long long v11;  // x0
    unsigned long v12;  // d0
    unsigned int *v0;  // [bp-0x58]
    long long v1;  // [bp-0x50]
    unsigned int *v2;  // [bp-0x48]
    uint128_t v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (sub_b8a1ec(a1) != 1)
    {
        a0->field_0 = 0;
        a0->field_8 = 4;
        a0->field_10 = 0;
        return v12;
    }
    ptr = _malloc(16);
    if (ptr)
    {
        v7 = ptr;
        *ptr = (unsigned int)a1;
        v0 = CONCAT(ptr, 4);
        v8 = 1;
        v2 = 1;
        v3 = *a1;
        while (1)
        {
            v9 = a1;
            if (sub_b8a1ec(&v3) != 1)
                break;
            a1 = v9;
            if (v8 == v0)
            {
                a1 = v8;
                sub_c736c8(&v0, a1, 1, 4, 4);
                v7 = *(unsigned long long *)((void*)&v0 + 8);
            }
            *(unsigned int *)((char *)v7 + 0x4 * v8) = (unsigned int)v9;
            v8 = (char *)v8 + 1;
            v2 = v8;
        }
        *(uint128_t *)&a0->field_0 = (uint128_t)v0;
        a0->field_10 = v2;
        return v10;
    }
    v11 = sub_c6b970(4, 16);
    if (v0)
        _free(v1);
    __Unwind_Resume(v11);
}
