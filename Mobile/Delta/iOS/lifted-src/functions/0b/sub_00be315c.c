/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe315c..0xbe3310 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be315c_0 {
    char padding_0[64];
    char field_40;
    char padding_41[71];
    long long field_88;
    unsigned long long field_90;
} st_be315c_0;

typedef struct st_be315c_1 {
    struct st_be315c_2 *field_0;
    long long field_8;
} st_be315c_1;

typedef struct st_be315c_2 {
    unsigned long long field_0;
} st_be315c_2;


unsigned long long sub_be315c(st_be315c_0 *a0, long long a1)
{
    unsigned long long iter;  // x24
    st_be315c_1 *ptr;  // x19
    unsigned long long v7;  // x22
    unsigned long long ptr1;  // x0
    long long v9;  // x21
    long long v10;  // x0
    char v0;  // [bp-0x68]
    st_be315c_1 *v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_b766f4(&v0, a0->field_88, a0->field_88 + 24 * a0->field_90);
    iter = 0;
    ptr = v1;
    if (v2 * 8 == iter)
    {
        if (v0)
            _free(ptr);
        ptr1 = _malloc(16);
        if (!ptr1)
        {
            v10 = sub_c6ba70(8, 16);
            _free(ptr);
            __Unwind_Resume(v10);
        }
        ptr = ptr1;
        *(st_be315c_0 **)ptr1 = a0;
        *(st_be315c_0 **)(ptr1 + 8) = &a0->field_40;
        if ((sub_be2154(a1, 0, a0) & 0xff) == 2 && (sub_bd3c48(a0, a1) & 0xff) == 2 && (sub_be2154(a1, 1, a0) & 0xff) == 2)
        {
            v9 = ptr->field_8;
            if ((sub_be2154(a1, 0, v9) & 0xff) == 2 && (sub_bd3c48(v9, a1) & 0xff) == 2)
                v7 = sub_be2154(a1, 1, v9) & 0xff;
        }
    }
    if (*(long long *)*(long long *)((char *)ptr + iter) != 9223372036854775810)
    {
        v7 = 2;
        iter += 8;
        if (!0)
            continue;
    }
}
