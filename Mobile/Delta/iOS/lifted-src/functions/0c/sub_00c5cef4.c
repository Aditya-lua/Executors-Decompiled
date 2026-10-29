/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5cef4..0xc5cfc8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5cef4_1 {
    char padding_0[7];
    struct st_c5cef4_0 *field_7;
    struct st_c5cef4_0 *field_f;
} st_c5cef4_1;

typedef struct st_c5cef4_0 {
    struct st_c5cef4_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_c5cef4_0 *field_8;
    struct st_c5cef4_0 *field_10;
} st_c5cef4_0;

extern st_c5cef4_0 g_efd788;

st_c5cef4_1 * sub_c5cef4(long long a0, st_c5cef4_0 *a1)
{
    st_c5cef4_0 *ptr;  // x0
    st_c5cef4_0 *ptr1;  // x0
    st_c5cef4_0 *ptr2;  // x0
    long long v5;  // x0
    long long v6;  // x0
    long long v7;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(a1);
    if (!ptr)
    {
        v5 = sub_c6b970(1, a1);
        sub_c5cfc8(a0);
        v6 = __Unwind_Resume(v5);
        _free(v7);
        __Unwind_Resume(v6);
    }
    _memcpy();
    ptr1 = _malloc(24);
    if (ptr1)
    {
        ptr1->field_0 = a1;
        *(st_c5cef4_0 **)&ptr1->field_1 = ptr;
        ptr1->field_8 = a1;
        ptr2 = _malloc(24);
        if (ptr2)
        {
            ptr2->field_0 = ptr1;
            *(struct st_c5cef4_0 ***)&ptr2->field_1 = &g_efd788.field_0;
            *(char *)&ptr2->field_8 = 20;
            return (char *)&ptr2->field_0 + 1;
        }
        sub_c6ba70(8, 24);
    }
    else
    {
        sub_c6ba70(8, 24);
    }
    __debugbreak();
}
