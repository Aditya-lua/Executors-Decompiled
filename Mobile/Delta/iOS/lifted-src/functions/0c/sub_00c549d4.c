/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc549d4..0xc54ad8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c549d4_0 {
    struct st_c549d4_0 *field_0;
} st_c549d4_0;


unsigned long long sub_c549d4(unsigned long a0, unsigned long long a1)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x22
    unsigned long long v6;  // x20
    st_c549d4_0 **ptr;  // x0
    long long v8;  // x0
    long long v9;  // x19
    unsigned long long v10;  // x0
    st_c549d4_0 **v0;  // [bp-0x1050]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a1 - (a1 >> 1);
    v4 = 500000;
    if (a1 >= 500000)
        a1 = v4;
    if (v3 >= a1)
        a1 = v3;
    if (48 < a1)
        v5 = a1;
    else
        v5 = 48;
    if (a1 < 0x101)
    {
        ptr = &v0;
    }
    else if (v3 <= 0xfffffffffffffff && !(v6 = v5 * 16, 0x7ffffffffffffff9 <= v6))
    {
        ptr = _malloc(v6);
        if (!ptr)
            goto LABEL_c54ab0;
    }
    else
    {
        sub_c6ba88();
LABEL_c54ab0:
        v8 = sub_c6b970(8, v6);
        if (a1 > 0x100)
            _free(v9);
        __Unwind_Resume(v8);
    }
    v10 = sub_c590e0();
    if (a1 <= 0x100)
        return v10;
    return _free(ptr);
}
